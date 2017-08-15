package com.example.hitesh0505.baskybaskyball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int finalScoreForTeamA = 0;
    private int finalScoreForTeamB =0;

    public void displayToUserA(int score) {
        TextView ourScore = (TextView) findViewById(R.id.score_team_one);
        ourScore.setText(String.valueOf(score));
    }

    public void displayToUserB(int score){
        TextView ourSecondScore = (TextView) findViewById(R.id.score_team_two);
        ourSecondScore.setText(String.valueOf(score));
    }

    public void onPressingButtonOne(View view){
        finalScoreForTeamA+=1;
        displayToUserA(finalScoreForTeamA);
    }

    public void onPressingButtonTwo(View view){
        finalScoreForTeamA+=2;
        displayToUserA(finalScoreForTeamA);
    }

    public void onPressingButtonThree(View view){
        finalScoreForTeamA+=3;
        displayToUserA(finalScoreForTeamA);
    }

    public void onPressingButtonOne1(View view){
        finalScoreForTeamB+=1;
        displayToUserB(finalScoreForTeamB);
    }

    public void onPressingButtonTwo2(View view){
        finalScoreForTeamB+=2;
        displayToUserB(finalScoreForTeamB);
    }

    public void onPressingButtonThree3(View view){
        finalScoreForTeamB+=3;
        displayToUserB(finalScoreForTeamB);
    }

    public void onPressingResetButton(View view){
        finalScoreForTeamB = 0;
        finalScoreForTeamA =0;
        Toast.makeText(this,"Scores are level again, Bitches !!",Toast.LENGTH_SHORT).show();
        displayToUserA(finalScoreForTeamA);
        displayToUserB(finalScoreForTeamB);
    }

}

