package android.example.fragment_nav

import android.example.fragment_nav.databinding.FragmentFourBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentFour : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding : FragmentFourBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_four, container, false
        )

        binding.changeColorBtn4.setOnClickListener {
            binding.frag4.setBackgroundResource(R.color.red)
        }
        binding.nextFrag4.setOnClickListener {
            findNavController().navigate(FragmentFourDirections.actionFragmentFourToFragmentOne())
        }

        return binding.root
    }
}