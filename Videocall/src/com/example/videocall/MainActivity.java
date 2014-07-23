package com.example.videocall;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button = (Button) findViewById(R.id.button1);
		final EditText edit = (EditText) findViewById(R.id.editText1);
		 
		// add button listener
		button.setOnClickListener(new OnClickListener() {
 
			@Override
			public void onClick(View arg0) {
 
				Intent callIntent = new Intent("com.android.phone.videocall");
				callIntent.putExtra("videocall", true);
				callIntent.setData(Uri.parse("tel:" + edit.getText()));
				startActivity(callIntent);
 
			}
 
		});
	}

}

