package com.example.thirtythrows

import junit.framework.Assert.assertEquals
import org.junit.Test

class LowScoringTest {

    @Test
    fun getScoreAllOnes() {
        var dice: Array<DiceFace> = arrayOf(
            DiceFace.ONE,
            DiceFace.ONE,
            DiceFace.ONE,
            DiceFace.ONE,
            DiceFace.ONE,
            DiceFace.ONE
        )

        assertEquals(6, LowScoring().getScore(dice))
    }

    @Test
    fun getScoreAllTwos() {
        var dice: Array<DiceFace> = arrayOf(
            DiceFace.TWO,
            DiceFace.TWO,
            DiceFace.TWO,
            DiceFace.TWO,
            DiceFace.TWO,
            DiceFace.TWO
        )

        assertEquals(12, LowScoring().getScore(dice))
    }

    @Test
    fun getScoreMixedScores() {
        var dice: Array<DiceFace> = arrayOf(
            DiceFace.TWO,
            DiceFace.FIVE,
            DiceFace.THREE,
            DiceFace.TWO,
            DiceFace.SIX,
            DiceFace.TWO
        )

        assertEquals(9, LowScoring().getScore(dice))
    }
}