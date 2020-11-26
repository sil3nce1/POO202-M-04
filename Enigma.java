package main;

import javax.swing.JPanel;

public class Enigma 
{
	protected int executions;
	protected int wrongAnswers;
	protected int rightAnswers;
	protected int activations;
	protected EnigmaLevel level;
	
	
	public Enigma(int executions, int wrongAnswers, int rightAnswers, int activations, EnigmaLevel level) 
	{
		this.setExecutionsCount(executions);
		this.setWrongAnswersCount(wrongAnswers);
		this.setRightAnswersCount(rightAnswers);
		this.setActivationsCount(activations);
		this.setEnigmaLevel(level);
	}
	
	public Enigma() {}
	
	
	public int getExecutionsCount() 
	{
		return this.executions;
	}
	
	public void setExecutionsCount(int executions)
	{
		this.executions = executions;
	}
	
	public int getWrongAnswersCount() 
	{
		return this.wrongAnswers;
	}
	
	public void setWrongAnswersCount(int wrongAnswers)
	{
		this.wrongAnswers = wrongAnswers;
	}
	
	public int getActivationCount() 
	{
		return this.activations;
	}
	
	public void setActivationsCount(int activations)
	{
		this.activations = activations;
	}
	
	public int getRightAnswersCount() 
	{
		return this.rightAnswers;
	}
	
	public void setRightAnswersCount(int rightAnswers)
	{
		this.rightAnswers = rightAnswers;
	}
	
	public EnigmaLevel getEnigmaLevel() 
	{
		return this.level;
	}
	
	public void setEnigmaLevel(EnigmaLevel level)
	{
		this.level = level;
	}
	
	public JPanel getPanel(int index) {}
	
	
}
