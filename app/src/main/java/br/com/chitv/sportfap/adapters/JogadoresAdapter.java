package br.com.chitv.sportfap.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import br.com.chitv.sportfap.R;

/**
 * Created by c019 on 26/11/2016.
 */

public class JogadoresAdapter extends RecyclerView.Adapter<JogadoresAdapter.ViewHolder> {

    private List listAdp;
    private LayoutInflater layoutInflaterAdp;

    public JogadoresAdapter(Context context, List list){
        this.listAdp = list;
        layoutInflaterAdp = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = layoutInflaterAdp.inflate(R.layout.adp_jogadores, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tvModel.setText(String.valueOf(listAdp.get(position)));
    }

    @Override
    public int getItemCount() {
        return listAdp.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvModel, tvBrand;

        public ViewHolder(View itemView) {
            super(itemView);

            tvModel = (TextView) itemView.findViewById(R.id.tv_model);
            tvBrand = (TextView) itemView.findViewById(R.id.tv_brand);
        }
    }

}
