package com.example.fintrack

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

// Adapter is used to adapt the data class (CategoryEntity) and item_category
class CategoryAdapter :
    ListAdapter<CategoryEntity, CategoryAdapter.CategoryViewHolder>(CategoryDiffUtils()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    class CategoryViewHolder(view: View): RecyclerView.ViewHolder(view){
        private val tvCategory = view.findViewById<TextView>(R.id.tv_category)

        fun bind(categoryEntity: CategoryEntity){
            tvCategory.text = categoryEntity.title
        }

    }
    class CategoryDiffUtils : DiffUtil.ItemCallback<CategoryEntity>(){
        override fun areItemsTheSame(oldItem: CategoryEntity, newItem: CategoryEntity): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: CategoryEntity, newItem: CategoryEntity): Boolean {
            return oldItem.title == newItem.title
        }

    }


}