package com.example.coutrcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int point = 3;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void threePointsTeamA(View view) {
        int point = 3;
        scoreTeamA += point;
        displayForTeamA(scoreTeamA);
    }

    public void twoPointsTeamA(View view) {
        int point = 2;
        scoreTeamA += point;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowTeamA(View view) {
        int point = 1;
        scoreTeamA += point;
        displayForTeamA(scoreTeamA);
    }

    public void threePointsTeamB(View view) {
        int point = 3;
        scoreTeamB += point;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsTeamB(View view) {
        int point = 2;
        scoreTeamB += point;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowTeamB(View view) {
        int point = 1;
        scoreTeamB += point;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayReset(scoreTeamA);
        displayReset(scoreTeamB);
    }

    public void displayReset(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
        TextView scoreView1 = (TextView) findViewById(R.id.team_b_score);
        scoreView1.setText(String.valueOf(score));
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}