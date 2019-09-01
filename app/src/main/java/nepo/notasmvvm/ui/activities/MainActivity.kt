package nepo.notasmvvm.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*
import nepo.notasmvvm.R
import nepo.notasmvvm.ui.activities.adapter.MainAdapter
import nepo.notasmvvm.viewmodels.ItemsViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var vielModel: ItemsViewModel
    val adapter : MainAdapter by lazy {
        MainAdapter()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(myToolbar)

        myRecyclerview.adapter = adapter
        // init view model
        vielModel = ViewModelProviders.of(this).get(ItemsViewModel::class.java)
        vielModel.getItens().observe(this, Observer {
            it?.let {
                adapter.add(it)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_item_add ->{
                Toast.makeText(this,"Load add", Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
