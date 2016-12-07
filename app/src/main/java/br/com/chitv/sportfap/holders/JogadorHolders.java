package br.com.chitv.sportfap.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import br.com.chitv.sportfap.R;

/**
 * Created by c019 on 07/12/2016.
 */

public class JogadorHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView jogadorIcon;
    public TextView jogadorText;
    public TextView jogadorNum;

    public JogadorHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        jogadorIcon = (ImageView) itemView.findViewById(R.id.jogador_icon);
        jogadorText = (TextView) itemView.findViewById(R.id.jogador_text);
        jogadorNum = (TextView) itemView.findViewById(R.id.jogador_num);
    }

    @Override
    public void onClick(View view) {
        switch (getAdapterPosition()) {
            case 0:
                Toast.makeText(view.getContext(), "Jogador", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(view.getContext(), "Clicked Position = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
