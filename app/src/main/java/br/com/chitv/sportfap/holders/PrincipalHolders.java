package br.com.chitv.sportfap.holders;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import br.com.chitv.sportfap.R;
import br.com.chitv.sportfap.activity.EventoActivity;

public class PrincipalHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView categoriaIcon;
    public TextView categoriaText;

    public PrincipalHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        categoriaIcon = (ImageView) itemView.findViewById(R.id.categoria_icon);
        categoriaText = (TextView) itemView.findViewById(R.id.categoria_text);
    }

    @Override
    public void onClick(View view) {
        switch (getAdapterPosition()){
            case 0:
                Intent intent = new Intent(view.getContext(), EventoActivity.class);
                view.getContext().startActivity(intent);
                break;
            default:
                Toast.makeText(view.getContext(), "Clicked Position = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
