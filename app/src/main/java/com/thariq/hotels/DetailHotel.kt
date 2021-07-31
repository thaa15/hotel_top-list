package com.thariq.hotels

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView

class DetailHotel : AppCompatActivity() {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_RATE = "extra_rate"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PHONE = "extra_phone"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_hotel)

        val name_received :TextView = findViewById(R.id.tv_name_received)
        val price_received :TextView = findViewById(R.id.tv_price_received)
        val rate_received :RatingBar = findViewById(R.id.tv_rate_received)
        val photo_received :ImageView = findViewById(R.id.tv_photo_received)
        val phone_received :Button = findViewById(R.id.tv_phone_received)
        val detail_received : TextView = findViewById(R.id.tv_detail_received)

        val name = intent.getStringExtra(EXTRA_NAME)
        val detail = intent.getStringExtra(EXTRA_DETAIL)
        val price = intent.getStringExtra(EXTRA_PRICE)
        val rate = intent.getStringExtra(EXTRA_RATE)
        val phone = intent.getStringExtra(EXTRA_PHONE)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        name_received.text = name
        price_received.text = price
        rate?.also { rate_received.rating = it.toFloat() }
        photo_received.setImageResource(photo)
        detail_received.text = detail

        phone_received.setOnClickListener {
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
            startActivity(dialPhoneIntent)
        }
    }
}