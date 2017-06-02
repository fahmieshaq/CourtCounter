package com.fahmieshaq.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int THREE_POINTS = 3;
    private final int TWO_POINTS = 2;
    private final int ONE_POINT = 1;

    private int teamAScore = 0;
    private int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Team A score calculator
    public void addThreePointsForTeamA(View view) {
        teamAScore = teamAScore + THREE_POINTS;
        displayForTeamA(teamAScore);
    }

    // Team A score calculator
    public void addTwoPointsForTeamA(View view) {
        teamAScore = teamAScore + TWO_POINTS;
        displayForTeamA(teamAScore);
    }

    // Team A score calculator
    public void addOnePointForTeamA(View view) {
        teamAScore = teamAScore + ONE_POINT;
        displayForTeamA(teamAScore);
    }

    // Team B score calculator
    public void addThreePointsForTeamB(View view) {
        teamBScore = teamBScore + THREE_POINTS;
        displayForTeamB(teamBScore);
    }

    // Team B score calculator
    public void addTwoPointsForTeamB(View view) {
        teamBScore = teamBScore + TWO_POINTS;
        displayForTeamB(teamBScore);
    }

    // Team B score calculator
    public void addOnePointForTeamB(View view) {
        teamBScore = teamBScore + ONE_POINT;
        displayForTeamB(teamBScore);
    }

    /**
     * Display team A scores of basketball teams
     */
    private void displayForTeamA(int score) {
        TextView scoreValue = (TextView) findViewById(R.id.team_a_score);
        scoreValue.setText(String.valueOf(score));
    }

    /**
     * Display team B scores of basketball teams
     */
    private void displayForTeamB(int score) {
        TextView scoreValue = (TextView) findViewById(R.id.team_b_score);
        scoreValue.setText(String.valueOf(score));
    }

    /**
     * Display team A old score
     */
    private void displayOldScoreForTeamA(int score) {
        TextView oldScoreValue = (TextView) findViewById(R.id.team_a_history_score);
        oldScoreValue.setText(String.valueOf(score));
    }

    /**
     * Display team B old score
     */
    private void displayOldScoreForTeamB(int score) {
        TextView oldScoreValue = (TextView) findViewById(R.id.team_b_history_score);
        oldScoreValue.setText(String.valueOf(score));
    }

    // Reset scores
    public void reset(View view) {
        // Save old scores and then reset scores
        displayOldScoreForTeamA(teamAScore);
        displayOldScoreForTeamB(teamBScore);
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
}
