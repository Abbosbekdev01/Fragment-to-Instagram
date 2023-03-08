package uz.abbosbek.fragment_15_h_2.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import uz.abbosbek.fragment_15_h_2.R
import uz.abbosbek.fragment_15_h_2.databinding.FragmentHomBinding
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class HomFragment : Fragment() {
     private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    private val binding by lazy { FragmentHomBinding.inflate(layoutInflater) }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        ProfileFragment
        binding.btnProfile.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .setCustomAnimations(
                    R.anim.animation_right,
                    R.anim.animaton_to_left,
                    R.anim.animation_left,
                    R.anim.animation_to_right
                )
                .replace(R.id.my_container, ProfileFragment())
                .addToBackStack(binding.toString())
                .commit()
        }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}