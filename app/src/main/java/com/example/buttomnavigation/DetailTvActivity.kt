package com.example.buttomnavigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_detail_tv.*


class DetailTvActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_DATA = "extra_data"
    }

    var tv: Tv? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_tv)

        tv = intent.getParcelableExtra(EXTRA_DATA)

        tv_name.text = tv?.name
        tv_overview.text = tv?.overview

        Glide.with(img_poster).load(IMAGE_BASE + tv!!.poster).into(img_poster)
    }
}
