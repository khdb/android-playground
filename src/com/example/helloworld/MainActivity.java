package com.example.helloworld;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	//ActionBar actionBar = getActionBar();
	ShareActionProvider provider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
      
        setContentView(R.layout.activity_main);
        //setTitle("Hello StackOverflow");
        //setTitle("Checkins" + " (233)" );
        
        
        ActionBar actionBar = getActionBar();
        actionBar.setTitle("Checkins" + " (233)" );
        // add the custom view to the action bar
//        actionBar.setCustomView(R.layout.actionbar_view);
//        EditText search = (EditText) actionBar.getCustomView().findViewById(R.id.searchfield);
//        search.setOnEditorActionListener(new OnEditorActionListener() {
//
//          @Override
//          public boolean onEditorAction(TextView v, int actionId,
//              KeyEvent event) {
//            Toast.makeText(MainActivity.this, "Search triggered",
//                Toast.LENGTH_LONG).show();
//            return false;
//          }
//        });
//        
//        actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM | ActionBar.DISPLAY_SHOW_HOME);
//      
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        
     // Get the ActionProvider for later usage
        provider = (ShareActionProvider) menu.findItem(R.id.menu_share).getActionProvider();
        
        return true;
    }
 
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
      switch (item.getItemId()) {
//      case R.id.action_refresh:
//        Toast.makeText(this, "Refresh selected", Toast.LENGTH_SHORT)
//            .show();
//        //actionBar.setSubtitle("mytest");
//        //actionBar.setTitle("vogella.com");
//        break;
//      case R.id.action_photo:
//        Toast.makeText(this, "Photo selected", Toast.LENGTH_SHORT)
//            .show();
//        break;
      	case R.id.menu_share:
          doShare();
          break;
          
      default:
        break;
      }

      return true;
    }
    
    public void doShare() {
        // populate the share intent with data
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "This is a message for you");
        provider.setShareIntent(intent);
      } 
    
}
