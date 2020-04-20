package bm.it.mobile.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.adapter_main.view.*

class MainListAdapter(private val list: List<Features>,
                      private val callback: MainAdapterCallback) : RecyclerView.Adapter<MainListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_main, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = list[position].name
        holder.description.text = list[position].description

        holder.view.setOnClickListener {
            callback.onPressed(list[position].id)
        }
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.adapterMainNameTextview
        val description = itemView.adapterMainDescriptionTextview
        val view = itemView.adapterMainNameView
    }

    interface MainAdapterCallback {
        fun onPressed(item: Int)
    }
}