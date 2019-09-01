package nepo.notasmvvm.model.mock

import nepo.notasmvvm.model.domain.Item

class ItemMock {

    private var itens = listOf<Item>(
        Item(0,"Alerta indestruvivel"),
        Item(1,"Boiando de mais"),
        Item(2,"19-08-1999")
    )
    fun getItens() = itens
}