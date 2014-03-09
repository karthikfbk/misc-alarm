package com.example.inicus;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.add_event:
	            NavigateToAddEvent();
	            return true;	        
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	private void NavigateToAddEvent() {
		// TODO Auto-generated method stub
		Intent intent = new Intent(this, Add_Event.class);
		startActivity(intent);
	}

}
