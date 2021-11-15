package android.example.fragment_nav

import android.example.fragment_nav.databinding.FragmentTwoBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding : FragmentTwoBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_two, container, false
        )

        binding.changeColorBtn2.setOnClickListener {
            binding.frag2.setBackgroundResource(R.color.warm)
        }
        binding.nextFrag2.setOnClickListener { view: View ->
            findNavController().navigate(FragmentTwoDirections.actionFragmentTwoToFragmentThree())
        }

        return binding.root
    }
}