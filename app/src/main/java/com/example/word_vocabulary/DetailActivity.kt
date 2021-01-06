package com.example.word_vocabulary

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.word_vocabulary.databinding.ActivityDetailBinding

/*class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val letterId = intent?.extras?.getString("letter").toString()
        recyclerView.adapter = WordAdapter(letterId, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.addItemDecoration(
                DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
        title = getString(R.string.detail_prefix) + " " + letterId
    }
}*/
class DetailActivity : AppCompatActivity() {

    companion object {
        val LETTER = "letter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val letterId = intent?.extras?.getString(DetailActivity.LETTER).toString()

        recyclerView.adapter = WordAdapter(letterId, this)

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )

        title = getString(R.string.detail_prefix) + " " + letterId


    }
}