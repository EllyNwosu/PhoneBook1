package com.mavis.games.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mavis.games.MainActivity
import com.mavis.games.databinding.ActivityMainBinding
import com.mavis.games.databinding.AnimalBinding
import com.mavis.games.models.Animal
import com.mavis.games.models.PropertyActivity

class AnimalAdapter(val animals: List<Animal>, var clickListner: OnItemClickListner): RecyclerView.Adapter<AnimalAdapter.AnimalViewHolder>() {
    class AnimalViewHolder(var binding: AnimalBinding): RecyclerView.ViewHolder(binding.root){
        fun initialize(item: Animal, action : OnItemClickListner){
            binding.txFirstname.text = item.firstname
            binding.txSurname.text = item.surname
            binding.viewPicture.setImageResource(item.picture)

            itemView.setOnClickListener {
                action.onItemClick(item, adapterPosition)
            }
        }
        fun bind(animal: Animal){
            binding.apply {
                txFirstname.text = animal.firstname
                txSurname.text = animal.surname
                viewPicture.setImageResource(animal.picture)
//                root.setOnClickListener {
//                    var intent: Intent = Intent(this@AnimalViewHolder, PropertyActivity::class.java)
//
//                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimalViewHolder {
        val binding = AnimalBinding.inflate(LayoutInflater.from(parent.context))
        return AnimalViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AnimalViewHolder, position: Int) {
        val animal = animals[position]
        holder.bind(animal)
        holder.initialize(animals.get(position), clickListner)
    }

    override fun getItemCount(): Int {
        return animals.size
    }
}

interface OnItemClickListner{
    fun onItemClick(item: Animal, position: Int)
}