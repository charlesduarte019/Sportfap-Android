package br.com.chitv.sportfap.holders;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.activity.EventoActivity;
import br.com.chitv.sportfap.activity.TimeActivity;

/**
 * Created by c019 on 07/12/2016.
 */

public class EventoHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView eventoText;

    public EventoHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        eventoText = (TextView) itemView.findViewById(R.id.evento_text);
    }

    @Override
    public void onClick(View view) {
        switch (getAdapterPosition()) {
            case 9:
                Intent intent = new Intent(view.getContext(), TimeActivity.class);
                view.getContext().startActivity(intent);
                break;
            default:
                Toast.makeText(view.getContext(), "Clicked Position = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
