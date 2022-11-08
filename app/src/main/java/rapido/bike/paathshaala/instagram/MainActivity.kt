package rapido.bike.paathshaala.instagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createFeed()
    }

    private fun createFeed() {
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerview.layoutManager = LinearLayoutManager(this)
        initialiseRecyclerView(recyclerview)
    }

    private fun initialiseRecyclerView(recyclerview: RecyclerView) {
        val postFeedAdapter = PostFeedAdapter(this,getPosts())
        recyclerview.adapter = postFeedAdapter
    }

    private fun getPosts(): List<PostCard> {
        val data = ArrayList<PostCard>()
        for (i in 1..5){
            data.add(PostCard(
                "https://play-lh.googleusercontent.com/9HyDHKMpf6qa6EPhUbX3qgVmdbCQnkYtQxjoM_GgAaQCBlGY0XJcgYiu5jpnm0nZP6Q=w240-h480-rw",
                "rapidoapp",
                "https://i0.wp.com/s3.ap-south-1.amazonaws.com/img.paisawapas/images/2022/07/15171839/Frame-1968.jpg?fit=1200%2C600&ssl=1",
                5,
                "This #InternationalTranslationDay, let's see if you can guess these popular songs correctly \uD83C\uDFB5"
            ))
        }
        return data
    }
}