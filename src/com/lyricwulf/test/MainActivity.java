package com.lyricwulf.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE="com.lyricwulf.test.MESSAGE";
	
	private void openSearch() {
		//temporary
	    Toast.makeText(this, "Search button pressed", Toast.LENGTH_SHORT).show();
	}
	
	private void openSettings() {
		//temporary
	    Toast.makeText(this, "Settings button pressed", Toast.LENGTH_SHORT).show();
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	// Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
        
    public void sendMessage(View view) {	
    Intent intent = new Intent(this, DisplayMessageActivity.class);	
    EditText editText = (EditText) findViewById(R.id.edit_message);	
    String message = editText.getText().toString();	
    intent.putExtra(EXTRA_MESSAGE, message);	
    startActivity(intent);	
    } 	
    
}
