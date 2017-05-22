package team.kaodim.com.interviewtask.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import team.kaodim.com.interviewtask.fragments.DetailsFragment;


public  class MyPagerAdapter extends FragmentPagerAdapter {

    private  int NUM_ITEMS = 1;
    private static String id = "";
    private static String name = "";
    private static String nic = "";
    private static String nationality = "";
    private static String mobile = "";


    public MyPagerAdapter(FragmentManager fragmentManager , String id, String name, String nic, String nationality, String mobile){
        super(fragmentManager);
        this.id = id;
        this.name = name;
        this.nic = nic;
        this.nationality = nationality;
        this.mobile = mobile;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
                return DetailsFragment.newInstance(id,name,nic,nationality,mobile);

        }

        return null;
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }
}