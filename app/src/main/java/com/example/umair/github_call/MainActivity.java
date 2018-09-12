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
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);

        mRecView.setLayoutManager(layoutManager);
        mRecView.setHasFixedSize(true);

        profileModels=new ArrayList<>();

        ProfileModel model=new ProfileModel(R.drawable.pakistan,"Pakistan");
        ProfileModel model1=new ProfileModel(R.drawable.america,"America");
        ProfileModel model2=new ProfileModel(R.drawable.australia,"Australia");
        ProfileModel model3=new ProfileModel(R.drawable.canada,"Canada");
        ProfileModel model4=new ProfileModel(R.drawable.england,"England");
        ProfileModel model5=new ProfileModel(R.drawable.germany,"Germany");
        ProfileModel model6=new ProfileModel(R.drawable.iceland,"Iceland");
        ProfileModel model7=new ProfileModel(R.drawable.india,"India");
        ProfileModel model8=new ProfileModel(R.drawable.ukraine,"ukraine");
        ProfileModel model9=new ProfileModel(R.drawable.turkey,"Turkey");

        profileModels.add(model);
        profileModels.add(model2);
        profileModels.add(model1);
        profileModels.add(model3);
        profileModels.add(model4);
        profileModels.add(model5);
        profileModels.add(model6);
        profileModels.add(model7);
        profileModels.add(model8);
        profileModels.add(model9);
        viewAdapter=new MRecyclerViewAdapter(profileModels);
        mRecView.setAdapter(viewAdapter);

    }
}
