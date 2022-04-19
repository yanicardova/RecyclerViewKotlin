package com.wew.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.gatotkaca,
                nameSuperhero = "Gatot Kaca",
                descSuperhero = "Gatot Kaca adalah Pahlawan yang berasal dari indonesia"
            ),
            Superhero(
                R.drawable.aquaman,
                nameSuperhero = "Aquaman",
                descSuperhero = "Aquaman adalah Pahlawan yang berasal dari America"

            ),
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Antman",
                descSuperhero = "Antman adalah Pahlawan yang berasal dari America"
            ),
            Superhero(
                R.drawable.batgirl,
                nameSuperhero = "Batgirl",
                descSuperhero = "Batgirl adalah Pahlawan Wanita yang berasal dari America"
            ),
            Superhero(
                R.drawable.batman,
                nameSuperhero = "Batman",
                descSuperhero = "Batman adalah Pahlawan yang berasal dari America"
            ),
            Superhero(
                R.drawable.blackpanther,
                nameSuperhero = "Black Panther",
                descSuperhero = "Black Panther adalah Pahlawan yang berasal dari Africa"
            ),
            Superhero(
                R.drawable.captainamerika,
                nameSuperhero = "Captain America",
                descSuperhero = "Captain Amerika adalah Pahlawan yang berasal dari Jepang"
            ),
            Superhero(
                R.drawable.deadpool,
                nameSuperhero = "DeadPool",
                descSuperhero = "DeadPool adalah Pahlawan yang berasal dari America"
            ),
            Superhero(
                R.drawable.hulk,
                nameSuperhero = "Hulk",
                descSuperhero = "Hulk adalah Pahlawan yang berasal dari hasil Ekperimen"
            ),
            Superhero(
                R.drawable.ironman,
                nameSuperhero = "Ironman",
                descSuperhero = "Ironman adalah Pahlawan yang berasal dari America"
            ),
            Superhero(
                R.drawable.spiderman,
                nameSuperhero = "Spiderman",
                descSuperhero = "Spiderman adalah Pahlawan yang berasal dari Laba-Laba"
            ),
            Superhero(
                R.drawable.superman,
                nameSuperhero = "Superman",
                descSuperhero = "Superman adalah Pahlawan yang berasal dari America"
            ),
            Superhero(
                R.drawable.thor,
                nameSuperhero = "Thor",
                descSuperhero = "Thor adalah Pahlawan yang berasal dari America"
            ),
            Superhero(
                R.drawable.wonderwomen,
                nameSuperhero = "WonderWomen",
                descSuperhero = "WonderWomen adalah Pahlawan yang berasal dari Rahim Emaknya"
            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            
        }
    }
}