package comd7shah.github.www.finalquizzapp;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

/**
 * Created by dhrutishah on 15-02-22.
 */
public class FragmentFour extends Fragment {
    RadioButton q4a2;
    Button btn4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_four, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        q4a2 = (RadioButton)getView().findViewById(R.id.q4a2);
        btn4 = (Button)getView().findViewById(R.id.btn4);

        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btn4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences.Editor editor = app_preferences.edit();

                if (q4a2.isChecked()){
                    editor.putInt("answer_value4", 1);
                } else {
                    editor.putInt("answer_value4", 0);
                }
                editor.commit();
            }
        });
    }
}
