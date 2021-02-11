package com.example.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.coderswag.R
import com.example.coderswag.model.Category

class CategoryAdapter(private val context: Context, private val categories: List<Category>) :
    BaseAdapter() {

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.category_list_item, parent, false)
            holder = ViewHolder()
            holder.categoryImage = view.findViewById(R.id.imageViewCover)
            holder.categoryName = view.findViewById(R.id.categoryName)

            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }

        val category = categories[position]
        holder.categoryName?.text = category.title

        val recourseId =
            context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(recourseId)

        return view
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null

    }
}