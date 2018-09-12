package com.example.umair.github_call;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MRecyclerViewAdapter extends RecyclerView.Adapter<MRecyclerViewAdapter.MListViewHolder> {
private List<ProfileModel> profileModels;
    public MRecyclerViewAdapter(List<ProfileModel> profileModels){
        this.profileModels=profileModels;
    }
    @NonNull
    @Override
    public MListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context=viewGroup.getContext();
        int layoutInflatorID=R.layout.list_item;
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately=false;
        View view=layoutInflater.inflate(layoutInflatorID,viewGroup,shouldAttachToParentImmediately);
        MListViewHolder mListViewHolder=new MListViewHolder(view);

        return mListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MListViewHolder mListViewHolder, int i) {
    ProfileModel profileModel=profileModels.get(i);
    mListViewHolder.bind(profileModel);
    }

    @Override
    public int getItemCount() {
        return profileModels.size();
    }

    public class MListViewHolder extends RecyclerView.ViewHolder{
        CircleImageView mListImgView;
        TextView mListTextView;
        public MListViewHolder(@NonNull View itemView) {
            super(itemView);
            mListImgView=itemView.findViewById(R.id.circularImage);
            mListTextView=itemView.findViewById(R.id.txt_list);
        }

        void bind(ProfileModel mModel){
           mListImgView.setImageResource(mModel.getProfileImageId());
           mListTextView.setText(mModel.getProfileUserName());
        }
    }
}
