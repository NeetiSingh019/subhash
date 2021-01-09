package aw.environment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.MyViewHolder> {

    Context nContext;
    List<Found> nData;

    public RecyclerViewAdapter2(Context nContext, List<Found> nData) {
        this.nContext = nContext;
        this.nData = nData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v= LayoutInflater.from(nContext).inflate(R.layout.found_items, parent, false);
        MyViewHolder vholder=new MyViewHolder(v);
        return vholder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_header.setText(nData.get(position).getFound_header());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_header;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_header=(TextView)itemView.findViewById(R.id.found_header);
        }
    }
}

