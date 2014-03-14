package com.example.inicus;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
//import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.SearchView;

public class Home extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
	}

	@SuppressLint("NewApi")
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.home, menu);    

		
	    SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = new SearchView(getActionBar().getThemedContext());
        searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));
        menu.findItem(R.id.search_event).setActionView(searchView);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.add_event:
	           NavigateToAddEvent();
	           return true;
	        case R.id.search_event:
	        Displaysearch();
	        
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

	private void Displaysearch() {
		// TODO Auto-generated method stub
		//Do nothing
	}

	private void NavigateToAddEvent() {
		//TODO Auto-generated method stub
		Intent intent = new Intent(this, Add_Event.class);
		startActivity(intent);
	}

}
