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

    public ImageView countryPhoto;
    public TextView countryText;

    public PrincipalHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        countryPhoto = (ImageView) itemView.findViewById(R.id.country_photo);
        countryText = (TextView) itemView.findViewById(R.id.country_text);
    }

    @Override
    public void onClick(View view) {
        switch (getAdapterPosition()){
            case 0:
                Intent intent = new Intent(view.getContext(), EventoActivity.class);
                view.getContext().startActivity(intent);
                break;
        }
        Toast.makeText(view.getContext(), "Clicked Position = " + getAdapterPosition(), Toast.LENGTH_SHORT).show();
    }

}
