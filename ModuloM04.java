package Intregavel2;

public class ModuloM04 implements ModuleInterface  {

	//Atributos
	private boolean isDefused;
	private int howManyActivations;
	private int howManyExecutions;
	private int howManyRigthAnswers;
	private int howManyWrongAnswers;
	
	
    //container
	String[] enigma = new String[6];
	
	//Construtor
	public ModuloM04(boolean isDefused, int howManyActivations, int howManyExecutions, int howManyRigthAnswers,
			int howManyWrongAnswers) {
		super();
		this.setDefused (isDefused);
		this.setHowManyActivations (howManyActivations);
		this.setHowManyExecutions (howManyExecutions);
		this.setHowManyRigthAnswers (howManyRigthAnswers);
		this.setHowManyWrongAnswers (howManyWrongAnswers);
	}
	
	//Metodos
	public boolean isDefused() {
			return isDefused;
		}
	public void setDefused(boolean isDefused) {
		this.isDefused = isDefused;
	}
	public int getHowManyActivations() {
		return howManyActivations;
	}
	public void setHowManyActivations(int howManyActivations) {
		this.howManyActivations = howManyActivations;
	}
	public int getHowManyExecutions() {
		return howManyExecutions;
	}
	public void setHowManyExecutions(int howManyExecutions) {
		this.howManyExecutions = howManyExecutions;
	}
	public int getHowManyRigthAnswers() {
		return howManyRigthAnswers;
	}
	public void setHowManyRigthAnswers(int howManyRigthAnswers) {
		this.howManyRigthAnswers = howManyRigthAnswers;
	}
	public int getHowManyWrongAnswers() {
		return howManyWrongAnswers;
	}
	public void setHowManyWrongAnswers(int howManyWrongAnswers) {
		this.howManyWrongAnswers = howManyWrongAnswers;
	}
}
