
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
	
	
	public  ModuloM04() {
		this.activations++;
	}
	
	
	
	
	
	public void attachBomb(BombInterface bomb) {
		this.bomb = bomb;
	}


	@Override
	public void attach(BombInterface arg0) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-geswitch(index) {
switch(arg0) {
	case 1:
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("enigma1.ser"));
			this.e = (Enigma) ois.readObject();
		}catch(FileNotFoundException z) {
		this.e = new Enigma(new Enigma1());
			try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enimga1.ser"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		break;
	case 2:
		try {
		ObjectInputStream ois = new ObjectInputStream( new FileInputStream("enigma2.ser"));
		this.e = (Enigma) ois.readObject();
	}catch(FileNotFoundException z) {
	this.e = new Enigma(new Enigma2());
		try {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enimga2.ser"));
		}catch(IOException e) {
			e.printStackTrace();
		}
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
	}
		break;
	case 3:
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("enigma3.ser"));
			this.e = (Enigma) ois.readObject();
		}catch(FileNotFoundException z) {
		this.e = new Enigma(new Enigma3());
			try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enimga3.ser"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		break;
	case 4:
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("enigma4.ser"));
			this.e = (Enigma) ois.readObject();
		}catch(FileNotFoundException z) {
		this.e = new Enigma(new Enigma4());
			try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enimga4.ser"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		break;
	case 5:
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("enigma5.ser"));
			this.e = (Enigma) ois.readObject();
		}catch(FileNotFoundException z) {
		this.e = new Enigma(new Enigma5());
			try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enimga5.ser"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		break;
	case 6:
		try {
			ObjectInputStream ois = new ObjectInputStream( new FileInputStream("enigma6.ser"));
			this.e = (Enigma) ois.readObject();
		}catch(FileNotFoundException z) {
		this.e = new Enigma(new Enigma6());
			try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enimga6.ser"));
			}catch(IOException e) {
				e.printStackTrace();
			}
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		break;
}
		
	return e.getPanel();
	}

	
	public boolean Errou() {
		if(e.getFlagErro()) {
			restaureFlag();
			return true;
		}
		return false;
	}
	public void restaureFlag() {
		e.setFlagErro();
	}
	@Override
	public boolean isDefused() {
		// TODO Auto-generated method stub
		if(e.defused) {
			return true;
		}
		return false;
	}
}