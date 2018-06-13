package com.example.cjcu.test0531;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.viewHolder>{
    private List<Person> trans;

    @Override
    public viewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_row,parent,false);
        viewHolder vh = new viewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(viewHolder holder, int position) {
        Person person = trans.get(position);
        holder.cdate.setText(person.getCdate());
        holder.info.setText(person.getInfo());
        holder.amount.setText(person.getAmount());
    }

    @Override
    public int getItemCount() {
        return trans.size();
    }


    public class viewHolder extends RecyclerView.ViewHolder {
        private TextView cdate;
        private TextView info;
        private TextView amount;

        public viewHolder(View v) {
            super(v);
            cdate=v.findViewById(R.id.tv_cdate);
            info=v.findViewById(R.id.tv_info);
            amount=v.findViewById(R.id.tv_amount);


        }
    }

}
