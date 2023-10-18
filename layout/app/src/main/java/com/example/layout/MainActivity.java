package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    private GestureDetectorCompat mGestureDetector;
    private class GestureListener extends
            GestureDetector.SimpleOnGestureListener {
        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            Toast.makeText(MainActivity.this,
                    "onSingleTapConfirmed",
                    Toast.LENGTH_SHORT).show();
            setContentView(R.layout.layoutone);
            return super.onSingleTapConfirmed(e);
        }
        @Override
        public boolean onDoubleTap(MotionEvent e) {
            Toast.makeText(MainActivity.this, "onDoubleTap",
                    Toast.LENGTH_SHORT).show();
            setContentView(R.layout.linearlayout);
            return super.onDoubleTap(e);
        }
    }
    public boolean onTouchEvent(MotionEvent event) {
        mGestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGestureDetector = new GestureDetectorCompat(this, new
                GestureListener());
    }
}

