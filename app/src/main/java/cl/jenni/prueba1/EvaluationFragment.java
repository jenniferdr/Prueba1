package cl.jenni.prueba1;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;

public class EvaluationFragment extends Fragment {

    public EvaluationFragment() {

    }

    public static EvaluationFragment newInstance() {

        return new EvaluationFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_evaluation, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final CheckBox checkBox1 = view.findViewById(R.id.checkbox_1);
        final CheckBox checkBox2 = view.findViewById(R.id.checkbox_2);
        final CheckBox checkBox3 = view.findViewById(R.id.checkbox_3);
        final SeekBar happinessSb = view.findViewById(R.id.happinesSb);
        Button evalBtn = view.findViewById(R.id.evaluationBtn);

        evalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer total= (checkBox1.isChecked()?50:0) + (checkBox2.isChecked()?50:0)
                        + (checkBox3.isChecked()?50:0) + happinessSb.getProgress();


                //Toast.makeText(getContext(),"Awesome level: "+ total,Toast.LENGTH_LONG).show();

                final AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("Resultado");
                alert.setMessage("Awesome level: "+ total);
                alert.setNeutralButton("Keep going", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        alert.setOnDismissListener(new DialogInterface.OnDismissListener() {
                            @Override
                            public void onDismiss(DialogInterface dialogInterface) {

                            }
                        });
                    }
                });

                alert.show();
            }
        });


    }
}
