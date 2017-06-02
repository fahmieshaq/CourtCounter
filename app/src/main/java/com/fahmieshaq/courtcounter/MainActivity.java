package com.fahmieshaq.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreePointsForTeamA(View view) {
        teamAScore = 3;
        displayForTeamA(teamAScore);
    }

    public void addTwoPointsForTeamA(View view) {
        teamAScore = 2;
        displayForTeamA(teamAScore);
    }

    public void addOnePointForTeamA(View view) {
        teamAScore = 1;
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
