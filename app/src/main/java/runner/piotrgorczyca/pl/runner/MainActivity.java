package runner.piotrgorczyca.pl.runner;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mFirstDistanceBtn;
    private Button mSecondDistanceBtn;
    private Button mThirdDistanceBtn;
    private Button mFourthDistanceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFirstDistanceBtn = (Button) findViewById(R.id.first_distance_btn);
        mSecondDistanceBtn = (Button) findViewById(R.id.second_distance_btn);
        mThirdDistanceBtn = (Button) findViewById(R.id.third_distance_btn);
        mFourthDistanceBtn = (Button) findViewById(R.id.fourth_distance_btn);

        mFirstDistanceBtn.setOnClickListener(this);
        mSecondDistanceBtn.setOnClickListener(this);
        mThirdDistanceBtn.setOnClickListener(this);
        mFourthDistanceBtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onClick(View view) {

        switch(view.getId()) {

            case R.id.first_distance_btn:
                Toast.makeText(MainActivity.this, "Choosed 1-4 km", Toast.LENGTH_SHORT).show();
                break;

            case R.id.second_distance_btn:
                Toast.makeText(MainActivity.this, "Choosed 5-8 km", Toast.LENGTH_SHORT).show();
                break;

            case R.id.third_distance_btn:
                Toast.makeText(MainActivity.this, "Choosed 9-14 km", Toast.LENGTH_SHORT).show();
                break;

            case R.id.fourth_distance_btn:
                Toast.makeText(MainActivity.this, "Choosed > 15 km", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
