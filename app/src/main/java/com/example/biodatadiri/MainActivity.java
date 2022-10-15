package com.example.biodatadiri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void liatTelepon(View view){
        Uri uri = Uri.parse("tel:081237535919");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void email(View view){
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"111202113639@mhs.dinus.ac.id"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Email from Aplication");
        email.setType("text/plan");
        startActivity(Intent.createChooser(email,"Choose an Email Client"));
    }
    public void maps(View view){
        Uri maps = Uri.parse("geo:-7.006376,110.390651");
        Intent it = new Intent(Intent.ACTION_VIEW, maps);
        startActivity(it);
    }
}