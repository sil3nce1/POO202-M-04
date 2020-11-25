package Modulo_Completo;

public class Enigma 
{
	protected int executionsCount;
	protected int wrongAnswersCount;
	protected int activationsCount;
	protected int rightAnswersCount;
	protected EnigmaLevel level;
	
	public Enigma() {
		
	}
	
	public Enigma(int executions, int wrongAnswers, int activations, EnigmaLevel level) {
		super();
		this.setExecutionsCount(executions);
		this.setWrongAnswersCount(wrongAnswers);
		this.setActivationsCount(activations);
		this.setLevel(level);
	}
	
	
	
	
	
	public int getExecutionsCount() {
		return executionsCount;
	}


	public void setExecutionsCount(int executionsCount) {
		this.executionsCount = executionsCount;
	}


	public int getWrongAnswersCount() {
		return wrongAnswersCount;
	}


	public void setWrongAnswersCount(int wrongAnswersCount) {
		this.wrongAnswersCount = wrongAnswersCount;
	}


	public int getActivationsCount() {
		return activationsCount;
	}


	public void setActivationsCount(int activationsCount) {
		this.activationsCount = activationsCount;
	}


	public int getRightAnswersCount() {
		return rightAnswersCount;
	}


	public void setRightAnswersCount(int rightAnswersCount) {
		this.rightAnswersCount = rightAnswersCount;
	}


	public EnigmaLevel getLevel() {
		return level;
	}


	public void setLevel(EnigmaLevel level) {
		this.level = level;
	}
	
	
	public void IncrementActivations() {
		this.activationsCount ++;
	}
	
	public void IncrementWrongAnsweres() {
		this.wrongAnswersCount ++;
	}
	
	public void IncrementRightAnsweres() {
		this.rightAnswersCount++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
