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
public class FragmentFive extends Fragment {

    RadioButton q5a1;
    Button btn5;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_five, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        q5a1 = (RadioButton)getView().findViewById(R.id.q5a1);
        btn5 = (Button)getView().findViewById(R.id.btn5);

        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btn5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                SharedPreferences.Editor editor = app_preferences.edit();

                if (q5a1.isChecked()){
                    editor.putInt("answer_value5", 1);
                } else {
                    editor.putInt("answer_value5", 0);
                }
                editor.commit();
            }
        });
    }
}
