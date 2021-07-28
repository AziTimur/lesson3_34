package com.geek.lesson3by34;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
   private ArrayList<Country>list=new ArrayList<>();

   public void addlist(ArrayList<Country>list){
       this.list.addAll(list);
       notifyDataSetChanged();
   }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
       TextView county_tv,capital_tv;
       ImageView img_v;
        public ViewHolder(View view) {
            super(view);
            county_tv = view.findViewById(R.id.county_tv);
            capital_tv = view.findViewById(R.id.capital_tv);
            img_v = view.findViewById(R.id.img_v);
        }

        public void onBind(Country country) {
            img_v.setImageResource(country.getImg_iv());
            county_tv.setText(county_tv.getText());
            capital_tv.setText(capital_tv.getText());
        }
    }
}
