package team.kaodim.com.interviewtask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import team.kaodim.com.interviewtask.Activities.DataCollectionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(MainActivity.this, DataCollectionActivity.class);
        intent.putExtra("applicant_name", "Gerald Butler");
        intent.putExtra("applicant_id", "204");
        startActivity(intent);
        finish();

    }
}
