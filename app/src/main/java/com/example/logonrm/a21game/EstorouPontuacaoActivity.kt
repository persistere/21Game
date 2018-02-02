package com.example.logonrm.a21game

import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_estorou_pontuacao.*

class EstorouPontuacaoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_estorou_pontuacao)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        tvPontuacaoFinal.text = intent.getStringExtra("PONTUACAO")

        val mediaPlayer = MediaPlayer.create(this, R.raw.explosao);
        mediaPlayer.start();
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}
