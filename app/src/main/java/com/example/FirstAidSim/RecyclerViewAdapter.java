package com.example.FirstAidSim;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Course> mData;


    public RecyclerViewAdapter(Context mContext, ArrayList<Course> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.custom_view,parent,false);


        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.course_title.setText(mData.get(position).getCourseName());
        holder.course_thumbnail.setImageResource(mData.get(position).getThumbnail_course());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext,CourseActivity.class);
                intent.putExtra("Title",mData.get(position).getCourseName());
                intent.putExtra("Description",mData.get(position).getDescription());
                mContext.startActivity(intent);
            }
        });




    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView course_title;
        ImageView course_thumbnail;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            course_title = (TextView) itemView.findViewById(R.id.title_id);
            course_thumbnail = (ImageView) itemView.findViewById(R.id.image_id);
            cardView = (CardView) itemView.findViewById(R.id.card_view_id);
        }

        @Override
        public void onClick(View v) {
            Log.i("RC", "CLICKED!");
        }
    }
}
