package com.example.cw2_app2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button buttonPrevious, buttonNext;

    private int[] imageIds = {R.drawable.business, R.drawable.composer, R.drawable.doctor,
            R.drawable.engineer, R.drawable.farmer, R.drawable.no_image, R.drawable.operator,
            R.drawable.patrol, R.drawable.student, R.drawable.teacher};

    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        buttonPrevious = findViewById(R.id.buttonPrevious);
        buttonNext = findViewById(R.id.buttonNext);

        updateImage();

        buttonPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPreviousImage();
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showNextImage();
            }
        });
    }

    private void showPreviousImage() {
        if (currentImageIndex > 0) {
            currentImageIndex--;
            updateImage();
        }
    }

    private void showNextImage() {
        if (currentImageIndex < imageIds.length - 1) {
            currentImageIndex++;
            updateImage();
        }
    }

    private void updateImage() {
        imageView.setImageResource(imageIds[currentImageIndex]);
    }
}
