
import java.util.ArrayList;
import javax.swing.JPanel;
import Modulo_Completo.*;
import UI.*;
import java.io.*;

public class ModuloM04 implements ModuleInterface {

	private BombInterface bomb;
	private int activations;
	private Enigma e;
	private int index;
	String nomeArq;

	public ModuloM04() {
		this.activations++;
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
		return 0;
	}

	@Override
	public int getHowManyExecutions(byte arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHowManyRightAnswers(byte arg0) {
		// TODO Auto-generated method stub
		return e.getRightAnswersCount();
	}

	@Override
	public int getHowManyWrongAnswers(byte arg0) {
		// TODO Auto-generated method stub
		return e.getWrongAnswersCount();
	}

	@Override
	public JPanel getPanel(byte arg0) {
		
		 nomeArq = "enigma" + arg0 + ".ser";
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArq));
			this.e = (Enigma) ois.readObject();
		}catch(FileNotFoundException z) {
			this.e = new Enigma();
		}catch(IOException z) {
			z.printStackTrace();
		}catch(ClassNotFoundException z) {
			z.printStackTrace();
		}
		
		JPanel painel = null;
		switch (arg0) {
		case 1:
			painel = new Enigma1(e);
			break;
		case 2:
			painel = new Enigma2(e);
			break;
		case 3:
			painel = new Enigma3(e);
			break;
		case 4:
			painel = new Enigma4(e);
			break;
		case 5:
			painel = new Enigma5(e);
			break;
		case 6:
			painel = new Enigma6(e);
			break;
		}
		
		e.setPanel(painel);
		return e.getPanel();
	}

	public void Errou() {
		if(e.getWrongAnswersCount()%3 ==0) {
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArq));
				oos.writeObject(e);
				}catch(IOException z) {
					z.printStackTrace();
				}
		}
		bomb.addError();
	}

	@Override
	public boolean isDefused() {
		// TODO Auto-generated method stub
		if (e.defused) {
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
}