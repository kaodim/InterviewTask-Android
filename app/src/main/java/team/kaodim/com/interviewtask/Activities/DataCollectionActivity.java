package team.kaodim.com.interviewtask.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import team.kaodim.com.interviewtask.MainActivity;
import team.kaodim.com.interviewtask.Models.User;
import team.kaodim.com.interviewtask.R;

public class DataCollectionActivity extends AppCompatActivity {

    EditText etNic, etMobile;
    Spinner spNationality;
    Button btnSubmit;
    User user;
    ArrayList<String> nationalities = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_collection);

        //Set title of Activity
        setTitle(getString(R.string.title_submit_details));

        //Initialize UI elements
        etNic = (EditText) findViewById(R.id.etNic);
        etMobile = (EditText) findViewById(R.id.etMobile);
        spNationality = (Spinner) findViewById(R.id.spNationality);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        InitializeNationalities();

        //Set Nationalities
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.custom_spinner_item, nationalities);
        spNationality.setAdapter(adapter);

        //region OnClick methods

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = new User();
                user.setId(getIntent().getExtras().getString("applicant_id"));
                user.setName(getIntent().getExtras().getString("applicant_name"));
                user.setNic(etNic.getText().toString());
                user.setNic(spNationality.getSelectedItem().toString());
                user.setNic(etMobile.getText().toString());
                submitDetails(user);
            }
        });

        //endregion

    }

    private void submitDetails(User user) {

        //Toast.makeText(DataCollectionActivity.this, getString(R.string.welcome) + user.getName() + ". " + getString(R.string.details_submitted), Toast.LENGTH_LONG).show();

        Intent intent = new Intent(DataCollectionActivity.this, UserDetailsActivity.class);
        intent.putExtra("id", user.getId());
        intent.putExtra("name", user.getName());
        intent.putExtra("nic", user.getNic());
        intent.putExtra("nationality", user.getNationality());
        intent.putExtra("mobile", user.getMobile());
        startActivity(intent);
    }

    private void InitializeNationalities() {
        nationalities.add("Australian");
        nationalities.add("French");
        nationalities.add("Indian");
        nationalities.add("Malaysian");
        nationalities.add("Pakistani");
        nationalities.add("Sri Lankan");
    }
}
