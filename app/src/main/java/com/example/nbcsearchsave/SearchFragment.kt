package com.example.nbcsearchsave

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.nbcsearchsave.databinding.FragmentSearchBinding

class SearchFragment: Fragment(){

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val a = KakaoResponse("", )
        val adapter = MyAdapter()


        return inflater.inflate(R.layout.fragment_search, container, false)
    }

}