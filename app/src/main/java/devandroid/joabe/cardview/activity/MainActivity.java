package devandroid.joabe.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import devandroid.joabe.cardview.R;
import devandroid.joabe.cardview.adapter.PostagemAdapter;
import devandroid.joabe.cardview.model.Postagem;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Postagem> ListaPostagem = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 1);

        recyclerView.setLayoutManager(layoutManager);

        prepararPostagem();

        PostagemAdapter adapter = new PostagemAdapter(ListaPostagem);
        recyclerView.setAdapter(adapter);
    }

    public void prepararPostagem(){

        Postagem p = new Postagem("@Joabe_rochadel", "Viagem Bahamas", R.drawable.imagem1);
        ListaPostagem.add(p);
        p = new Postagem("@JR_2703", "Trabalho", R.drawable.imagem2);
        ListaPostagem.add(p);
        p = new Postagem("@123_milhas", "Propaganda paga", R.drawable.imagem3);
        ListaPostagem.add(p);
        p = new Postagem("@123_milhas", "Propaganda paga", R.drawable.imagem4);
        ListaPostagem.add(p);

    }
}