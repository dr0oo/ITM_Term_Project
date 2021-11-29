package com.example.itm_term_project

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.nambimobile.widgets.efab.ExpandableFab
import com.nambimobile.widgets.efab.ExpandableFabLayout
import com.nambimobile.widgets.efab.FabOption

class ScoreStorage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.score_stroage)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        val fab: FabOption = findViewById(R.id.fab_menu_setting)

        fab.setOnClickListener(View.OnClickListener {
            val hw: TextView = findViewById(R.id.hw)
            hw.setText("fab clicked")
        })


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.pi -> {
            val intent = Intent(this, PersonalInformation::class.java)
            startActivity(intent)
            true
        }

        R.id.str -> {
            val intent = Intent(this, ScoreStorage::class.java)
            startActivity(intent)
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

}