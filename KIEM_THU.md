# BÁO CÁO KIỂM THỬ ỨNG DỤNG QUẢN LÝ CHI TIÊU CÁ NHÂN

**Họ và tên**: Phạm Văn Đức  
**MSSV**: 2415053122207  
**Dự án**: KTGK_2415053122207_PhamVanDuc  
**Ngày kiểm thử**: 15/10/2026  

---

## DẠNG BÀI BỔ SUNG
- **Mã số sinh viên**: 2415053122207 (3 số cuối: `207`)
- **Phép chia dư**: $207 \pmod 3 = 0 \rightarrow$ Đề bổ sung 3.
- **Tên branch bổ sung**: `bo_sung_3`
- **Yêu cầu đề bổ sung 3**:
  1. Cho phép chuyển trạng thái khoản chi giữa "Đã thanh toán" và "Chưa thanh toán".
  2. Cập nhật thuộc tính `daThanhToan` của đối tượng `KhoanChi`.
  3. Hiển thị trạng thái mới trên màn hình chi tiết.
  4. Giữ nguyên trạng thái thanh toán hiện tại khi thực hiện chỉnh sửa thông tin khoản chi.

---

## KẾT QUẢ KIỂM THỬ THỰC TẾ (TEST CASES)

| STT | Kịch bản kiểm thử | Dữ liệu đầu vào | Kết quả mong đợi | Kết quả thực tế | Trạng thái |
| :---: | :--- | :--- | :--- | :--- | :---: |
| **1** | Nhập dữ liệu hợp lệ | Tên: "Ăn sáng"<br>Số tiền: 35000<br>Ghi chú: "Phở bò" | Bấm "Thêm khoản chi" hiển thị Toast thông báo. Bấm "Xem chi tiết" mở `ChiTietChiTieuActivity` hiển thị đầy đủ thông tin. | Hiển thị Toast thành công và chuyển màn hình chi tiết hiển thị đúng dữ liệu. | **PASS** |
| **2** | Kiểm tra tên trống hoặc khoảng trắng | Tên: "   "<br>Số tiền: 50000 | Báo lỗi "Tên khoản chi không được để trống" trên ô nhập tên, focus lại ô nhập. | Đã báo lỗi đúng ô nhập tên, không cho chuyển màn hình. | **PASS** |
| **3** | Số tiền bằng 0, âm hoặc không phải số | Tên: "Mua sách"<br>Số tiền: -20000 / 0 / "abc" | Báo lỗi "Số tiền phải là số hợp lệ và lớn hơn 0" trên ô nhập số tiền. | Đã báo lỗi đúng ô nhập tiền, không cho chuyển màn hình. | **PASS** |
| **4** | Điều hướng sang màn hình chi tiết | Chuyển từ `MainActivity` sang `ChiTietChiTieuActivity` | Nhận đúng Intent và hiển thị thông tin kèm trạng thái "Trạng thái: Chưa thanh toán". | Màn hình chi tiết hiển thị đầy đủ thông tin khoản chi. | **PASS** |
| **5** | Đổi trạng thái thanh toán (Đề bổ sung 3) | Bấm nút "Đổi trạng thái thanh toán" | Trạng thái chuyển từ "Chưa thanh toán" sang "Đã thanh toán", cập nhật đối tượng `KhoanChi` và hiển thị Toast thông báo. | Trạng thái được cập nhật lập tức sang "Đã thanh toán" kèm Toast. | **PASS** |
| **6** | Giữ nguyên trạng thái khi chỉnh sửa (Đề bổ sung 3) | Bấm "Chỉnh sửa khoản chi", sửa số tiền thành 45000 và bấm "Lưu" | Chuyển sang màn hình chỉnh sửa rồi lưu lại, trạng thái "Đã thanh toán" vẫn được giữ nguyên không bị mất. | Màn hình chi tiết hiển thị thông tin mới và giữ nguyên trạng thái "Đã thanh toán". | **PASS** |
| **7** | Hủy chỉnh sửa khoản chi | Bấm nút "Hủy" trên màn hình chỉnh sửa | Màn hình đóng lại, giữ nguyên dữ liệu ban đầu tại màn hình chi tiết. | Dữ liệu cũ được giữ nguyên không thay đổi. | **PASS** |

---

## KẾT LUẬN
- **Build status**: SUCCESS (Không có lỗi biên dịch).
- **Tính năng**: Đã đáp ứng 100% yêu cầu đề thi chính và đề bổ sung 3.
