package comd7shah.github.www.finalquizzapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by dhrutishah on 15-02-22.
 */
public class Final_Score extends Activity implements View.OnClickListener {

    TextView q1_score, q2_score, q3_score, q4_score, q5_score, final_score;
    int finalescore;
    int q2answer, q3answer, q4answer, q5answer;
    String q1;

    Button btnreset;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_score);
        initControls();

        btnreset = (Button) findViewById(R.id.btnreset);
        btnreset.setOnClickListener(this);

    }



    public void onStart(){
        super.onStart();
    }

    public void initControls(){

        q1_score = (TextView)findViewById(R.id.q1_score);
        q2_score = (TextView)findViewById(R.id.q2_score);
        q3_score = (TextView)findViewById(R.id.q3_score);
        q4_score = (TextView)findViewById(R.id.q4_score);
        q5_score = (TextView)findViewById(R.id.q5_score);
        final_score = (TextView)findViewById(R.id.final_score);

        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(this);

        int q1answer = app_preferences.getInt("answer_value", 0);
        int q2answer = app_preferences.getInt("answer_value2", 0);
        int q3answer = app_preferences.getInt("answer_value3", 0);
        int q4answer = app_preferences.getInt("answer_value4", 0);
        int q5answer = app_preferences.getInt("answer_value5", 0);

        if ( q1answer == 1 ){
            q1_score.setText("Correct");
        } else {
            q1_score.setText("Incorrect");
        }

        if ( q2answer == 1){
            q2_score.setText("Correct");
        } else {
            q2_score.setText("Incorrect ");
        }

        if ( q3answer == 1){
            q3_score.setText("Correct");
        } else {
            q3_score.setText("Incorrect ");
        }

        if ( q4answer == 1){
            q4_score.setText("Correct");
        } else {
            q4_score.setText("Incorrect ");
        }

        if ( q5answer == 1){
            q5_score.setText("Correct");
        } else {
            q5_score.setText("Incorrect ");
        }
        finalescore =  q1answer + q2answer + q3answer + q4answer + q5answer;
        final_score.setText(finalescore + "/5");
    }



    @Override
    public void onClick(View v){
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
    }


}






