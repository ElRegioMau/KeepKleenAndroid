package com.example.keepkleen.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.keepkleen.R
import com.example.keepkleen.viewModel.CrearCuentaViewModel

class CrearCuentaFragment : Fragment() {

    companion object {
        fun newInstance() = CrearCuentaFragment()
    }

    private lateinit var viewModel: CrearCuentaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_crear_cuenta, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CrearCuentaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}