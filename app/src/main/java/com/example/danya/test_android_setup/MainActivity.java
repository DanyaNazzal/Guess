package com.example.danya.test_android_setup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    void guss()
    {

        Random r = new Random();
        int r1 = r.nextInt();
        Button mButton ;
        TextView mTextViwe ;
        mTextViwe = (TextView)findViewById(R.id.textView);
        mButton = (Button)findViewById(R.id.button);

        int mTextViewValue = Integer.parseInt(mTextViwe.toString());

        //Toast.makeText(QuizActivity.this,
        //R.string.correct_toast,
               // Toast.LENGTH_SHORT).show();

        //******************************************************************************************

        if ( r1 == mTextViewValue )
        {
           Toast.makeText(MainActivity.this, R.string.win_toast ,Toast.LENGTH_LONG).show();
        }

        //******************************************************************************************

        while ( r1 != mTextViewValue ) {

            if ( r1 < mTextViewValue )
            {
                Toast.makeText(MainActivity.this, R.string.more_toast ,Toast.LENGTH_LONG).show();
            }

            //**************************************************************************************

            else if ( r1 > mTextViewValue )
            {
                Toast.makeText(MainActivity.this, R.string.less_toast ,Toast.LENGTH_LONG).show();

            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
