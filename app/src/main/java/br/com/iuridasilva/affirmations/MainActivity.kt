package br.com.iuridasilva.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.iuridasilva.affirmations.adapter.ItemAdapter
import br.com.iuridasilva.affirmations.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Carregando dados iniciais
        val myDataSet = Datasource().loadAffirmations()

        //Passando os dados ao recycler inicial
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataSet)

        // quando se tem certeza que o conteúdo não altera o tamanho da layout
        recyclerView.setHasFixedSize(true)
    }
}