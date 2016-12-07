package br.com.chitv.sportfap.adapter;

        import android.content.Context;
        import android.support.v7.widget.RecyclerView;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;


        import java.util.List;

        import br.com.chitv.sportfap.R;
        import br.com.chitv.sportfap.model.CategoriaModel;
        import br.com.chitv.sportfap.holders.PrincipalHolders;

public class PrincipalAdapter extends RecyclerView.Adapter<PrincipalHolders> {

    private Context context;
    private List<CategoriaModel> itemList;

    public PrincipalAdapter(Context context, List<CategoriaModel> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @Override
    public PrincipalHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_categoria, null);
        PrincipalHolders rcv = new PrincipalHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(PrincipalHolders holder, int position) {
        holder.categoriaIcon.setImageResource(itemList.get(position).getIdIcon());
        holder.categoriaText.setText(itemList.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}
