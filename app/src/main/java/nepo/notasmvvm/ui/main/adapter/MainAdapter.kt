package nepo.notasmvvm.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_item.view.*
import nepo.notasmvvm.R
import nepo.notasmvvm.domain.Item

class MainAdapter(val listItem: MutableList<Item>?) : RecyclerView.Adapter<MainViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_item,parent,false))
    }

    override fun getItemCount(): Int {
        if(listItem != null){
            return listItem.size
        }else return 0}

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bindViewHolder(listItem!![position])
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