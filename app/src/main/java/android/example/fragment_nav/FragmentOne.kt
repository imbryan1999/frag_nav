package android.example.fragment_nav

import android.example.fragment_nav.databinding.FragmentOneBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding: FragmentOneBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_one, container, false
        )

        binding.changeColorBtn1.setOnClickListener {
            binding.frag1.setBackgroundResource(R.color.cyan)
        }
        binding.nextFrag1.setOnClickListener { view : View ->
            view.findNavController().navigate(FragmentOneDirections.actionFragmentOneToFragmentTwo())
        }

        return binding.root
    }
}