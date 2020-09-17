package com.workday.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import com.workday.android.service.GiphyService
import kotlinx.android.synthetic.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val searchView = findViewById<SearchView> (R.id.searchView)



        searchView.setOnSearchClickListener {


            // user click here

            // user ftech teh data

            // end point here which is url. included in service

            // to make netowk https call

            // fetch the data ( get request), which will be images

            // parese the data---sing GSON


              var responseAPI = GiphyService.API

            val scope = CoroutineScope(Dispatchers.IO)


            scope.launch{

                responseAPI.searchGiphyAPI().data.stream().allMatch {


                }






                // need to be parsed


            }


        }

    }
}