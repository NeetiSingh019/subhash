package net.petneeds.ui.lostandfound

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import net.petneeds.R
import net.petneeds.data.network.AuthApi
import net.petneeds.data.network.Resource
import net.petneeds.data.repository.AuthRepository
import net.petneeds.data.repository.LostAndFoundRepsitory
import net.petneeds.databinding.FragmentLoginBinding
import net.petneeds.databinding.FragmentLostBinding
import net.petneeds.ui.auth.AuthViewModel
import net.petneeds.ui.base.BaseFragment
import net.petneeds.ui.handleApiError
import net.petneeds.ui.home.HomeActivity
import net.petneeds.ui.startNewActivity
import net.petneeds.ui.visible

class LostFragment : BaseFragment<LostAndFoundViewModel, FragmentLostBinding, LostAndFoundRepsitory>() {
   /* override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lost, container, false)
    }*/

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

       /* viewModel.LostAndFoundResponse.observe(viewLifecycleOwner, Observer {
          //  binding.progressbar.visible(it is Resource.Loading)
            when (it) {
                is Resource.Success -> {
                    lifecycleScope.launch {

                        Toast.makeText(requireContext(),"Form Saved",Toast.LENGTH_LONG).show()
                       //  requireActivity().startNewActivity(HomeActivity::class.java)
                    }
                }

                is Resource.Failure -> handleApiError(it)
            }
        })*/


        binding.SubmitBtn.setOnClickListener{
            savelostorfound()
            Log.i("1","1")

            Toast.makeText(requireContext(),"${viewModel.LostAndFoundResponse.value}",Toast.LENGTH_LONG).show()
        }

        /*binding.buttonLogin.setOnClickListener {
            login()
        }*/
    }


    private fun savelostorfound() {
        val loc = binding.editText1.text.toString().trim()
        val breed = binding.breedTxt.text.toString().trim()
        viewModel.savelostorfound(loc,breed)

    }

    override fun getViewModel() = LostAndFoundViewModel::class.java

    override fun getFragmentBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) =  FragmentLostBinding.inflate(inflater, container, false)

    override fun getFragmentRepository() =
        LostAndFoundRepsitory(remoteDataSource.buildApi(AuthApi::class.java), userPreferences)
}