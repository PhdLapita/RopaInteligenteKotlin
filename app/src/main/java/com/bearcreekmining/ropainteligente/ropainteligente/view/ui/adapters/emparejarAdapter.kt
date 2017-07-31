package com.bearcreekmining.ropainteligente.ropainteligente.view.ui.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.bearcreekmining.ropainteligente.ropainteligente.R

/**
 * Created by lapita on 27/07/17.
 */
class emparejarAdapter : RecyclerView.Adapter<emparejarAdapter.ViewHolder>() {

    var mItems: ArrayList<String>  = ArrayList()
    lateinit var mClick : View.OnClickListener

    fun RecyclerAdapter(item : ArrayList<String>){
        this.mItems = item
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = mItems[position]
        holder.bind(item, position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_emparejar, parent, false))
    }

    override fun getItemCount(): Int {
        return mItems.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val card = view.findViewById(R.id.card) as TextView
        fun bind(str: String, position: Int){
            card.text = str
        }
    }
}