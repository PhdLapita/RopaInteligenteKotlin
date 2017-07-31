package com.bearcreekmining.ropainteligente.ropainteligente.view.ui.actividades

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.bearcreekmining.ropainteligente.ropainteligente.R

class EmparejarActivity : AppCompatActivity() {
    lateinit var mRecyclerView : RecyclerView
    val mAdapter : RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emparejar)
    }
}
