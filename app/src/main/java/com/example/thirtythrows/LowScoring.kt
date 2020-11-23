package com.example.thirtythrows

class LowScoring : Scoring {
    override fun getScore(dice: Array<DiceFace>): Int {
        var score = 0
        dice.forEach { d ->
            run {
                if (d.points <= 3) {
                    score += d.points
                }
            }
        }
        return score
    }
}