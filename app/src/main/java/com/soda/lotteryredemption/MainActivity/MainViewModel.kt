package com.soda.lotteryredemption.MainActivity

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.soda.lotteryredemption.Prize
import com.soda.lotteryredemption.PrizeList

class MainViewModel(application: Application):AndroidViewModel(application) {
    val filterLiveData = MutableLiveData<List<Prize>>()

    fun filterData(code:String){
        if (code.isEmpty()){
            filterLiveData.value = PrizeList
        }else{
            val tempList = mutableListOf<Prize>()
            val upperCaseCode= code.toUpperCase()
            PrizeList.forEach {
                if (comparePrizeName(upperCaseCode,it)){
                    tempList.add(it)
                }
            }
            filterLiveData.value = tempList
        }
    }

    private fun comparePrizeName(code: String,prize: Prize):Boolean{
        return when (code.length){
            1->{
                prize.code.contains(code)
            }
            2->{
                convert2LetterList(prize).contains(code)
            }
            3->{
                convert3LetterList(prize).contains(code)
            }
            else->{
                false
            }
        }
    }

    private fun convert2LetterList(prize: Prize):List<String>{
        val c1 = prize.code[0].toString()
        val c2 = prize.code[1].toString()
        val c3 = prize.code[2].toString()

        return listOf(
            c1+c2,
            c2+c1,
            c1+c3,
            c3+c1,
            c3+c2,
            c2+c3
        )
    }

    private fun convert3LetterList(prize:Prize):List<String>{
        val c1 = prize.code[0].toString()
        val c2 = prize.code[1].toString()
        val c3 = prize.code[2].toString()

        return listOf(
            c1+c2+c3,
            c1+c3+c2,
            c2+c1+c3,
            c2+c3+c1,
            c3+c1+c2,
            c3+c2+c1
        )
    }

}