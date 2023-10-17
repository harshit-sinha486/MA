package com.example.shapeprogram;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    //when user clicks on your app's icon which
    //causes this method to create the activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new myView(this));
    }
    private static class myView extends View{
        Paint myPaint;
        public myView(Context context) {
            super(context);
            init();
        }
        private void init(){
            myPaint=new Paint();
            myPaint.setColor(Color.GREEN);
            myPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            myPaint.setStrokeWidth(7);
        }
        //Canvas in Android is a drawing framework
        // which helps us to draw custom design like line, circle
        // or even a rectangle.
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawRect(400,100,650,450, myPaint);
            canvas.drawCircle( 200,350,150, myPaint);
            canvas.drawRect(50,750,200,950, myPaint);
            canvas.drawLine(520,850,520,950,myPaint);
        }
    }
}