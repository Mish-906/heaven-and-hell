package com.example.heavenandhell

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class IteamsActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_iteams2)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Iteam>()

        items.add(Iteam(1, "armor", "рапира кровавой розы",
            "изящное оружие совмещает эпатаж и силу",
            "2д6+1д6 ядом. Противник должен пройти спасбросок по тел равным 13 или будет оглушен на раунд.",
            100))

        items.add(Iteam(2, "plant", "семена лечащего гриба",
            "светящийся теплым светом гриб",
            "При посадке этого растения в радиусе 10ф от него все существа восстанавливают 1д10.",
            150))

        items.add(Iteam(3, "potion", "зелье временной жизни",
            "кратковременное здоровье",
            "В течение 2 часов вы получаете 1д10 временных хитов",
            150))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = IteamsAdapter(items, this)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}