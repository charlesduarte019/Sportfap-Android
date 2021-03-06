package br.com.chitv.sportfap.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.model.JogadorModel;
import br.com.chitv.sportfap.holders.JogadorHolders;

/**
 * Created by c019 on 07/12/2016.
 */

public class JogadorAdapter  extends RecyclerView.Adapter<JogadorHolders> {

    private Context context;
    private List<JogadorModel> itemList;

    public JogadorAdapter(Context context, List<JogadorModel> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public JogadorHolders onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_jogador, null);
        JogadorHolders rcv = new JogadorHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(JogadorHolders holder, int position) {
        holder.jogadorIcon.setImageResource(itemList.get(position).getIdIcon());
        holder.jogadorText.setText(itemList.get(position).getNome());
        holder.jogadorNum.setText(holder.jogadorNum.getText() + itemList.get(position).getNumero());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
