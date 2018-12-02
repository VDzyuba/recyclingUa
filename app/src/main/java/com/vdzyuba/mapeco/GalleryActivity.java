package com.vdzyuba.mapeco;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class GalleryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Цікаві матеріали");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ImageView img1 = (ImageView)findViewById(R.id.linkimage1);
        img1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent image1 = new Intent(GalleryActivity.this, Tom1Activity.class);
                startActivity(image1);
            }
        });

        ImageView img2 = (ImageView)findViewById(R.id.linkimage2);
        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent image2 = new Intent(GalleryActivity.this, Tom2Activity.class);
                startActivity(image2);
            }
        });

        ImageView img3 = (ImageView)findViewById(R.id.linkimage3);
        img3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent image3 = new Intent(GalleryActivity.this, Buklet1Activity.class);
                startActivity(image3);
            }
        });

        ImageView img4 = (ImageView)findViewById(R.id.linkimage4);
        img4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent image4 = new Intent(GalleryActivity.this, Buklet2Activity.class);
                startActivity(image4);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // handle arrow click here
        if (item.getItemId() == android.R.id.home) {
            finish(); // close this activity and return to preview activity (if there is any)
        }

        return super.onOptionsItemSelected(item);
    }

}
