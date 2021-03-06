package com.example.retrofitexample

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.row_item.view.*


class UsersAdapter(private val users: ArrayList<User>) : RecyclerView.Adapter<UsersAdapter.MyViewHolder>() {

    //var count = 0
    private val TAG = "UsersAdapter"
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // Inflate a layout from our XML (row_item.XML) and return the holder
        //Log.d(TAG, "onCreateViewHolder: ${count++}")

        // create a new view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        val currentItem = users[position]
        holder.name.text = "${currentItem.name.title} ${currentItem.name.first} ${currentItem.name.last}"
        holder.email.text = currentItem.email
        holder.gender.text = currentItem.gender

        // Load the image from theurl using picasso library
        Picasso.get().load(currentItem.imageUrl.medium).into(holder.profileImage)

        //Log.d(TAG, "onBindViewHolder: $position")
    }

    override fun getItemCount(): Int {
        // Return the size of your dataset (invoked by the layout manager)
        return users.size
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    inner class MyViewHolder (itemView: View): RecyclerView.ViewHolder (itemView){
        // This class will represent a single row in our recyclerView list
        // This class also allows caching views and reuse them
        // Each MyViewHolder object keeps a reference to 3 view items in our row_item.xml file
        val name = itemView.tv_name
        val gender = itemView.tv_gender
        val email = itemView.tv_email
        val profileImage = itemView.image_profile


    }
}
