package uz.abbosbek.fragment_15_h_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.abbosbek.fragment_15_h_2.databinding.ActivityMainBinding
import uz.abbosbek.fragment_15_h_2.fragments.HomFragment

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.my_container, HomFragment())
            .commit()
    }
}