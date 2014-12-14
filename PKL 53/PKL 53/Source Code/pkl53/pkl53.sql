-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 23, 2014 at 04:36 AM
-- Server version: 5.5.27
-- PHP Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pkl53`
--

-- --------------------------------------------------------

--
-- Table structure for table `b1_keterangan_tempat`
--

CREATE TABLE IF NOT EXISTS `b1_keterangan_tempat` (
  `KKS` varchar(15) NOT NULL COMMENT 'Kode Kuesioner',
  `B1R1` varchar(1) DEFAULT NULL COMMENT 'Kab/Kota',
  `B1R2` varchar(3) DEFAULT NULL COMMENT 'Kec',
  `B1R3` varchar(3) DEFAULT NULL COMMENT 'Desa/Kel',
  `B1R5A` varchar(3) DEFAULT NULL COMMENT 'No. BS',
  `B1R6` varchar(2) DEFAULT NULL COMMENT 'No. ART',
  `B1R4` int(1) DEFAULT NULL COMMENT 'Klasifikasi Desa/Kel',
  `B1R7` varchar(50) DEFAULT NULL COMMENT 'Nama Pemilik',
  `B1R8` varchar(50) DEFAULT NULL COMMENT 'Alamat',
  `tanggal_pencacahan` date DEFAULT NULL COMMENT 'Tgl Pencacahan',
  `tanggal_pemeriksaan` date DEFAULT NULL COMMENT 'Tgl Pemeriksaan',
  `nim_pencacah` varchar(7) DEFAULT NULL COMMENT 'NIM Pencacah',
  PRIMARY KEY (`KKS`),
  KEY `nim_pencacah` (`nim_pencacah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b1_tempat`
--

CREATE TABLE IF NOT EXISTS `b1_tempat` (
  `KKS` varchar(12) NOT NULL,
  `B1R1` varchar(1) NOT NULL COMMENT 'kabupaten',
  `B1R2` varchar(3) NOT NULL COMMENT 'kecamatan',
  `B1R3` varchar(3) NOT NULL COMMENT 'desa',
  `B1R4` int(1) NOT NULL COMMENT 'klasifikasi desa',
  `B1R5` varchar(3) NOT NULL COMMENT 'Nomor Blok sensus',
  `B1R6` varchar(2) NOT NULL COMMENT 'Nomor urut rumah tangga',
  `B1R7` varchar(50) NOT NULL COMMENT 'Nama kepala rumah tangga ',
  `B1R8` varchar(50) NOT NULL COMMENT 'Alamat',
  `nim_pencacah` varchar(7) NOT NULL,
  `tgl_pencacahan` date NOT NULL,
  `tgl pemeriksaan` date DEFAULT NULL,
  PRIMARY KEY (`KKS`),
  KEY `B1R2` (`B1R2`),
  KEY `B1R3` (`B1R3`),
  KEY `nim_pencacah` (`nim_pencacah`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b4_keterangan_art`
--

