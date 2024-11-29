package com.example.pz7_mdk0103;

import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    ImageView imgMap;
    ImageView imgDial;
    ImageView imgMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EdgeToEdge.enable(this);

        imgMap = (ImageView) findViewById(R.id.img_map);
        imgDial = (ImageView) findViewById(R.id.img_dial);
        imgMail = (ImageView) findViewById(R.id.img_mail);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);


        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener(){
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                        switch (menuItem.getItemId()){
//                            case R.id.action_map:
//                                imgMap.setVisibility(View.VISIBLE);
//                                imgDial.setVisibility(View.GONE);
//                                imgMail.setVisibility(View.GONE);
//                                break;
//                            case R.id.action_dial:
//                                imgMap.setVisibility(View.GONE);
//                                imgDial.setVisibility(View.VISIBLE);
//                                imgMail.setVisibility(View.GONE);
//                                break;
//                            case R.id.action_mail:
//                                imgMap.setVisibility(View.GONE);
//                                imgDial.setVisibility(View.GONE);
//                                imgMail.setVisibility(View.VISIBLE);
//                                break;
//                        }
                        return false;
                    }


                }
        );


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}