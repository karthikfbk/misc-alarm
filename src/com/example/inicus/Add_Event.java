package com.example.inicus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Add_Event extends Activity {

	public final static String EVENT_TITLE = "com.example.inicus.eventtitle";
	public final static String EVENT_DETAILS = "com.example.inicus.eventtitle";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add__event);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add__event, menu);
		return true;
	}
	
	public void sendEvent(View view){
		
		Intent intent = new Intent(this, Home.class);
		EditText editText = (EditText) findViewById(R.id.eventTitle);
		String title = editText.getText().toString();
		intent.putExtra(EVENT_TITLE, title);
		editText = (EditText) findViewById(R.id.eventDetails);
		String details = editText.getText().toString();
		intent.putExtra(EVENT_DETAILS, details);
	}
}


