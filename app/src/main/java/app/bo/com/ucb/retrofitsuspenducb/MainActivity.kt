package app.bo.com.ucb.retrofitsuspenducb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val restApiAdapter = RestApiAdapter()
        val endPoint = restApiAdapter.conectionApi()
        GlobalScope.launch(Dispatchers.IO) {
            val posts = endPoint.getAllPost()
            posts.forEach {
                Log.d("post", it.title)
            }
        }
    }
}