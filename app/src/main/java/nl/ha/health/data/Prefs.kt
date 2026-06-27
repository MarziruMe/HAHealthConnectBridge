package nl.ha.health.data

import android.content.Context

class Prefs(context: Context) {

    private val sp = context.getSharedPreferences("ha_bridge", Context.MODE_PRIVATE)

    fun setHost(v: String) = sp.edit().putString("host", v).apply()
    fun getHost() = sp.getString("host", "") ?: ""

    fun setUser(v: String) = sp.edit().putString("user", v).apply()
    fun getUser() = sp.getString("user", "") ?: ""

    fun setPass(v: String) = sp.edit().putString("pass", v).apply()
    fun getPass() = sp.getString("pass", "") ?: ""
}
