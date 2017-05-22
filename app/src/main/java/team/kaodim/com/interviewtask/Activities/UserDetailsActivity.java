package team.kaodim.com.interviewtask.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import team.kaodim.com.interviewtask.R;
import team.kaodim.com.interviewtask.adapter.MyPagerAdapter;

public class UserDetailsActivity extends AppCompatActivity {

    ViewPager userDetailsViewPager;
    MyPagerAdapter userPagerAdapter;
    private String id = "";
    private String name = "";
    private String nic = "";
    private String nationality = "";
    private String mobile = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        userDetailsViewPager = (ViewPager) findViewById(R.id.viewPager);

        id = getIntent().getExtras().getString("id");
        name = getIntent().getExtras().getString("name");
        nic = getIntent().getExtras().getString("nic");
        nationality = getIntent().getExtras().getString("nationality");
        mobile = getIntent().getExtras().getString("mobile");

        userPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),id,name,nic,nationality,mobile);
        userDetailsViewPager.setAdapter(userPagerAdapter);

    }


}
