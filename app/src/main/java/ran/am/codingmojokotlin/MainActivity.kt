package ran.am.codingmojokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Enter username : ")
        val username= readLine()

        //val greeting = "Hello $username, welcome to my program!"

        println(username)

        print("Enter your name: ")
        val name = readLine()
    }
}