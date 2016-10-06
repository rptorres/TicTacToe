package dai.com.tictactoe;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingActionButton fab = (FloatingActionButton)findViewById(R.id.btFAB);
        fab.setOnClickListener(this);
        Toolbar tb = (Toolbar)findViewById(R.id.toolBar);
        if (tb != null){
            setSupportActionBar(tb);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btFAB:
                Intent i = new Intent(this, SingelGameActivity.class);
                startActivity(i);
                break;
        }
    }
}
