
import java.util.ArrayList;

import javax.swing.JPanel;

import Modulo_Completo.*;

import UI.*;


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
		e = new Enigma(new Enigma1(e));
		
		break;
	case 2:
		e = new Enigma(new Enigma2());
		break;
	case 3:
		e = new Enigma(new Enigma3());
		break;
	case 4:
		e = new Enigma(new Enigma4());
		break;
	case 5:
		e = new Enigma(new Enigma5());
		break;
	case 6:
		e = new Enigma(new Enigma6());
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