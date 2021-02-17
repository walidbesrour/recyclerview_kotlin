package com.example.list_kotlin.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.list_kotlin.ExampleItem
import com.example.list_kotlin.R
import com.example.list_kotlin.adapter.ExampleAdapter
import com.example.list_kotlin.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

        private lateinit var binding : FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)



        val exampleList = generateDummyList(500)
        binding.recycle.adapter =ExampleAdapter(exampleList)
        binding.recycle.layoutManager = LinearLayoutManager(requireContext())
        binding.recycle.setHasFixedSize(true)

        return  binding.root
    }

    private fun generateDummyList(size: Int): List<ExampleItem> {
        val list = ArrayList<ExampleItem>()
//        list.add(ExampleItem(R.drawable.ic_android,"walid","besrour"))
//        list.add(ExampleItem(R.drawable.account_circle_24,"aymen","besrour"))
//        list.add(ExampleItem(R.drawable.home_24,"khaled","besrour"))
//        list.add(ExampleItem(R.drawable.ic_android,"walid","besrour"))
//        list.add(ExampleItem(R.drawable.account_circle_24,"aymen","besrour"))
//        list.add(ExampleItem(R.drawable.home_24,"khaled","besrour"))
//        list.add(ExampleItem(R.drawable.ic_android,"walid","besrour"))
//        list.add(ExampleItem(R.drawable.account_circle_24,"aymen","besrour"))
//        list.add(ExampleItem(R.drawable.home_24,"khaled","besrour"))
        for (i in 0 until size) {
            val drawable = when (i % 3) {
                0 -> R.drawable.ic_android
                1 -> R.drawable.account_circle_24
                else -> R.drawable.home_24
            }
            val item = ExampleItem(drawable, "Item $i", "Line 2")
            list += item
        }
        return list
    }
}