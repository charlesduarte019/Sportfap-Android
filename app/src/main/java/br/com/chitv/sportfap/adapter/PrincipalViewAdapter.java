package br.com.chitv.sportfap.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.holders.PrincipalHolders;

public class PrincipalViewAdapter extends RecyclerView.Adapter<PrincipalHolders> {

    private Context context;
    private ArrayList<Integer> itemListImg;
    private ArrayList<String> itemListText;

    public PrincipalViewAdapter(Context context, ArrayList<Integer> itemListImg, ArrayList<String> itemListText) {
        this.context = context;
        this.itemListImg = itemListImg;
        this.itemListText = itemListText;
    }

    @Override
    public PrincipalHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.categoria_icon_list, null);
        PrincipalHolders rcv = new PrincipalHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(PrincipalHolders holder, int position) {
        holder.countryPhoto.setImageResource(itemListImg.get(position));
        holder.countryText.setText(itemListText.get(position));
    }

    @Override
    public int getItemCount() {
        return this.itemListImg.size();
    }

}