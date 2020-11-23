package com.example.thirtythrows

import junit.framework.Assert
import org.junit.Assert.*
import org.junit.Test

class ValueScoringTest {
    @Test
    fun testExample() {
        var dice: Array<DiceFace> = arrayOf(
            DiceFace.ONE,
            DiceFace.ONE,
            DiceFace.FOUR,
            DiceFace.ONE,
            DiceFace.TWO,
            DiceFace.FOUR
        )

        Assert.assertEquals(10, ValueScoring(5).getScore(dice))
    }
}