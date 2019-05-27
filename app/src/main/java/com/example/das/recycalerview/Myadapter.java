package com.example.das.recycalerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Myadapter extends RecyclerView.Adapter<Myadapter.Myviewholder> {

    Context context;
    String [] title;
    String [] detail;
    int [] images;

    public Myadapter(Context context, String[] title, String[] detail, int[] images) {
        this.context = context;
        this.title = title;
        this.detail = detail;
        this.images = images;
    }

    @NonNull
    @Override
    public Myadapter.Myviewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(context);
    View view=inflater.inflate(R.layout.sample_layout,viewGroup,false);

        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myadapter.Myviewholder myviewholder, int i) {
        myviewholder.textView.setText(title[i]);
        myviewholder.detail.setText(detail[i]);
        myviewholder.imageView.setImageResource(images[i]);

    }

    @Override
    public int getItemCount()
    {
        return images.length;
    }

    public class Myviewholder extends RecyclerView.ViewHolder {

TextView textView;
TextView detail;
ImageView imageView;



        public Myviewholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.titletextID);
            detail=itemView.findViewById(R.id.detailtextID);
            imageView=itemView.findViewById(R.id.imageID);
        }
    }
}
