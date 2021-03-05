package net.petneeds.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import net.petneeds.data.repository.AuthRepository
import net.petneeds.data.repository.BaseRepository
import net.petneeds.data.repository.LostAndFoundRepsitory
import net.petneeds.data.repository.UserRepository
import net.petneeds.ui.auth.AuthViewModel
import net.petneeds.ui.home.HomeViewModel
import net.petneeds.ui.lostandfound.LostAndFoundViewModel
import java.lang.IllegalArgumentException

@Suppress("UNCHECKED_CAST")
class ViewModelFactory(
    private val repository: BaseRepository
) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(AuthViewModel::class.java) -> AuthViewModel(repository as AuthRepository) as T
            modelClass.isAssignableFrom(HomeViewModel::class.java) -> HomeViewModel(repository as UserRepository) as T
            modelClass.isAssignableFrom(LostAndFoundViewModel::class.java) -> LostAndFoundViewModel(repository as LostAndFoundRepsitory) as T
            else -> throw IllegalArgumentException("ViewModelClass Not Found")
        }
    }

}