package com.codewithandro.gmailrecyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class GmailAdapter(var gmailArrayList: ArrayList<gmailData>, var context : Activity) :
RecyclerView.Adapter<GmailAdapter.MyViewHolder>()
{

    //create itemClick Action
    //sec_step -> declare varaible myListnear
    private lateinit var myListner: onItemClickListner

    //first_step -> create interface -> name onItemClickListner
    interface onItemClickListner {
        //create method name -> onItemClicking & Pass the position
        fun onItemClicking(position: Int)//give the -> MyViewHolder Class adapterPosition
    }

    //third_step -> create the method and use in mainActivity -> setItemClickListner
    fun setItemClickListner(listner: onItemClickListner){
        //intilize the myListner var
        myListner = listner
    }

    //complete the item Click Action
    //then changes in MyViewHolder Class the
    //1 -> add the interface parameter
    //2 -> create the init{ pass the adapterPostion }
    //3 -> add return parameter in onCreateViewHolder pass -> interface varName
    //4 -> mainActivity use the thirdMethod

    //3
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GmailAdapter.MyViewHolder {
        //creaete view holder using layout Inflaiter
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachrow,parent,false)
        return MyViewHolder(itemView,myListner)//pass the interface variable
    }

    //4
    override fun onBindViewHolder(holder: GmailAdapter.MyViewHolder, position: Int) {
        //current item populate set data
        var currentIteam = gmailArrayList[position]

        //set view data class
        holder.un.text = currentIteam.userName
        holder.fTitle.text = currentIteam.gmailTitle
        holder.gDate.text = currentIteam.gmailDate
        holder.ui.setImageResource(currentIteam.userImg)
    }

    //2
    override fun getItemCount(): Int {
        return gmailArrayList.size
    }

    //1
    class MyViewHolder(itemView : View,listner: onItemClickListner) : RecyclerView.ViewHolder(itemView) {

        //creaet the view find the xml views
        val un = itemView.findViewById<TextView>(R.id.userName)
        val fTitle = itemView.findViewById<TextView>(R.id.fTitle)
        val gDate = itemView.findViewById<TextView>(R.id.gmailDate)
        val ui = itemView.findViewById<ShapeableImageView>(R.id.imgId)

        //init under setOnClickListner
        init {
            itemView.setOnClickListener{
                //pass adepter postion
                listner.onItemClicking(adapterPosition)//pass adapter position
            }
        }
    }


}