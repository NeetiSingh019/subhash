package net.petneeds.ui.lostandfound


import android.content.ContentProvider
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.petneeds.data.network.Resource
import net.petneeds.data.repository.LostAndFoundRepsitory
import net.petneeds.data.responses.LoginResponse
import net.petneeds.ui.base.BaseViewModel
import java.net.ContentHandler

class LostAndFoundViewModel(
    private val repository: LostAndFoundRepsitory
) : BaseViewModel(repository) {


    private val _LostAndFoundResponse: MutableLiveData<Resource<String>> = MutableLiveData()
    val LostAndFoundResponse: LiveData<Resource<String>>
        get() = _LostAndFoundResponse

    var pid: Int? = null
    var LostOrFound: String? = null
    var Location: String? = null
    var DateofMissing: String? = null
    var DateofFound: String? = null
    var Breed: String? = null
    var Gender: String? = null
    var Color: String? = null
    var Size: String? = null
    var IdentificationMarks: String? = null
    var ApproximateAge: String? = null
    var WearingCollar: Boolean? = null
    var Email: String? = null
    var Phone: String? = null
    var OtherInfo: String? = null

    fun savelostorfound(
        Location : String,
        Breed : String
    ) = viewModelScope.launch {

        //Toast.makeText(requireContext(ContentProvider),"${viewModel.LostAndFoundResponse.value}",Toast.LENGTH_LONG).show()
        _LostAndFoundResponse.value  = repository.savelostorfound(Location, Breed)
        Log.i("Result", _LostAndFoundResponse.getValue().toString())
    }

}