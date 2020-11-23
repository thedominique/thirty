package com.example.thirtythrows

import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashSet

class ValueScoring(target: Int) : Scoring {
    var target: Int = target

    override fun getScore(dice: Array<DiceFace>): Int {
        var sorted = dice.map { d -> DiceFace2(d) }.sortedBy { d -> d.points }
        var sum = combinationSum2(sorted, this.target)
        return 0
    }

    fun backTrack(
        currSum: Int,
        curr: MutableList<DiceFace2>,
        ans: MutableList<List<DiceFace2>?>,
        start: Int,
        candidates: List<DiceFace2>,
        target: Int
    ) {
        if (currSum == target) {
            ans.add(ArrayList(curr))
            return
        }
        val set: HashSet<DiceFace2> = HashSet()
        var i = start
        while (i < candidates.size) {
            if (currSum + candidates[i].points > target) {
                break //any integer after this can not be part of the solution
            }
            if (set.contains(candidates[i])) {
                i += 1
                continue
            }
            curr.add(candidates[i])
            backTrack(currSum + candidates[i].points, curr, ans, i + 1, candidates, target)
            curr.removeAt(curr.size - 1)
            set.add(candidates[i])
            i += 1
        }
    }

    fun combinationSum2(
        candidates: List<DiceFace2>,
        target: Int
    ): List<List<DiceFace2>?>? {
        val ans: MutableList<List<DiceFace2>?> = ArrayList()
        backTrack(0, LinkedList(), ans, 0, candidates, target)
        print(ans.toString())
        return ans
    }
}