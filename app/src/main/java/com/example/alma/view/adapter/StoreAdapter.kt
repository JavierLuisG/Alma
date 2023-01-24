package com.example.alma.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.alma.R

class StoreAdapter: RecyclerView.Adapter<StoreAdapter.ViewHolder>() {

     override fun onCreateViewHolder(viewGroup: ViewGroup, i:Int): ViewHolder{
          val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.cardview_store, viewGroup, false)
          return ViewHolder(v)
     }
     inner class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
         var itemImageViewProduct: ImageView
         var itemTxtTituloPrenda: TextView
         var itemTxtPrecio: TextView
         var itemTxtMaterial: TextView

         init{
              itemImageViewProduct = ItemView.findViewById(R.id.imageViewProduct)
              itemTxtTituloPrenda = ItemView.findViewById(R.id.txtTituloPrenda)
              itemTxtPrecio = ItemView.findViewById(R.id.txtPrecio)
              itemTxtMaterial = ItemView.findViewById(R.id.txtMaterial)
         }
     }

    val image = arrayOf(R.drawable.image_enterizomorado, R.drawable.image_enterizotopflores)
    val titulo = arrayOf("Enterizo azul", "Conjunto top flores")
    val precio = arrayOf(85.000, 120.000)
    val material = arrayOf("Algodón", "Licra")

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemImageViewProduct.setImageResource(image[position])
        viewHolder.itemTxtTituloPrenda.text = titulo[position]
        viewHolder.itemTxtPrecio.text = precio[position].toString()
        viewHolder.itemTxtMaterial.text = material[position]
    }

    override fun getItemCount(): Int {
        return image.size
    }
}