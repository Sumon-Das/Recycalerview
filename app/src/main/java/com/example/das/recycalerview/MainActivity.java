package com.example.das.recycalerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {


     RecyclerView recyclerView;

   int[] images={
           R.drawable.bagladesh,
           R.drawable.brazil,
           //R.drawable.in,
           R.drawable.pakisthan,
           R.drawable.singapur,
           R.drawable.spain,
           R.drawable.turkey,
           R.drawable.bagladesh,
           R.drawable.brazil,
           //R.drawable.in,
           R.drawable.pakisthan,
           R.drawable.singapur,
           R.drawable.spain,
           R.drawable.turkey,
   };
   String [] title;
   String [] detail;

   Myadapter myadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerViewID);
        title=getResources().getStringArray(R.array.country_name);
        detail=getResources().getStringArray(R.array.country_detail);

        myadapter=new Myadapter(this,title,detail,images);
            recyclerView.setAdapter(myadapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
       // Toast.makeText(this, "kfdfkdfkd", Toast.LENGTH_SHORT).show();

    }
}
