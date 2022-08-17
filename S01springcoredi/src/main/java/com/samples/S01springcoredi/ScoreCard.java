package com.samples.S01springcoredi;

public class ScoreCard {
	private Scores scores;

	public Scores getScores() {
		return scores;
	}

	public void setScores(Scores scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "ScoreCard [scores=" + scores + "]";
	}
	
	
}
