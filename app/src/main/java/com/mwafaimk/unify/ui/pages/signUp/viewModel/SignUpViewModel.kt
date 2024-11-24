package com.mwafaimk.unify.ui.pages.signUp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mwafaimk.unify.data.repository.network.NetworkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val repository: NetworkRepository
) : ViewModel() {

    val responseLiveData = MutableLiveData<String>()

    fun fun1() {
    }

    fun fun2() {

    }
}