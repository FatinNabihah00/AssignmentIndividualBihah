package com.lab.assignmentindividualbihah;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Objects;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        TextView websiteTextView = findViewById(R.id.websiteTextView);

        websiteTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Open the URL in a browser
                Uri websiteUri = Uri.parse("https://github.com/SyafiqahAzizan/ElectricityBillCalculator");
                Intent intent = new Intent(Intent.ACTION_VIEW, websiteUri);
                startActivity(intent);
            }
        });
    }
}
