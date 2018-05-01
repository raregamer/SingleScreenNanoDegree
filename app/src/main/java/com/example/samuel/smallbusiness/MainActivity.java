package com.example.samuel.smallbusiness;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageView facebook;
    ImageView email;
    ImageView twitter;
    String facebookLink = "http://www.facebook.com";
    String twitterLink = "http://www.twitter.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent fb = new Intent(Intent.ACTION_VIEW);
                fb.setData(Uri.parse(facebookLink));

                if(fb.resolveActivity(getPackageManager()) != null) {
                    startActivity(fb);
                } else {
                    Toast.makeText(MainActivity.this,"Please install a web browser.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Email button in beta.", Toast.LENGTH_SHORT).show();

            }
        });

        twitter = findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent tweet = new Intent(Intent.ACTION_VIEW);
                tweet.setData(Uri.parse(twitterLink));
                if(tweet.resolveActivity(getPackageManager()) != null) {
                    startActivity(tweet);
                } else {
                    Toast.makeText(MainActivity.this,"Please install a web browser.", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
