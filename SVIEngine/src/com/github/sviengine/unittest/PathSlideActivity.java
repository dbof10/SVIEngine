package com.github.sviengine.unittest;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PathSlideActivity extends UnitTestBaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		// TODO Auto-generated method stub
		super.onConfigurationChanged(newConfig);
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	public boolean createWindow() {
		// TODO Auto-generated method stub
		mWindow = new PathSlideWindow(this);
		
		if( mWindow == null )
			return false;
		
		return true;
	}
	
	@Override
	public boolean onCreateOptionsMenu (Menu menu) {
		
		menu.add("HOME");
		menu.add("PAPER");
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected (MenuItem item) {
		mWindow.onOptionsItemSelected(item);
		return true;
	}
}