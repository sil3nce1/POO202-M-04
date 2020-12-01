

import javax.swing.JPanel;
import UI.*;
import java.io.*;

public class Enigma implements Serializable
{
	protected int executionsCount;
	protected int wrongAnswersCount;
	protected int rightAnswersCount;
	protected boolean defused = false;
	protected boolean flagErro = false;
	private transient JPanel panel;
	
	private EnigmaLevel level;
	
	public Enigma(JPanel p) {
	
		this.panel = p;
	}
	
	public Enigma(int executions, int wrongAnswers, EnigmaLevel level) {
		
		this.setExecutionsCount(executions);
		this.setWrongAnswersCount(wrongAnswers);
	
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


	public int getRightAnswersCount() {
		return rightAnswersCount;
	}


	public void setRightAnswersCount(int rightAnswersCount) {
		this.rightAnswersCount = rightAnswersCount;
	}


	public EnigmaLevel getEnigmaLevel() {
		return level;
	}


	public void setLevel(EnigmaLevel level) {
		this.level = level;
	}
	
	
	
	public void IncrementWrongAnsweres() {
		this.wrongAnswersCount ++;
		this.flagErro = true;
		
	}
	
	public void IncrementRightAnsweres() {
		this.defuse();
		this.rightAnswersCount++;
	}
	
	public JPanel getPanel() {
		return panel;
		}
	
	public void setDefuse(boolean b) {
		defused = b;
	}
	public void defuse() {
		defused = true;
	}
	
	public  boolean getDefused() {
		return defused;
	}
	public boolean getFlagErro() {
		return flagErro;
	}
	public void setFlagErro() {
		flagErro = false;
	}
	
}
	
	
	
	
	
	
	

