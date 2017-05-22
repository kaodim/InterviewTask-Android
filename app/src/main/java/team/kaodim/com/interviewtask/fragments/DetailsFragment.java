package team.kaodim.com.interviewtask.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import team.kaodim.com.interviewtask.R;


/**
 * Created by Caeser on 22/05/2017.
 */

public class DetailsFragment extends Fragment {

    private String id = "";
    private String name = "";
    private String nic = "";
    private String nationality = "";
    private String mobile = "";

    public static DetailsFragment newInstance(String id, String name, String nic, String nationality, String mobile){

        DetailsFragment fragment = new DetailsFragment();
        Bundle arg = new Bundle();
        arg.putString("id", id);
        arg.putString("name", name);
        arg.putString("nic",nic);
        arg.putString("nationality", nationality);
        arg.putString("mobile", mobile);
        fragment.setArguments(arg);
        return  fragment;


    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        id = getArguments().getString("id");
        name = getArguments().getString("name");
        nic = getArguments().getString("nic");
        nationality = getArguments().getString("nationality");
        mobile = getArguments().getString("mobile");

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_details, container, false);
        TextView id = (TextView) view.findViewById(R.id.id);
        TextView name = (TextView) view.findViewById(R.id.name);
        TextView nic = (TextView) view.findViewById(R.id.nic);
        TextView mobile = (TextView) view.findViewById(R.id.mobile);
        TextView nationality = (TextView) view.findViewById(R.id.nationality);

        id.setText(this.id);
        name.setText(this.name);
        nic.setText(this.nic);
        mobile.setText(this.mobile);
        nationality.setText(this.nationality);


        return view;
    }
}
