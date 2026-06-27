class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        scheduleDailySync(this)

        startActivity(Intent(this, SettingsActivity::class.java))
        finish()
    }
}
