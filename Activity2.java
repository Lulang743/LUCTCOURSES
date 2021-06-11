package com.example.luct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView head,txt2,txt3,txt4,txt5,text6;
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);


        head=(TextView)findViewById(R.id.txt1);
        txt3=(TextView)findViewById(R.id.txt3);
        txt4=(TextView)findViewById(R.id.text4);
        txt5=(TextView)findViewById(R.id.txt51);
        text6=(TextView)findViewById(R.id.text4);



        String head1 = getIntent().getExtras().getString("monster_name");
        String imageRes = getIntent().getExtras().getString("description");
        String txt = getIntent().getExtras().getString("course1");
        String txt31 = getIntent().getExtras().getString("course2");
        String txt41 = getIntent().getExtras().getString("course3");

        head.setText(head1);
        txt5.setText(imageRes);
        text6.setText(txt);
        txt3.setText(txt31);
        txt4.setText(txt41);

    }
}