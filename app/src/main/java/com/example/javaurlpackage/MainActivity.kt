package com.example.javaurlpackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import java.lang.Exception
import java.net.URL

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val host = findViewById<Button>(R.id.button1)
        host.setOnClickListener { toFindHost() }

        val port = findViewById<Button>(R.id.button2)
        port.setOnClickListener { toFindPort() }

        val path = findViewById<Button>(R.id.button3)
        path.setOnClickListener { toFindPath() }

        val protocol = findViewById<Button>(R.id.button4)
        protocol.setOnClickListener { toFindProtocol() }

        val query = findViewById<Button>(R.id.button5)
        query.setOnClickListener { toFindQuery() }

        val clear = findViewById<Button>(R.id.clear_text)
        clear.setOnClickListener { clearURL() }
    }

    private fun clearURL() {
        val input = findViewById<EditText>(R.id.editText)
        input.setText("")

        val result = findViewById<EditText>(R.id.resultText)
        result.setText("")
    }

    private fun toFindHost() {
        val input = findViewById<EditText>(R.id.editText)
        val ip = input.text.toString()
        val result = findViewById<EditText>(R.id.resultText)
        try {
            val url = URL(ip)
            result.setText(url.host.toString())
        } catch (e: Exception) {
            result.setText(getString(R.string.error))
        }
    }

    private fun toFindPort() {
        val input = findViewById<EditText>(R.id.editText)
        val ip = input.text.toString()
        val result = findViewById<EditText>(R.id.resultText)
        try {
            val url = URL(ip)
            result.setText(url.port.toString())
        } catch (e: Exception) {
            result.setText(getString(R.string.error))
        }
    }

    private fun toFindPath() {
        val input = findViewById<EditText>(R.id.editText)
        val ip = input.text.toString()
        val result = findViewById<EditText>(R.id.resultText)
        try {
            val url = URL(ip)
            result.setText(url.path.toString())
        } catch (e: Exception) {
            result.setText(getString(R.string.error))
        }
    }

    private fun toFindProtocol() {
        val input = findViewById<EditText>(R.id.editText)
        val ip = input.text.toString()
        val result = findViewById<EditText>(R.id.resultText)
        try {
            val url = URL(ip)
            result.setText(url.protocol.toString())
        } catch (e: Exception) {
            result.setText(getString(R.string.error))
        }
    }

    private fun toFindQuery() {
        val input = findViewById<EditText>(R.id.editText)
        val ip = input.text.toString()
        val result = findViewById<EditText>(R.id.resultText)
        try {
            val url = URL(ip)
            result.setText(url.query.toString())
        } catch (e: Exception) {
            result.setText(e.toString())
        }
    }

}