package com.example.android.footballscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore,teamBscore;
    String TeamA,TeamB;
    Button btnAddTeamA,btnAddTeamb,btnEnd,btnSubmit;
    TextView tvGoalA,tvGoalb,tvTeamA,tvTeamB;
    EditText etTeamA,etTeamB;
    LinearLayout inputLayout,scoreLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TeamA="";
        TeamB="";
        teamAscore=0;
        teamBscore=0;

        btnAddTeamA=(Button)findViewById(R.id.AddTeamA);
        btnAddTeamb=(Button)findViewById(R.id.AddTeamB);
        btnEnd=(Button)findViewById(R.id.btnEnd);
        btnSubmit=(Button)findViewById(R.id.Submit);
        tvGoalA=(TextView)findViewById(R.id.tvGoalA);
        tvGoalb=(TextView)findViewById(R.id.tvGoalB);
        tvTeamA=(TextView)findViewById(R.id.tvTeamA);
        tvTeamB=(TextView)findViewById(R.id.tvTeamB);
        etTeamA=(EditText)findViewById(R.id.etTeamA);
        etTeamB=(EditText)findViewById(R.id.etTeamB);
        inputLayout=(LinearLayout)findViewById(R.id.inputLayout);
        scoreLayout=(LinearLayout)findViewById(R.id.scoreLayout);

        inputLayout.setVisibility(View.VISIBLE);

        btnAddTeamA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamAscore++;
                tvGoalA.setText(Integer.toString(teamAscore));
            }
        });

        btnAddTeamb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamBscore++;
                tvGoalb.setText(Integer.toString(teamBscore));
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputLayout.setVisibility(View.VISIBLE);
                teamAscore=0;
                teamBscore=0;
                TeamA="";
                TeamB="";
                etTeamA.setText("");
                etTeamB.setText("");
                tvTeamA.setText("");
                tvTeamB.setText("");
                tvGoalA.setText(Integer.toString(teamAscore));
                tvGoalb.setText(Integer.toString(teamBscore));
                scoreLayout.setVisibility(View.GONE);
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreLayout.setVisibility(View.VISIBLE);
                TeamA=etTeamA.getText().toString();
                TeamB=etTeamB.getText().toString();
                tvTeamA.setText(TeamA);
                tvTeamB.setText(TeamB);
                inputLayout.setVisibility(View.GONE);
            }
        });
    }
}
