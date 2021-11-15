package android.example.fragment_nav

import android.example.fragment_nav.databinding.FragmentThreeBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class FragmentThree : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding : FragmentThreeBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_three, container, false
        )

        binding.changeColorBtn3.setOnClickListener {
            binding.frag3.setBackgroundResource(R.color.green)
        }
        binding.nextFrag3.setOnClickListener { view : View ->
            findNavController().navigate(FragmentThreeDirections.actionFragmentThreeToFragmentFour())
        }

        return binding.root
    }
}