CREATE TABLE IF NOT EXISTS `b4_keterangan_art` (
  `KKSArt` varchar(14) NOT NULL,
  `B4R1` varchar(2) NOT NULL COMMENT 'no art',
  `KKS` varchar(12) NOT NULL,
  `B4R2` varchar(50) NOT NULL COMMENT 'nama art',
  `B4R3` enum('1','2','3','4','5','6','7','8','9') NOT NULL COMMENT 'hub dengan krt',
  `B4R4` enum('1','2') NOT NULL COMMENT 'jenis kelamin',
  `B4R5` int(2) NOT NULL COMMENT 'umur',
  `B4R6` enum('1','2','3','4') NOT NULL COMMENT 'status perkawinan',
  `B4R7` enum('1','2') NOT NULL COMMENT 'memiliki pekerjaan',
  PRIMARY KEY (`KKSArt`),
  UNIQUE KEY `KKS` (`KKS`),
  KEY `KKS_2` (`KKS`),
  KEY `KKS_3` (`KKS`),
  KEY `KKS_4` (`KKS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b4_keterangan_pekerjaan`
--

CREATE TABLE IF NOT EXISTS `b4_keterangan_pekerjaan` (
  `KKSArtNu` varchar(15) NOT NULL,
  `B4R8` varchar(1) DEFAULT NULL COMMENT 'no urut pekerjaan',
  `KKSArt` varchar(14) NOT NULL,
  `B4R9` varchar(25) DEFAULT NULL COMMENT 'jenis pekerjaan',
  `B4R10` enum('1','2','3','4') DEFAULT NULL COMMENT 'status pekerjaan',
  `B4R11` enum('1','2') DEFAULT NULL COMMENT 'memiliki kontrak kerja',
  `B4R12` enum('1','2') DEFAULT NULL COMMENT 'mendapatkan pesangon',
  `B4R13` enum('1','2') DEFAULT NULL COMMENT 'perusahaan menyediakan dana pensiun',
  `B4R14` enum('1','2') DEFAULT NULL COMMENT 'perusahaan menyediakan pesangon',
  `B4R15` enum('1','2') DEFAULT NULL COMMENT 'perusahaan menyediakan cuti sakit',
  `B4R16` enum('1','2') DEFAULT NULL COMMENT 'perusahaan menyediakan cuti hamil & melahirkan',
  `B4R17` enum('1','2') DEFAULT NULL COMMENT 'pekerja informal',
  `B4R18` enum('0','1') DEFAULT NULL COMMENT 'pekerjaan informal utama',
  PRIMARY KEY (`KKSArtNu`),
  UNIQUE KEY `KKSART` (`KKSArt`),
  KEY `KKSArt_2` (`KKSArt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b4_keterangan_usaha`
--

CREATE TABLE IF NOT EXISTS `b4_keterangan_usaha` (
  `KKSArtNu` varchar(15) NOT NULL,
  `B4R8` varchar(1) DEFAULT NULL COMMENT 'No urut usaha ',
  `KKSArt` varchar(14) DEFAULT NULL,
  `B4R9` varchar(25) DEFAULT NULL COMMENT 'Lapangan usaha',
  `B4R10` enum('1','2','3') DEFAULT NULL COMMENT 'Status Dalam Pekerjaan ',
  `B4R11` enum('1','2') DEFAULT NULL COMMENT 'Berbadan Hukum ',
  `B4R12` enum('1','2','3') DEFAULT NULL COMMENT 'Apakah Terdaftar',
  `B4R13` enum('1','2','3') DEFAULT NULL COMMENT 'Memiliki Pembukuan',
  `B4R14` enum('1','2') DEFAULT NULL COMMENT 'Kategori informal',
  `B4R15` enum('0','1') DEFAULT NULL COMMENT 'Usaha Utama',
  PRIMARY KEY (`KKSArtNu`),
  KEY `KKSArt` (`KKSArt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b5`
--

CREATE TABLE IF NOT EXISTS `b5` (
  `KKSArt` varchar(12) NOT NULL,
  `B5R1_1` varchar(50) NOT NULL COMMENT 'Nama Pekerja',
  `B5R1_2` varchar(2) NOT NULL COMMENT 'No Urut Pekerja',
  `B5R2` varchar(2) NOT NULL COMMENT 'Kode Provinsi Lahir Pekerja',
  `B5R3` varchar(2) NOT NULL COMMENT 'Kode Prov Tmpt Tinggal Pekerja 5 thn lalu',
  `B5R4` enum('1','2','3') NOT NULL COMMENT 'Status Sekolah',
  `B5R5` enum('1','2') DEFAULT NULL COMMENT 'Pekerjaan menggangu pendidikan ?',
  `B5R6` enum('1','2','3','4','5','6','7','8','9') DEFAULT NULL COMMENT 'Ijazah yang dimiliki',
  `B5R7` varchar(2) DEFAULT NULL COMMENT 'Jurusan/Program studi terakhir',
  `B5R8` enum('1','2','3') NOT NULL COMMENT 'Pernah mengikuti pelatihan',
  `B5R9` varchar(2) DEFAULT NULL COMMENT 'Kode Jenis Pelatihan',
  `B5R10` enum('1','2') NOT NULL COMMENT 'Memiliki telepon/handphone',
  `B5R11` enum('1','2') NOT NULL COMMENT 'Memiliki akses thdp internet?',
  `B5R12A` enum('1','2') NOT NULL COMMENT 'Bisa mengoperasikan komputer?',
  `B5R12B` enum('1','2') DEFAULT NULL COMMENT 'Menggunakan komputer utk bekerja?',
  PRIMARY KEY (`KKSArt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Keterangan Umum Pekerja Informal';

-- --------------------------------------------------------

--
-- Table structure for table `b5a_pemilik_usaha`
--

CREATE TABLE IF NOT EXISTS `b5a_pemilik_usaha` (
  `KKSArtNu` varchar(15) NOT NULL,
  `B5AR2` varchar(2) DEFAULT NULL COMMENT 'PROVINSI LAHIR',
  `B5AR3` varchar(2) DEFAULT NULL COMMENT 'PROVINSI 5 TAHUN LALU',
  `B5AR4` varchar(2) DEFAULT NULL COMMENT 'SUKU',
  `B5AR5` enum('1','2','3','4','5','6','7','8','9') DEFAULT NULL COMMENT 'IJAZAH',
  `B5AR6` varchar(25) DEFAULT NULL COMMENT 'JURUSAN',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b5b_rincian_usaha`
--

CREATE TABLE IF NOT EXISTS `b5b_rincian_usaha` (
  `KKSArtNu` varchar(15) NOT NULL COMMENT 'KKSArtNu',
  `B5R7` varchar(4) DEFAULT NULL COMMENT 'Jenis Lapangan Usaha',
  `B5R8` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'Alasan Utama',
  `B5R8_Lain` varchar(50) DEFAULT NULL COMMENT 'Alasan Utama, lainnya',
  `B5R9_Bulan` int(2) DEFAULT NULL COMMENT 'Usaha mulai beroprasi (bulan)',
  `B5R9_Tahun` int(4) DEFAULT NULL COMMENT 'Usaha mulai beroprasi (tahun)',
  `B5R10` enum('1','2','3','4','5','6','7','8','9','10','11','12') DEFAULT NULL COMMENT 'Tipe tempat usaha',
  `B5R10_Lain` varchar(50) DEFAULT NULL COMMENT 'Tipe tempat usaha, lainnya',
  `B5R11` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'Status kepemilikan usaha',
  `B5R12A` enum('1','2','3') DEFAULT NULL COMMENT 'usaha terdaftar institusi: Kantor Pajak',
  `B5R12B` enum('1','2','3') DEFAULT NULL COMMENT 'usaha terdaftar institusi: Pemerintah Daerah',
  `B5R12C` enum('1','2','3') DEFAULT NULL COMMENT 'usaha terdaftar institusi: Pemerintah Pusat',
  `B5R12D` enum('1','2','3') DEFAULT NULL COMMENT 'usaha terdaftar institusi: Kantor Jamsostek',
  `B5R13` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'Jenis pembukuan',
  `B5R13_Lain` varchar(50) DEFAULT NULL COMMENT 'Jenis pembukuan, lainnya',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b5c_kompensasi`
--

CREATE TABLE IF NOT EXISTS `b5c_kompensasi` (
  `KKSARTNU` varchar(15) NOT NULL,
  `B5R14A` int(2) DEFAULT NULL COMMENT 'Jumlah pekerja',
  `B5R14B` int(2) DEFAULT NULL COMMENT 'Jumlah pekerja dibayar',
  `B5R15` int(2) DEFAULT NULL COMMENT 'Jumlah hari kerja',
  `B5R16` int(2) DEFAULT NULL COMMENT 'Bulan beroperasi',
  `B5R17` enum('1','2','3','4') DEFAULT NULL COMMENT 'Pedoman pengupahan',
  `B5R18A` enum('1','2','3') DEFAULT NULL COMMENT 'efisiensi perusahaan',
  `B5R18B` enum('1','2','3') DEFAULT NULL COMMENT 'penurunan produksi',
  `B5R18C` enum('1','2','3') DEFAULT NULL COMMENT 'BBM naik',
  `B5R18D` enum('1','2','3') DEFAULT NULL COMMENT 'sulit keuangan',
  `B5R18E` enum('1','2','3') DEFAULT NULL COMMENT 'lainnya',
  `B5R18_lainnya` varchar(50) DEFAULT NULL COMMENT 'lainnya dan sebutkan',
  `B5R19` int(11) DEFAULT NULL COMMENT 'total jaminan sosial',
  PRIMARY KEY (`KKSARTNU`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b5c_pekerja`
--

CREATE TABLE IF NOT EXISTS `b5c_pekerja` (
  `KKSArtNu` varchar(15) NOT NULL COMMENT 'FK tbl Ket Usaha',
  `B5CR20_1` int(2) DEFAULT NULL COMMENT 'no pekerja',
  `B5CR20_2` varchar(50) DEFAULT NULL COMMENT 'nama pekerja',
  `B5CR20_3` enum('1','2') DEFAULT NULL COMMENT 'gender',
  `BR5C20_4` int(2) DEFAULT NULL COMMENT 'umur',
  `BR5C20_5` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'Status Pekerjaan',
  `BR5C20_6` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'Kontrak Kerja',
  `BR5C20_7` int(3) DEFAULT NULL COMMENT 'jml Jam Kerja',
  `BR5C20_8` int(2) DEFAULT NULL COMMENT 'jml Hari Kerja',
  `BR5C20_9` enum('1','2','3','4','5','6','7','8') DEFAULT NULL COMMENT 'Dasar Pembayaran',
  `BR5C20_10` enum('1','2','3') DEFAULT NULL COMMENT 'Jenis Pembayaran',
  `BR5C20_11` int(11) DEFAULT NULL COMMENT 'Gaji dan Pendapatan',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b5d_pendapatan`
--

CREATE TABLE IF NOT EXISTS `b5d_pendapatan` (
  `KKSArtNu` varchar(15) NOT NULL,
  `B5R21_apr13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_mei13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_jun13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_juli13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_agst13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_sept13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_okt13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_nov13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_des13` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_jan14` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_feb14` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R21_mar14` enum('1','2','3') NOT NULL COMMENT 'fluktuasi kegiatan',
  `B5R22A` int(11) NOT NULL COMMENT 'pendp/penj min',
  `B5R22B` int(11) NOT NULL COMMENT 'pendp/penj rata2',
  `B5R22C` int(11) NOT NULL COMMENT 'pendp/penj maks',
  `B5R23A` enum('1','2') NOT NULL COMMENT 'pekerjan tdk tetap',
  `B5R23B1` int(2) NOT NULL COMMENT 'pekerja ttp laki2',
  `B5R23B2` int(2) NOT NULL COMMENT 'pekerja ttp per',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b5e_permodalan`
--

CREATE TABLE IF NOT EXISTS `b5e_permodalan` (
  `KKKSArtNu` varchar(15) NOT NULL,
  `B5ER24` int(11) NOT NULL COMMENT 'jumlah modal awal',
  `B5ER25_utama` int(1) NOT NULL COMMENT 'sumber modal utama',
  `B5ER25_lainnya` int(2) NOT NULL COMMENT 'sumber modal lainnya',
  `B5ER25_lainnya_sebutkan` varchar(25) DEFAULT NULL COMMENT 'sumber modal lainnya sebutkan',
  `B5ER26A` enum('1','2') NOT NULL COMMENT 'pernah pinjam di bank?',
  `B5ER26B` enum('1','2') NOT NULL COMMENT 'Apakah pinjaman berhasil ',
  `B5ER27` enum('1','2','3','4','5','6','7') DEFAULT NULL COMMENT 'alasan tidak mengajukan ke bank',
  `B5ER27_lainnya` varchar(25) DEFAULT NULL COMMENT 'alasan lain',
  `B5ER28` enum('1','2') NOT NULL COMMENT 'tahu lemb keu mikro',
  `B5ER28A` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'Alasan bisa tau lemb keu mikro',
  `B5ER28A_lainnya` varchar(25) DEFAULT NULL COMMENT 'Alasan bisa tau lemb keu mikro lainnya',
  `B5ER28B` enum('1','2') NOT NULL COMMENT 'pernah mengajukan permohonan pinjaman ke lemb keu mikro',
  `B5ER28C` enum('1','2','3','4','5','6','7','8') NOT NULL COMMENT 'alasan tdk mengajukan pinjaman ke mikro',
  `B5ER28C_lainnya` varchar(25) NOT NULL COMMENT 'Alasan tdk pinjam, lainnya',
  `B5ER28D` enum('1','2') DEFAULT NULL COMMENT 'Peroleh pinjaman mikro',
  `B5ER28E` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'alasan ditolak',
  `B5ER28E_lainnya` varchar(25) DEFAULT NULL COMMENT 'Alasan ditolak lainnya varchar',
  `B5E28F1` enum('1','2') NOT NULL COMMENT 'Peningkatan volume produksi',
  `B5E28F2` enum('1','2') NOT NULL COMMENT 'Menambah keragaman jenis produk',
  `B5E28F3` enum('1','2') NOT NULL COMMENT 'Meningkatkan volume penjualan',
  `B5E28F4` enum('1','2') NOT NULL COMMENT 'Meningkatkan daya saing',
  `B5E28F5` enum('1','2') NOT NULL COMMENT 'Menambah pekerja',
  `B5E28F6` enum('1','2') NOT NULL COMMENT 'Bekerja dalam jangka waktu cepat',
  `B5E28F7` enum('1','2') NOT NULL COMMENT 'Pemanfaatan sedikit pekerja',
  `B5E28F8` enum('1','2') NOT NULL COMMENT 'Dapat mengatasi kesulitan keuangan',
  `B5E28F9` enum('1','2') NOT NULL COMMENT 'Lainnya',
  `B5E28F9_lain` varchar(25) NOT NULL COMMENT 'Sebutkan lainnya',
  `B5ER29B` enum('1','2','3','4','5','6','7') NOT NULL COMMENT 'Bantuan utama',
  `B5ER29B1` enum('1','2') NOT NULL COMMENT 'Pelatihan teknis',
  `B5ER29B2` enum('1','2') NOT NULL COMMENT 'Pelatihan manajemen',
  `B5ER29B3` enum('1','2') NOT NULL COMMENT 'Bantuan bahan baku',
  `B5ER29B4` enum('1','2') NOT NULL COMMENT 'Akses peralatan modern',
  `B5ER29B5` enum('1','2') NOT NULL COMMENT 'Akses peminjaman',
  `B5ER29B6` enum('1','2') NOT NULL COMMENT 'Akses informasi',
  `B5ER29B7` enum('1','2') NOT NULL COMMENT 'Akses pesanan',
  `B5ER29B8` enum('1','2') NOT NULL COMMENT 'Masalah dengan pemerintah',
  `B5ER29B9` enum('1','2') NOT NULL COMMENT 'Proses pengadilan',
  `B5ER29B10` enum('1','2') NOT NULL COMMENT 'Masalah keamanan',
  `B5ER29B11` enum('1','2') NOT NULL COMMENT 'Berinteraksi dengan karyawan',
  `B5ER29B12` enum('1','2') NOT NULL COMMENT 'Lainnya',
  `B5ER29B12_lain` varchar(25) DEFAULT NULL COMMENT 'Sebutkan lainnya',
  PRIMARY KEY (`KKKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b6a`
--

CREATE TABLE IF NOT EXISTS `b6a` (
  `KKSArtNu` varchar(15) NOT NULL COMMENT 'Kode kuesioner+Art+Nomor urut usaha',
  `B6R13A` int(2) DEFAULT NULL COMMENT 'lamanya bekerja (tahun)',
  `B6R13B` int(2) DEFAULT NULL COMMENT 'lamanya bekerja (bulan)',
  `B6R14A` int(1) DEFAULT NULL COMMENT 'hari kerja dlm seminggu',
  `B6R14B` int(2) DEFAULT NULL COMMENT 'jam kerja dlm seminggu',
  `B6R11` enum('1','2') DEFAULT NULL COMMENT 'adanya daftar pekerjaan',
  `B6R12` enum('1','2') DEFAULT NULL COMMENT 'adanya jam siaga',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b6b`
--

CREATE TABLE IF NOT EXISTS `b6b` (
  `KKSArtNu` varchar(15) NOT NULL,
  `B6BR13` enum('1','2','3','4') NOT NULL COMMENT 'Bentuk pembayaran upah',
  `B6BR14` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'Dasar pembayaran upah',
  `B6BR14_lain` varchar(15) DEFAULT NULL COMMENT 'Dasar pembayaran upah lainnya',
  `B6BR15A` int(11) DEFAULT NULL COMMENT 'Upah berupa uang',
  `B6BR15B` int(11) DEFAULT NULL COMMENT 'Upah berupa barang',
  `B6BR16` enum('1','2','3') DEFAULT NULL COMMENT 'Dibayar tepat waktu?',
  `B6BR17` enum('1','2') NOT NULL COMMENT 'Dapat bonus?',
  `B6BR18` int(11) DEFAULT NULL COMMENT 'Total bonus',
  `B6BR19A` enum('1','2') NOT NULL COMMENT 'Diberi istirahat mingguan?',
  `B6BR19B` enum('1','2') NOT NULL COMMENT 'Diberi cuti orang tua?',
  `B6BR19C` enum('1','2') NOT NULL COMMENT 'Diberi libur lain?',
  `B6BR20` enum('1','2') NOT NULL COMMENT 'Pernah kecelakaan kerja?',
  `B6BR21A` enum('1','2','3') DEFAULT NULL COMMENT 'Jenis kecelakaan',
  `B6BR21B` enum('1','2') DEFAULT NULL COMMENT 'Dapat santunan kecelakaan kerja?',
  `B6BR22` enum('1','2') NOT NULL COMMENT 'Mengalami tindak kekerasan?',
  `B6BR23` enum('1','2','3') NOT NULL COMMENT 'Memperoleh jaminan sosial BPJS? ',
  `B6BR24A` enum('1','2') NOT NULL COMMENT 'Ingin berganti pekerjaan?',
  `B6BR24B` text NOT NULL,
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b6_keterangan_informal`
--

CREATE TABLE IF NOT EXISTS `b6_keterangan_informal` (
  `KKSArtNu` varchar(16) NOT NULL,
  `B6R2` varchar(4) NOT NULL COMMENT 'Klasifikasi Jenis Pekerjaan',
  `B6R3` varchar(4) NOT NULL COMMENT 'Klasifikasi Lapangan Usaha',
  `B6R4` enum('1','2','3','4','5','6','7','8','9','10','11','12') NOT NULL COMMENT 'Lokasi Kerja',
  `B6R4_lain` varchar(50) DEFAULT NULL COMMENT 'Lokasi Kerja Lain',
  `B6R5` enum('1','2') DEFAULT NULL COMMENT 'Harus Tinggal di Tempat Kerja?',
  `B6R6` int(3) DEFAULT NULL COMMENT 'Jarak Tempuh',
  `B6R7` int(3) DEFAULT NULL COMMENT 'Lama Pekerjaan',
  `B6R8` enum('1','2','3','4','5') NOT NULL COMMENT 'Alasan Pilih Pekerjaan',
  `B6R8_lain` varchar(25) DEFAULT NULL COMMENT 'Alasan Lain Pilih Pekerjaan',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b6_pungutan&retribusi`
--

CREATE TABLE IF NOT EXISTS `b6_pungutan&retribusi` (
  `KKSArtNu` varchar(15) NOT NULL,
  `B6R1` enum('1','2','3') NOT NULL COMMENT 'bayar retribusi',
  `B6R1_lainnya` varchar(25) DEFAULT NULL COMMENT 'bayar retribusi lainnya',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b7_kendala`
--

CREATE TABLE IF NOT EXISTS `b7_kendala` (
  `KKSARTNU` varchar(15) NOT NULL COMMENT 'kode kuesioner',
  `B7R1` enum('1','2') DEFAULT NULL COMMENT 'apa mengalami kesulitan',
  `B7R2A` enum('1','2') DEFAULT NULL COMMENT 'kesulitan bahan baku',
  `B7R2B` enum('1','2') DEFAULT NULL COMMENT 'kesulitan ketrampilan pekerja',
  `B7R2C` enum('1','2') DEFAULT NULL COMMENT 'kesulitan kemampuan bayar upah',
  `B7R2D` enum('1','2') DEFAULT NULL COMMENT 'kesulitan pungli',
  `B7R2E` enum('1','2') DEFAULT NULL COMMENT 'kesulitan kekurangan pelanggan',
  `B7R2F` enum('1','2') DEFAULT NULL COMMENT 'kesulitan terlalu banyak pesaing',
  `B7R2G` enum('1','2') DEFAULT NULL COMMENT 'kesulitan keuangan',
  `B7R2H` enum('1','2') DEFAULT NULL COMMENT 'kesulitan tempat usaha terlalu sempit',
  `B7R2I` enum('1','2') DEFAULT NULL COMMENT 'kesulitan kekurangan mesin perkap',
  `B7R2J` enum('1','2') DEFAULT NULL COMMENT 'kesulitan org management',
  `B7R2K` enum('1','2') DEFAULT NULL COMMENT 'kesulitan terlalu banyak aturan pajak',
  `B7R2L` enum('1','2') DEFAULT NULL COMMENT 'kesulitan pendapatan terlalu sedikit',
  `B7R3` enum('1','2','3','4') DEFAULT NULL COMMENT 'jenis kesulitan bahan baku ',
  `B7R3_lainnya` varchar(50) DEFAULT NULL COMMENT 'jenis kesulitan bahan baku lainnya',
  `B7R4A` enum('1','2') DEFAULT NULL COMMENT 'dibantu pel teknis',
  `B7R4B` enum('1','2') DEFAULT NULL COMMENT 'dibantu pel manajemen org keu',
  `B7R4C` enum('1','2') DEFAULT NULL COMMENT 'dibantu bahan baku',
  `B7R4D` enum('1','2') DEFAULT NULL COMMENT 'dibantu akses peralatan modern',
  `B7R4E` enum('1','2') DEFAULT NULL COMMENT 'dibantu akses dpt pinjaman',
  `B7R4F` enum('1','2') DEFAULT NULL COMMENT 'dibantu memperoleh info pasar',
  `B7R4G` enum('1','2') DEFAULT NULL COMMENT 'dibantu akses pesanan',
  `B7R4H` enum('1','2') DEFAULT NULL COMMENT 'dibantu pendaftaran bisnis',
  `B7R4I` enum('1','2') DEFAULT NULL COMMENT 'dibantu iklan',
  `B7R4J` enum('1','2') DEFAULT NULL COMMENT 'dibantu lainnya',
  `B7R4_sebutkan` varchar(25) DEFAULT NULL COMMENT 'dibantu lainnya, sebutkan',
  `B7R5` enum('1','2') DEFAULT NULL COMMENT 'apakah mnjd anggota org profesi',
  `B7R61` varchar(50) DEFAULT NULL COMMENT 'jenis bantuan 1',
  `B7R62` varchar(50) DEFAULT NULL COMMENT 'jenis bantuan 2 ',
  `B7R63` varchar(50) DEFAULT NULL COMMENT 'jenis bantuan 3',
  PRIMARY KEY (`KKSARTNU`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `b8_target&respon`
--

CREATE TABLE IF NOT EXISTS `b8_target&respon` (
  `KKSArtNu` varchar(15) NOT NULL,
  `B8R1A` enum('1','2') NOT NULL COMMENT 'Tempat jual usaha sektor formal',
  `B8R1B` enum('1','2') NOT NULL COMMENT 'Tempat jual usaha sektor informal',
  `B8R1C` enum('1','2') NOT NULL COMMENT 'Tempat jual pedagang',
  `B8R1D` enum('1','2') NOT NULL COMMENT 'Tempat jual RT',
  `B8R1E` enum('1','2') NOT NULL COMMENT 'Tempat jual pasar trad',
  `B8R1F` enum('1','2') NOT NULL COMMENT 'Tempat jual lainnya',
  `B8R1F_lain` varchar(25) NOT NULL COMMENT 'Sebutkan tempat jual lain',
  `B8R2` enum('1','2') NOT NULL COMMENT 'Pernah berganti usaha?',
  `B8R3` varchar(50) NOT NULL COMMENT 'Lapangan usaha sebelumnya',
  `B8R4` varchar(2) NOT NULL COMMENT 'Berapa kali pindah usaha',
  `B8R5` enum('1','2','3') NOT NULL COMMENT 'Jumlah konsumen',
  `B8R6` enum('1','2','3') NOT NULL COMMENT 'Jumlah produk yang terjual',
  `B8R7` enum('1','2','3') NOT NULL COMMENT 'Tindak lanjut',
  PRIMARY KEY (`KKSArtNu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `NIM` varchar(7) NOT NULL,
  `Nama` varchar(30) NOT NULL,
  `Password` varchar(15) NOT NULL,
  PRIMARY KEY (`NIM`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`NIM`, `Nama`, `Password`) VALUES
('11.6960', 'Yopi', 'yopi');

-- --------------------------------------------------------

--
-- Table structure for table `pencacah`
--

CREATE TABLE IF NOT EXISTS `pencacah` (
  `nim_pencacah` varchar(7) NOT NULL,
  `nim_kortim` varchar(7) DEFAULT NULL,
  PRIMARY KEY (`nim_pencacah`),
  KEY `nim_kortim` (`nim_kortim`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE IF NOT EXISTS `petugas` (
  `nim_pencacah` varchar(7) NOT NULL,
  `nim_kortim` varchar(7) NOT NULL,
  PRIMARY KEY (`nim_pencacah`),
  KEY `nim_pencacah` (`nim_pencacah`),
  KEY `nim_kortim` (`nim_kortim`),
  KEY `nim_kortim_2` (`nim_kortim`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `b1_keterangan_tempat`
--
ALTER TABLE `b1_keterangan_tempat`
  ADD CONSTRAINT `b1_keterangan_tempat_ibfk_1` FOREIGN KEY (`nim_pencacah`) REFERENCES `pencacah` (`nim_pencacah`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b1_tempat`
--
ALTER TABLE `b1_tempat`
  ADD CONSTRAINT `b1_tempat_ibfk_2` FOREIGN KEY (`nim_pencacah`) REFERENCES `mahasiswa` (`NIM`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b4_keterangan_art`
--
ALTER TABLE `b4_keterangan_art`
  ADD CONSTRAINT `b4_keterangan_art_ibfk_1` FOREIGN KEY (`KKS`) REFERENCES `b1_keterangan_tempat` (`KKS`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `b4_keterangan_art_ibfk_4` FOREIGN KEY (`KKS`) REFERENCES `b1_tempat` (`KKS`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b4_keterangan_pekerjaan`
--
ALTER TABLE `b4_keterangan_pekerjaan`
  ADD CONSTRAINT `b4_keterangan_pekerjaan_ibfk_2` FOREIGN KEY (`KKSArt`) REFERENCES `b4_keterangan_art` (`KKSArt`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b4_keterangan_usaha`
--
ALTER TABLE `b4_keterangan_usaha`
  ADD CONSTRAINT `b4_keterangan_usaha_ibfk_2` FOREIGN KEY (`KKSArt`) REFERENCES `b4_keterangan_art` (`KKSArt`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b5`
--
ALTER TABLE `b5`
  ADD CONSTRAINT `b5_ibfk_2` FOREIGN KEY (`KKSArt`) REFERENCES `b4_keterangan_art` (`KKSArt`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b5a_pemilik_usaha`
--
ALTER TABLE `b5a_pemilik_usaha`
  ADD CONSTRAINT `b5a_pemilik_usaha_ibfk_1` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b5b_rincian_usaha`
--
ALTER TABLE `b5b_rincian_usaha`
  ADD CONSTRAINT `b5b_rincian_usaha_ibfk_1` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b5c_kompensasi`
--
ALTER TABLE `b5c_kompensasi`
  ADD CONSTRAINT `b5c_kompensasi_ibfk_1` FOREIGN KEY (`KKSARTNU`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b5c_pekerja`
--
ALTER TABLE `b5c_pekerja`
  ADD CONSTRAINT `b5c_pekerja_ibfk_1` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`);

--
-- Constraints for table `b5d_pendapatan`
--
ALTER TABLE `b5d_pendapatan`
  ADD CONSTRAINT `b5d_pendapatan_ibfk_1` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b5e_permodalan`
--
ALTER TABLE `b5e_permodalan`
  ADD CONSTRAINT `b5e_permodalan_ibfk_1` FOREIGN KEY (`KKKSArtNu`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b6a`
--
ALTER TABLE `b6a`
  ADD CONSTRAINT `b6a_ibfk_2` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_pekerjaan` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b6b`
--
ALTER TABLE `b6b`
  ADD CONSTRAINT `b6b_ibfk_2` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_pekerjaan` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b6_keterangan_informal`
--
ALTER TABLE `b6_keterangan_informal`
  ADD CONSTRAINT `b6_keterangan_informal_ibfk_2` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_pekerjaan` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b6_pungutan&retribusi`
--
ALTER TABLE `b6_pungutan&retribusi`
  ADD CONSTRAINT `b6_pungutan@0026retribusi_ibfk_1` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b7_kendala`
--
ALTER TABLE `b7_kendala`
  ADD CONSTRAINT `b7_kendala_ibfk_1` FOREIGN KEY (`KKSARTNU`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `b8_target&respon`
--
ALTER TABLE `b8_target&respon`
  ADD CONSTRAINT `b8_target@0026respon_ibfk_1` FOREIGN KEY (`KKSArtNu`) REFERENCES `b4_keterangan_usaha` (`KKSArtNu`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `pencacah`
--
ALTER TABLE `pencacah`
  ADD CONSTRAINT `pencacah_ibfk_1` FOREIGN KEY (`nim_pencacah`) REFERENCES `mahasiswa` (`NIM`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `pencacah_ibfk_2` FOREIGN KEY (`nim_kortim`) REFERENCES `mahasiswa` (`NIM`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `petugas`
--
ALTER TABLE `petugas`
  ADD CONSTRAINT `petugas_ibfk_3` FOREIGN KEY (`nim_pencacah`) REFERENCES `mahasiswa` (`NIM`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `petugas_ibfk_4` FOREIGN KEY (`nim_kortim`) REFERENCES `mahasiswa` (`NIM`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
