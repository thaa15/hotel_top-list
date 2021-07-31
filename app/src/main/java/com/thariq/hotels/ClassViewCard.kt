package com.thariq.hotels

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class ClassViewCard internal constructor(private val listHotel: ArrayList<Hotels>) : RecyclerView.Adapter<ClassViewCard.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_hotel, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val hero = listHotel[position]
        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = hero.name
        holder.tvRate.rating = hero.rate.toFloat()
        holder.tvPrice.text = hero.price
        holder.btnDetail.setOnClickListener { v->
            Toast.makeText(
                holder.itemView.context,
                "Detail " + listHotel[position].name,
                Toast.LENGTH_SHORT
            ).show()
            val moveToDetail = Intent(v.context, DetailHotel::class.java)
            moveToDetail.putExtra(DetailHotel.EXTRA_NAME, listHotel[position].name)
            moveToDetail.putExtra(DetailHotel.EXTRA_PRICE, listHotel[position].price)
            moveToDetail.putExtra(DetailHotel.EXTRA_RATE, listHotel[position].rate)
            moveToDetail.putExtra(DetailHotel.EXTRA_PHONE, listHotel[position].phone)
            moveToDetail.putExtra(DetailHotel.EXTRA_DETAIL, listHotel[position].detail)
            moveToDetail.putExtra(DetailHotel.EXTRA_PHOTO, listHotel[position].photo)
            v.context.startActivity(moveToDetail)
        }
    }

    override fun getItemCount(): Int {
        return listHotel.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvRate: RatingBar = itemView.findViewById(R.id.tv_item_rate)
        var tvPrice: TextView = itemView.findViewById(R.id.tv_item_price)
        var btnDetail: Button = itemView.findViewById(R.id.btn_set_detail)
    }
}