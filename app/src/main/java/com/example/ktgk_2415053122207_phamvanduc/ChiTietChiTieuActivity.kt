package com.example.ktgk_2415053122207_phamvanduc
import android.content.Intent
import android.widget.Toast
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.app.Activity
import androidx.activity.result.contract.ActivityResultContracts
class ChiTietChiTieuActivity : AppCompatActivity() {
    private var tenHienTai_207 = ""
    private var tienHienTai_207 = 0.0
    private var ghiChuHienTai_207 = ""
    private val moChinhSua_207 =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { ketQua_207 ->

            if (ketQua_207.resultCode == Activity.RESULT_OK) {
                val duLieu_207 = ketQua_207.data

                if (duLieu_207 != null) {
                    val tenMoi_207 =
                        duLieu_207.getStringExtra("tenKhoanChi_207") ?: ""

                    val tienMoi_207 =
                        duLieu_207.getDoubleExtra("soTien_207", 0.0)

                    val ghiChuMoi_207 =
                        duLieu_207.getStringExtra("ghiChu_207") ?: ""

                    tenHienTai_207 = tenMoi_207
                    tienHienTai_207 = tienMoi_207
                    ghiChuHienTai_207 = ghiChuMoi_207

                    findViewById<TextView>(R.id.tvTenKhoanChi_207).text =
                        "Tên khoản chi: $tenMoi_207"

                    findViewById<TextView>(R.id.tvSoTien_207).text =
                        "Số tiền: $tienMoi_207 VNĐ"

                    findViewById<TextView>(R.id.tvGhiChu_207).text =
                        "Ghi chú: $ghiChuMoi_207"
                }
            }
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_chi_tiet_chi_tieu)

        supportActionBar?.title =
            "Phạm Văn Đức - 2415053122207 - Quản lý chi tiêu cá nhân"

        // Anh xa TextView
        val tvTenKhoanChi_207 =
            findViewById<TextView>(R.id.tvTenKhoanChi_207)

        val tvSoTien_207 =
            findViewById<TextView>(R.id.tvSoTien_207)

        val tvGhiChu_207 =
            findViewById<TextView>(R.id.tvGhiChu_207)

        val btnQuayLai_207 =
            findViewById<Button>(R.id.btnQuayLai_207)

        val btnChinhSua_207 =
            findViewById<Button>(R.id.btnChinhSua_207)

        // Nhan du lieu tu Intent
        val tenKhoanChi_207 =
            intent.getStringExtra("tenKhoanChi_207") ?: ""

        val soTien_207 =
            intent.getDoubleExtra("soTien_207", 0.0)

        val ghiChu_207 =
            intent.getStringExtra("ghiChu_207") ?: ""

        val khoanChi_207 = KhoanChi(
            maKhoanChi_207 = "KC20701",
            tenKhoanChi_207 = tenKhoanChi_207,
            soTien_207 = soTien_207,
            ghiChu_207 = ghiChu_207,
            daThanhToan_207 = false
        )

        val tvTrangThai_207 =
            findViewById<TextView>(R.id.tvTrangThai_207)

        tvTrangThai_207.text =
            if (khoanChi_207.daThanhToan_207)
                "Trạng thái: Đã thanh toán"
            else
                "Trạng thái: Chưa thanh toán"

        tenHienTai_207 = tenKhoanChi_207
        tienHienTai_207 = soTien_207
        ghiChuHienTai_207 = ghiChu_207

        btnChinhSua_207.setOnClickListener {
            val intent_207 = Intent(
                this,
                ChinhSuaChiTieuActivity::class.java
            )

            intent_207.putExtra("tenKhoanChi_207", tenHienTai_207)
            intent_207.putExtra("soTien_207", tienHienTai_207)
            intent_207.putExtra("ghiChu_207", ghiChuHienTai_207)

            moChinhSua_207.launch(intent_207)
        }

        if (tenHienTai_207.isBlank()) {
            Toast.makeText(
                this,
                "Lỗi: Thiếu tên khoản chi",
                Toast.LENGTH_LONG
            ).show()

            tvTenKhoanChi_207.text =
                "Tên khoản chi: Không hợp lệ"

        } else {
            tvTenKhoanChi_207.text =
                "Tên khoản chi: ${khoanChi_207.tenKhoanChi_207}"
        }

        if (!tienHienTai_207.isFinite() || tienHienTai_207 <= 0) {
            Toast.makeText(
                this,
                "Lỗi: Số tiền không hợp lệ",
                Toast.LENGTH_LONG
            ).show()

            tvSoTien_207.text =
                "Số tiền: Không hợp lệ"

        } else {
            tvSoTien_207.text =
                "Số tiền: ${khoanChi_207.soTien_207} VNĐ"
        }

        // Hien thi du lieu
        tvGhiChu_207.text =
            "Ghi chú: ${khoanChi_207.ghiChu_207}"

        // Quay lai MainActivity
        btnQuayLai_207.setOnClickListener {
            finish()
        }
    }
}
