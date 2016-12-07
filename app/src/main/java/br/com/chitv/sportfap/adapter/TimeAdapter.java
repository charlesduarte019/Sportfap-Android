package br.com.chitv.sportfap.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.model.TimeModel;
import br.com.chitv.sportfap.holders.TimeHolders;

/**
 * Created by c019 on 07/12/2016.
 */

public class TimeAdapter extends RecyclerView.Adapter<TimeHolders> {

    private Context context;
    private List<TimeModel> itemList;

    public TimeAdapter(Context context, List<TimeModel> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public TimeHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_time, null);
        TimeHolders rcv = new TimeHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(TimeHolders holder, int position) {
        holder.timeText.setText(itemList.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}
