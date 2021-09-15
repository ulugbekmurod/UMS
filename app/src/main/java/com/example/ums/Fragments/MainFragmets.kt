package com.example.ums.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ums.R
import com.example.ums.databinding.FragmentMainFragmetsBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MainFragmets : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_main_fragmets, container, false)

        val binding=FragmentMainFragmetsBinding.bind(view)

        binding.cardView.setOnClickListener {

            findNavController().navigate(R.id.action_mainFragmets_to_tarifFragment)
        }




        return  view
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MainFragmets().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}