package com.example.android.merge;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import static android.content.ContentValues.TAG;

public class OkCancelBar extends LinearLayout {



	public OkCancelBar(Context context, AttributeSet attrs) {
		super(context, attrs);
		setOrientation(HORIZONTAL);
		setGravity(Gravity.CENTER);
		setWeightSum(1.0f);
		setMinimumWidth(100);


//		Log.d(TAG, context.toString()+ this.getWidth());
		
		LayoutInflater.from(context).inflate(R.layout.okcancelbar, this, true);
		
		TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.OkCancelBar, 0, 0);

       try {

		   String text = array.getString(R.styleable.OkCancelBar_okLabel);
		   if (text == null) text = "Ok";
		   ((Button) findViewById(R.id.okcancelbar_ok)).setText(text);

		   text = array.getString(R.styleable.OkCancelBar_cancelLabel);
		   if (text == null) text = "Cancel";
		   ((Button) findViewById(R.id.okcancelbar_cancel)).setText(text);
	   }finally {

		   array.recycle();
	   }
	}
}
