package faber.com.androidsimplelinux;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MyActivity extends ActionBarActivity {

    private TextView tvCmdLine;
    private TextView tvCmdRlt;

    private EditText etCmdIn;

    private Button btnRun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        iniView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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

    public void iniView(){
        tvCmdLine = (TextView) findViewById(R.id.tvCmdLine);
        tvCmdRlt = (TextView) findViewById(R.id.tvCmdRlt);

        etCmdIn = (EditText) findViewById(R.id.etCmdIn);

        btnRun = (Button) findViewById(R.id.btnRun );
        btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String commandInput = etCmdIn.getText().toString();
                tvCmdLine.setText(commandInput);
                tvCmdRlt.setText("This is the results.");
            }
        });
    }

}
