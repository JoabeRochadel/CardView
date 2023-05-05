package devandroid.joabe.cardview.adapter;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import devandroid.joabe.cardview.R;
import devandroid.joabe.cardview.model.Postagem;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;
    public PostagemAdapter(List<Postagem> listaPostagens) {
        postagens = listaPostagens;

    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe,
                parent, false);

        return new MyViewHolder(itemLista);
    }



    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = postagens.get(position);
        holder.textView_Nome.setText(postagem.getNome());
        holder.textView_Postagem.setText(postagem.getPostagem());
        holder.imageView_Postagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagens.size() ;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textView_Nome;
        private TextView textView_Postagem;
        private ImageView imageView_Postagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView_Nome = itemView.findViewById(R.id.textoView_Nome);
            textView_Postagem = itemView.findViewById(R.id.textView_Postagem);
            imageView_Postagem = itemView.findViewById(R.id.imageView_Postagem);
        }
    }
}
