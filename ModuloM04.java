
import java.util.ArrayList;
import javax.swing.JPanel;
import Modulo_Completo.*;
import java.io.*;

public class ModuloM04 implements ModuleInterface {

	private transient BombInterface bomb;
	private transient Enigma04 e;
	public Stats stats;
	private transient int  index;
	public transient String  nomeArq;
	public static transient  ModuloM04 instance;

	public ModuloM04() {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("module.ser"));
			stats = (Stats) ois.readObject();
		}catch(FileNotFoundException z) {
			stats = new Stats();
		}catch(IOException z) {
			z.printStackTrace();
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
		}
		
		stats.setActivations(stats.getActivations() + 1);
		
		try {
			ObjectOutputStream ooos = new ObjectOutputStream(new FileOutputStream("module.ser"));
			ooos.writeObject(stats);
		}catch(IOException z){
			z.printStackTrace();
		}
		
		
		
		instance = this;
		
	}

	public void attach(BombInterface bomb) {
		this.bomb = bomb;
	}

	

	@Override
	public EnigmaLevel getEnigmaLevel(byte arg0) {
		// TODO Auto-generated method stub
		return this.e.getEnigmaLevel();
	}

	@Override
	public int getHowManyActivations() {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("module.ser"));
			stats = (Stats) ois.readObject();
			return stats.getActivations();
		}catch(FileNotFoundException z) {
			return 1;
		}catch(IOException z) {
			z.printStackTrace();
			return 1;
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
			return 1;
		}
		
	
	}

	@Override
	public int getHowManyExecutions(byte arg0) {
		// TODO Auto-generated method stub
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArq));
			Enigma04 en = (Enigma04) ois.readObject();
			return en.getExecutionsCount();
		}catch(FileNotFoundException z) {
			return 1;
		}catch(IOException z) {
			z.printStackTrace();
			return 1;
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
			return 1;
		}
		
	}

	@Override
	public int getHowManyRightAnswers(byte arg0) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArq));
			Enigma04 en = (Enigma04) ois.readObject();
			return en.getRightAnswersCount();
		}catch(FileNotFoundException z) {
			return 1;
		}catch(IOException z) {
			z.printStackTrace();
			return 1;
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
			return 1;
		}
	}

	@Override
	public int getHowManyWrongAnswers(byte arg0) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArq));
			Enigma04 en = (Enigma04) ois.readObject();
			return en.getWrongAnswersCount();
		}catch(FileNotFoundException z) {
			return 1;
		}catch(IOException z) {
			z.printStackTrace();
			return 1;
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
			return 1;
		}
	}

	@Override
	public JPanel getPanel(byte arg0) {
		 nomeArq = "enigma" + arg0 + ".ser";
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArq));
			this.e = (Enigma04) ois.readObject();
			e.setExecutionsCount(e.getExecutionsCount() + 1);	
			e.attach();
		}catch(FileNotFoundException z) {
			this.e = new Enigma04();
			e.attach();
		}catch(IOException z) {
			z.printStackTrace();
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
		}
		
		JPanel painel = null;
		switch (arg0) {
		case 1:
			painel = new Enigma041(e);
			break;
		case 2:
			painel = new Enigma042(e);
			break;
		case 3:
			painel = new Enigma043(e);
			break;
		case 4:
			painel = new Enigma044(e);
			break;
		case 5:
			painel = new Enigma045(e);
			break;
		case 6:
			painel = new Enigma046(e);
			break;
		}
		
		e.setPanel(painel);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArq));
			oos.writeObject(e);
			}catch(IOException z) {
				z.printStackTrace();
			}
		return e.getPanel();
	}

	public void Errou() {
		
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArq));
			oos.writeObject(e);
			}catch(IOException z) {
				z.printStackTrace();
			}
		bomb.addError();
	}

	@Override
	public boolean isDefused() {
		// TODO Auto-generated method stub
		if (e.getDefuse()) {
			try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArq));
			oos.writeObject(e);
			}catch(IOException z) {
				z.printStackTrace();
			}
			
			
			return true;
			
		}
		
		return false;
	}
	
	public void  setEnigma() {
		
	}
}