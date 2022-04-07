package com.example.zoomcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageviewid);
        zoomControls=findViewById(R.id.zoomcontrolid);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setScaleX(imageView.getScaleX()+1 );
                imageView.setScaleY(imageView.getScaleY()+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (imageView.getScaleX()>1 && imageView.getScaleY()>1) {
                    imageView.setScaleY(imageView.getScaleY() - 1);
                    imageView.setScaleX(imageView.getScaleX() - 1);
                }
            }
        });
    }
}