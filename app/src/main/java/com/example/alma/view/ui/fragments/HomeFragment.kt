package com.example.alma.view.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.navigation.fragment.findNavController
import com.example.alma.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // relacion entre la variable al elemento del fragmento en el home
        val cardViewStore = view.findViewById<CardView>(R.id.cardStore)
        cardViewStore.setOnClickListener { // metodo para al dar click se realice la operacion
            findNavController().navigate(R.id.action_homeFragment_to_storeFragment)// me traigo el grafo para que me cambie de fragment
        }
        val cardViewFavorites = view.findViewById<CardView>(R.id.cardFavorites)
        cardViewFavorites.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_favoritesFragment)
        }
        val cardViewShoppingCart = view.findViewById<CardView>(R.id.cardShoppingCart)
        cardViewShoppingCart.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_shoppingCartFragment)
        }
        val cardViewLocation = view.findViewById<CardView>(R.id.cardLocation)
        cardViewLocation.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_locationFragment)
        }
        val cardViewProfile = view.findViewById<CardView>(R.id.cardProfile)
        cardViewProfile.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_profileFragment)
        }
        val cardViewCustomerService  = view.findViewById<CardView>(R.id.cardCustomerService)
        cardViewCustomerService.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_customerServiceFragment)
        }
    }
}