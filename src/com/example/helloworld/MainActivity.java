package com.example.helloworld;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	//ActionBar actionBar = getActionBar();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setTitle("Hello StackOverflow");
        setTitle("Checkins" + " (233)" );
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
      case R.id.action_refresh:
        Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT)
            .show();
        //actionBar.setSubtitle("mytest");
        //actionBar.setTitle("vogella.com");
        break;
      case R.id.action_photo:
        Toast.makeText(this, "Photo selected", Toast.LENGTH_SHORT)
            .show();
        break;

      default:
        break;
      }

      return true;
    }
    
}
