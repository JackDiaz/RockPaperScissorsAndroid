package com.example.rockpaperscissors;

import java.util.Random;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
	ImageView imageView1;
    ImageView imageView2;
    Choice playerChoice;
    Choice computerChoice;
    
    public enum Choice {
        CR, NUKE, FOOT
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "Your Message", Toast.LENGTH_LONG).show();
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    public void crButtonPressed(View view) {
        Toast.makeText(MainActivity.this, "1", Toast.LENGTH_LONG).show();
        imageView1.setImageResource(R.drawable.cr);
        playerChoice = Choice.CR;
        makeComputerChoice();
    }
     
    public void footButtonPressed(View view) {
        Toast.makeText(MainActivity.this, "2", Toast.LENGTH_LONG).show();

        imageView1.setImageResource(R.drawable.foot);
        playerChoice = Choice.FOOT;
        makeComputerChoice();
    }
     
    public void nukeButtonPressed(View view) {
        Toast.makeText(MainActivity.this, "3", Toast.LENGTH_LONG).show();

        imageView1.setImageResource(R.drawable.nuke);
        playerChoice = Choice.NUKE;
        makeComputerChoice();
    }
    
    public void makeComputerChoice() {
        Random generator = new Random();
        int randomInt = generator.nextInt(3);
        if (randomInt == 0) {
            computerChoice = Choice.CR;
            imageView2.setImageResource(R.drawable.cr);
        }else if(randomInt == 1) {
            computerChoice = Choice.FOOT;
            imageView2.setImageResource(R.drawable.foot);
        }else {
            computerChoice = Choice.NUKE;
            imageView2.setImageResource(R.drawable.nuke);
        }
    }
    

    
    
}
