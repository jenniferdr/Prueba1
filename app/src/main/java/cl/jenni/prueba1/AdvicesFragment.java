package cl.jenni.prueba1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class AdvicesFragment extends Fragment {

    public AdvicesFragment() {
    }

    public static AdvicesFragment newInstance() {

        return new AdvicesFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView greeting = (TextView) view.findViewById(R.id.greetings_text);
        String userName = getActivity().getIntent().getStringExtra("USERNAME");

        greeting.setText("Hola " + userName +",");


    }
}
