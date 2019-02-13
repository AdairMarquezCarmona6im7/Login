package adairmarquezcarmona.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AccessActivity extends AppCompatActivity {

    private Button out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_access);

        out = (Button) findViewById(R.id.Logout);

        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                outL();
            }
        });

    }

    public void outL(){
        Intent login = new Intent(this, MainActivity.class);
        startActivity(login);
    }
}

