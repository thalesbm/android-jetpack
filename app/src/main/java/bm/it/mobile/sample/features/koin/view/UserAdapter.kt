package bm.it.mobile.sample.features.koin.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import bm.it.mobile.sample.R
import bm.it.mobile.sample.features.koin.model.UserModel
import kotlinx.android.synthetic.main.adapter_koin.view.*

class UserAdapter : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    private val list by lazy {
        mutableListOf<UserModel>()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_koin, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = list[position]
        holder.textview.text = item.name
    }

    fun updateList(newList: List<UserModel>) {
        this.list.clear()
        this.list.addAll(newList)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview = itemView.adapterTextview
    }
}