package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score, score2, score3, score4;

    public void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score1);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayer2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayer3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score3);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForPlayer4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score4);
        scoreView.setText(String.valueOf(score));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayer1(0);
        displayForPlayer2(0);
        displayForPlayer3(0);
        displayForPlayer4(0);
    }
    public void plusOne1 (View view){
        score += 1;
        displayForPlayer1(score);

    }
    public void plusFive1 (View view){
        score += 5;
        displayForPlayer1(score);

    }
    public void plusTen1 (View view){
        score += 10;
        displayForPlayer1(score);

    }
    public void plusOne2 (View view){
        score2 += 1;
        displayForPlayer2(score2);

    }
    public void plusFive2 (View view){
        score2 += 5;
        displayForPlayer2(score2);

    }
    public void plusTen2 (View view){
        score2 += 10;
        displayForPlayer2(score2);

    }
    public void plusOne3 (View view){
        score3 += 1;
        displayForPlayer3(score3);

    }
    public void plusFive3 (View view){
        score3 += 5;
        displayForPlayer3(score3);

    }
    public void plusTen3 (View view){
        score3 += 10;
        displayForPlayer3(score3);

    }
    public void plusOne4 (View view){
        score4 += 1;
        displayForPlayer4(score4);

    }
    public void plusFive4 (View view){
        score4 += 5;
        displayForPlayer4(score4);

    }
    public void plusTen4 (View view){
        score4 += 10;
        displayForPlayer4(score4);

    }
    public void reset(View view){
        score = 0;
        score2 = 0;
        score3 = 0;
        score4 = 0;
        displayForPlayer1(score);
        displayForPlayer2(score2);
        displayForPlayer3(score3);
        displayForPlayer4(score4);
    }
}
