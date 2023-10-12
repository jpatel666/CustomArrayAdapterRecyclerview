package com.example.customarrayadapterrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AppAdapter extends RecyclerView.Adapter<AppAdapter.MyClass>{   //4 Times Alt+Enter

    MainActivity mainActivity;
    String[] appname;                    //Short Cut ;
    int[] appicon;


    public AppAdapter(MainActivity mainActivity, String[] appname, int[] appicon) {
        this.mainActivity = mainActivity;
        this.appname = appname;                                                   //Right Click---Generate---Constructor---Select All Now Last Okay
        this.appicon = appicon;
    }

    @NonNull
    @Override
    public AppAdapter.MyClass onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {   //parent

         //___Any                                                                              //
        View view = LayoutInflater.from(mainActivity).inflate(R.layout.app_item_layout,parent,false);
        MyClass myClass = new MyClass(view);
        return myClass;
    }

    @Override
    public void onBindViewHolder(@NonNull AppAdapter.MyClass holder, int position) {   //holder

     holder.tvAppname.setText(appname[position]);
     holder.ivAppicon.setImageResource(appicon[position]);

    }

    @Override
    public int getItemCount() {
        return appicon.length;
    }

    public class MyClass extends RecyclerView.ViewHolder {

        ImageView ivAppicon;

        TextView tvAppname;
        public MyClass(@NonNull View itemView) {  //itemView
            super(itemView);

            ivAppicon = itemView.findViewById(R.id.ivAppicon);
            tvAppname = itemView.findViewById(R.id.tvAppname);



        }
    }
}
