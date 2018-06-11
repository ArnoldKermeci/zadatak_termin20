package com.example.androiddevelopment.zadatak_termin20.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.androiddevelopment.zadatak_termin20.R;
import com.example.androiddevelopment.zadatak_termin20.fragments.SviGlumciFragment;

import java.util.List;

public class GlumacAdapter extends RecyclerView.Adapter<GlumacAdapter.ViewHolder>  {
    private List<String> glumacs;
    private SviGlumciFragment.OnItemSelectedListener listener;

    public GlumacAdapter(SviGlumciFragment.OnItemSelectedListener listener, List<String> fruits) {
        this.glumacs = glumacs;
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_glumac_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final int pos = position;
        holder.textView.setText(glumacs.get(position));
        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemSelected(pos);
            }
        });
    }

    @Override
    public int getItemCount() {
        return glumacs.size();
    }



    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public ViewHolder(View v) {
            super(v);
            textView = (TextView) v.findViewById(R.id.text);
        }
    }
}
