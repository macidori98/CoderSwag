package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.model.Product

class ProductsRecyclerViewAdapter(
    private val context: Context,
    private val products: List<Product>,
    val itemClick: (Product) -> Unit
) : RecyclerView.Adapter<ProductsRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View, val itemClick: (Product) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private var productImage: ImageView? = itemView.findViewById(R.id.imageViewCover)
        private var productName: TextView? = itemView.findViewById(R.id.categoryName)

        fun bindCategory(product: Product, context: Context) {
            val recourseId =
                context.resources.getIdentifier(product.image, "drawable", context.packageName)

            productName?.text = product.title
            productImage?.setImageResource(recourseId)

            itemView.setOnClickListener {
                itemClick(product)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsRecyclerViewAdapter.ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)

        return ViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: ProductsRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindCategory(products[position], context)
    }

    override fun getItemCount(): Int {
        return products.count()
    }
}