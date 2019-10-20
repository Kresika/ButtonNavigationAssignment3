package com.example.viewimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    RadioGroup animal;
    RadioButton rbFish,rbCat, rbBird;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        animal=findViewById(R.id.rgAnimal);
        image= findViewById(R.id.imageView);
       rbBird=findViewById(R.id.rbbird);
        rbFish=findViewById(R.id.rbfish);
        rbCat=findViewById(R.id.rbcat);

        rbBird.setOnClickListener(this);
        rbCat.setOnClickListener(this);
        rbFish.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.rbbird:
                image.setImageResource(R.drawable.bird);
                break;
            case R.id.rbcat:
                image.setImageResource(R.drawable.cat);
                break;
            case R.id.rbfish:
                image.setImageResource(R.drawable.fish);
                break;
        }

    }
}

