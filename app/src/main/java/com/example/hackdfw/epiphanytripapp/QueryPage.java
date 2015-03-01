package com.example.hackdfw.epiphanytripapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class QueryPage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query_page);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_query_page, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void startSearch(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, ChoiceListPage.class);
        EditText Query_edit_text_1 = (EditText) findViewById(R.id.Query_edit_text_1);
        String str1 = Query_edit_text_1.getText().toString().trim();

        EditText Query_edit_text_2 = (EditText) findViewById(R.id.Query_edit_text_2);
        String str2 = Query_edit_text_2.getText().toString().trim();
        int start_time = 0;
        if(str2.equals("") || str2.isEmpty())
            ;
        else {
            start_time = Integer.parseInt(str2);
        }
        EditText Query_edit_text_3 = (EditText) findViewById(R.id.Query_edit_text_3);
        String str3 = Query_edit_text_3.getText().toString().trim();
        int distance = Integer.parseInt(str3);

        if(!str1.isEmpty() && str1.equals("1")) {
            Toast.makeText(this, "Location equals 1.", Toast.LENGTH_SHORT).show();
        }
        else if(!str2.isEmpty() && start_time < 0){
            Toast.makeText(this, "Start time less than 0.", Toast.LENGTH_SHORT).show();
        }
        else if(!str3.isEmpty() && distance < 0){
            Toast.makeText(this, "Distance less than 0.", Toast.LENGTH_SHORT).show();
        }
        else
            startActivity(intent);
        //EditText editText = (EditText) findViewById(R.id.edit_message);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);

    }
}
