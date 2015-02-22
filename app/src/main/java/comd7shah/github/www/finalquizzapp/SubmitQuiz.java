package comd7shah.github.www.finalquizzapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by dhrutishah on 15-02-22.
 */
public class SubmitQuiz extends Fragment {

    Button get_score;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.submit_quiz, null);
    }

    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

        get_score = (Button)getView().findViewById(R.id.get_score);
        get_score.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(getActivity(), Final_Score.class);
                startActivity(i);
            }
        });
    }
}
