package com.example.hovedmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        private Button button;
        private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textView2.setText("Du trykket");

            }
        });

         textView2 = findViewById(R.id.textView2);



    }

    public void open(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://javabog.dk"));
        startActivity(browserIntent);
    }


}
