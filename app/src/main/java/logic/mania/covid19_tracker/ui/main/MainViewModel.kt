package logic.mania.covid19_tracker.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import logic.mania.covid19_tracker.model.ApiResponse
import logic.mania.covid19_tracker.repository.CovidIndiaRepository
import logic.mania.covid19_tracker.utils.State
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

@ExperimentalCoroutinesApi
@InternalCoroutinesApi
class MainViewModel(private val repository: CovidIndiaRepository) : ViewModel() {

    private val _covidLiveData = MutableLiveData<State<ApiResponse>>()

    val covidLiveData: LiveData<State<ApiResponse>>
        get() = _covidLiveData

    fun getData() {
        viewModelScope.launch {
            repository.getData().collect {
                _covidLiveData.value = it
            }
        }
    }
}