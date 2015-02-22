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
public class FragmentThree extends Fragment {


    RadioButton q3a3;
    Button btn3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        q3a3 = (RadioButton)getView().findViewById(R.id.q3a3);
        btn3 = (Button)getView().findViewById(R.id.btn3);

        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btn3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences.Editor editor = app_preferences.edit();

                if (q3a3.isChecked()){
                    editor.putInt("answer_value3", 1);
                } else {
                    editor.putInt("answer_value3", 0);
                }
                editor.commit();
            }
        });




    }
}
