package cl.jenni.prueba1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText userName = (EditText) findViewById(R.id.username);

        final EditText passw = (EditText) findViewById(R.id.passW);

        Button loginButton = (Button) findViewById(R.id.loginBtn);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if("Jennifer".equals(userName.getText().toString()) && "1234".equals(passw.getText().toString()) ){
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    intent.putExtra("USERNAME", userName.getText().toString());
                    startActivity(intent);
                }else{
                    userName.setError("error");
                    Toast.makeText(view.getContext(), "Invalid username or password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}


