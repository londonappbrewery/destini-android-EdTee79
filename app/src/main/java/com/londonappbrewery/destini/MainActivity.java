package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Integer ActiveStoryID = (Integer) 1;
    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ActiveStoryID){
                    case 1:
                        ActiveStoryID = 3;
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        break;
                    case 2:
                        ActiveStoryID = 3;
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);
                        break;
                    case 3:
                        ActiveStoryID = 6;
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (ActiveStoryID){
                    case 1:
                        ActiveStoryID = 2;
                        mStoryTextView.setText(R.string.T2_Story);
                        mTopButton.setText(R.string.T2_Ans1);
                        mBottomButton.setText(R.string.T2_Ans2);
                        break;
                    case 2:
                        ActiveStoryID = 4;
                        mStoryTextView.setText(R.string.T4_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        break;
                    case 3:
                        ActiveStoryID = 5;
                        mStoryTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
