package com.assignment.arpit.unifest_2k19;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SponsorsAdapter extends RecyclerView.Adapter<SponsorsViewHolder> {

    private List<SponsorsInfo> sponcersList;

    public SponsorsAdapter(List<SponsorsInfo> sponcersList) {
        this.sponcersList = sponcersList;
    }

    @NonNull
    @Override
    public SponsorsViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card, viewGroup, false);

        return new SponsorsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SponsorsViewHolder viewHolder, int i) {

        SponsorsInfo si = sponcersList.get(i);
        viewHolder.imageView.setImageResource(Integer.parseInt(si.imagePath));
        viewHolder.textView.setText(si.textInfo);

    }

    @Override
    public int getItemCount() {
        return sponcersList.size();
    }

}

class SponsorsViewHolder extends RecyclerView.ViewHolder{

    protected TextView textView;
    protected ImageView imageView;

    public SponsorsViewHolder(View v){
        super(v);

        textView = v.findViewById(R.id.textView);
        imageView = v.findViewById(R.id.imageView);

    }
}

class SponsorsInfo {

    protected String imagePath;
    protected String textInfo;
}
