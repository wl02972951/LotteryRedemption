package com.soda.lotteryredemption.MainActivity

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.soda.lotteryredemption.AllCapTransformationMethod
import com.soda.lotteryredemption.PrizeList
import com.soda.lotteryredemption.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var mViewModel : MainViewModel
    private val mAdapter by lazy { PrizeAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(application).create(MainViewModel::class.java)
        initView()
        initModel()
    }

    private fun initView(){
        rvList.setHasFixedSize(true)
        rvList.layoutManager= LinearLayoutManager(this)
        rvList.adapter = mAdapter
        mAdapter.setData(PrizeList)

        Glide.with(ivTurtle).load(R.drawable.turtul).into(ivTurtle)
        containerGonGoo.visibility = View.INVISIBLE

        etCode.transformationMethod = AllCapTransformationMethod(true);
        etCode.addTextChangedListener {
            mViewModel.filterData(it.toString())
        }

    }
    private fun initModel(){
        mViewModel.filterLiveData.observe(this, Observer {
            mAdapter.setData(it)
            containerGonGoo.visibility = if (it.isEmpty()) View.VISIBLE else View.INVISIBLE
        })
    }

}