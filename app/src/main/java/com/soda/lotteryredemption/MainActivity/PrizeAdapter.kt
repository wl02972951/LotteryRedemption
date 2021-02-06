package com.soda.lotteryredemption.MainActivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.soda.lotteryredemption.Prize
import com.soda.lotteryredemption.R

class PrizeAdapter() : RecyclerView.Adapter<PrizeAdapter.PrizeViewHolder>() {

    private var filterList = listOf<Prize>()

    fun setData(prizeList: List<Prize>) {
        filterList = prizeList
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PrizeViewHolder {
        return PrizeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_prize, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PrizeViewHolder, position: Int) {
        holder.bindView(filterList[position])
    }

    override fun getItemCount(): Int {
        return filterList.size
    }

    inner class PrizeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val tvCode = view.findViewById<TextView>(R.id.tvCode)
        private val tvPrize = view.findViewById<TextView>(R.id.tvPrize)
        private val tvEng = view.findViewById<TextView>(R.id.tvEng)
        private val tvIs777 = view.findViewById<TextView>(R.id.tvIs777)

        fun bindView(prize: Prize) {
            tvCode.text = prize.code
            tvPrize.text = prize.prize
            tvEng.text = prize.english
            tvIs777.visibility = if (prize.tripleSevenOnly) View.VISIBLE else View.INVISIBLE
        }
    }

}
