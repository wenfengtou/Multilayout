package com.android.moreitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.DetailViewHolder> {


    private ArrayList<String> mData;
    public DetailAdapter(ArrayList<String> data) {
        mData = data;
    }

    @NonNull
    @Override
    public DetailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_detail_item, parent,false);
        return new DetailViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DetailViewHolder holder, int position) {
        holder.detail_tv.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }


    class DetailViewHolder extends RecyclerView.ViewHolder {

        TextView detail_tv;
        public DetailViewHolder(@NonNull View itemView) {
            super(itemView);
            detail_tv = itemView.findViewById(R.id.rv_detail_tv);
        }
    }
}
