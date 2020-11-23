package com.example.thirtythrows

enum class DiceFace(
    val points: Int,
    val whiteImageResource: Int,
    val redImageResource: Int
) {
    ONE(1, R.drawable.white1, R.drawable.red1),
    TWO(2, R.drawable.white2, R.drawable.red2),
    THREE(3, R.drawable.white3, R.drawable.red3),
    FOUR(4, R.drawable.white4, R.drawable.red4),
    FIVE(5, R.drawable.white5, R.drawable.red5),
    SIX(6, R.drawable.white6, R.drawable.red6)
}