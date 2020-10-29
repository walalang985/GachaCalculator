package apc.mobprog.gachacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        TextView result = findViewById( R.id.res );
        Button calc = findViewById( R.id.button );
        EditText character = findViewById( R.id.chara ), gamee = findViewById( R.id.game );
        calc.setOnClickListener( v -> result.setText( "Your chance of getting " + character.getText().toString() + " from the game " + gamee.getText().toString() + " is " + Double.toString( Math.random()*100 ) + "%" ) );
    }
}