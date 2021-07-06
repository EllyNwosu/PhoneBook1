package com.mavis.games

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.mavis.games.databinding.ActivityMainBinding
import com.mavis.games.models.Animal
import com.mavis.games.adapter.AnimalAdapter
import com.mavis.games.adapter.OnItemClickListner
import com.mavis.games.models.PropertyActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), OnItemClickListner {
    private lateinit var binding: ActivityMainBinding
    private lateinit var animalAdapter: AnimalAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val animals: List<Animal> = mutableListOf(
            Animal(
                R.drawable.ic_dionsaur,
                firstname = "Wild",
                surname = "Dinosaur"
            ),
            Animal(
                R.drawable.ic_bat,
                firstname = "Bird",
                surname = "Bat"
            ),
            Animal(
                R.drawable.ic_crab,
                firstname = "Wild",
                surname = "Crab"
            ),
            Animal(
                R.drawable.ic_cat,
                firstname = "Pet",
                surname = "Cat"
            ),
            Animal(
                R.drawable.ic_cebra,
                firstname = "Forest",
                surname = "Zebra"
            ),
            Animal(
                R.drawable.ic_elefant,
                firstname = "Mammals",
                surname = "Elephant"
            ),
            Animal(
                R.drawable.ic_frog,
                firstname = "Water",
                surname = "Frog"
            ),
            Animal(
                R.drawable.ic_giraffe,
                firstname = "Mammals",
                surname = "Giraffe"
            ),
            Animal(
                R.drawable.ic_hen,
                firstname = "Bird",
                surname = "Hen"
            ),
            Animal(
                R.drawable.ic_horse,
                firstname = "Mammals",
                surname = "Horse"
            ),
            Animal(
                R.drawable.ic_krokodil,
                firstname = "Mammals",
                surname = "Crokodile"
            ),
            Animal(
                R.drawable.ic_schwein,
                firstname = "Mammals",
                surname = "Schwein"
            ),
            Animal(
                R.drawable.ic_tiger,
                firstname = "Wild",
                surname = "Tiger"
            ),
            Animal(
                R.drawable.ic_skunk,
                firstname = "Mammals",
                surname = "Skunk"
            ),
            Animal(
                R.drawable.ic_schwein,
                firstname = "Mammals",
                surname = "Schwein"
            ),  Animal(
                R.drawable.ic_grasshopper,
                firstname = "Insects",
                surname = "Grasshopper"
            ),
            Animal(
                R.drawable.ic_elefante,
                firstname = "Mammals",
                surname = "Elephant"
            ),
            Animal(
                R.drawable.ic_seahorse,
                firstname = "Mammals",
                surname = "Sea Horse"
            ),
            Animal(
                R.drawable.ic__342406378,
                firstname = "Car",
                surname = "Tyre"
            ),
            Animal(
                R.drawable.ic_cow,
                firstname = "Mammals",
                surname = "Cow"
            )
        )

        animalAdapter = AnimalAdapter(animals, clickListner = this)
        binding.animalRecycler.adapter = animalAdapter

    }

    override fun onItemClick(item: Animal, position: Int) {
        var intent = Intent(this, PropertyActivity::class.java)
        intent.putExtra("imageAnimal",item.picture.toString())
        intent.putExtra("textfirstname",item.firstname)
        intent.putExtra("textsurname",item.surname)
        startActivity(intent)
    }
}


//var intent = Intent(activity, ClickDetail::class.java)
//intent.putExtra("your_key",MainActivity.clickArray.toString())
//startActivity(intent)
//
//class ClickDetail : AppCompatActivity(){
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.traffic_click_detail)
//        val YourData =  getIntent().getStringExtra("your_key")
//    }
//}