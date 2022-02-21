package com.kay.progayim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class SimpleAdapter(
    private val itemClick: (pos: Int) -> Unit,
    private val deleteClick: (pos: Int) -> Unit,
) : RecyclerView.Adapter<SimpleAdapter.ViewHolder>() {
    private var list = listOf<String>()

    fun setData(list: List<String>) {
        this.list = list
        notifyDataSetChanged()
    }

    fun removeItem(pos: Int) {
        list = list.toMutableList().apply { removeAt(pos) }
        notifyItemRemoved(pos)
        notifyItemRangeChanged(pos, list.size)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(itemView, itemClick, deleteClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class ViewHolder(
        itemView: View,
        private val itemClick: (pos: Int) -> Unit,
        private val deleteClick: (pos: Int) -> Unit,
    ) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: String) {
            val txt = itemView.findViewById<AppCompatTextView>(R.id.item_txt)
            val deleteBtn = itemView.findViewById<AppCompatButton>(R.id.itemDelete)
            txt.text = item
            itemView.setOnClickListener {
                itemClick.invoke(adapterPosition)
            }

            deleteBtn.setOnLongClickListener {
                deleteClick.invoke(adapterPosition)
                true
            }
        }
    }
}