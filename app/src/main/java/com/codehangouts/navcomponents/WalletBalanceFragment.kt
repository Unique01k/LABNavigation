package com.codehangouts.navcomponents


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class WalletBalanceFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

// Расширяем макет для этого фрагмента
        return inflater.inflate(R.layout.fragment_view_balance, container, false)
    }


}
