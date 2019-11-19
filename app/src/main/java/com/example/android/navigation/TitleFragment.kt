package com.example.android.navigation


import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.android.navigation.databinding.FragmentTitleBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 *
 */
class TitleFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(inflater,
                R.layout.fragment_title,container,false)
        binding.playButton.setOnClickListener{view: View ->
//            view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment)
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToGameFragment())
        }
        //TODO : codelab's Homework
        binding.rulesButton.setOnClickListener {view: View ->
//            view.findNavController().navigate(R.id.action_titleFragment_to_rulesFragment)
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToRulesFragment())
        }
        binding.aboutButton.setOnClickListener { view: View ->
//            view.findNavController().navigate(R.id.action_titleFragment_to_aboutFragment)
            view.findNavController().navigate(TitleFragmentDirections.actionTitleFragmentToAboutFragment())
        }

        setHasOptionsMenu(true)
        return binding.root
        }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.options_menu,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,
                view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }

    }

