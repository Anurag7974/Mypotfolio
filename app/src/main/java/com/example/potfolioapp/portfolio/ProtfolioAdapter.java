package com.example.potfolioapp.portfolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.potfolioapp.R;

import java.util.List;

public class ProtfolioAdapter extends RecyclerView.Adapter<ProtfolioAdapter.PortfolioViewHolder> {

    List<ProtfolioItem> mdata;

    public ProtfolioAdapter(List<ProtfolioItem> mdata) {
        this.mdata = mdata;
    }

    @NonNull
    @Override
    public PortfolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_portolio,parent,false);

        return new PortfolioViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull PortfolioViewHolder holder, int position) {

        holder.tvPosition.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class PortfolioViewHolder extends RecyclerView.ViewHolder{

        TextView tvPosition;

        public PortfolioViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPosition = itemView.findViewById(R.id.item_port_text);
        }
    }
}
