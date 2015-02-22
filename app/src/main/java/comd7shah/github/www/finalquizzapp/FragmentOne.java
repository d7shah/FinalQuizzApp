package comd7shah.github.www.finalquizzapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by dhrutishah on 15-02-22.
 */
public class FragmentOne extends Fragment {

    RadioButton q1a2;
    Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_one, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        q1a2 = (RadioButton)getView().findViewById(R.id.q1a2);
        btn1 = (Button)getView().findViewById(R.id.btnq1);

        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btn1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences.Editor editor = app_preferences.edit();

                if (q1a2.isChecked()){
                    editor.putInt("answer_value", 1);
                } else {
                    editor.putInt("answer_value", 0);
                }
                editor.commit();
            }
        });

    }

}
