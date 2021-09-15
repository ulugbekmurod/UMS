package com.example.ums.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.findNavController
import com.example.ums.*
import com.example.ums.databinding.FragmentTarifBinding





class TarifFragment : Fragment() {


    private var usmitem=ArrayList<Model>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view= inflater.inflate(R.layout.fragment_tarif, container, false)
        val binding=FragmentTarifBinding.bind(view)
        addData()
        val myAdapter=MyAdapter(usmitem, object : ClickListner {
            override fun onClickItem(item: Model) {

                if (item.tarif=="Mobi 20"){
                    findNavController().navigate(R.id.action_tarifFragment_to_malumotFragment)
                }else if (item.tarif=="Mobi 30"){
                    findNavController().navigate(R.id.action_tarifFragment_to_thirdFragment)
                }else if(item.tarif=="Mobi 40"){
                    findNavController().navigate(R.id.action_tarifFragment_to_fourFragment)
                }else if (item.tarif=="Mobi 50"){
                    findNavController().navigate(R.id.action_tarifFragment_to_fiveFragment)
                }else if (item.tarif=="Mobi 60"){
                    findNavController().navigate(R.id.action_tarifFragment_to_sixFragment)
                }else if (item.tarif=="Mobi 70"){
                    findNavController().navigate(R.id.action_tarifFragment_to_sevenFragment)
                }else if (item.tarif=="Mobi 80"){
                    findNavController().navigate(R.id.action_tarifFragment_to_eightFragment)
                }




            }

        })
        binding.recyclerv.adapter=myAdapter


        return view
    }

    private fun addData() {
        usmitem.add(Model("Mobi 20","*111*120#","20 000/1 000 so'm oylik/kunlik abanent to'lovi500/17"))
        usmitem.add(Model("Mobi 30","*111*128#","30 000 so'm abanent to'lovi 10 000 so'm O'zbekiston bo'yich"))
        usmitem.add(Model("Mobi 40","*111*12#","40 000/2 000 so'mlik oylik/kunlik abanent to'lovi 1"))
        usmitem.add(Model("Mobi 50","*111*122#","50 000 so'm abanent to'lovi oyiga UNLIM tarmoq"))
        usmitem.add(Model("Mobi 60","*111*128#","30 000 so'm abanent to'lovi 10 000 so'm O'zbekiston bo'yich"))
        usmitem.add(Model("Mobi 70","*111*128#","30 000 so'm abanent to'lovi 10 000 so'm O'zbekiston bo'yich"))
        usmitem.add(Model("Mobi 80","*111*128#","30 000 so'm abanent to'lovi 10 000 so'm O'zbekiston bo'yich"))

    }

}