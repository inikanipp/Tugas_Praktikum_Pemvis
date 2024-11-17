
CREATE TABLE Wilayah (
    ID_Wilayah INT PRIMARY KEY AUTO_INCREMENT,
    wilayah VARCHAR(100) NOT NULL
);

-- Tabel User
CREATE TABLE User (
    ID_User INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(100) NOT NULL,
    level ENUM('admin', 'user') NOT NULL,favorite
    ID_Wilayah INT,
    FOREIGN KEY (ID_Wilayah) REFERENCES Wilayah(ID_Wilayah)
);

-- Tabel Makanan
CREATE TABLE Makanan (
    ID_Makanan INT PRIMARY KEY AUTO_INCREMENT,
    nama_makanan VARCHAR(100) NOT NULL,
    ID_Wilayah INT,
    Bahan_Utama TEXT NOT NULL,
    Total_Harga_Bahan DECIMAL(10, 2) NOT NULL,
    langkah_langkah TEXT NOT NULL,
    status ENUM('available', 'unavailable') NOT NULL,
    FOREIGN KEY (ID_Wilayah) REFERENCES Wilayah(ID_Wilayah)
);

-- Tabel Favorite
CREATE TABLE Favorite (
    ID_User INT,
    ID_Makanan INT,
    PRIMARY KEY (ID_User, ID_Makanan),
    FOREIGN KEY (ID_User) REFERENCES User(ID_User) ON DELETE CASCADE,
    FOREIGN KEY (ID_Makanan) REFERENCES Makanan(ID_Makanan) ON DELETE CASCADE
);

-- Insert data ke tabel Wilayah sesuai dengan provinsi di Pulau Jawa
INSERT INTO Wilayah (wilayah) VALUES
('DKI Jakarta'),
('Jawa Barat'),
('Jawa Tengah'),
('DI Yogyakarta'),
('Jawa Timur'),
('Banten');
