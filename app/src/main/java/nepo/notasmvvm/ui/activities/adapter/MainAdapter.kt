package nepo.notasmvvm.ui.activities.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_item.view.*
import nepo.notasmvvm.R
import nepo.notasmvvm.model.domain.Item

class MainAdapter(val listItem: MutableList<List<Item>>? = mutableListOf()) : RecyclerView.Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.card_item,
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        if(listItem != null){
            return listItem.size
        }else return 0}

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindViewHolder(listItem.get(position))
    }

    fun add(item: Item?){
        listItem?.add(item)
        notifyDataSetChanged()
    }

    fun add(itens: List<Item>){
        listItem!!.clear()
        listItem!!.addAll(itens)
        notifyDataSetChanged()
    }

    fun remove(item:Item){
        listItem!!.add(item)
        notifyDataSetChanged()
    }

}
class MainViewHolder(var v:View) : RecyclerView.ViewHolder(v){

    fun bindViewHolder(item:Item){
        // has access to all of, element paraments
        with(v){
            txt_nameitem.text = item.name
        }
    }

}