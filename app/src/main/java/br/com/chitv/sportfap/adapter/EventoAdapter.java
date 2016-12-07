package br.com.chitv.sportfap.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.dao.EventosDao;
import br.com.chitv.sportfap.holders.EventoHolders;

/**
 * Created by c019 on 07/12/2016.
 */

public class EventoAdapter extends RecyclerView.Adapter<EventoHolders> {

    private Context context;
    private List<EventosDao> itemList;

    public EventoAdapter(Context context, List<EventosDao> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public EventoHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_evento, null);
        EventoHolders rcv = new EventoHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(EventoHolders holder, int position) {
        holder.eventoText.setText(itemList.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}