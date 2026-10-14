# BÁO CÁO KIỂM THỬ ỨNG DỤNG QUẢN LÝ CHI TIÊU CÁ NHÂN

**Họ và tên**: Phạm Văn Đức  
**MSSV**: 2415053122207  
**Dự án**: KTGK_2415053122207_PhamVanDuc  
**Ngày kiểm thử**: 15/10/2026  

---

## DẠNG BÀI BỔ SUNG
- **Mã số sinh viên**: 2415053122207 (3 số cuối: `207`)
- **Phép chia dư**: $207 \pmod 3 = 0 \rightarrow$ Đề bổ sung 3.
- **Yêu cầu đề bổ sung 3**: Cho phép quản lý và hiển thị trạng thái thanh toán của khoản chi (`daThanhToan_207`).

---

## KẾT QUẢ KIỂM THỬ THỰC TẾ (TEST CASES)

| STT | Kịch bản kiểm thử | Dữ liệu đầu vào | Kết quả mong đợi | Kết quả thực tế | Trạng thái |
| :---: | :--- | :--- | :--- | :--- | :---: |
| **1** | Nhập dữ liệu hợp lệ | Tên: "Ăn sáng"<br>Số tiền: 35000<br>Ghi chú: "Phở bò" | Bấm "Thêm khoản chi" hiển thị Toast thông báo. Bấm "Xem chi tiết" mở `ChiTietChiTieuActivity` hiển thị đầy đủ thông tin. | Hiển thị Toast thành công và chuyển màn hình chi tiết hiển thị đúng dữ liệu. | **PASS** |
| **2** | Kiểm tra tên trống hoặc khoảng trắng | Tên: "   "<br>Số tiền: 50000 | Báo lỗi "Tên khoản chi không được để trống" trên ô nhập tên, focus lại ô nhập. | Đã báo lỗi đúng ô nhập tên, không cho chuyển màn hình. | **PASS** |
| **3** | Số tiền bằng 0, âm hoặc không phải số | Tên: "Mua sách"<br>Số tiền: -20000 / 0 / "abc" | Báo lỗi "Số tiền phải là số hợp lệ và lớn hơn 0" trên ô nhập số tiền. | Đã báo lỗi đúng ô nhập tiền, không cho chuyển màn hình. | **PASS** |
| **4** | Điều hướng sang màn hình chi tiết | Chuyển từ `MainActivity` sang `ChiTietChiTieuActivity` | Nhận đúng Intent và hiển thị thông tin kèm trạng thái "Trạng thái: Chưa thanh toán". | Màn hình chi tiết hiển thị đầy đủ thông tin khoản chi. | **PASS** |
| **5** | Lưu chỉnh sửa khoản chi | Sửa Tên thành "Ăn sáng đặc biệt", Số tiền thành 45000 | Trả kết quả qua `Activity Result API` (RESULT_OK) và cập nhật giao diện chi tiết. | Màn hình chi tiết cập nhật ngay lập tức dữ liệu mới. | **PASS** |
| **6** | Hủy chỉnh sửa khoản chi | Bấm nút "Hủy" trên màn hình chỉnh sửa | Màn hình đóng lại, giữ nguyên dữ liệu ban đầu tại màn hình chi tiết. | Dữ liệu cũ được giữ nguyên không thay đổi. | **PASS** |
| **7** | Chỉnh sửa lần thứ hai | Bấm "Chỉnh sửa" lần 2, sửa Số tiền thành 50000 | Lấy đúng dữ liệu mới nhất (45000) sang màn hình chỉnh sửa, và lưu lại 50000 thành công. | Dữ liệu được truyền và cập nhật chính xác lần thứ 2. | **PASS** |

---

## KẾT LUẬN
- **Build status**: SUCCESS (Không có lỗi biên dịch).
- **Tính năng**: Đã đáp ứng 100% yêu cầu đề thi chính và đề bổ sung 3.
