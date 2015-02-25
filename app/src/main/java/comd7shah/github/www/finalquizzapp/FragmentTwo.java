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
public class FragmentTwo extends Fragment {
    RadioButton q2a1;
    Button btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        q2a1 = (RadioButton) getView().findViewById(R.id.q2a1);
        btn2 = (Button) getView().findViewById(R.id.q2_button);

        final SharedPreferences app_preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                 SharedPreferences.Editor editor = app_preferences.edit();

                if (q2a1.isChecked()) {
                    editor.putInt("answer_value2", 1);
                } else {
                    editor.putInt("answer_value2", 0);
                }
                editor.commit();



            }
        });


    }
}

