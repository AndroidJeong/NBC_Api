package com.example.nbcsearchsave

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.example.nbcsearchsave.databinding.ActivityMainBinding
import com.example.nbcsearchsave.db.AppDatabase
import com.example.nbcsearchsave.db.MyDao
import com.example.nbcsearchsave.db.MyEntity

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private lateinit var db: AppDatabase
    private lateinit var myDao: MyDao
    private lateinit var infoList: ArrayList<MyEntity>
    private lateinit var adapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       // db = AppDatabase.getInstance(this)!!
       // myDao = db.getDao()


        binding.apply {
            mainMyfragmentBtn.setOnClickListener {
                setFragment(MyFragment())
            }

            mainSearchfragmentBtn.setOnClickListener {
                setFragment(SearchFragment())
            }
        }

    }


    private fun setFragment(frag: Fragment) {
        supportFragmentManager.commit {
            replace(R.id.main_frameFragment, frag)
            setReorderingAllowed(true)
            addToBackStack("")
        }
    }


}


