INSERT INTO TaiKhoan VALUES
('TK01','phanmembanhang1','bimat1','Admin',1),
('TK02','phanmembanhang2','bimat2','Staff',1),
('TK03','phanmembanhang3','bimat3','Staff',1)
GO

INSERT INTO NhanVien VALUES
('NV01','TK02',N'Nguyễn Thành Trung',1,N'Ninh Bình','0358234123','037204007541','2023-04-10',1,'anh1.png'),
('NV02','TK02',N'Đào Đức Phiên',1,N'Hà Nội','0852123754','037201445789','2023-01-10',1,'anh2.png'),
('NV03','TK02',N'Lê Trọng An',0,N'Bắc Ninh','0575241471','038205004741','2023-01-13',1,'anh3.png'),
('NV04','TK01',N'Khương Trọng Đức',1,N'Hà Nam','0842123745','039542004176','2022-08-15',0,'anh4.png'),
('NV05','TK02',N'Hồ Đức Anh',0,N'Hòa Bình','0385412789','034245007454','2022-07-19',0,'anh5.png')
GO

INSERT INTO KhachHang Values
('KH01',N'Nguyễn Đức Việt','1999-10-13','0532687524','ducvietnguyen123@gmail.com',1,N'Hà Nội',1),
('KH02',N'Phạm Nhật Nam','2000-05-01','0854247895','trunam3123czc@gmail.com',1,N'Thành Phố Hồ Chí Minh',1),
('KH03',N'Phùng Bá Duy','2002-04-10','0175257987','duyzn3121@gmail.com',0,N'Nghệ An',0)
GO

INSERT INTO LoaiSanPham VALUES
('LSP01',N'Áo Khoác Krants',1,N'Hàng đẹp'),
('LSP02',N'Áo Thun Krants',1,N'Hàng đẹp'),
('LSP03',N'Áo Polo Krants',1,N'Hàng đẹp'),
('LSP04',N'Quần Tây Krants',0,N'Hàng đẹp'),
('LSP05',N'Quần Kaki Krants',1,N'Hàng đẹp')
GO

INSERT INTO SanPham VALUES
('SP01',N'Áo Khoác Hoodie Krants Local Brand Unisex Special Collection Premium',1,88,150000,N'Chất liệu vải dù nhám dày dặn 2 lớp.Trong lớp lót giúp áo thoáng nhiệt.Thiết kế áo  form đẹp',N'Đen',N'Vải cotton',N'S','LSP01'),
('SP02',N'Áo Khoác Gió Nam Nữ Krants Design Studio Jacket New Collection Blue',1,14,190000,N'Chất liệu vải dù nhám dày dặn 2 lớp.Trong lớp lót giúp áo thoáng nhiệt.Thiết kế áo  form đẹp',N'Trắng',N'Vải nỉ',N'M','LSP01'),
('SP03',N'Áo Thun Local Brand Krants Signature Logo Brand',1,999,300000,N'Hình ảnh sản phẩm là ảnh thật, các hình hoàn toàn do shop tự thiết kế và chụp.',N'Đỏ',N'Vải cotton',N'L','LSP02'),
('SP04',N'Áo Polo Local Brand Krants Signature Polo Shirt Premium',1,47,500000,N'Hình ảnh sản phẩm là ảnh thật, các hình hoàn toàn do shop tự thiết kế và chụp.',N'Trắng',N'Vải kaki',N'XL','LSP03'),
('SP05',N'Quần Tây Nam Phong Cách Hàn Quốc Krants',1,25,250000,N'Quần tây Krants được căn chỉnh form dáng chuẩn giúp cho người mặc cảm thấy tự tin hơn ',N'Đen',N'Vải kaki',N'L','LSP04'),
('SP06',N'Quần Kaki nam dáng baggy vải co giãn Krants',1,571,350000,N'Vải quần kaki nam ống suông được làm từ sợi COTTON tự nhiên giúp cho mặt vải lì không bị bóng',N'Đen',N'Vải kaki',N'L','LSP05'),
('SP07',N'Quần Tây Nam Ống Côn Krants',1,66,280000,N'Quần tây Krants được căn chỉnh form dáng chuẩn giúp cho người mặc cảm thấy tự tin hơn ',N'Be',N'Vải kaki',N'M','LSP04'),
('SP08',N'Áo Polo Local Brand Krants Signature Polo Shirt Premium',1,77,190000,N'Hình ảnh sản phẩm là ảnh thật, các hình hoàn toàn do shop tự thiết kế và chụp.',N'Đen',N'Vải nỉ',N'M','LSP03'),
('SP09',N'Quần Tây Nam Vải Cotton Krants',1,17,280000,N'Quần tây Krants được căn chỉnh form dáng chuẩn giúp cho người mặc cảm thấy tự tin hơn ',N'Trắng',N'Vải kaki',N'M','LSP04'),
('SP10',N'Áo Thun Local Brand Krants Premium 100% Cotton Most Famous',1,69,190000,N'Hình ảnh sản phẩm là ảnh thật, các hình hoàn toàn do shop tự thiết kế và chụp.',N'Trắng',N'Vải cotton',N'L','LSP02')
GO

