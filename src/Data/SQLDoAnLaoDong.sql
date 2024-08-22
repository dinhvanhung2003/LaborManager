CREATE DATABASE qlCongNhan;
GO

USE qlCongNhan;
GO
CREATE TABLE CongNhan (
    MaCongNhan int NOT NULL PRIMARY KEY,
    TenCongNhan NVARCHAR(255),
    CMND NVARCHAR(255) NOT NULL,
    SDT NVARCHAR(20) NOT NULL,
	LuongCoBan FLOAT NOT NULL,
    PhuCap FLOAT NOT NULL,
    DiaChi NVARCHAR(255) NOT NULL,
    GioiTinh NVARCHAR(255) NOT NULL,
	ChucVu NVARCHAR(255) NOT NULL,
    NgaySinh DATE,
	 FOREIGN KEY (MaCongNhan) REFERENCES CongNhan(MaCongNhan),
);

INSERT INTO CongNhan (MaCongNhan, TenCongNhan, CMND, SDT, LuongCoBan, PhuCap, DiaChi, GioiTinh, ChucVu, NgaySinh)
VALUES (1000, N'Trần Văn Anh', N'123456789', N'0987654321', 5000000, 1000000, N'Hà Nội', N'Nam', N'Admin', '1990-01-01'),
(1001, N'Trần Văn Thanh', N'023456789', N'0887654321', 3000000, 1000000, N'Hà Nam', N'Nam', N'Quản Lý Công Nhân', '1990-03-02'),
(1002, N'Nguyễn Thị Sinh', N'043456789', N'0987654338', 8000000, 1000000, N'Hà Tĩnh', N'Nữ', N'Quản Lý Công Nhân', '1995-02-02'),
(1003, N'Nguyễn Thị Vân Anh', N'043456789', N'0987654338', 8000000, 1000000, N'Hà Tĩnh', N'Nữ', N'Công Nhân', '1995-02-02')





CREATE TABLE CongTrinh (
    MaCongTrinh NVARCHAR(255) NOT NULL PRIMARY KEY,
    TenCongTrinh NVARCHAR(255),
    NgayHoanThanh DATE,
    MaHopDong NVARCHAR(255) NOT NULL,
    NgayKi DATE,
    TenNhanVien NVARCHAR(255),
    MaNhanVien INT NOT NULL,
    TongGiaTriHopDong float NOT NULL,
    FOREIGN KEY (MaCongTrinh) REFERENCES CongTrinh(MaCongTrinh)
);


CREATE TABLE PhanCong (
    MaCongNhan INT NOT NULL,
    TenCongNhan NVARCHAR(255),
    MaPhanCong NVARCHAR(255) NOT NULL PRIMARY KEY,
    TenCongTrinh NVARCHAR(255) NOT NULL,
    MaCongTrinh NVARCHAR(255) NOT NULL,
    FOREIGN KEY (MaCongNhan) REFERENCES CongNhan(MaCongNhan),
    FOREIGN KEY (MaCongTrinh) REFERENCES CongTrinh(MaCongTrinh)
);

CREATE TABLE NguoiQuanLyCongTrinh (
    MaQuanLy INT NOT NULL PRIMARY KEY,
    ID INT NOT NULL,
    TenQuanLy NVARCHAR(255),
    MaCongTrinh NVARCHAR(255) NOT NULL,
	TenCongTrinh NVARCHAR(255),
    TenTaiKhoan NVARCHAR(255),
    MatKhau NVARCHAR(255),
    FOREIGN KEY (MaCongTrinh) REFERENCES CongTrinh(MaCongTrinh)
);

CREATE TABLE NguoiQuanLyCongNhan (
    MaQuanLy INT NOT NULL PRIMARY KEY,
    ID INT NOT NULL,
    TenQuanLy NVARCHAR(255),
    MaCongNhan INT NOT NULL,
    TenTaiKhoan NVARCHAR(255),
    MatKhau NVARCHAR(255),
    FOREIGN KEY (MaCongNhan) REFERENCES CongNhan(MaCongNhan)
);

CREATE TABLE TaiKhoan (
 
    MaCongNhan INT NOT NULL,
    TenTaiKhoan VARCHAR(255)   PRIMARY KEY, 
    MatKhau VARCHAR(255), 
    QuyenTruyCap VARCHAR(255), 
    TenNhanVien VARCHAR(255),
    FOREIGN KEY (MaCongNhan) REFERENCES CongNhan(MaCongNhan)
);
INSERT INTO TaiKhoan(MaCongNhan, TenTaiKhoan, MatKhau, QuyenTruyCap, TenNhanVien)
VALUES 
	(1000, N'tranvana', N'1', N'Admin', N'Trần Văn Anh');
	

CREATE TABLE QuanLyNgayCong(
	MaCongNhan INT PRIMARY KEY,
    TenCongNhan NVARCHAR(255),
    MaPhanCong NVARCHAR(255) ,
    TenCongTrinh NVARCHAR(255) ,
    MaCongTrinh NVARCHAR(255) ,
	SoNgayCong int
)