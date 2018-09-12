package com.example.umair.github_call;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
RecyclerView mRecView;
MRecyclerViewAdapter viewAdapter;

List<ProfileModel> profileModels;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecView=(RecyclerView)findViewById(R.id.mRecyclerView);
       // LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        mRecView.setLayoutManager(new GridLayoutManager(this,2));
        mRecView.setHasFixedSize(true);

        profileModels=new ArrayList<>();

        ProfileModel model=new ProfileModel(R.drawable.ic_launcher_background,"Ali");
        ProfileModel model1=new ProfileModel(R.drawable.ic_launcher_background,"Asad");
        ProfileModel model2=new ProfileModel(R.drawable.ic_launcher_background,"Akraam");
        profileModels.add(model);
        profileModels.add(model2);
        profileModels.add(model1);
        viewAdapter=new MRecyclerViewAdapter(profileModels);
        mRecView.setAdapter(viewAdapter);

    }
}
