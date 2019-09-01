package nepo.notasmvvm.viewmodels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import nepo.notasmvvm.model.domain.Item
import nepo.notasmvvm.model.mock.ItemMock

class ItemsViewModel() : ViewModel() {
    private val instanceMock = ItemMock()
    //  data am saved in rotation of screen
    private var itens = MutableLiveData<List<Item>>()

    // load all data of mock on local the at class
    fun loadData(){
        this.itens.postValue(instanceMock.getItens())
    }

    // returns the current value to another class
    fun getItens() : MutableLiveData<List<Item>> = itens
}