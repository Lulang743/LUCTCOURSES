package com.example.luct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
 ImageView image1,image2,image4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image1=(ImageView)findViewById(R.id.image1);
        image2=(ImageView)findViewById(R.id.image2);
        image4=(ImageView)findViewById(R.id.image4);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("description", "This course will teach students with the quantitative  methods used in the finance and capital markets industry.It is ideal for students who want to learn how to analyse complex data.");
                intent.putExtra("monster_name", "Data science");
                intent.putExtra("course1", "1.Explanatory Data analysis");
                intent.putExtra("course2", "2.The R programming Language");
                intent.putExtra("course3", "3.Statistical Inference");
                intent.putExtra("course4", "4.Introduction to Machine Language");

                startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("description", "This course will give students hands_on experience in developing interacting android applications.It is suitable for students with any level of computing knoeledge.");
                intent.putExtra("monster_name", "Mobile app development");
                intent.putExtra("course1", "1.Fundamentals of Android Development");
                intent.putExtra("course2", "2.Designing Adaptive Application");
                intent.putExtra("course3", "3.Cross-platform with Flutter");

                startActivity(intent);
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("description", "Front end web developers get glory all the world!!.Students will learn more about web interfaces that we interact with on every one of our devices which are results of Web developers' hard work.");
                intent.putExtra("monster_name", "Front-End Web development");
                intent.putExtra("course1", "1.HTML AND CSS");
                intent.putExtra("course2", "2.JAVASCRIPT");
                intent.putExtra("course3", "3.RESPONSIVE DESIGNS");

                startActivity(intent);

            }
        });
    }
}