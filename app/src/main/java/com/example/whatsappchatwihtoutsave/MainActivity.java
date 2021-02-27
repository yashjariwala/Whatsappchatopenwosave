package com.example.whatsappchatwihtoutsave;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


    import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView urlstring;
    private ImageView imgurlwa;
    EditText Medit;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = (Button) findViewById(R.id.openwabutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Medit = (EditText) findViewById(R.id.editTextNumberDecimal);
                Medit.getText().toString();
                if (Medit.getText().length() == 0) {
                    Medit.setError("Please Enter The Phone Number");
                    Toast.makeText(getApplicationContext(), "Please Enter Phone Number with Country Code", Toast.LENGTH_LONG).show();
                } else {

                    String Url = "http://api.whatsapp.com/send?phone=+" + Medit.getText();
                    //String Url = "http://google.com";
                    Toast.makeText(getApplicationContext(), "Opening What's App", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Intent.ACTION_VIEW);
                    i.setData(Uri.parse(Url));
                    startActivity(i);
                }
            }
        });

        urlstring = (TextView) findViewById(R.id.textViewcoded);
        urlstring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String WAYA = "http://api.whatsapp.com/send?phone=+919833657709";
                Intent iwaya = new Intent(Intent.ACTION_VIEW);
                iwaya.setData(Uri.parse(WAYA));
                startActivity(iwaya);

            }
        });
    }
}




