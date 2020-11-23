package com.example.thirtythrows

import android.net.Uri
import android.widget.ImageView
import kotlin.properties.Delegates
import kotlin.random.Random

class Dice(view: ImageView) {
    private var view: ImageView by Delegates.notNull()
    private var keep: Boolean = false
    private var currentFace: DiceFace

    init {
        this.view = view
        this.currentFace = DiceFace.ONE;

        view.setOnClickListener {
            this.keep = this.keep.not()
            updateImage()
        }
    }

    private fun updateImage() {
        if (this.keep) {
            this.view.setImageURI(Uri.parse("android.resource://com.example.thirtythrows/" +this.currentFace.redImageResource))
        } else {
            this.view.setImageURI(Uri.parse("android.resource://com.example.thirtythrows/" +this.currentFace.whiteImageResource))
        }
    }

    fun removeKeep(){
        this.keep = false
        updateImage()
    }

    fun throwDice() {
        if (this.keep) {
            return
        }
        this.currentFace = DiceFace.values()[Random.nextInt(from = 0, until = 6)];
        updateImage()
    }

    public fun getFace(): DiceFace {
        return this.currentFace
    }
}