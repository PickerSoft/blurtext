package com.picker.blurtext

import android.graphics.BlurMaskFilter
import android.graphics.MaskFilter
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.MaskFilterSpan
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onBlur(view: View) {
        val blurMask: MaskFilter = BlurMaskFilter(5f, BlurMaskFilter.Blur.NORMAL)
        val text = SpannableString("Text with blur mask")
        text.setSpan(MaskFilterSpan(blurMask), 5, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val blurMask2: MaskFilter = BlurMaskFilter(10f, BlurMaskFilter.Blur.NORMAL)
        text.setSpan(MaskFilterSpan(blurMask2), 10, 14, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        val blurMask3: MaskFilter = BlurMaskFilter(15f, BlurMaskFilter.Blur.NORMAL)
        text.setSpan(MaskFilterSpan(blurMask3), 15, 19, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        var tv = findViewById<TextView>(R.id.textView)
        tv.text = text
    }

    fun onOriginal(view: View) {
        val text = SpannableString("Text with blur mask")
        var tv = findViewById<TextView>(R.id.textView)
        tv.text = text
    }
}