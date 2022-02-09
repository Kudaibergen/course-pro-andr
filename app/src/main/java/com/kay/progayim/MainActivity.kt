package com.kay.progayim

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.kay.progayim.databinding.ActivityMainBinding
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import java.lang.RuntimeException
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val dbInstance get() = Injector.database

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)


        var i: Int = 0
        val list = listOf<String>("one", "two", "three", "four", "five")
        val list2 = listOf<String>("1", "2", "3", "4", "5")
        val list3 = listOf<String>("1", "2", "2", "3", "4", "4", "4", "5", "5")
        val list4 = listOf<String>("1x", "2", "3x", "4x", "5")
        //skip
        //take
        //distinct
        //filter

        val d = Observable.fromIterable(list4)
            .filter { it.contains("x") }
            .subscribe(
                { value -> log("Received: $value") }, // onNext
                { error -> log("Error: $error") },    // onError
                { log("Completed!") }                 // onComplete
            )

        val d2 = Observable.range(10, 5)
            .subscribe(
                { value -> log("Received: $value") }, // onNext
                { error -> log("Error: $error") },    // onError
                { log("Completed!") }                 // onComplete
            )

        val d3 = Observable.intervalRange(
            10L,     // Start
            5L,      // Count
            0L,      // Initial Delay
            1L,      // Period
            TimeUnit.SECONDS
        ).subscribe {
            log("Result we just received: $it")
        }

        val l1 = listOf("1", "2", "3")
        val l2 = listOf("4", "5", "6")
        val obs1 = Observable.fromIterable(l1)
        val obs2 = Observable.fromIterable(l2)

        val d4 = Observable.zip(obs1, obs2) { x1, x2 ->
            "$x1 + $x2"
        }
            .subscribe(
                { value -> log("Received: $value") }, // onNext
                { error -> log("Error: $error") },    // onError
                { log("Completed!") }                 // onComplete
            )

        val d5 = Observable.fromIterable(l1)
            .mergeWith(obs2)
            .subscribe(
                { value -> log("Received: $value") }, // onNext
                { error -> log("Error: $error") },    // onError
                { log("Completed!") }                 // onComplete
            )

    }

    private fun log(m: String) {
        Log.e("BERG", m)
    }
}