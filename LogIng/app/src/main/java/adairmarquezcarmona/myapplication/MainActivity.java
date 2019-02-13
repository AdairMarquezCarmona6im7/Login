package adairmarquezcarmona.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.logins);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateUser();
            }
        });

    }

    public void validateUser(){
        EditText user = (EditText) findViewById(R.id.userName);
        EditText pass = (EditText) findViewById(R.id.password);

        String username = user.getText().toString();
        String contra = pass.getText().toString();

        if(username.equals("abc") && contra.equals("123")){
            Intent access = new Intent(this, AccessActivity.class);
            startActivity(access);
        }else{
            Toast.makeText(this,"Usuario o Contraseña invalidos",Toast.LENGTH_SHORT).show();
        }

    }
}
