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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view) {
        teamAScore = teamAScore + THREE_POINTS;
        displayForTeamA(teamAScore);
    }

    public void addTwoPointsForTeamA(View view) {
        teamAScore = teamAScore + TWO_POINTS;
        displayForTeamA(teamAScore);
    }

    public void addOnePointForTeamA(View view) {
        teamAScore = teamAScore + ONE_POINT;
        displayForTeamA(teamAScore);
    }

    /**
     * Display scores of basketball teams
     */
    private void displayForTeamA(int score) {
        TextView scoreValue = (TextView) findViewById(R.id.team_a_score);
        scoreValue.setText(String.valueOf(score));
    }
}
