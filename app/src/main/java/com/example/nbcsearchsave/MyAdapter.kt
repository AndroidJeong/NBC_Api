package com.example.nbcsearchsave

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nbcsearchsave.databinding.ItemApisearchBinding

class MyAdapter(private val dataList: ArrayList<KakaoResponse> ): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(binding: ItemApisearchBinding): RecyclerView.ViewHolder(binding.root) {
        val item_thum = binding.itemThumnail
        val item_date  = binding.itemDate
        val item_like  = binding.itemLike
        val item_source  = binding.itemSource
        val root = binding.root
    }

    //이너 클래스에서 정의 한 마이뷰홀더 객체를 만들어서 반환
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.MyViewHolder {
        val binding: ItemApisearchBinding = ItemApisearchBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    //마이뷰홀더와 데이터를 묶어준다
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val data = dataList[position]



        holder.item_thum.setImageResource(R.drawable.ic_launcher_background)
        holder.item_date.text = "예시"
        holder.item_source.text = "예시"

        holder.root.setOnClickListener {
            holder.item_like.visibility = View.VISIBLE
        }


    }

    override fun getItemCount(): Int {
        return 2
    }




}