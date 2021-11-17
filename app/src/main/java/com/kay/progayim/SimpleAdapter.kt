package com.kay.progayim

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter : RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {
    private var list = listOf<String>()

    fun setData(list: List<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        Log.e("TAG", "Berg: onCreateViewHolder")
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Log.e("TAG", "Berg: onBindViewHolder, pos= $position")
        val text = list[position]
        holder.bind(text)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        fun bind(title: String) {
            val txt = view.findViewById<AppCompatTextView>(R.id.item_txt)
            txt.text = title
        }
    }
}