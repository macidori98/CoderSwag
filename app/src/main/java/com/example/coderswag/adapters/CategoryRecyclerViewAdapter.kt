package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.R
import com.example.coderswag.model.Category

class CategoryRecyclerViewAdapter(
    private val context: Context,
    private val categories: List<Category>,
    val itemClick: (Category) -> Unit
) : RecyclerView.Adapter<CategoryRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View, val itemClick: (Category) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private var categoryImage: ImageView? = itemView.findViewById(R.id.imageViewCover)
        private var categoryName: TextView? = itemView.findViewById(R.id.categoryName)

        fun bindCategory(category: Category, context: Context) {
            val recourseId =
                context.resources.getIdentifier(category.image, "drawable", context.packageName)

            categoryName?.text = category.title
            categoryImage?.setImageResource(recourseId)

            itemView.setOnClickListener {
                itemClick(category)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryRecyclerViewAdapter.ViewHolder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)

        return ViewHolder(view, itemClick)
    }

    override fun onBindViewHolder(holder: CategoryRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.bindCategory(categories[position], context)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }
}