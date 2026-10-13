package com.example.ktgk_2415053122207_phamvanduc

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ChiTietChiTieuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Hien thi giao dien chi tiet
        setContentView(R.layout.activity_chi_tiet_chi_tieu)

        // Dat tieu de
        supportActionBar?.title =
            "Phạm Văn Đức - 2415053122207 - Quản lý chi tiêu cá nhân"

        // Anh xa nut Quay lai
        val btnQuayLai_207 =
            findViewById<Button>(R.id.btnQuayLai_207)

        // Xu ly su kien nut Quay lai
        btnQuayLai_207.setOnClickListener {
            finish()
        }
    }
}
