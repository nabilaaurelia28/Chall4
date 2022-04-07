package com.example.chall4.view.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.chall4.R
import com.example.chall4.databinding.FragmentRegisterBinding
import com.example.chall4.model.RoomDatabaseStore
import com.example.chall4.model.data.DataPegawai


class RegisterFragment : Fragment() {
    private var bind : FragmentRegisterBinding? = null
    private val binding get()=bind!!
    private var dataPegawai:RoomDatabaseStore?=null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       bind =  FragmentRegisterBinding.inflate(inflater,container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataPegawai= RoomDatabaseStore.getDataPegawai(requireContext())

        binding.btnRegister.setOnClickListener{
            val objDataPegawai=DataPegawai(null,binding.etUsernameRegis.text.toString(),binding.etPasswRegis.text.toString()){

        }
            lifecycleScope
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }
}