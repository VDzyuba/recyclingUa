package com.vdzyuba.mapeco;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("RecyclingUa");


        setSupportActionBar(toolbar);


       Button b_maps = (Button) findViewById(R.id.b_maps);
        Button b_gallery = (Button) findViewById(R.id.b_gallery);
        Button b_project = (Button) findViewById(R.id.b_project);
        Button b_about = (Button) findViewById(R.id.b_about);




        b_maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity2.class);
                startActivity(intent);


            }
        });

        b_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent g = new Intent(MainActivity.this, GalleryActivity.class);
                startActivity(g);


            }
        });

        b_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(MainActivity.this, ProjectActivity.class);
                startActivity(p);


            }
        });

        b_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(a);


            }
        });


        ImageButton facebook = (ImageButton) findViewById(R.id.facebook);
        ImageButton youtube = (ImageButton) findViewById(R.id.youtube);
        ImageButton twitter = (ImageButton) findViewById(R.id.twitter);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/%D0%A6%D0%B5%D0%BD%D1%82%D1%80-%D0%B4%D0%BE%D1%81%D0%BB%D1%96%D0%B4%D0%B6%D0%B5%D0%BD%D1%8C-%D0%BC%D1%96%D1%81%D1%86%D0%B5%D0%B2%D0%BE%D0%B3%D0%BE-%D1%81%D0%B0%D0%BC%D0%BE%D0%B2%D1%80%D1%8F%D0%B4%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F-165382680163970/"));
                startActivity(browserIntent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/channel/UCebLEys3r4LDMNAvn_Xc7Ew"));
                startActivity(browserIntent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(
                        Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/CDMS_LVIV"));
                startActivity(browserIntent);
            }
        });

    }



}
