package Modulo_Completo;
import java.util.ArrayList;

public class ModuloM04 implements ModuleInterface {
	
	private ArrayList<Enigma> enigmaList = new ArrayList<Enigma>();
	private BombInterface bomb;
	
	public ModuloM04() {
		this.enigmaList[0] = new ReasoningLogic();
		this.enigmaList[1] = new ReasoningLogic();
		this.enigmaList[2] = new PropositionalLogic();
		this.enigmaList[3] = new PropositionalLogic();
	}
	
	public int getHowManyExecutions(byte enigma) 
	{
		return this.enigmaList[enigma].getExecutionsCount();
	}
	
	public int getHowManyRightAnswers(byte enigma)
	{
		return this.enigmaList[enigma].getRightAnswersCount();
	}
	
	public int getHowManyActivations()
	{
		return this.enigmaList[enigma].getActivationsCount();
	}
	
	public int getHowManyWrongAnswers(byte enigma)
	{
		return this.enigmaList[enigma].getWrongAnswersCount();
	}
	
	public Enigma getEnigmaByIndex(byte enigma)
	{
		return this.enigmaList[enigma];
	}
	
	public void attach(BombInterface bomb)
	{
		this.bomb = bomb;
	}
	

}
