package com.tooryanaad.chakra.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Riddles {
	
	@Id
	private int riddleId;
	private String question;
	private String answer;
	
	public Riddles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Riddles(int riddleId, String question, String answer) {
		super();
		this.riddleId = riddleId;
		this.question = question;
		this.answer = answer;
	}
	
	
	public int getRiddleId() {
		return riddleId;
	}
	public void setRiddleId(int riddleId) {
		this.riddleId = riddleId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
