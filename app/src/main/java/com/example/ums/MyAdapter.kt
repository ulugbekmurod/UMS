package com.example.ums

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ums.databinding.ItemListBinding

class MyAdapter(var item:ArrayList<Model>, var clickListner: ClickListner):RecyclerView.Adapter<MyAdapter.UmsViewHolder>() {

    inner class UmsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

        val binding=ItemListBinding.bind(itemView)

        fun onBind(model: Model) {



            binding.apply {
                textView.text=model.tarif
                idtv.text=model.coding
                sumtv.text=model.sum

            }

            binding.cardM.setOnClickListener {
                clickListner.onClickItem(model)
            }



        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UmsViewHolder {
        val view=UmsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false))
        return view
    }

    override fun onBindViewHolder(holder: UmsViewHolder, position: Int) {
        holder.onBind(item[position])
    }

    override fun getItemCount(): Int {
        return item.size
    }
}


interface ClickListner{
    fun onClickItem(item: Model)
}