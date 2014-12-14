-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2014 at 07:18 PM
-- Server version: 5.6.16
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Table structure for table `1b1_tempat`
--

CREATE TABLE IF NOT EXISTS `1b1_tempat` (
  `KKS` varchar(13) NOT NULL,
  `B1R1` varchar(2) NOT NULL COMMENT 'Kab/Kota',
  `B1R2` varchar(5) DEFAULT NULL COMMENT 'Kec',
  `B1R3` varchar(8) DEFAULT NULL COMMENT 'Desa/Kel',
  `B1R4` enum('1','2') DEFAULT NULL COMMENT 'klasifikasi desa',
  `B1R5A` varchar(12) DEFAULT NULL COMMENT 'No. BS',
  `B1R5B` varchar(3) DEFAULT NULL COMMENT 'nomor segmen',
  `B1R6` varchar(2) DEFAULT NULL COMMENT 'No. Rumah Tangga',
  `B1R7` varchar(50) DEFAULT NULL COMMENT 'Nama KRT',
  `B1R8` varchar(50) NOT NULL DEFAULT '' COMMENT 'Alamat',
  `tanggalPencacahan` date DEFAULT NULL COMMENT 'Tgl Pencacahan',
  `tanggalPemeriksaanKP` date DEFAULT NULL COMMENT 'Tgl Pemeriksaan',
  `nimPencacah` varchar(7) DEFAULT NULL COMMENT 'NIM Pencacah',
  PRIMARY KEY (`KKS`),
  KEY `nim_pencacah` (`nimPencacah`),
  KEY `B1R4` (`B1R4`),
  KEY `b1_keterangantempat_ibfk_2` (`B1R1`),
  KEY `B1R2` (`B1R2`),
  KEY `B1R3` (`B1R3`),
  KEY `B1R5A` (`B1R5A`),
  KEY `B1R6` (`B1R6`),
  KEY `B1R2_2` (`B1R2`),
  KEY `B1R2_3` (`B1R2`,`B1R3`,`B1R5A`,`B1R5B`),
  KEY `B1R1_3` (`B1R1`),
  KEY `B1R4_2` (`B1R4`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1b1_tempat`
--

INSERT INTO `1b1_tempat` (`KKS`, `B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5A`, `B1R5B`, `B1R6`, `B1R7`, `B1R8`, `tanggalPencacahan`, `tanggalPemeriksaanKP`, `nimPencacah`) VALUES
('0504002300805', '05', '05040', '05040023', '2', '5040028008B', '002', '05', 'Memo Zebua', 'Jalan Karet Kemarin No 9', '2014-05-05', '2014-05-08', '11.6782'),
('1001000500102', '10', '10010', '10010005', '1', '10010005001B', '004', '02', 'Bagus Setia', 'Jl. Otista', '2014-05-01', '2014-05-02', '11.6813'),
('7102000902207', '71', '71020', '71020009', '1', '71020009022B', '020', '07', 'FAHMI MAULANA', 'Jl. Kebon Nanas Selatan 1 No. 16', '2014-04-25', '2014-04-27', '11.6652'),
('7103000101016', '71', '71030', '71030001', '1', '71030001010B', '001', '16', 'Faberlius Hulu', 'Jalan Sensus 2C', '2014-04-25', '2014-04-27', '11.6648'),
('7103000202216', '71', '71030', '71030002', '1', '71030002022B', NULL, '16', 'Yuko Oshima', 'Jalan Akhibara ', '2014-05-12', '2014-05-20', '11.6727'),
('7103000202219', '71', '71030', '71030002', '1', '71030002022B', NULL, '19', 'YUNITA KRISTY', 'jalan masjid', '2014-05-12', '2014-05-20', '11.6971'),
('7105100002010', '71', '05012', '05012003', '2', '10010007005B', '010', '08', 'Rezeki RIdho', 'jl. Permata', '2014-04-29', '2014-04-30', '11.6560');

-- --------------------------------------------------------

--
-- Table structure for table `1b4_art`
--

CREATE TABLE IF NOT EXISTS `1b4_art` (
  `KKSArt` varchar(15) NOT NULL COMMENT 'KKSArt',
  `KKS` varchar(13) NOT NULL COMMENT 'KKS',
  `B4R1` varchar(2) NOT NULL COMMENT 'No. ART',
  `B4R2` varchar(50) NOT NULL COMMENT 'Nama ART',
  `B4R3` enum('1','2','3','4','5','6','7','8','9') NOT NULL COMMENT 'Hubungan dengan KRT',
  PRIMARY KEY (`KKSArt`),
  KEY `KKS` (`KKS`),
  KEY `B4R3` (`B4R3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1b4_art`
--

INSERT INTO `1b4_art` (`KKSArt`, `KKS`, `B4R1`, `B4R2`, `B4R3`) VALUES
('050400230080501', '0504002300805', '01', 'Memo Zebua', '1'),
('050400230080502', '0504002300805', '02', 'Viktor Bale Zebua', '7'),
('100100050010201', '1001000500102', '01', 'Bagus Setia', '1'),
('710200090220701', '7102000902207', '01', 'FAHMI MAULANA', '1'),
('710200090220702', '7102000902207', '02', 'ISTRI FAHMI MAULANA', '2'),
('710200090220703', '7102000902207', '03', 'Anak FAHMI MAULANA', '3'),
('710200090220704', '7102000902207', '04', 'Anak2 FAHMI MAULANA', '3'),
('710200090220705', '7102000902207', '05', 'Anak3 FAHMI MAULANA', '3'),
('710300020011601', '7103000200116', '01', 'Faberlius Hulu', '1'),
('710300020011602', '7103000200116', '02', 'Kriswanti Lase', '2'),
('710300020011603', '7103000200116', '03', 'Sevelino Hulu', '3'),
('710300020011604', '7103000200116', '04', 'Sevel Wati Hulu ', '3'),
('710300020011605', '7103000200116', '05', 'Sevelius Hulu', '3'),
('710300020221601', '7103000202216', '01', 'Yuko Oshima', '2'),
('710300020221602', '7103000202216', '02', 'Maeda Atsuko', '2'),
('710300020221901', '7103000202219', '01', 'YUNITA KRISTY', '3'),
('710300020221902', '7103000202219', '02', 'BOMBI', '4'),
('710510000201001', '7105100002010', '01', 'Rezeki Ridho', '1'),
('710510000201002', '7105100002010', '02', 'Aprilia Anti', '2');

-- --------------------------------------------------------

--
-- Table structure for table `1b4_umumtenagakerja`
--

CREATE TABLE IF NOT EXISTS `1b4_umumtenagakerja` (
  `KKSArtNup` varchar(16) NOT NULL COMMENT 'kks+art+no urut pekerjaan',
  `KKSArt` varchar(15) NOT NULL,
  `B4R4` varchar(1) DEFAULT NULL COMMENT 'no urut pekerjaan',
  `B4R5` enum('0','1','2','3','4','5','6','7','8','9') DEFAULT NULL COMMENT 'rincian lapangan usaha',
  `B4R6` varchar(2) NOT NULL COMMENT 'no kbli',
  `B4R8` enum('1','2','3','4','5','6','7') DEFAULT NULL COMMENT 'status pekerjaan',
  `B4R7` enum('0','1','2','3','4','5','6','7','8','9') DEFAULT NULL COMMENT 'jenis pekerjaan',
  `B4R9` enum('1','2','3') DEFAULT NULL COMMENT 'kontrak kerja tertulis',
  `B4R10` enum('1','2','3') DEFAULT NULL COMMENT 'pesangon',
  `B4R11` enum('1','2','3') DEFAULT NULL COMMENT 'kompensasi sakit',
  `B4R12` enum('1','2','3') DEFAULT NULL COMMENT 'Kompensasi lahir',
  `B4R13` enum('1','2','3') DEFAULT NULL COMMENT 'berhenti tnp pemberitahuan',
  `B4R14` enum('0','1') DEFAULT NULL COMMENT 'checklist pekerjaan informal',
  `B4R15` enum('0','1') DEFAULT NULL COMMENT 'pekerjaan informal utama',
  `B4R16` enum('1','2') DEFAULT NULL COMMENT 'jual barang atau barter',
  `B4R17` enum('1','2','3') DEFAULT NULL COMMENT 'badan hukum',
  `B4R18` enum('1','2','3','4') DEFAULT NULL COMMENT 'pembukuan',
  `B4R19` enum('1','2','3','4') DEFAULT NULL COMMENT 'kantor pajak',
  `B4R20` enum('1','2','3','4') DEFAULT NULL COMMENT 'pemerintah daerah',
  `B4R21` enum('1','2','3','4') DEFAULT NULL COMMENT 'pemerintah pusat',
  `B4R22` enum('1','2','3','4') DEFAULT NULL COMMENT 'kantor jamsostek',
  `B4R23` enum('0','1') DEFAULT NULL COMMENT 'kategori usaha informal/bukan',
  `B4R24` enum('0','1') DEFAULT NULL COMMENT 'usaha informal utama',
  PRIMARY KEY (`KKSArtNup`),
  KEY `KKSArt` (`KKSArt`),
  KEY `B4R8` (`B4R7`),
  KEY `B4R9` (`B4R9`),
  KEY `B4R10` (`B4R10`),
  KEY `B4R11` (`B4R11`),
  KEY `B4R13` (`B4R13`),
  KEY `B4R18` (`B4R18`),
  KEY `B4R12` (`B4R12`),
  KEY `B4R19` (`B4R19`),
  KEY `B4R20` (`B4R20`),
  KEY `B4R21` (`B4R21`),
  KEY `B4R22` (`B4R22`),
  KEY `B4R7` (`B4R8`),
  KEY `B4R16` (`B4R16`),
  KEY `B4R17` (`B4R17`),
  KEY `B4R5` (`B4R5`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1b4_umumtenagakerja`
--

INSERT INTO `1b4_umumtenagakerja` (`KKSArtNup`, `KKSArt`, `B4R4`, `B4R5`, `B4R6`, `B4R8`, `B4R7`, `B4R9`, `B4R10`, `B4R11`, `B4R12`, `B4R13`, `B4R14`, `B4R15`, `B4R16`, `B4R17`, `B4R18`, `B4R19`, `B4R20`, `B4R21`, `B4R22`, `B4R23`, `B4R24`) VALUES
('0504002300805011', '050400230080501', '1', '1', '01', '2', '6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '2', '3', '3', '3', '3', '0', '0'),
('0504002300805012', '050400230080501', '2', '2', '18', '7', '5', '2', '2', '2', '2', '1', '0', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('0504002300805021', '050400230080502', '1', '5', '01', '5', '6', '2', '2', '2', '2', '1', '0', '0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('1001000500102011', '100100050010201', '1', '2', '15', '3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '3', '3', '3', '3', '3', '1', '1'),
('7102000902207011', '710200090220701', '1', '1', '61', '1', '3', '2', '2', '2', '2', '2', '1', '0', '1', '2', '2', '2', '2', '2', '2', '1', '1'),
('7102000902207012', '710200090220701', '2', '4', '51', '4', '5', '2', '2', '2', '2', '2', '', '', '2', '2', '2', '2', '2', '2', '2', '0', '0'),
('7102000902207021', '710200090220702', '1', '9', '81', '5', '4', '2', '2', '2', '2', '2', '0', '0', '2', '2', '2', '2', '2', '2', '2', '1', '1'),
('7103000200116011', '710300020011601', '1', '4', '01', '2', '6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '3', '3', '3', '3', '3', '1', '1'),
('7103000200116021', '710300020011602', '1', '4', '18', '4', '2', '2', '2', '2', '2', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7103000200116031', '710300020011603', '1', '1', '01', '7', '6', '2', '2', '2', '2', '2', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7103000200116041', '710300020011604', '1', '4', '04', '4', '4', '2', '2', '2', '2', '2', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7103000200116051', '710300020011605', '1', '5', '09', '1', '5', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '1', '3', '1', '2', '1', '2', '0', '0'),
('7103000202216011', '710300020221601', '1', '2', '01', '2', '6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '3', '3', '3', '3', '3', '1', '1'),
('7103000202216021', '710300020221602', '1', '6', '01', '7', '7', '2', '2', '2', '2', '1', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7103000202219011', '710300020221901', '0', '6', '06', '2', '9', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '2', '3', '3', '3', '3', '1', '1'),
('7103000202219022', '710300020221902', '2', '4', '06', '4', '2', '2', '2', '2', '2', '2', '1', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7105100002010011', '710510000201001', '1', '4', '4', '2', '3', '3', '3', '3', '3', '3', '1', '0', '1', '1', '1', '1', '1', '1', '1', '1', '0'),
('7105100002010012', '710510000201001', '2', '1', '1', '2', '1', '2', '2', '2', '2', '2', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('7105100002010021', '710510000201002', '1', '5', '2', '2', '2', '3', '3', '3', '3', '2', '1', '1', '2', '2', '2', '2', '2', '2', '2', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `1b5_umumtenagakerjainformal`
--

CREATE TABLE IF NOT EXISTS `1b5_umumtenagakerjainformal` (
  `KKSArtNup` varchar(16) NOT NULL,
  `B5R1A` varchar(50) DEFAULT NULL COMMENT 'Nama',
  `B5R1B` int(2) DEFAULT NULL COMMENT 'No ART',
  `B5R3` enum('1','2') DEFAULT NULL COMMENT 'Jenis kelamin',
  `B5R4` int(2) DEFAULT NULL COMMENT 'Umur',
  `B5R5` enum('1','2','3','4') DEFAULT NULL COMMENT 'Status perkawinan',
  `B5R2` varchar(1) DEFAULT NULL COMMENT 'No urut pekerjaan',
  `B5R6A` varchar(2) DEFAULT NULL COMMENT 'Provinsi lahir',
  `B5R6B` varchar(2) DEFAULT NULL COMMENT 'Kabupaten/kota lahir',
  `B5R7A` varchar(2) DEFAULT NULL COMMENT 'provinsi 5thn lalu',
  `B5R7B` varchar(2) DEFAULT NULL COMMENT 'kota/kab 5 tahun lalu',
  `B5R8` varchar(3) DEFAULT NULL COMMENT 'suku',
  `B5R9` enum('1','2','3') DEFAULT NULL COMMENT 'partisipasi sekolah',
  `B5R10` enum('1','2') DEFAULT NULL COMMENT 'pekerjaan mengganggu pendidikan',
  `B5R11` enum('1','2','3','4','5','6','7','8','9') DEFAULT NULL COMMENT 'ijazah tertinggi',
  `B5R12` varchar(2) DEFAULT NULL COMMENT 'jurusan/prodi',
  `B5R13` enum('1','2','3') DEFAULT NULL COMMENT 'pelatihan kerja',
  `B5R14A` varchar(2) DEFAULT NULL COMMENT 'jenis pelatihan kerja',
  `B5R14B` varchar(2) DEFAULT NULL COMMENT 'jenis pelatihan kerja',
  `B5R15` enum('1','2') DEFAULT NULL COMMENT 'memiliki hp',
  `B5R16` enum('1','2') DEFAULT NULL COMMENT 'perrnah akses internet',
  `B5R17A` enum('1','2') DEFAULT NULL COMMENT 'bisa komputer',
  `B5R17B` enum('1','2') DEFAULT NULL COMMENT 'menggunakan komputer untuk kerja',
  PRIMARY KEY (`KKSArtNup`),
  KEY `B5R11` (`B5R11`),
  KEY `B5R13` (`B5R13`),
  KEY `B5R9` (`B5R9`),
  KEY `B5R5` (`B5R5`),
  KEY `B5R12` (`B5R12`),
  KEY `B5R14A` (`B5R14A`,`B5R14B`),
  KEY `B5R14B` (`B5R14B`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1b5_umumtenagakerjainformal`
--

INSERT INTO `1b5_umumtenagakerjainformal` (`KKSArtNup`, `B5R1A`, `B5R1B`, `B5R3`, `B5R4`, `B5R5`, `B5R2`, `B5R6A`, `B5R6B`, `B5R7A`, `B5R7B`, `B5R8`, `B5R9`, `B5R10`, `B5R11`, `B5R12`, `B5R13`, `B5R14A`, `B5R14B`, `B5R15`, `B5R16`, `B5R17A`, `B5R17B`) VALUES
('0504002300805011', 'Memo Zebua', 1, '1', 21, '1', '1', '12', '23', '18', '05', '6', '2', '2', '4', NULL, '1', NULL, NULL, '1', '1', '1', '2'),
('0504002300805021', 'Victor Bale Zebua', 2, '1', 18, '1', '1', '12', '23', '18', '05', '6', '2', '2', '3', NULL, '1', NULL, NULL, '1', '1', '1', '2'),
('1001000500102011', 'Bagus Setia', 1, '1', 30, '2', '1', '12', '03', '12', '03', '001', '3', NULL, '3', NULL, '1', NULL, NULL, '1', '2', '2', '2'),
('7102000902207011', 'FAHMI MAULANA', 1, '1', 42, '1', '1', '18', '71', '32', '71', '1', '1', '2', '6', '08', '1', '1', '1', '1', '1', '1', '1'),
('7102000902207021', 'ISTRI FAHMI MAULANA', 2, '2', 35, '1', '1', '18', '71', '32', '71', '1', '3', NULL, '6', '07', '1', '1', '1', '1', '1', '1', '1'),
('7103000200116011', 'Faberlius Hulu', 1, '1', 40, '2', '0', '12', '14', '19', '20', '07', '3', '2', '6', NULL, '2', NULL, NULL, '1', '1', '1', '1'),
('7103000200116021', 'Kriswanti Lase', 2, '2', 39, '2', '1', '12', '13', '19', '10', '07', '3', '2', '5', NULL, '2', NULL, NULL, '1', '1', '1', '1'),
('7103000200116031', 'Sevelino Hulu', 3, '1', 19, '1', '1', '19', '20', '19', '20', '07', '2', '2', '4', NULL, '1', NULL, NULL, '1', '1', '1', '1'),
('7103000200116041', 'Sevel Wati Hulu', 4, '2', 17, '1', '1', '19', '20', '19', '20', '07', '2', '2', '4', NULL, '1', NULL, NULL, '1', '1', '1', '1'),
('7103000200116051', 'Sevelius Hulu', 5, '1', 15, '1', '1', '19', '20', '19', '20', '07', '2', '2', '3', NULL, '1', NULL, NULL, '1', '1', '1', '1'),
('7103000202216011', 'Yuko Oshima', 1, '1', 34, '2', '1', '18', '10', '18', '71', '1', '3', NULL, '2', NULL, '1', NULL, NULL, '1', '2', '2', NULL),
('7103000202216021', 'ZEBUA', 1, '1', 21, '1', '0', '12', '32', '12', '32', '005', '2', '2', '4', NULL, '2', NULL, NULL, '1', '1', '1', '1'),
('7103000202219011', 'YUNITA KRISTY', 1, '2', 35, '2', '1', '71', '71', '71', '71', '001', '3', NULL, '5', NULL, '1', NULL, NULL, '1', '2', '2', '2'),
('7103000202219022', 'BOMBI', 2, '1', 37, '2', '2', '71', '71', '71', '71', '001', '2', NULL, '5', NULL, '1', NULL, NULL, '1', '1', '1', '2'),
('7105100002010012', 'Rezeki Ridho', 1, '1', 31, '1', '2', '31', NULL, '71', '02', '05', '1', '2', '4', '01', '1', '01', '02', '2', '2', '2', '1'),
('7105100002010021', 'Aprilia Anti', 2, '2', 26, '2', '2', '31', NULL, '71', '05', '05', '3', '2', '4', '01', '2', '01', '02', '1', '1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `1b6_umumpekerjaaninformalutama`
--

CREATE TABLE IF NOT EXISTS `1b6_umumpekerjaaninformalutama` (
  `KKSArtNup` varchar(16) NOT NULL,
  `B6R1` varchar(2) DEFAULT NULL COMMENT 'KBJI',
  `B6R2` varchar(2) DEFAULT NULL COMMENT 'KBLI',
  `B6R3` enum('1','2','3','4','5','6','7','8','9','10','11','12','13') DEFAULT NULL COMMENT 'lokasi kerja',
  `B6R3_tetapLainnya` varchar(50) DEFAULT NULL COMMENT 'lokasi pekerjaan lain (tempat tetap)',
  `B6R3_tidakTetapLainnya` varchar(50) DEFAULT NULL COMMENT 'lokasi pekerjaan (tidak tetap)',
  `B6R4A` int(2) DEFAULT NULL COMMENT 'jarak tempuh(km)',
  `B6R4B` int(3) DEFAULT NULL COMMENT 'jarak tempuh (m)',
  `B6R5A` int(2) DEFAULT NULL COMMENT 'lama perjalanan(jam)',
  `B6R5B` int(2) DEFAULT NULL COMMENT 'lama perjalanan (menit)',
  `B6R6_utama` int(2) DEFAULT NULL COMMENT 'alasan utama',
  `B6R6_utama_lainnya` varchar(50) DEFAULT NULL COMMENT 'alasan utama lainnya',
  `B6R6_lain` int(2) DEFAULT NULL COMMENT 'alasan lain',
  `B6R6_lain_lainnya` varchar(50) DEFAULT NULL COMMENT 'alasan lain lainnya',
  `B6R7A` int(2) DEFAULT NULL COMMENT 'lama bekerja (th)',
  `B6R7B` int(2) DEFAULT NULL COMMENT 'lama berkerja (bulan)',
  `B6R8A` int(1) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B6R8B` int(2) DEFAULT NULL COMMENT 'jumlah jam kerja seminggu',
  `B6R9A` enum('1','2') DEFAULT NULL COMMENT 'keluhan kesehatan',
  `B6R9B` enum('1','2') DEFAULT NULL COMMENT 'terganggunya pekerjaan',
  `B6R10` enum('1','2') DEFAULT NULL COMMENT 'ada kecelakaan kerja',
  `B6R11` enum('1','2') DEFAULT NULL COMMENT 'pernah alami kecelakaan kerja',
  `B6R12A` enum('1','2','3') DEFAULT NULL COMMENT 'jenis kecelakaan',
  `B6R12B` enum('1','2') DEFAULT NULL COMMENT 'santunan kecelakaan',
  `B6R13` enum('1','2') DEFAULT NULL COMMENT 'ada tindak kekerasan',
  `B6R14` enum('1','2') DEFAULT NULL COMMENT 'pernah alami tindak kekerasan',
  `B6R16` enum('1','2','3','4') DEFAULT NULL COMMENT 'bentuk pembayaran upah',
  `B6R17` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'dasar pembayaran upah',
  `B6R17_lainnya` varchar(50) DEFAULT NULL COMMENT 'dasar pembayaran upah lainnya',
  `B6R15A` int(8) DEFAULT NULL COMMENT 'jumlah pendapatan (uang)',
  `B6R15B` int(8) DEFAULT NULL COMMENT 'jumlah pendapatan (barang)',
  `B6R18` enum('1','2','3') DEFAULT NULL COMMENT 'upah tepat waktu',
  `B6R19` enum('1','2') DEFAULT NULL COMMENT 'dapet bonus',
  `B6R20A` int(8) DEFAULT NULL COMMENT 'total bonus dalam uang',
  `B6R20B` int(8) DEFAULT NULL COMMENT 'total bonus dalam barang',
  `B6R21A` enum('1','2') DEFAULT NULL COMMENT 'hari istirahat mingguan',
  `B6R21B` enum('1','2') DEFAULT NULL COMMENT 'cuti orangtua',
  `B6R21C` enum('1','2') DEFAULT NULL COMMENT 'libur lainnya',
  `B6R22A` enum('1','2','3') DEFAULT NULL COMMENT 'apakah ada jaminan sosial',
  `B6R22B` enum('1','2') DEFAULT NULL COMMENT 'bentuk jaminan sosial',
  `B6R22B_lainnya` varchar(50) DEFAULT NULL COMMENT 'bentuk jaminan sosial lainnya',
  PRIMARY KEY (`KKSArtNup`),
  KEY `B6R3` (`B6R3`),
  KEY `B6R6_utama` (`B6R6_utama`),
  KEY `B6R6_lain` (`B6R6_lain`),
  KEY `B6R13A` (`B6R12A`),
  KEY `B6R16` (`B6R16`),
  KEY `B6R17` (`B6R17`),
  KEY `B6R19` (`B6R18`),
  KEY `B6R23` (`B6R22A`),
  KEY `B6R12A` (`B6R12A`),
  KEY `B6R1` (`B6R1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1b6_umumpekerjaaninformalutama`
--

INSERT INTO `1b6_umumpekerjaaninformalutama` (`KKSArtNup`, `B6R1`, `B6R2`, `B6R3`, `B6R3_tetapLainnya`, `B6R3_tidakTetapLainnya`, `B6R4A`, `B6R4B`, `B6R5A`, `B6R5B`, `B6R6_utama`, `B6R6_utama_lainnya`, `B6R6_lain`, `B6R6_lain_lainnya`, `B6R7A`, `B6R7B`, `B6R8A`, `B6R8B`, `B6R9A`, `B6R9B`, `B6R10`, `B6R11`, `B6R12A`, `B6R12B`, `B6R13`, `B6R14`, `B6R16`, `B6R17`, `B6R17_lainnya`, `B6R15A`, `B6R15B`, `B6R18`, `B6R19`, `B6R20A`, `B6R20B`, `B6R21A`, `B6R21B`, `B6R21C`, `B6R22A`, `B6R22B`, `B6R22B_lainnya`) VALUES
('0504002300805011', '61', '01', '4', NULL, NULL, 2, 30, 0, 20, 16, NULL, 8, NULL, 4, 5, 6, 24, '1', '2', '1', '1', '1', NULL, '2', NULL, NULL, NULL, NULL, 3200000, 10000, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('0504002300805021', '61', '01', '4', NULL, NULL, 2, 30, 0, 20, 1, NULL, 16, NULL, 2, 1, 6, 24, '1', '2', '1', '1', '1', '2', '1', '2', '3', '5', NULL, 1200000, 50000, '1', '2', NULL, NULL, '1', '1', '1', '3', NULL, NULL),
('1001000500102011', '13', '12', '3', NULL, NULL, 5, 200, 1, 0, 4, NULL, NULL, NULL, 3, 2, 6, 35, '2', NULL, '2', NULL, NULL, NULL, '2', NULL, NULL, NULL, NULL, 2500000, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7102000902207011', '72', '61', '6', NULL, NULL, 45, 500, 3, 20, 1, NULL, 8, NULL, 8, 3, 6, 24, '1', '2', '1', '1', '2', '2', '2', '1', '1', '2', NULL, 15000000, 0, '1', '2', NULL, NULL, '1', '1', '1', '2', NULL, NULL),
('7102000902207021', '83', '62', '7', NULL, NULL, 7, 100, 0, 50, 1, NULL, 4, NULL, 3, 4, 5, 25, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', NULL, 3000000, 0, '1', '2', NULL, NULL, '1', '1', '1', '2', NULL, NULL),
('7103000200116011', '11', '01', '7', NULL, NULL, 2, 30, 1, 45, 4, NULL, 8, NULL, 5, 6, 5, 35, '2', '2', '2', '2', NULL, '2', '2', '2', '1', '1', NULL, 2000000, NULL, '2', '2', NULL, NULL, '2', '2', '2', '2', '2', NULL),
('7103000200116021', '12', '18', '4', NULL, NULL, 2, 5, 1, 5, 2, NULL, 4, NULL, 5, 6, 5, 35, '2', '2', '2', '2', NULL, '2', '2', '2', '1', '4', NULL, 2000000, NULL, '1', '2', NULL, NULL, '2', '2', '2', '2', '2', NULL),
('7103000200116031', '32', '09', '3', NULL, NULL, 2, 30, 0, 45, 2, NULL, 4, NULL, 2, 4, 5, 35, '2', '2', '2', '2', NULL, '2', '2', '2', '1', '4', NULL, 1500000, NULL, '1', '2', NULL, NULL, '2', '2', '2', '2', NULL, NULL),
('7103000200116051', '01', '01', '2', NULL, NULL, NULL, NULL, NULL, NULL, 2, NULL, NULL, NULL, 1, 1, 4, 30, '2', '2', '2', '2', NULL, '2', '2', '2', '1', '4', NULL, NULL, NULL, '2', '2', NULL, NULL, '2', '2', '2', '2', NULL, NULL),
('7103000202216011', '61', '01', '4', NULL, NULL, 0, 400, 0, 15, 8, NULL, 16, NULL, 8, 0, 6, 60, '1', '2', '1', '2', NULL, NULL, '2', NULL, NULL, NULL, NULL, 15000000, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7103000202216021', '11', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7103000202219011', '61', '21', '4', NULL, NULL, NULL, 50, NULL, 30, NULL, NULL, NULL, NULL, 2, NULL, 5, 5, '2', NULL, '2', '2', NULL, NULL, '2', '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7103000202219022', '61', '01', '4', NULL, NULL, 0, 400, 0, 15, 8, NULL, 16, NULL, 8, 0, 6, 60, '1', '2', '1', '2', NULL, NULL, '2', NULL, NULL, NULL, NULL, 15000000, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
('7105100002010011', '72', '4', '3', NULL, NULL, 5, 0, 1, 0, 1, NULL, 2, NULL, 1, 0, 7, 49, '1', '1', '1', '1', '1', '1', '1', '1', '2', '4', NULL, 500000, 100011, '1', '1', 100000, 10020202, '2', '2', '2', '2', '2', NULL),
('7105100002010021', '74', '1', '2', NULL, NULL, 21, 212, 21, 21, 32, NULL, 4, NULL, 21, 21, 3, 34, '2', '2', '2', '1', '2', '2', '1', '2', '2', '5', NULL, 1000000, 1000000, '1', '2', 10002222, 2331224, '1', '1', '1', '3', '1', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `1b7_krt`
--

CREATE TABLE IF NOT EXISTS `1b7_krt` (
  `KKSArt` varchar(15) NOT NULL COMMENT 'kks + no krt',
  `B7R1` varchar(50) NOT NULL COMMENT 'nama krt',
  `B7R2` int(2) NOT NULL COMMENT 'umur krt',
  `B7R3` enum('1','2','3') DEFAULT NULL COMMENT 'partisipasi sekolah',
  `B7R4` enum('1','2','3','4','5','6','7','8','9') DEFAULT NULL COMMENT 'ijazah tertinggi',
  `B7R5` int(2) NOT NULL COMMENT 'banyaknya anggota rumah tangga',
  PRIMARY KEY (`KKSArt`),
  KEY `B7R3` (`B7R3`),
  KEY `B7R4` (`B7R4`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1b7_krt`
--

INSERT INTO `1b7_krt` (`KKSArt`, `B7R1`, `B7R2`, `B7R3`, `B7R4`, `B7R5`) VALUES
('050400230080501', 'Memo Zebua', 21, '2', '4', 2),
('100100050010201', 'Bagus Setia', 30, '3', '3', 2),
('710200090220701', 'FAHMI MAULANA', 43, '3', '6', 5),
('710300020011601', 'Faberlius Hulu', 30, '3', '6', 5),
('710300020221601', 'Yuko Oshima', 34, '3', '2', 4),
('710300020221902', 'YUNITA KRISTY', 70, '2', '5', 3),
('710510000201001', 'Rezeki Ridho', 31, '3', '9', 2);

-- --------------------------------------------------------

--
-- Table structure for table `1b8_perumahandanaset`
--

CREATE TABLE IF NOT EXISTS `1b8_perumahandanaset` (
  `KKS` varchar(13) NOT NULL,
  `B8R1` enum('1','2','3','4','5','6','7') DEFAULT NULL COMMENT 'jenis atap',
  `B8R2` enum('1','2','3','4') DEFAULT NULL COMMENT 'jenis dinding',
  `B8R3` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'jenis lantai',
  `B8R4` int(4) DEFAULT NULL COMMENT 'luas lantai',
  `B8R5A` enum('1','2','3','4','5','6','7','8','9','10','11','12') DEFAULT NULL COMMENT 'sumber air minum',
  `B8R5B` enum('1','2','3') DEFAULT NULL COMMENT 'jarak kepenampungan limbah',
  `B8R6` enum('1','2','3','4','5','6','7','8','9','10','11','12') DEFAULT NULL COMMENT 'sumber air mandi',
  `B8R7A` enum('1','2','3','4') DEFAULT NULL COMMENT 'penggunaan tempat BAB',
  `B8R7B` enum('1','2','3','4') DEFAULT NULL COMMENT 'jenis kloset',
  `B8R8` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'sumber penerangan',
  `B8R9` enum('1','2','3','4','5','6','7','8') DEFAULT NULL COMMENT 'bahan bakar utama',
  `B8R10A` enum('1','2') DEFAULT NULL COMMENT 'sepeda',
  `B8R10B` enum('1','2') DEFAULT NULL COMMENT 'sepeda motor',
  `B8R10C` enum('1','2') DEFAULT NULL COMMENT 'perahu',
  `B8R10D` enum('1','2') DEFAULT NULL COMMENT 'tv kabel',
  `B8R10E` enum('1','2') DEFAULT NULL COMMENT 'AC',
  `B8R10F` enum('1','2') DEFAULT NULL COMMENT 'pemanas air',
  `B8R10G` enum('1','2') DEFAULT NULL COMMENT 'tabung gas 12kg',
  `B8R10H` enum('1','2') DEFAULT NULL COMMENT 'kulkas',
  `B8R10I` enum('1','2') DEFAULT NULL COMMENT 'perahu motor',
  `B8R10J` enum('1','2') DEFAULT NULL COMMENT 'mobil',
  PRIMARY KEY (`KKS`),
  KEY `B8R2` (`B8R2`),
  KEY `B8R3` (`B8R3`),
  KEY `B8R5A` (`B8R5A`),
  KEY `B8R5B` (`B8R5B`),
  KEY `B8R6` (`B8R6`),
  KEY `B8R7A` (`B8R7A`),
  KEY `B8R7B` (`B8R7B`),
  KEY `B8R8` (`B8R8`),
  KEY `B8R9` (`B8R9`),
  KEY `B8R1` (`B8R1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `1b8_perumahandanaset`
--

INSERT INTO `1b8_perumahandanaset` (`KKS`, `B8R1`, `B8R2`, `B8R3`, `B8R4`, `B8R5A`, `B8R5B`, `B8R6`, `B8R7A`, `B8R7B`, `B8R8`, `B8R9`, `B8R10A`, `B8R10B`, `B8R10C`, `B8R10D`, `B8R10E`, `B8R10F`, `B8R10G`, `B8R10H`, `B8R10I`, `B8R10J`) VALUES
('0504002300805', '4', '1', '1', 42, '2', NULL, '3', '1', '1', '1', '4', '1', '1', '2', '2', '2', '1', '2', '1', '1', '2'),
('1001000500102', '1', '2', '3', 90, '4', '2', '3', '2', '3', '2', '5', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2'),
('7102000902207', '1', '1', '1', 290, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1'),
('7103000200116', '1', '1', '1', 120, '6', '2', '6', '1', '1', '1', '2', '1', '1', '2', '2', '2', '1', '2', '1', '2', '2'),
('7103000202219', '3', '2', '2', 500, '1', NULL, '3', '3', '2', '2', '2', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2'),
('7105100002010', '1', '1', '1', 150, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `2b1_tempat`
--

CREATE TABLE IF NOT EXISTS `2b1_tempat` (
  `KKS` varchar(13) NOT NULL COMMENT 'KKS',
  `B1R1` varchar(2) NOT NULL COMMENT 'Kab/Kota',
  `B1R2` varchar(5) DEFAULT NULL COMMENT 'Kec',
  `B1R3` varchar(8) DEFAULT NULL COMMENT 'Desa/Kel',
  `B1R4` enum('1','2') DEFAULT NULL COMMENT 'klasifikasi desa',
  `B1R5A` varchar(12) DEFAULT NULL COMMENT 'No. BS',
  `B1R5B` varchar(4) DEFAULT NULL COMMENT 'nomor segmen',
  `B1R6` varchar(3) DEFAULT NULL COMMENT 'No. Rumah Tangga',
  `B1R7` varchar(50) DEFAULT NULL COMMENT 'Nama KRT',
  `B1R8` varchar(50) DEFAULT NULL COMMENT 'Alamat',
  `tanggalPencacahan` date DEFAULT NULL COMMENT 'Tgl Pencacahan',
  `tanggalPemeriksaanKU` date DEFAULT NULL,
  `nimPencacah` varchar(7) DEFAULT NULL COMMENT 'NIM Pencacah',
  PRIMARY KEY (`KKS`),
  KEY `nim_pencacah` (`nimPencacah`),
  KEY `B1R1` (`B1R1`(1)),
  KEY `B1R4` (`B1R4`),
  KEY `b1_keterangantempat_ibfk_2` (`B1R1`),
  KEY `B1R2` (`B1R2`),
  KEY `B1R3` (`B1R3`),
  KEY `B1R5A` (`B1R5A`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2b1_tempat`
--

INSERT INTO `2b1_tempat` (`KKS`, `B1R1`, `B1R2`, `B1R3`, `B1R4`, `B1R5A`, `B1R5B`, `B1R6`, `B1R7`, `B1R8`, `tanggalPencacahan`, `tanggalPemeriksaanKU`, `nimPencacah`) VALUES
('1001000500102', '10', '10010', '10010005', '1', '10010005001B', '004', '02', 'Bagus Setia', 'Jl. Otista', '2014-05-14', '2014-05-15', '11.6813'),
('1008001100705', '10', '10080', '10080011', '1', '10080011007B', '001', '05', 'Kawaohe Man', 'RT 04 / RW 02 Kebon Pisang Selatan', '2014-05-06', '2014-05-08', '11.6782'),
('7102000101302', '71', '71020', '71020001', '1', '71020001013B', NULL, '02', 'AGUS SUTISNA', 'Jl. Otista', '2014-05-14', '2014-05-15', '11.6971'),
('7102000902207', '71', '71020', '71020009', '1', '71020009022B', 'S020', '07', 'FAHMI MAULANA', 'Jl. Kebon Nanas Selatan 1 No. 16', '2014-04-25', '2014-04-27', '11.6652'),
('7103000202210', '71', '71030', '71030002', '1', '71030002022B', NULL, '10', 'SALIM', 'JL OTISTA 3 RT 07', '2014-05-12', '2014-05-22', '11.6727'),
('7103000202222', '71', '71030', '71030002', '1', '71030002022B', NULL, '22', 'YUNITA KRISTY', 'jalan masjid', '2014-05-12', '2014-05-22', '11.6971'),
('7105100002010', '05', '05012', '05012003', '1', '10010007005B', '010', '08', 'Rezeki RIdho', 'jl. Permata', '2014-04-29', '2014-04-29', '11.6560');

-- --------------------------------------------------------

--
-- Table structure for table `2b2_umumusaha`
--

CREATE TABLE IF NOT EXISTS `2b2_umumusaha` (
  `KKS` varchar(13) NOT NULL,
  `KKSArt` varchar(15) NOT NULL,
  `B2R1` int(2) DEFAULT NULL,
  `B2R2` varchar(50) DEFAULT NULL,
  `B2R3` enum('1','2','3','4','5','6','7','8','9') DEFAULT NULL,
  `B2R4` int(1) DEFAULT NULL,
  `B2R5` enum('0','1','2','3','4','5','6','7','8','9') DEFAULT NULL,
  `B2R6` varchar(2) DEFAULT NULL,
  `B2R7` enum('1','2','3') DEFAULT NULL,
  `B2R8` enum('7','1','2','3','4','5','6') DEFAULT NULL,
  `B2R9` enum('1','2','3') DEFAULT NULL,
  `B2R10` int(1) DEFAULT NULL,
  `B2R11` enum('1','2','3','4') DEFAULT NULL,
  `B2R12` enum('1','2','3','4') DEFAULT NULL,
  `B2R13` enum('1','2','3','4') DEFAULT NULL,
  `B2R14` enum('1','2','3','4') DEFAULT NULL,
  `B2R15` int(1) DEFAULT NULL,
  `B2R16` int(1) DEFAULT NULL,
  PRIMARY KEY (`KKSArt`),
  KEY `B2R3` (`B2R3`),
  KEY `B2R7` (`B2R7`),
  KEY `B2R9` (`B2R9`),
  KEY `B2R11` (`B2R11`),
  KEY `B2R12` (`B2R12`),
  KEY `B2R13` (`B2R13`),
  KEY `B2R14` (`B2R14`),
  KEY `B2R5` (`B2R5`),
  KEY `B2R8` (`B2R8`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2b2_umumusaha`
--

INSERT INTO `2b2_umumusaha` (`KKS`, `KKSArt`, `B2R1`, `B2R2`, `B2R3`, `B2R4`, `B2R5`, `B2R6`, `B2R7`, `B2R8`, `B2R9`, `B2R10`, `B2R11`, `B2R12`, `B2R13`, `B2R14`, `B2R15`, `B2R16`) VALUES
('1001000500102', '100100050010201', 1, 'Bagus Setia', '1', 1, '4', '12', '3', '1', '2', 2, '3', '3', '3', '3', 1, 1),
('1008001100705', '100800110070501', 1, 'Kawaohe Man', '1', 1, '3', '03', '3', '1', '1', 3, '1', '1', '2', '1', 1, 1),
('1008001100705', '100800110070502', 2, 'Kelly Chan', '2', 1, '5', '03', '3', '1', '2', 2, '3', '3', '3', '3', 0, 0),
('7102000101302', '710200010130201', 1, 'AGUS SUTISNA', '1', 1, '1', '19', '1', '1', '2', 1, '3', '3', '3', '3', 1, 1),
('7102000902207', '710200090220701', 1, 'FAHMI MAULANA', '1', 1, '3', '51', '3', '1', '2', 2, '3', '3', '3', '3', 1, 1),
('7102000902207', '710200090220702', 2, 'ISTRI FAHMI MAULANA', '2', 1, '2', '91', '1', '1', '2', 2, '3', '3', '3', '3', 1, 1),
('7103000202210', '710300020221001', 1, 'SALIM', '1', 1, '1', '15', '1', '1', '2', 2, '2', '2', '2', '3', 1, 1),
('7103000202219', '710300020221901', 1, 'YUNITA KRISTY', '1', 1, '1', '15', '1', '1', '2', 2, '2', '2', '2', '3', 1, 1),
('7105100002010', '710510000201001', 1, 'Rezeki Ridho', '1', 1, '1', '01', '1', '1', '1', 1, '1', '1', '1', '1', 1, 1),
('7105100002010', '710510000201002', 1, 'Aprilia Anti', '1', 1, '1', '01', '1', '1', '1', 1, '2', '1', '1', '1', 1, 1);

-- --------------------------------------------------------

--
-- Table structure for table `2b3r15_pekerja`
--

CREATE TABLE IF NOT EXISTS `2b3r15_pekerja` (
  `KKSArtNupNp` varchar(18) NOT NULL COMMENT 'Kode kuesioner + No ART + No Usaha + No Pekerja',
  `KKSArtNup` varchar(16) NOT NULL COMMENT 'FK tbl Ket Usaha',
  `B3R15A` int(2) DEFAULT NULL COMMENT 'No pekerja',
  `B3R15B` varchar(50) DEFAULT NULL COMMENT 'Nama pekerja',
  `B3R15C` enum('1','2') DEFAULT NULL COMMENT 'Jenis kelamin',
  `B3R15D` int(2) DEFAULT NULL COMMENT 'Umur',
  `B3R15E` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'Kode Status Pekerjaan',
  `B3R15F` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'Kode Kontrak Kerja',
  `B3R15G` int(2) DEFAULT NULL COMMENT 'Jml Jam Kerja perminggu',
  `B3R15H` int(2) DEFAULT NULL COMMENT 'Jml Hari Kerja perminggu',
  `B3R15I` enum('1','2','3','4') DEFAULT NULL COMMENT 'Kode Jenis Pembayaran',
  `B3R15J` enum('1','2','3','4','5','6','7') DEFAULT NULL COMMENT 'Dasar Pembayaran',
  `B3R15K` int(8) DEFAULT NULL COMMENT 'Upah dan Gaji',
  PRIMARY KEY (`KKSArtNupNp`),
  KEY `B6CR20C` (`B3R15C`),
  KEY `KKSArtNu` (`KKSArtNup`),
  KEY `B4R13E` (`B3R15E`),
  KEY `B4R13F` (`B3R15F`),
  KEY `B4R13I` (`B3R15I`),
  KEY `B4R13J` (`B3R15J`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2b3r15_pekerja`
--

INSERT INTO `2b3r15_pekerja` (`KKSArtNupNp`, `KKSArtNup`, `B3R15A`, `B3R15B`, `B3R15C`, `B3R15D`, `B3R15E`, `B3R15F`, `B3R15G`, `B3R15H`, `B3R15I`, `B3R15J`, `B3R15K`) VALUES
('100100050010201101', '1001000500102011', 1, 'Budi', '1', 18, '1', '5', 20, 5, '1', '4', 300000),
('100800110070502101', '1008001100705021', 1, 'Meny', '2', 24, '4', '3', 7, 6, '1', '3', 425000),
('100800110070502102', '1008001100705021', 2, 'Sinta Punah', '2', 23, '3', '3', 7, 6, '1', '3', 425000),
('710300020221001101', '7103000202210011', 1, 'PEKERJA 1 FAHMI MAULANA', '2', 18, '4', '3', 24, 6, '4', '4', 800000),
('710300020221001102', '7103000202210011', 2, 'PEKERJA 2 FAHMI MAULANA', '2', 19, '3', '4', 24, 6, '4', '6', 800000),
('710300020221001103', '7103000202210011', 3, 'PEKERJA 3 FAHMI MAULANA', '2', 18, '4', '4', 24, 6, '4', '4', 7000000);

-- --------------------------------------------------------

--
-- Table structure for table `2b3_rinciusaha`
--

CREATE TABLE IF NOT EXISTS `2b3_rinciusaha` (
  `KKSArtNup` varchar(16) NOT NULL COMMENT 'Kode kuesioner + No ART + No Usaha',
  `KKSArt` varchar(15) NOT NULL COMMENT 'Kode Kuesioner',
  `B3R1A` varchar(50) DEFAULT NULL COMMENT 'nama pemilik usaha',
  `B3R1B` int(2) DEFAULT NULL COMMENT 'no art pemilik usaha',
  `B3R2` int(1) DEFAULT NULL COMMENT 'no urut usaha',
  `B3R3` int(2) DEFAULT NULL COMMENT 'KBLI',
  `B3R4A` int(2) DEFAULT NULL COMMENT 'Usaha mulai operasi (bulan)',
  `B3R4B` int(4) DEFAULT NULL COMMENT 'Usaha mulai operasi (tahun)',
  `B3R5` enum('1','2','3','4','5','6','7','8','9','10','11','12','13') DEFAULT NULL COMMENT 'Tipe tempat',
  `B3R5_lainnya` varchar(50) DEFAULT NULL COMMENT 'Tipe tempat, lainnya',
  `B3R6` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'Status kepemilikan',
  `B3R7A` int(2) DEFAULT NULL COMMENT 'Jumlah Pekerja',
  `B3R7B` int(2) DEFAULT NULL COMMENT 'Jumlah Pekerja Dibayar',
  `B3R8` int(2) DEFAULT NULL COMMENT 'Hari Kerja',
  `B3R9` int(2) DEFAULT NULL COMMENT 'Jumlah Bulan Operasi',
  `B3R10` enum('1','2','3','4','5') DEFAULT NULL COMMENT 'Sistem Pengupahan',
  `B3R11A` enum('1','2','3') DEFAULT NULL COMMENT 'Efisiensi Perusahaan',
  `B3R11B` enum('1','2','3') DEFAULT NULL COMMENT 'Penurunan Produksi',
  `B3R11C` enum('1','2','3') DEFAULT NULL COMMENT 'Kenaikan BBM',
  `B3R11D` enum('1','2','3') DEFAULT NULL COMMENT 'Kesulitan Keuangan',
  `B3R11E_lainnya` varchar(50) DEFAULT NULL COMMENT 'Lainnya',
  `B3R12A` int(8) DEFAULT NULL COMMENT 'Kompensasi Melahirkan',
  `B3R12B` int(8) DEFAULT NULL COMMENT 'Kompensasi Sakit',
  `B3R12C` int(8) DEFAULT NULL COMMENT 'Kompensasi Kecelakaan',
  `B3R12D` int(8) DEFAULT NULL COMMENT 'Kompensasi Lainnya',
  `B3R12_jumlah` int(9) DEFAULT NULL COMMENT 'Jumlah jaminan yang diberikan',
  `B3R13A_apr13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_mei13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_jun13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_jul13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_agt13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_sep13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_okt13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_nov13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_des13` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_jan14` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_feb14` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13A_mar14` int(3) DEFAULT NULL COMMENT 'jumlah hari kerja',
  `B3R13B_apr13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_mei13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_jun13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_jul13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_agt13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_sep13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_okt13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_nov13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_des13` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_jan14` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_feb14` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R13B_mar14` enum('0','1','2','3') DEFAULT NULL COMMENT 'fluktuasi kegiatan',
  `B3R14` int(8) DEFAULT NULL COMMENT 'omset/nilai produksi sbulan lalu',
  `B3R16` int(9) DEFAULT NULL COMMENT 'jumlah modal awal',
  `B3R17A1` int(8) DEFAULT NULL COMMENT 'bahan baku mentah pertanian',
  `B3R17A2` int(8) DEFAULT NULL COMMENT 'bahan baku mentah non-pertanian',
  `B3R17B1` int(8) DEFAULT NULL COMMENT 'biaya pembelian pertanian',
  `B3R17B2` int(8) DEFAULT NULL COMMENT 'biaya pembelian non-pertanian',
  `B3R17C1` int(8) DEFAULT NULL COMMENT 'kompensasi tenaga kerja pertanian',
  `B3R17C2` int(8) DEFAULT NULL COMMENT 'kompensasi tenaga kerja non-pertanian',
  `B3R17C1A` int(8) DEFAULT NULL COMMENT 'upah dan gaji (pertanian)',
  `B3R17C1B` int(8) DEFAULT NULL COMMENT 'jaminan sosial (pertanian)',
  `B3R17C1C` int(8) DEFAULT NULL COMMENT 'bonus (pertanian)',
  `B3R17C2A` int(8) DEFAULT NULL COMMENT 'upah dan gaji ( non pertanian)',
  `B3R17C2B` int(8) DEFAULT NULL COMMENT 'jaminan sosial (non pertanian)',
  `B3R17C2C` int(8) DEFAULT NULL COMMENT 'bonus (non pertanian)',
  `B3R17D1` int(8) DEFAULT NULL COMMENT 'Biaya operasional pertanian',
  `B3R17D2` int(8) DEFAULT NULL COMMENT 'Biaya operasional non pertanian',
  `B3R17D1A` int(8) DEFAULT NULL COMMENT 'biaya operasional, minyak lpg pelumas pertanian',
  `B3R17D1B` int(8) DEFAULT NULL COMMENT 'biaya operasional, minyak lpg pelumas non-pertanian',
  `B3R17D2A` int(8) DEFAULT NULL COMMENT 'biaya operasional aior listrik pertanian',
  `B3R17D2B` int(8) DEFAULT NULL COMMENT 'biaya operasional aior listrik non-pertanian',
  `B3R17E1` int(8) DEFAULT NULL COMMENT 'biaya operasional biaya sewa pertanian',
  `B3R17E2` int(8) DEFAULT NULL COMMENT 'biaya operasional biaya sewa non-pertanian',
  `B3R17F1` int(8) DEFAULT NULL COMMENT 'biaya perbaikan pertanian',
  `B3R17F2` int(8) DEFAULT NULL COMMENT 'biaya perbaikan non-pertanian',
  `B3R17G1` int(8) DEFAULT NULL COMMENT 'jasa pertanian',
  `B3R17G2` int(8) DEFAULT NULL COMMENT 'jasa non-pertanian',
  `B3R17H1` int(8) DEFAULT NULL COMMENT 'biaya pemasaran, pengepakan (pertanian)',
  `B3R17H2` int(8) DEFAULT NULL COMMENT 'biaya pemasaran, pengepakan (non pertanian)',
  `B3R17I1` int(8) DEFAULT NULL COMMENT 'pajak pertanian',
  `B3R17I2` int(8) DEFAULT NULL COMMENT 'pajak non-pertanian',
  `B3R17J1` int(8) DEFAULT NULL COMMENT 'punguntan liar pertanian',
  `B3R17J2` int(8) DEFAULT NULL COMMENT 'punguntan liar non-pertanian',
  `B3R17K1` int(8) DEFAULT NULL COMMENT 'bunga pinjaman pertanian',
  `B3R17K2` int(8) DEFAULT NULL COMMENT 'bunga pinjaman non-pertanian',
  `B3R17L1` int(8) DEFAULT NULL COMMENT 'biaya lainnya pertanian',
  `B3R17L2` int(8) DEFAULT NULL COMMENT 'biaya lainnya non-pertanian',
  `B3R17_totalPengeluaran` int(9) DEFAULT NULL COMMENT 'total Pengeluaran',
  `B3R17_labarugi` int(9) DEFAULT NULL COMMENT 'Laba/rugi',
  `B3R18B1` int(1) DEFAULT NULL COMMENT 'Pekerja ttp laki2',
  `B3R18B2` int(1) DEFAULT NULL COMMENT 'pekerja ttp per',
  `B3R18A` enum('1','2') DEFAULT NULL COMMENT 'pekerjan tdk tetap',
  `B3R19_utama` enum('1','2','3','4','5','6','7') DEFAULT NULL COMMENT 'sumber modal utama',
  `B3R19_lainnya` enum('1','2','3','4','5','6','7') DEFAULT NULL COMMENT 'sumber modal lainnya',
  `B3R19_lainnya_sebutkan` varchar(50) DEFAULT NULL COMMENT 'sumber modal lainnya sebutkan',
  `B3R20A` enum('1','2') DEFAULT NULL COMMENT 'pernah pinjam di bank?',
  `B3R20B` enum('1','2') DEFAULT NULL COMMENT 'Apakah pinjaman berhasil ',
  `B3R21` enum('1','2','3','4','5','6','7') DEFAULT NULL COMMENT 'alasan tidak mengajukan ke bank',
  `B3R21_lainnya` varchar(50) DEFAULT NULL COMMENT 'alasan lain',
  `B3R22A` enum('1','2') DEFAULT NULL COMMENT 'tahu lemb keu mikro',
  `B3R22B` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'Alasan bisa tau lemb keu mikro',
  `B3R22B_lainnya` varchar(50) DEFAULT NULL COMMENT 'Alasan bisa tau lemb keu mikro lainnya',
  `B3R22C` enum('1','2') DEFAULT NULL COMMENT 'pernah mengajukan permohonan pinjaman ke lemb keu mikro',
  `B3R22D` enum('1','2','3','4','5','6','7','8','9') DEFAULT NULL COMMENT 'alasan tdk mengajukan pinjaman ke mikro',
  `B3R22D_lainnya` varchar(50) DEFAULT NULL COMMENT 'Alasan tdk pinjam, lainnya',
  `B3R22E` enum('1','2') DEFAULT NULL COMMENT 'Peroleh pinjaman mikro',
  `B3R22F` enum('1','2','3','4','5','6') DEFAULT NULL COMMENT 'alasan ditolak',
  `B3R22F_lainnya` varchar(50) DEFAULT NULL COMMENT 'Alasan ditolak lainnya varchar',
  `B3R22G1` enum('1','2') DEFAULT NULL COMMENT 'Meningkatkan volume produksi',
  `B3R22G2` enum('1','2') DEFAULT NULL COMMENT 'Menambah keragaman jenis produk',
  `B3R22G3` enum('1','2') DEFAULT NULL COMMENT 'Meningkatkan volume penjualan',
  `B3R22G4` enum('1','2') DEFAULT NULL COMMENT 'Meningkatkan daya saing',
  `B3R22G5` enum('1','2') DEFAULT NULL COMMENT 'Menambah pekerja',
  `B3R22G6` enum('1','2') DEFAULT NULL COMMENT 'Bekerja dalam jangka waktu cepat',
  `B3R22G7` enum('1','2') DEFAULT NULL COMMENT 'Pemanfaatan sedikit pekerja',
  `B3R22G8` enum('1','2') DEFAULT NULL COMMENT 'Dapat mengatasi kesulitan keuangan',
  `B3R22G9_lainnya` varchar(50) DEFAULT NULL COMMENT 'Lainnya',
  `B3R23A` enum('1','2','3','4','5','6','7','8') DEFAULT NULL COMMENT 'Bantuan utama',
  `B3R23A_Lainnya` varchar(50) DEFAULT NULL COMMENT 'Bantuan utama lainnya, sebutkan',
  `B3R23B1` enum('1','2') DEFAULT NULL COMMENT 'Pelatihan teknis',
  `B3R23B2` enum('1','2') DEFAULT NULL COMMENT 'Pelatihan manajemen',
  `B3R23B3` enum('1','2') DEFAULT NULL COMMENT 'Bantuan bahan baku',
  `B3R23B4` enum('1','2') DEFAULT NULL COMMENT 'Akses peralatan modern',
  `B3R23B5` enum('1','2') DEFAULT NULL COMMENT 'Akses peminjaman',
  `B3R23B6` enum('1','2') DEFAULT NULL COMMENT 'Akses informasi',
  `B3R23B7` enum('1','2') DEFAULT NULL COMMENT 'Akses pesanan',
  `B3R23B8` enum('1','2') DEFAULT NULL COMMENT 'Masalah dengan pemerintah',
  `B3R23B9` enum('1','2') DEFAULT NULL COMMENT 'Proses pengadilan',
  `B3R23B10` enum('1','2') DEFAULT NULL COMMENT 'Masalah keamanan',
  `B3R23B11` enum('1','2') DEFAULT NULL COMMENT 'Berinteraksi dengan karyawan',
  `B3R23B12_lainnya` varchar(50) DEFAULT NULL COMMENT 'Sebutkan lainnya',
  `B3R24` enum('1','2') DEFAULT NULL COMMENT 'Apa mengalami kesulitan ?',
  `B3R25A` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan bahan baku',
  `B3R25B` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan ketrampilan pekerja',
  `B3R25C` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan kemampuan bayar upah',
  `B3R25D` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan pungutan liar',
  `B3R25E` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan kekurangan pelanggan',
  `B3R25F` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan terlalu banyak pesaing',
  `B3R25G` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan keuangan',
  `B3R25H` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan tempat usaha terlalu sempit',
  `B3R25I` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan kekurangan mesin/perkap',
  `B3R25J` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan organisasi, management',
  `B3R25K` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan terlalu banyak aturan, pajak',
  `B3R25L` enum('1','2') DEFAULT NULL COMMENT 'Kesulitan pendapatan terlalu sedikit',
  `B3R25M_lainnya` varchar(50) DEFAULT NULL COMMENT 'Jenis kesulitan yang dialami lainnya',
  `B3R26` enum('1','2','3','4') DEFAULT NULL COMMENT 'Jenis kesulitan bahan baku ',
  `B3R26_lainnya` varchar(50) DEFAULT NULL COMMENT 'Jenis kesulitan bahan baku lainnya',
  `B3R27A` enum('1','2') DEFAULT NULL COMMENT 'dibantu pel teknis',
  `B3R27B` enum('1','2') DEFAULT NULL COMMENT 'dibantu pel manajemen org keu',
  `B3R27C` enum('1','2') DEFAULT NULL COMMENT 'dibantu bahan baku',
  `B3R27D` enum('1','2') DEFAULT NULL COMMENT 'dibantu akses peralatan modern',
  `B3R27E` enum('1','2') DEFAULT NULL COMMENT 'dibantu akses mdpt pinjaman',
  `B3R27F` enum('1','2') DEFAULT NULL COMMENT 'dibantu memperoleh info pasar',
  `B3R27G` enum('1','2') DEFAULT NULL COMMENT 'dibantu akses pesanan',
  `B3R27H` enum('1','2') DEFAULT NULL COMMENT 'dibantu pendaftaran bisnis',
  `B3R27I` enum('1','2') DEFAULT NULL COMMENT 'dibantu iklan',
  `B3R27J_lainnya` varchar(50) DEFAULT NULL COMMENT 'dibantu lainnya, sebutkan',
  `B3R28` enum('1','2') DEFAULT NULL COMMENT 'Apakah mnjd anggota org profesi',
  `B3R29A` varchar(50) DEFAULT NULL COMMENT 'Jenis bantuan 1',
  `B3R29B` varchar(50) DEFAULT NULL COMMENT 'Jenis bantuan 2 ',
  `B3R29C` varchar(50) DEFAULT NULL COMMENT 'Jenis bantuan 3',
  `B3R30A` enum('1','2') DEFAULT NULL COMMENT 'Tempat jualan : usaha sektor formal',
  `B3R30B` enum('1','2') DEFAULT NULL COMMENT 'Tempat jualan : sektor informal',
  `B3R30C` enum('1','2') DEFAULT NULL COMMENT 'Tempat jualan : Rumah Tangga',
  `B3R30D` enum('1','2') DEFAULT NULL COMMENT 'Tempat jualan : Pasar Tradisional',
  `B3R30E` enum('1','2') DEFAULT NULL COMMENT 'Tempat jualan : Rumah makan/hotel',
  `B3R30F` enum('1','2') DEFAULT NULL COMMENT 'Tempat jualan : Supermarket/ swalayan',
  `B3R30G` enum('1','2') DEFAULT NULL COMMENT 'Tempat jualan : Lainnya',
  `B3R31` enum('1','2') DEFAULT NULL COMMENT 'Apa pernah berganti usaha',
  `B3R32` int(2) DEFAULT NULL COMMENT 'Brp kali pindah usaha',
  `B3R33` varchar(2) DEFAULT NULL COMMENT 'Kode lapangan usaha terakhir sebelum usaha ini',
  `B3R34` enum('1','2','3') DEFAULT NULL COMMENT 'Jml konsumen bln ini',
  `B3R35` enum('1','2','3') DEFAULT NULL COMMENT 'Jml produk yg dijual',
  `B3R36` enum('1','2','3') DEFAULT NULL COMMENT 'Tindakan lanjutan thdp usaha',
  PRIMARY KEY (`KKSArtNup`),
  KEY `B3R5` (`B3R5`),
  KEY `B3R6` (`B3R6`),
  KEY `B3R10` (`B3R10`),
  KEY `B3R11A` (`B3R11A`),
  KEY `B3R11B` (`B3R11B`),
  KEY `B3R11C` (`B3R11C`),
  KEY `B3R11D` (`B3R11D`),
  KEY `B3R21` (`B3R21`),
  KEY `B3R22B` (`B3R22B`),
  KEY `B3R22D` (`B3R22D`),
  KEY `B3R22F` (`B3R22F`),
  KEY `B3R23A` (`B3R23A`),
  KEY `B3R26` (`B3R26`),
  KEY `B3R35` (`B3R34`),
  KEY `B3R36` (`B3R35`),
  KEY `B3R37` (`B3R36`),
  KEY `B3R14b_okt13` (`B3R13B_okt13`),
  KEY `B3R14b_nov13` (`B3R13B_nov13`),
  KEY `B3R14b_des13` (`B3R13B_des13`),
  KEY `B3R14b_jan14` (`B3R13B_jan14`),
  KEY `B3R14b_feb14` (`B3R13B_feb14`),
  KEY `B3R14b_mar14` (`B3R13B_mar14`),
  KEY `B3R13B_mei13` (`B3R13B_mei13`,`B3R13B_jun13`,`B3R13B_jul13`,`B3R13B_agt13`,`B3R13B_sep13`),
  KEY `B3R13B_apr13_2` (`B3R13B_apr13`,`B3R13B_mei13`,`B3R13B_jun13`,`B3R13B_jul13`,`B3R13B_agt13`,`B3R13B_sep13`,`B3R13B_okt13`,`B3R13B_nov13`,`B3R13B_des13`,`B3R13B_jan14`,`B3R13B_feb14`,`B3R13B_mar14`),
  KEY `B3R13B_jun13` (`B3R13B_jun13`,`B3R13B_jul13`,`B3R13B_agt13`,`B3R13B_sep13`),
  KEY `B3R13B_jul13` (`B3R13B_jul13`),
  KEY `B3R13B_agt13` (`B3R13B_agt13`,`B3R13B_sep13`),
  KEY `B3R13B_sep13` (`B3R13B_sep13`),
  KEY `B3R13B_apr13` (`B3R13B_apr13`),
  KEY `KKS` (`KKSArt`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `2b3_rinciusaha`
--

INSERT INTO `2b3_rinciusaha` (`KKSArtNup`, `KKSArt`, `B3R1A`, `B3R1B`, `B3R2`, `B3R3`, `B3R4A`, `B3R4B`, `B3R5`, `B3R5_lainnya`, `B3R6`, `B3R7A`, `B3R7B`, `B3R8`, `B3R9`, `B3R10`, `B3R11A`, `B3R11B`, `B3R11C`, `B3R11D`, `B3R11E_lainnya`, `B3R12A`, `B3R12B`, `B3R12C`, `B3R12D`, `B3R12_jumlah`, `B3R13A_apr13`, `B3R13A_mei13`, `B3R13A_jun13`, `B3R13A_jul13`, `B3R13A_agt13`, `B3R13A_sep13`, `B3R13A_okt13`, `B3R13A_nov13`, `B3R13A_des13`, `B3R13A_jan14`, `B3R13A_feb14`, `B3R13A_mar14`, `B3R13B_apr13`, `B3R13B_mei13`, `B3R13B_jun13`, `B3R13B_jul13`, `B3R13B_agt13`, `B3R13B_sep13`, `B3R13B_okt13`, `B3R13B_nov13`, `B3R13B_des13`, `B3R13B_jan14`, `B3R13B_feb14`, `B3R13B_mar14`, `B3R14`, `B3R16`, `B3R17A1`, `B3R17A2`, `B3R17B1`, `B3R17B2`, `B3R17C1`, `B3R17C2`, `B3R17C1A`, `B3R17C1B`, `B3R17C1C`, `B3R17C2A`, `B3R17C2B`, `B3R17C2C`, `B3R17D1`, `B3R17D2`, `B3R17D1A`, `B3R17D1B`, `B3R17D2A`, `B3R17D2B`, `B3R17E1`, `B3R17E2`, `B3R17F1`, `B3R17F2`, `B3R17G1`, `B3R17G2`, `B3R17H1`, `B3R17H2`, `B3R17I1`, `B3R17I2`, `B3R17J1`, `B3R17J2`, `B3R17K1`, `B3R17K2`, `B3R17L1`, `B3R17L2`, `B3R17_totalPengeluaran`, `B3R17_labarugi`, `B3R18B1`, `B3R18B2`, `B3R18A`, `B3R19_utama`, `B3R19_lainnya`, `B3R19_lainnya_sebutkan`, `B3R20A`, `B3R20B`, `B3R21`, `B3R21_lainnya`, `B3R22A`, `B3R22B`, `B3R22B_lainnya`, `B3R22C`, `B3R22D`, `B3R22D_lainnya`, `B3R22E`, `B3R22F`, `B3R22F_lainnya`, `B3R22G1`, `B3R22G2`, `B3R22G3`, `B3R22G4`, `B3R22G5`, `B3R22G6`, `B3R22G7`, `B3R22G8`, `B3R22G9_lainnya`, `B3R23A`, `B3R23A_Lainnya`, `B3R23B1`, `B3R23B2`, `B3R23B3`, `B3R23B4`, `B3R23B5`, `B3R23B6`, `B3R23B7`, `B3R23B8`, `B3R23B9`, `B3R23B10`, `B3R23B11`, `B3R23B12_lainnya`, `B3R24`, `B3R25A`, `B3R25B`, `B3R25C`, `B3R25D`, `B3R25E`, `B3R25F`, `B3R25G`, `B3R25H`, `B3R25I`, `B3R25J`, `B3R25K`, `B3R25L`, `B3R25M_lainnya`, `B3R26`, `B3R26_lainnya`, `B3R27A`, `B3R27B`, `B3R27C`, `B3R27D`, `B3R27E`, `B3R27F`, `B3R27G`, `B3R27H`, `B3R27I`, `B3R27J_lainnya`, `B3R28`, `B3R29A`, `B3R29B`, `B3R29C`, `B3R30A`, `B3R30B`, `B3R30C`, `B3R30D`, `B3R30E`, `B3R30F`, `B3R30G`, `B3R31`, `B3R32`, `B3R33`, `B3R34`, `B3R35`, `B3R36`) VALUES
('1001000500102011', '100100050010201', 'Bagus Setia', 1, 1, 12, 12, 2012, '3', NULL, '1', 2, 1, 25, 12, '2', '2', '2', '2', '2', NULL, 0, 0, 0, 0, 0, 20, 21, 20, 20, 20, 20, 26, 25, 21, 20, 15, 25, '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', 3000000, 800000, 0, 500000, 0, 0, 0, 150000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '2', '', '1', NULL, '2', NULL, '3', NULL, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2', NULL, NULL, NULL, '2', '2', '1', '1', '2', '2', '2', '2', NULL, NULL, '2', '2', '1'),
('1008001100705021', '100800110070502', 'Kelly Chan', 2, 1, 3, 4, 2010, '3', NULL, '1', 3, 2, 25, 11, '3', '2', '2', '2', '2', NULL, 0, 300000, 0, 0, 300000, 25, 25, 21, 25, 25, 25, 0, 20, 20, 15, 21, 23, '2', '2', '1', '2', '2', '2', '0', '3', '3', '3', '2', '2', 5200000, 2000000, 0, 2000000, 0, 0, 0, 0, 0, 0, 0, 850000, 0, 0, 0, 0, 0, 350000, 0, 150000, 0, 0, 0, 50000, 0, 0, 0, 20000, 0, 0, 0, 0, 0, 0, 0, 50000, 3470000, 1730000, 0, 0, '2', '1', '2', NULL, '2', NULL, '6', NULL, '1', '1', NULL, '2', '6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '1', '2', '2', '2', '1', '2', '2', '1', '1', '2', '2', '2', NULL, '2', NULL, '2', '2', '1', '1', '2', '1', '1', '2', '2', NULL, '2', NULL, NULL, NULL, '2', '1', '1', '1', '1', '2', '2', '2', NULL, '00', '1', '1', '1'),
('7102000101302011', '710200010130201', 'AGUS SUTISNA', 1, 1, 19, 6, 1990, '10', 'LAUT', '4', 1, 0, 26, 12, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, 26, '2', '2', '1', '2', '3', '2', '2', '2', '3', '2', '3', '1', 10000000, 1900000, 500000, 0, 500000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1000000, 0, 1000000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2000000, 8000000, 0, 0, '2', '1', NULL, NULL, '2', NULL, '6', NULL, '1', '1', NULL, '2', '6', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '6', NULL, '2', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', NULL, '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', 'CUACA BURUK', NULL, NULL, '2', '2', '2', '2', '2', '2', '2', '2', '2', NULL, '1', 'BANTUAN DANA', NULL, NULL, '2', '2', '1', '2', '2', '2', '2', '2', NULL, 'BU', '1', '1', '1'),
('7102000900220701', '710200090220701', 'FAHMI MAULANA', 1, 1, 51, 6, 2009, '2', NULL, '1', 4, 3, 31, 12, '3', '2', '2', '2', '2', NULL, 100000, 100000, 100000, 100000, 400000, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, '2', '2', '1', '1', '3', '3', '3', '3', '3', '3', '3', '3', 30000000, 10000000, 1000000, 0, 1000000, 0, 1000000, 0, 1000000, 1000000, 1000000, 0, 0, 0, 1000000, 1000000, 1000000, 1000000, 0, 0, 1000000, 0, 1000000, 0, 1000000, 0, 1000000, 0, 1000000, 0, 1000000, 0, 1000000, 0, 1000000, 0, 15000000, 15000000, 0, 3, '2', '1', '2', NULL, '1', '1', NULL, NULL, '1', '2', NULL, '1', NULL, NULL, '1', NULL, NULL, '1', '1', '1', '1', '1', '1', '1', '1', NULL, '8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', NULL, '1', NULL, '1', '1', '1', '1', '1', '1', '1', '1', '1', NULL, '2', NULL, NULL, NULL, '2', '1', '1', '1', '1', '1', '2', '2', NULL, '51', '2', '2', '1'),
('7103000202210011', '710300020221001', 'SALIM', 1, 1, 3, 1, 2013, '1', NULL, '1', 2, 0, 15, 8, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 15, 0, 0, 0, 0, 0, 0, 0, 10, 12, 0, 15, '3', '0', '0', '0', '0', '0', '0', '0', '2', '2', '0', '3', 900000, 2500000, 0, 350000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 0, 20000, 0, 0, 0, 0, 0, 0, 0, 15000, 0, 0, 0, 0, 0, 0, 0, 10000, 495000, 405000, 0, 0, '2', '1', '2', NULL, '2', NULL, '1', NULL, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '2', '2', '2', '1', '1', '1', '2', '2', '2', '2', '2', NULL, NULL, NULL, '2', '2', '2', '2', '2', '1', '1', '2', '2', '2', '', NULL, NULL, NULL, '2', '2', '1', '2', '2', '2', '2', '2', NULL, '00', '2', '2', '1'),
('7103000202219011', '710300020221901', 'YUNITA KRISTY', 1, 1, 3, 1, 2010, '1', NULL, '1', 2, 0, 21, 9, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 19, 20, 21, 22, 0, 18, 19, 20, 10, 12, 0, 15, '3', '3', '3', '3', '0', '3', '3', '3', '2', '2', '0', '3', 850000, 3000000, 0, 35000, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100000, 0, 20000, 0, 0, 0, 0, 0, 0, 0, 15000, 0, 0, 0, 0, 0, 0, 0, 10000, 495000, 405000, 0, 0, '2', '1', '2', NULL, '2', NULL, '1', NULL, '2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '8', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '1', '2', '2', '2', '2', '1', '1', '1', '2', '2', '2', '2', '2', NULL, NULL, NULL, '2', '2', '2', '2', '2', '1', '1', '2', '2', '2', '', NULL, NULL, NULL, '2', '2', '1', '2', '2', '2', '2', '2', NULL, '00', '2', '2', '1'),
('710h510000201001', '710300020221001', 'Rezeki Ridho', 1, 1, 1, 1, 101, '1', NULL, '1', 1, 3, 1, 1, '1', '1', '1', '1', '1', 'demon', 1000000, 1000002, 3333333, 1111111, 888888, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 191, '0', '0', '0', '0', '1', '0', '0', '0', '0', '0', '0', '0', 19283, 2172, 2832372, 237773, 282, 2938, 4849, 92, 2839, 293829, 23822, 32383, 32, 323, 1234, 43222, 3231, 1, 232, 22, 22222, 2222, NULL, 8, 7, 8, 7, 8, 7, 6, 8, 6, 8, 6, 6, 6, 7, 7, 6, 7, '1', '6', '6', '6', '2', '2', '1', '1', '1', '1', '1', NULL, NULL, NULL, NULL, '2', '1', '1', '1', '1', '1', '1', NULL, '1', '1', NULL, NULL, NULL, '2', '2', '2', '1', NULL, '2', '1', '2', '2', '2', '2', NULL, '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, '2', NULL, NULL, NULL, '2', '2', '1', '2', '2', '2', '2', '2', NULL, NULL, '1', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `3ket_kuesioner`
--

CREATE TABLE IF NOT EXISTS `3ket_kuesioner` (
  `KKS` varchar(12) NOT NULL COMMENT 'B1R1 + B2R2 + B3R3 + B4R5',
  `B1R1` varchar(2) NOT NULL,
  `B1R2` varchar(5) NOT NULL,
  `B1R3` varchar(8) NOT NULL,
  `B1R4` enum('1','2') NOT NULL,
  `B1R5` varchar(12) NOT NULL,
  `B1R6` varchar(50) NOT NULL,
  `B2R1` int(3) NOT NULL,
  `B2R2` int(3) NOT NULL,
  `B2R3` int(3) NOT NULL,
  `B2R4` int(3) NOT NULL,
  `B2R5` int(3) NOT NULL,
  `B2R6` int(3) NOT NULL,
  `B2R7` int(3) NOT NULL,
  `B2R8` int(3) NOT NULL,
  `nimPencacah` varchar(7) NOT NULL,
  `tanggalPencacahan` date NOT NULL,
  `tanggalPemeriksaan` date NOT NULL,
  `catatan` text NOT NULL,
  PRIMARY KEY (`KKS`),
  KEY `B1R1` (`B1R1`),
  KEY `B1R3` (`B1R3`),
  KEY `B1R4` (`B1R4`),
  KEY `nimPencacah` (`nimPencacah`),
  KEY `B1R2` (`B1R2`),
  KEY `B1R5` (`B1R5`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `3ket_rt`
--

CREATE TABLE IF NOT EXISTS `3ket_rt` (
  `KKSRT` varchar(25) NOT NULL COMMENT 'KKS + B4R3 + B4R4 + B4R5',
  `KKS` varchar(12) NOT NULL COMMENT 'Foreign key untuk ket kuesioner',
  `B4R1` varchar(4) NOT NULL,
  `B4R2` varchar(25) NOT NULL,
  `B4R3` varchar(3) NOT NULL,
  `B4R4` varchar(3) NOT NULL,
  `B4R5` varchar(3) NOT NULL,
  `B4R6` int(2) NOT NULL,
  `B4R24` int(2) NOT NULL,
  `B4R2526` varchar(1) NOT NULL,
  `B4R30` int(2) NOT NULL,
  `B4R31` varchar(1) NOT NULL,
  PRIMARY KEY (`KKSRT`),
  KEY `KKS` (`KKS`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `3ket_rtanggota`
--

CREATE TABLE IF NOT EXISTS `3ket_rtanggota` (
  `KKSArt` varchar(26) NOT NULL COMMENT 'KKSRT + B4R7',
  `KKSRT` varchar(25) NOT NULL COMMENT 'Foreign key untuk ke tabel 3ket_rt',
  `B4R7` int(2) NOT NULL,
  `B4R8` varchar(50) NOT NULL,
  `B4R9` enum('1','2','3','4','5','6','7','8','9') NOT NULL,
  `B4R10` enum('1','2') NOT NULL,
  `B4R11` int(2) NOT NULL,
  `B4R12` varchar(1) DEFAULT NULL,
  `B4R13` varchar(1) DEFAULT NULL,
  `B4R14` varchar(1) DEFAULT NULL,
  `B4R15` varchar(1) DEFAULT NULL,
  `B4R16` enum('1','2','3','4','5','6','7','8','10') DEFAULT NULL,
  `B4R17` varchar(1) DEFAULT NULL,
  `B4R18` enum('1','2','3','4','5','6','7','8','9','10') DEFAULT NULL,
  `B4R19` enum('1','2','3','4','5','6','7','10') DEFAULT NULL,
  PRIMARY KEY (`KKSArt`),
  KEY `KKSRT` (`KKSRT`),
  KEY `B4R9` (`B4R9`),
  KEY `B4R10` (`B4R10`),
  KEY `B4R16` (`B4R16`),
  KEY `B4R18` (`B4R18`),
  KEY `B4R19` (`B4R19`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `coba`
--

CREATE TABLE IF NOT EXISTS `coba` (
  `a` varchar(7) NOT NULL,
  `b` varchar(7) NOT NULL,
  PRIMARY KEY (`a`),
  KEY `a` (`a`),
  KEY `b` (`b`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `jenis_pekerjaan`
--

CREATE TABLE IF NOT EXISTS `jenis_pekerjaan` (
  `B4R7` enum('0','1','2','3','4','5','6','7','8','9','10') NOT NULL,
  `value` varchar(70) NOT NULL,
  PRIMARY KEY (`B4R7`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jenis_pekerjaan`
--

INSERT INTO `jenis_pekerjaan` (`B4R7`, `value`) VALUES
('0', 'Anggota TNI/POLRI'),
('1', 'Pejabat Lembaga Legislatif, Pejabat Tinggi, dan Manajer'),
('2', 'Tenaga Profesional'),
('3', 'Teknisi dan Asisten Tenaga Profesional'),
('4', 'Tenaga Tata Usaha'),
('5', 'Tenaga Tata Usaha dan Usaha Penjualan di Toko dan Pasar'),
('6', 'Tenaga Usaha Pertanian dan Peternakan'),
('7', 'Tenaga Pengolahan dan Kerajinan'),
('8', 'Operator dan Perakit Mesin'),
('9', 'Pekerja Kasar, Tenaga Kebersihan'),
('10', 'tidak ada isian');

-- --------------------------------------------------------

--
-- Table structure for table `kabupatenkota`
--

CREATE TABLE IF NOT EXISTS `kabupatenkota` (
  `kodeKabupaten` varchar(2) NOT NULL,
  `namaKabupaten` varchar(25) NOT NULL,
  PRIMARY KEY (`kodeKabupaten`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kabupatenkota`
--

INSERT INTO `kabupatenkota` (`kodeKabupaten`, `namaKabupaten`) VALUES
('05', 'Lampung Tengah'),
('10', 'Pringsewu'),
('71', 'Bandar Lampung');

-- --------------------------------------------------------

--
-- Table structure for table `kbji`
--

CREATE TABLE IF NOT EXISTS `kbji` (
  `KBJI` varchar(2) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `value` varchar(65) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`KBJI`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kbji`
--

INSERT INTO `kbji` (`KBJI`, `value`) VALUES
('01', 'Anggota Tentara Nasional Indonesia (TNI) dan Kepolisian Negara RI'),
('11', 'Pejabat lembaga legislatif dan pemerintah'),
('12', 'Manajer Perusahaan'),
('13', 'Manajer Umum'),
('21', 'Peneliti Ilmu Pengetahuan Alam/ Matematika Dan Teknik'),
('22', 'Peneliti Ilmu Pengetahuan Hayati dan Kesehatan'),
('23', 'Peneliti Ilmu Pengetahuan Sosial dan peneliti ybdi'),
('24', 'Pengajar'),
('25', 'Ahli Hukun'),
('26', 'Ahli Usaha'),
('29', 'Tenaga Profesional lainnya'),
('31', 'Asisiten Ahli Ilmu Pengetahuan Alam dan Teknik'),
('32', 'Asisten Peneliti Ilmu Pengetahuan Hayati dan Kesehatan'),
('33', 'Asisten Pengajar'),
('34', 'Asisten Ahli Keuangan dan Penjualan'),
('35', 'Agen jasa usaha dan pialang perdagangan'),
('39', 'Asisten Ahli lainnya'),
('41', 'Tenaga Tata Usaha Perkantoran'),
('42', 'Tenaga Tata Usaha Pelayanan Pelanggan'),
('51', 'Tenaga Usaha jasa perorangan/ perlindungan dan keamanan'),
('52', 'Peraga Busana/ Pelayan Toko Dan Peraga Barang Niaga'),
('61', 'Petani Terlatih'),
('62', 'Petani dan Nelayan Subsisten'),
('71', 'Tenaga Penggalian dan Bangunan'),
('72', 'Tenaga Pengolah Logam/ Mekanik Mesin dan Tenaga YBDI'),
('73', 'Tenaga Presisi/ Kerajinan Tangan/ Percetakan Dan Tenaga Ahli YBDI'),
('74', 'Tenaga Pengolah Makanan/ Kayu/ Tekstil/ Kulit Dan Tenaga YBDI'),
('81', 'Operator Dan Perakit Mesin'),
('82', 'Operator Mesin Pengolahan Dan Perakit Mesin'),
('83', 'Pengemudi dan Operator Mesin yang Bergerak'),
('91', 'Tenaga Penjualan Keliling/ Kebersihan dan Tenaga YBDI'),
('92', 'Pekerja Kasar'),
('93', 'Pekerja Kasar Pertambangan, Kontruksi, Industri dan Angkutan');

-- --------------------------------------------------------

--
-- Table structure for table `kbli`
--

CREATE TABLE IF NOT EXISTS `kbli` (
  `noKBLI` int(2) NOT NULL DEFAULT '0',
  `value` varchar(150) DEFAULT NULL,
  `sektor` enum('1','2','3','4','5','6','7','8','9') DEFAULT NULL,
  PRIMARY KEY (`noKBLI`),
  KEY `sektor` (`sektor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kbli`
--

INSERT INTO `kbli` (`noKBLI`, `value`, `sektor`) VALUES
(1, 'Pertanian, Kehutanan dan Perikanan', '1'),
(2, 'Pertambangan dan penggalian', '1'),
(3, 'Industri Pengolahan', '2'),
(4, 'Pengadaan Listrik, Gas, Uap/Air Panas dan Udara Dingin', '2'),
(5, 'Pengadaan Air, Pengelolaan Sampah dan Daur Ulang, Pembuangan dan Pembersihan Limbah dan Sampah', '3'),
(6, 'Konstruksi ', '3'),
(7, 'Perdagangan Besar dan Eceran; Reparasi dan Perawatan Mobil dan Sepeda Motor', '4'),
(8, 'Transportasi dan Pergudangan ', '4'),
(9, 'Penyediaan Akomodasi dan Penyediaan Makan Minum', '4'),
(10, 'Informasi dan Komunikasi', '5'),
(11, 'Jasa Keuangan dan Asuransi', '5'),
(12, 'Real Estate ', '6'),
(13, 'Jasa Profesional, Ilmiah dan Teknis', '6'),
(14, 'Jasa Profesional, Ilmiah dan Teknis', '7'),
(15, 'Jasa Persewaan dan Sewa Guna Usaha Tanpa Hak Opsi, Ketenagakerjaan, Agen Perjalanan dan Penunjang Usaha Lainnya', '7'),
(16, 'Administrasi Pemerintahan, Pertahanan dan Jaminan Sosial Wajib', '8'),
(17, 'Jasa Pendidikan', '8'),
(18, 'Jasa Kesehatan  dan Kegiatan Sosial ', '9'),
(19, 'Kegiatan Jasa Lainnya', '9'),
(20, 'Jasa Perorangan yang Melayani Rumah Tangga; Kegiatan yang Menghasilkan Barang dan Jasa Oleh Rumah Tangga yang Digunakan Sendiri untuk Memenuhi Kebutuh', '9'),
(21, 'Kegiatan Badan Internasional dan Badan Ekstra Internasional Lainnya', '9');

-- --------------------------------------------------------

--
-- Table structure for table `kecamatan`
--

CREATE TABLE IF NOT EXISTS `kecamatan` (
  `kecamatan_id` varchar(5) NOT NULL,
  `B1R1` varchar(2) NOT NULL DEFAULT '',
  `B1R2` varchar(3) NOT NULL DEFAULT '',
  `namaKecamatan` varchar(20) CHARACTER SET utf8 DEFAULT NULL,
  PRIMARY KEY (`kecamatan_id`),
  UNIQUE KEY `namaKecamatan` (`namaKecamatan`),
  KEY `B1R2` (`B1R2`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='kecamatan';

--
-- Dumping data for table `kecamatan`
--

INSERT INTO `kecamatan` (`kecamatan_id`, `B1R1`, `B1R2`, `namaKecamatan`) VALUES
('05012', '05', '012', 'PUBIAN'),
('05020', '05', '020', 'KALIREJO'),
('05040', '05', '040', 'GUNUNG SUGIH'),
('05060', '05', '060', 'PUNGGUR'),
('05080', '05', '080', 'TERBANGGI BESAR'),
('05100', '05', '100', 'SEPUTIH MATARAM'),
('05111', '05', '111', 'WAY SEPUTIH'),
('05130', '05', '130', 'SEPUTIH SURABAYA'),
('10010', '10', '010', 'PARDASUKA'),
('10020', '10', '020', 'AMBARAWA'),
('10030', '10', '030', 'PAGELARAN'),
('10040', '10', '040', 'PRINGSEWU'),
('10050', '10', '050', 'GADING REJO'),
('10060', '10', '060', 'SUKOHARJO'),
('10070', '10', '070', 'BANYUMAS'),
('10080', '10', '080', 'ADI LUWIH'),
('71010', '71', '010', 'TELUK BETUNG BARAT'),
('71020', '71', '020', 'TELUK BETUNG SELATAN'),
('71030', '71', '030', 'PANJANG'),
('71040', '71', '040', 'TANJUNG KARANG TIMUR'),
('71050', '71', '050', 'TELUK BETUNG UTARA'),
('71060', '71', '060', 'TANJUNG KARANG PUSAT'),
('71070', '71', '070', 'TANJUNG KARANG BARAT'),
('71071', '71', '071', 'KEMILING'),
('71080', '71', '080', 'KEDATON'),
('71081', '71', '081', 'RAJABASA'),
('71082', '71', '082', 'TANJUNG SENANG'),
('71090', '71', '090', 'SUKARAME'),
('71091', '71', '091', 'SUKABUMI');

-- --------------------------------------------------------

--
-- Table structure for table `kelurahan`
--

CREATE TABLE IF NOT EXISTS `kelurahan` (
  `kelurahan_id` char(8) NOT NULL,
  `B1R1` varchar(2) NOT NULL,
  `B1R2` varchar(3) NOT NULL,
  `B1R3` varchar(3) NOT NULL,
  `namaKelurahan` varchar(30) NOT NULL,
  PRIMARY KEY (`kelurahan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kelurahan`
--

INSERT INTO `kelurahan` (`kelurahan_id`, `B1R1`, `B1R2`, `B1R3`, `namaKelurahan`) VALUES
('05012001', '05', '012', '001', 'KOTA BATU'),
('05012003', '05', '012', '003', 'PAYUNG MAKMUR'),
('05012005', '05', '012', '005', 'PAYUNG REJO'),
('05012007', '05', '012', '007', 'SANGUN RATU'),
('05012009', '05', '012', '009', 'GUNUNG HAJI'),
('05012012', '05', '012', '012', 'NEGERI KEPAYUNGAN'),
('05012014', '05', '012', '014', 'SEGALA MIDER'),
('05012016', '05', '012', '016', 'SINAR NEGERI'),
('05020004', '05', '020', '004', 'KALI REJO'),
('05020005', '05', '020', '005', 'BALAI REJO'),
('05020007', '05', '020', '007', 'KALI WUNGU'),
('05020008', '05', '020', '008', 'KALI DADI'),
('05020017', '05', '020', '017', 'SRI MULYO'),
('05020018', '05', '020', '018', 'SRI DADI'),
('05020019', '05', '020', '019', 'SUKOSARI'),
('05020020', '05', '020', '020', 'WATU AGUNG'),
('05020022', '05', '020', '022', 'PONCO WARNO'),
('05040017', '05', '040', '017', 'TERBANGGI SUBING'),
('05040019', '05', '040', '019', 'TERBANGGI AGUNG'),
('05040021', '05', '040', '021', 'KOMERING AGUNG'),
('05040022', '05', '040', '022', 'KOMERING PUTIH'),
('05040023', '05', '040', '023', 'PAJAR BULAN'),
('05040024', '05', '040', '024', 'SEPUTIH JAYA'),
('05040026', '05', '040', '026', 'GUNUNG SUGIH'),
('05040027', '05', '040', '027', 'BUYUT UDIK'),
('05040028', '05', '040', '028', 'PUTRA BUYUT'),
('05040029', '05', '040', '029', 'BUYUT ILIR'),
('05040030', '05', '040', '030', 'BUYUT UTARA'),
('05060001', '05', '060', '001', 'NUNGGAL REJO'),
('05060007', '05', '060', '007', 'TOTO KATON'),
('05060008', '05', '060', '008', 'TANGGUL ANGIN'),
('05060010', '05', '060', '010', 'MOJO PAHIT'),
('05060011', '05', '060', '011', 'ASTO MULYO'),
('05060012', '05', '060', '012', 'SIDO MULYO'),
('05080006', '05', '080', '006', 'ADI JAYA'),
('05080008', '05', '080', '008', 'YUKUM JAYA'),
('05080009', '05', '080', '009', 'INDRA PUTRA SUBING'),
('05080010', '05', '080', '010', 'KARANG ENDAH'),
('05080011', '05', '080', '011', 'NAMBAH DADI'),
('05080012', '05', '080', '012', 'ONO HARJO'),
('05080013', '05', '080', '013', 'TERBANGGI BESAR'),
('05080015', '05', '080', '015', 'BANDAR JAYA TIMUR'),
('05080016', '05', '080', '016', 'BANDAR JAYA BARAT'),
('05100001', '05', '100', '001', 'FAJAR MATARAM'),
('05100003', '05', '100', '003', 'REJOSARI MATARAM'),
('05100004', '05', '100', '004', 'SUMBER AGUNG MATARAM'),
('05100005', '05', '100', '005', 'UTAMA JAYA MATARAM'),
('05100007', '05', '100', '007', 'WIRATA AGUNG MATARAM'),
('05100008', '05', '100', '008', 'VARIA AGUNG'),
('05100010', '05', '100', '010', 'BUMI SETIA MATARAM'),
('05100011', '05', '100', '011', 'DHARMA AGUNG MATARAM'),
('05100013', '05', '100', '013', 'BANJAR AGUNG MATARAM'),
('05111002', '05', '111', '002', 'SRI BUDAYA'),
('05111004', '05', '111', '004', 'SRI BUSONO'),
('05111006', '05', '111', '006', 'SANGGA BUANA'),
('05130001', '05', '130', '001', 'GAYA BARU ENAM'),
('05130002', '05', '130', '002', 'RAWA BETIK'),
('05130012', '05', '130', '012', 'GAYA BARU TUJUH'),
('05130014', '05', '130', '014', 'SRI KATON'),
('05130015', '05', '130', '015', 'GAYA BARU DUA'),
('05130016', '05', '130', '016', 'GAYA BARU TIGA'),
('05130019', '05', '130', '019', 'SRI MULYA JAYA'),
('05130020', '05', '130', '020', 'GAYA BARU SATU'),
('05130022', '05', '130', '022', 'MATARAM ILIR'),
('1', '', '', '', ''),
('10010005', '10', '010', '005', 'KEDAUNG'),
('10010007', '10', '010', '007', 'RANTAU TIJANG'),
('10010008', '10', '010', '008', 'PARDASUKA'),
('10010013', '10', '010', '013', 'WARGO MULYO'),
('10010014', '10', '010', '014', 'PUJODADI'),
('10010015', '10', '010', '015', 'SUKOREJO'),
('10010018', '10', '010', '018', 'SIDODADI'),
('10020001', '10', '020', '001', 'KRESNOMULYO'),
('10020002', '10', '020', '002', 'SUMBER AGUNG'),
('10020003', '10', '020', '003', 'AMBARAWA'),
('10020004', '10', '020', '004', 'AMBARAWA BARAT'),
('10020006', '10', '020', '006', 'JATI AGUNG'),
('10020007', '10', '020', '007', 'MARGODADI'),
('10030001', '10', '030', '001', 'CANDI RETNO'),
('10030002', '10', '030', '002', 'TANJUNG DALAM'),
('10030004', '10', '030', '004', 'KARANGSARI'),
('10030005', '10', '030', '005', 'GUMUK MAS'),
('10030006', '10', '030', '006', 'PATOMAN'),
('10030007', '10', '030', '007', 'PAGELARAN'),
('10030008', '10', '030', '008', 'SUKARATU'),
('10030010', '10', '030', '010', 'LUGUSARI'),
('10030011', '10', '030', '011', 'PANUTAN'),
('10030012', '10', '030', '012', 'BUMI RATU'),
('10030014', '10', '030', '014', 'KEMILIN'),
('10030015', '10', '030', '015', 'NEGLASARI'),
('10030017', '10', '030', '017', 'GIRI TUNGGAL'),
('10030018', '10', '030', '018', 'MARGOSARI'),
('10030020', '10', '030', '020', 'PAMENANG'),
('10030021', '10', '030', '021', 'FAJAR MULIA'),
('10030023', '10', '030', '023', 'PASIR UKIR'),
('10030024', '10', '030', '024', 'GUMUK REJO'),
('10040007', '10', '040', '007', 'MARGAKAYA'),
('10040008', '10', '040', '008', 'WALUYOJATI'),
('10040009', '10', '040', '009', 'PAJAR ESUK'),
('10040011', '10', '040', '011', 'SIDOHARJO'),
('10040012', '10', '040', '012', 'PODOMORO'),
('10040013', '10', '040', '013', 'BUMI ARUM'),
('10040015', '10', '040', '015', 'PAJAR AGUNG'),
('10040016', '10', '040', '016', 'PRINGSEWU UTARA'),
('10040017', '10', '040', '017', 'PRINGSEWU SELATAN'),
('10040018', '10', '040', '018', 'PRINGSEWU BARAT'),
('10040019', '10', '040', '019', 'PRINGSEWU TIMUR'),
('10040020', '10', '040', '020', 'REJOSARI'),
('10040021', '10', '040', '021', 'BUMI AYU'),
('10050001', '10', '050', '001', 'PAREREJO'),
('10050002', '10', '050', '002', 'BLITAREJO'),
('10050004', '10', '050', '004', 'BULUKARTO'),
('10050005', '10', '050', '005', 'WATES'),
('10050006', '10', '050', '006', 'BULUREJO'),
('10050007', '10', '050', '007', 'TAMBAK REJO'),
('10050008', '10', '050', '008', 'WONODADI'),
('10050009', '10', '050', '009', 'GADING REJO'),
('10050010', '10', '050', '010', 'TEGALSARI'),
('10050011', '10', '050', '011', 'TULUNG AGUNG'),
('10050012', '10', '050', '012', 'JOGYAKARTA'),
('10050013', '10', '050', '013', 'KEDIRI'),
('10050014', '10', '050', '014', 'MATARAM'),
('10050015', '10', '050', '015', 'WONOSARI'),
('10060002', '10', '060', '002', 'SINAR BARU'),
('10060003', '10', '060', '003', 'SUKOHARJO I'),
('10060004', '10', '060', '004', 'SUKOHARJO II'),
('10060006', '10', '060', '006', 'PANGGUNG REJO'),
('10060007', '10', '060', '007', 'PANDANSARI'),
('10060008', '10', '060', '008', 'PANDAN SURAT'),
('10060009', '10', '060', '009', 'SUKOHARJO III'),
('10060011', '10', '060', '011', 'SUKOYOSO'),
('10060012', '10', '060', '012', 'SILIWANGI'),
('10060022', '10', '060', '022', 'WARINGINSARI BARAT'),
('10070001', '10', '070', '001', 'WAYA KRUI'),
('10070003', '10', '070', '003', 'NUSA WUNGU'),
('10070005', '10', '070', '005', 'BANJAREJO'),
('10070006', '10', '070', '006', 'SRIWUNGU'),
('10070007', '10', '070', '007', 'BANYUWANGI'),
('10070008', '10', '070', '008', 'BANYUMAS'),
('10070009', '10', '070', '009', 'SINAR MULIA'),
('10080005', '10', '080', '005', 'BANDUNG BARU'),
('10080006', '10', '080', '006', 'WARINGINSARI TIMUR'),
('10080008', '10', '080', '008', 'ENGGAL REJO'),
('10080010', '10', '080', '010', 'ADI LUWIH'),
('10080011', '10', '080', '011', 'PURWODADI'),
('71010001', '71', '010', '001', 'SUKAMAJU'),
('71010002', '71', '010', '002', 'KETEGUHAN'),
('71010003', '71', '010', '003', 'KOTA KARANG'),
('71010004', '71', '010', '004', 'PERWATA'),
('71010005', '71', '010', '005', 'BAKUNG'),
('71010006', '71', '010', '006', 'KURIPAN'),
('71010007', '71', '010', '007', 'N O GADING'),
('71010008', '71', '010', '008', 'SUKARAME II'),
('71020001', '71', '020', '001', 'GEDONG PAKUON'),
('71020002', '71', '020', '002', 'TALANG'),
('71020003', '71', '020', '003', 'PESAWAHAN'),
('71020005', '71', '020', '005', 'KANGKUNG'),
('71020006', '71', '020', '006', 'BUMI WARAS'),
('71020007', '71', '020', '007', 'PECOH RAYA'),
('71020008', '71', '020', '008', 'SUKARAJA'),
('71020009', '71', '020', '009', 'GARUNTANG'),
('71020010', '71', '020', '010', 'WAY LUNIK'),
('71020011', '71', '020', '011', 'KETAPANG'),
('71030001', '71', '030', '001', 'SRENGSEM'),
('71030002', '71', '030', '002', 'PANJANG SELATAN'),
('71030003', '71', '030', '003', 'PANJANG UTARA'),
('71030004', '71', '030', '004', 'PIDADA'),
('71030006', '71', '030', '006', 'WAY LAGA'),
('71030007', '71', '030', '007', 'WAY GUBAK'),
('71030009', '71', '030', '009', 'KARANG MARITIM'),
('71040001', '71', '040', '001', 'RAWA LAUT'),
('71040002', '71', '040', '002', 'KOTA BARU'),
('71040003', '71', '040', '003', 'TANJUNG AGUNG'),
('71040004', '71', '040', '004', 'KEBONJERUK'),
('71040005', '71', '040', '005', 'SAWAH LAMA'),
('71040006', '71', '040', '006', 'SAWAH BREBES'),
('71040007', '71', '040', '007', 'JAGA BAYA I'),
('71040008', '71', '040', '008', 'KEDAMAIAN'),
('71040009', '71', '040', '009', 'TANJUNG RAYA'),
('71040011', '71', '040', '011', 'CAMPANG RAYA'),
('71050001', '71', '050', '001', 'KUPANG KOTA'),
('71050003', '71', '050', '003', 'KUPANG TEBA'),
('71050004', '71', '050', '004', 'KUPANG RAYA'),
('71050006', '71', '050', '006', 'SUMUR BATU'),
('71050007', '71', '050', '007', 'GULAK GALIK'),
('71050008', '71', '050', '008', 'PENGAJARAN'),
('71050009', '71', '050', '009', 'SUMUR PUTRI'),
('71050010', '71', '050', '010', 'BATU PUTUK'),
('71060001', '71', '060', '001', 'DURIAN PAYUNG'),
('71060002', '71', '060', '002', 'GOTONG ROYONG'),
('71060004', '71', '060', '004', 'PELITA'),
('71060005', '71', '060', '005', 'PALAPA'),
('71060006', '71', '060', '006', 'KALIAWI'),
('71060007', '71', '060', '007', 'KELAPA TIGA'),
('71060008', '71', '060', '008', 'TANJUNG KARANG'),
('71060010', '71', '060', '010', 'PASIR GINTUNG'),
('71070002', '71', '070', '002', 'SUSUNAN BARU'),
('71070003', '71', '070', '003', 'SUKADANA HAM'),
('71070004', '71', '070', '004', 'SUKA JAWA'),
('71070005', '71', '070', '005', 'GEDONG AIR'),
('71070006', '71', '070', '006', 'SEGALA MIDER'),
('71070009', '71', '070', '009', 'GUNUNG TERANG'),
('71071001', '71', '071', '001', 'SUMBER AGUNG'),
('71071002', '71', '071', '002', 'KEDAUNG'),
('71071004', '71', '071', '004', 'BERINGIN RAYA'),
('71071005', '71', '071', '005', 'SUMBER REJO'),
('71071006', '71', '071', '006', 'KEMILING PERMAI I'),
('71071007', '71', '071', '007', 'LANGKA PURA'),
('71080001', '71', '080', '001', 'SUKAMENANTI'),
('71080002', '71', '080', '002', 'SIDODADI'),
('71080003', '71', '080', '003', 'SURABAYA'),
('71080004', '71', '080', '004', 'PERUMNAS WAY HALIM'),
('71080005', '71', '080', '005', 'KEDATON'),
('71080006', '71', '080', '006', 'LABUHAN RATU'),
('71080009', '71', '080', '009', 'KAMPUNG BARU'),
('71080013', '71', '080', '013', 'SEPANG JAYA'),
('71081002', '71', '081', '002', 'RAJABASA'),
('71081003', '71', '081', '003', 'RAJABASA RAYA'),
('71081004', '71', '081', '004', 'RAJABASA JAYA'),
('71082001', '71', '082', '001', 'LABUHAN DALAM'),
('71082002', '71', '082', '002', 'TANJUNG SENANG'),
('71082003', '71', '082', '003', 'WAY KANDIS'),
('71082004', '71', '082', '004', 'PERUMNAS WAY KANDIS'),
('71090003', '71', '090', '003', 'GUNUNG SULAH'),
('71090004', '71', '090', '004', 'WAY HALIM PERMAI'),
('71090005', '71', '090', '005', 'SUKARAME'),
('71090009', '71', '090', '009', 'WAY DADI'),
('71090010', '71', '090', '010', 'HARAPAN JAYA'),
('71091001', '71', '091', '001', 'JAGABAYA II'),
('71091002', '71', '091', '002', 'JAGABAYA III'),
('71091003', '71', '091', '003', 'TANJUNG BARU'),
('71091004', '71', '091', '004', 'KALIBALAU KENCANA'),
('71091005', '71', '091', '005', 'SUKABUMI INDAH'),
('71091006', '71', '091', '006', 'SUKABUMI');

-- --------------------------------------------------------

--
-- Table structure for table `keterampilan`
--

CREATE TABLE IF NOT EXISTS `keterampilan` (
  `B5R14` varchar(2) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `value` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`B5R14`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `keterampilan`
--

INSERT INTO `keterampilan` (`B5R14`, `value`) VALUES
('01', 'Jahit Menjahit'),
('02', 'Bordir'),
('03', 'Tata Boga'),
('11', 'Batu'),
('12', 'Kayu'),
('13', 'Beton'),
('21', 'Perusahaan'),
('22', 'Rumah Tangga'),
('41', 'TV'),
('42', 'AC'),
('43', 'Radio'),
('44', 'Komputer'),
('51', 'Las'),
('52', 'Mesin Industri'),
('53', 'Bubut'),
('61', 'Motor'),
('62', 'Mobil'),
('63', 'Motor Tempel'),
('71', 'Pariwisata'),
('81', 'Pertanian'),
('91', 'Logam'),
('92', 'Bahasa Inggris'),
('93', 'Bahasa Mandarin'),
('94', 'Bahasa Jepang'),
('95', 'Bahasa Lainnya'),
('99', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `kode_pendidikan`
--

CREATE TABLE IF NOT EXISTS `kode_pendidikan` (
  `kodePendidikan` varchar(2) CHARACTER SET latin1 NOT NULL,
  `value` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`kodePendidikan`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kode_pendidikan`
--

INSERT INTO `kode_pendidikan` (`kodePendidikan`, `value`) VALUES
('01', 'Agama dan Ilmu Kehutanan'),
('02', 'Administrasi/Manajemen Bisnis'),
('03', 'Administrasi/Manajemen Keuangan'),
('04', 'Administrasi Pemerintahan'),
('05', 'Administrasi/Manajemen Perkotaan'),
('06', 'Arsitektur dan Perencanaan Kota'),
('07', 'Bahasa dan Sastra'),
('08', 'Ekonomi'),
('09', 'Hukum dan Kehakiman'),
('10', 'Humanisme/Humaniora'),
('11', 'Ilmu Pengetahunan Alam(IPA)'),
('12', 'Ilmu Pengetahunan Alam(IPS)'),
('13', 'Kedokteran dan Kesehatan'),
('14', 'Kehutanan'),
('15', 'Kesenian dan Seni Rupa'),
('16', 'Komunikasi Masa dan Dokumentasi'),
('17', 'Matematika dan Ilmu Komputer'),
('18', 'Pelayanan Jasa'),
('19', 'Perikanan'),
('20', 'Pertanian'),
('21', 'Pertukangan/ Kerajinan dan Industri'),
('22', 'Peternakan'),
('23', 'Psikologi'),
('24', 'Teknik/Teknologi'),
('25', 'Transportasi dan Komunikasi'),
('26', 'Kependidikan dan Keguruan'),
('27', 'Lainnya'),
('50', 'Tidak Ada Isian');

-- --------------------------------------------------------

--
-- Table structure for table `kortimpencacah`
--

CREATE TABLE IF NOT EXISTS `kortimpencacah` (
  `nimPencacah` varchar(7) CHARACTER SET latin1 NOT NULL,
  `nimKortim` varchar(7) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`nimPencacah`),
  KEY `nimKortim` (`nimKortim`),
  KEY `nimPencacah` (`nimPencacah`),
  KEY `nimPencacah_2` (`nimPencacah`),
  KEY `nimPencacah_3` (`nimPencacah`),
  KEY `nimPencacah_4` (`nimPencacah`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `kortimpencacah`
--

INSERT INTO `kortimpencacah` (`nimPencacah`, `nimKortim`) VALUES
('11.6754', '10.6432'),
('11.6814', '10.6432'),
('11.6869', '10.6432'),
('11.6642', '11.6503'),
('11.6917', '11.6503'),
('11.6952', '11.6503'),
('11.6747', '11.6505'),
('11.6885', '11.6505'),
('11.6552', '11.6510'),
('11.6578', '11.6510'),
('11.6893', '11.6510'),
('11.6528', '11.6512'),
('11.6945', '11.6512'),
('11.6950', '11.6512'),
('11.6557', '11.6514'),
('11.6878', '11.6514'),
('11.6938', '11.6514'),
('11.6768', '11.6515'),
('11.6808', '11.6515'),
('11.6929', '11.6515'),
('11.6677', '11.6519'),
('11.6830', '11.6519'),
('11.6953', '11.6519'),
('11.6555', '11.6521'),
('11.6605', '11.6521'),
('11.6971', '11.6521'),
('11.6537', '11.6525'),
('11.6553', '11.6525'),
('11.6948', '11.6525'),
('11.6591', '11.6530'),
('11.6679', '11.6530'),
('11.6709', '11.6530'),
('11.6526', '11.6535'),
('11.6637', '11.6535'),
('11.6777', '11.6535'),
('11.6719', '11.6543'),
('11.6836', '11.6543'),
('11.6974', '11.6543'),
('11.6541', '11.6549'),
('11.6685', '11.6549'),
('11.6832', '11.6549'),
('10.6314', '11.6558'),
('11.6911', '11.6558'),
('11.6962', '11.6558'),
('11.6696', '11.6559'),
('11.6856', '11.6559'),
('11.6857', '11.6559'),
('11.6568', '11.6561'),
('11.6620', '11.6561'),
('11.6739', '11.6561'),
('11.6544', '11.6563'),
('11.6601', '11.6563'),
('11.6861', '11.6563'),
('11.6791', '11.6564'),
('11.6874', '11.6564'),
('11.6890', '11.6564'),
('11.6670', '11.6567'),
('11.6757', '11.6567'),
('11.6859', '11.6567'),
('11.6724', '11.6571'),
('11.6843', '11.6571'),
('11.6899', '11.6571'),
('11.6733', '11.6572'),
('11.6815', '11.6572'),
('11.6956', '11.6572'),
('11.6511', '11.6573'),
('11.6778', '11.6573'),
('11.6944', '11.6573'),
('11.6577', '11.6587'),
('11.6584', '11.6587'),
('11.6648', '11.6587'),
('11.6630', '11.6594'),
('11.6872', '11.6594'),
('11.6964', '11.6594'),
('11.6589', '11.6596'),
('11.6762', '11.6596'),
('11.6940', '11.6596'),
('11.6593', '11.6597'),
('11.6602', '11.6597'),
('11.6684', '11.6597'),
('11.6756', '11.6599'),
('11.6835', '11.6599'),
('11.6871', '11.6599'),
('11.6612', '11.6615'),
('11.6908', '11.6615'),
('11.6957', '11.6615'),
('11.6722', '11.6617'),
('11.6918', '11.6617'),
('11.6925', '11.6617'),
('10.6284', '11.6618'),
('10.6288', '11.6618'),
('11.6840', '11.6618'),
('11.6588', '11.6619'),
('11.6663', '11.6619'),
('11.6772', '11.6619'),
('11.6608', '11.6622'),
('11.6883', '11.6622'),
('11.6976', '11.6622'),
('11.6554', '11.6623'),
('11.6574', '11.6623'),
('11.6607', '11.6623'),
('11.6609', '11.6626'),
('11.6700', '11.6626'),
('11.6826', '11.6626'),
('11.6606', '11.6631'),
('11.6798', '11.6631'),
('11.6916', '11.6631'),
('11.6693', '11.6634'),
('11.6873', '11.6634'),
('11.6968', '11.6634'),
('11.6688', '11.6641'),
('11.6898', '11.6641'),
('11.6963', '11.6641'),
('11.6661', '11.6647'),
('11.6744', '11.6647'),
('11.6942', '11.6647'),
('11.6546', '11.6653'),
('11.6730', '11.6653'),
('11.6912', '11.6653'),
('11.6538', '11.6675'),
('11.6649', '11.6675'),
('11.6801', '11.6675'),
('11.6523', '11.6680'),
('11.6650', '11.6680'),
('11.6712', '11.6680'),
('11.6565', '11.6682'),
('11.6858', '11.6682'),
('11.6927', '11.6682'),
('11.6672', '11.6686'),
('11.6914', '11.6686'),
('11.6923', '11.6686'),
('11.6862', '11.6687'),
('11.6954', '11.6687'),
('11.6575', '11.6690'),
('11.6852', '11.6690'),
('11.6961', '11.6690'),
('11.6821', '11.6697'),
('11.6865', '11.6697'),
('11.6903', '11.6697'),
('11.6658', '11.6699'),
('11.6703', '11.6699'),
('11.6906', '11.6699'),
('11.6717', '11.6702'),
('11.6750', '11.6702'),
('11.6867', '11.6702'),
('11.6518', '11.6710'),
('11.6669', '11.6710'),
('11.6692', '11.6710'),
('10.6197', '11.6716'),
('11.6504', '11.6716'),
('11.6616', '11.6716'),
('11.6579', '11.6735'),
('11.6737', '11.6735'),
('11.6806', '11.6735'),
('11.6636', '11.6740'),
('11.6822', '11.6740'),
('11.6969', '11.6740'),
('11.6769', '11.6742'),
('11.6781', '11.6742'),
('11.6889', '11.6742'),
('11.6590', '11.6743'),
('11.6819', '11.6743'),
('11.6946', '11.6743'),
('11.6770', '11.6748'),
('11.6804', '11.6748'),
('11.6813', '11.6748'),
('10.6445', '11.6749'),
('11.6536', '11.6749'),
('11.6629', '11.6749'),
('11.6532', '11.6751'),
('11.6600', '11.6751'),
('11.6930', '11.6751'),
('11.6668', '11.6764'),
('11.6736', '11.6764'),
('11.6776', '11.6764'),
('11.6545', '11.6785'),
('11.6727', '11.6785'),
('11.6771', '11.6785'),
('10.6310', '11.6786'),
('11.6729', '11.6786'),
('11.6760', '11.6786'),
('11.6652', '11.6787'),
('11.6745', '11.6787'),
('11.6894', '11.6787'),
('11.6585', '11.6789'),
('11.6624', '11.6789'),
('11.6864', '11.6789'),
('11.6659', '11.6793'),
('11.6837', '11.6793'),
('11.6531', '11.6795'),
('11.6656', '11.6795'),
('11.6720', '11.6795'),
('11.6569', '11.6796'),
('11.6766', '11.6796'),
('11.6790', '11.6796'),
('11.6509', '11.6800'),
('11.6640', '11.6800'),
('11.6839', '11.6800'),
('11.6881', '11.6802'),
('11.6931', '11.6802'),
('11.6951', '11.6802'),
('11.6783', '11.6809'),
('11.6967', '11.6809'),
('11.6972', '11.6809'),
('11.6666', '11.6811'),
('11.6676', '11.6811'),
('11.6838', '11.6811'),
('11.6643', '11.6812'),
('11.6847', '11.6812'),
('11.6853', '11.6812'),
('11.6610', '11.6818'),
('11.6681', '11.6818'),
('11.6779', '11.6818'),
('11.6613', '11.6823'),
('11.6726', '11.6823'),
('11.6888', '11.6823'),
('11.6694', '11.6827'),
('11.6805', '11.6827'),
('11.6870', '11.6827'),
('11.6713', '11.6828'),
('11.6817', '11.6828'),
('11.6922', '11.6828'),
('11.6604', '11.6829'),
('11.6715', '11.6829'),
('11.6939', '11.6829'),
('11.6592', '11.6833'),
('11.6706', '11.6833'),
('11.6875', '11.6833'),
('11.6566', '11.6841'),
('11.6782', '11.6841'),
('11.6955', '11.6841'),
('11.6534', '11.6844'),
('11.6548', '11.6844'),
('11.6758', '11.6844'),
('11.6657', '11.6848'),
('11.6935', '11.6848'),
('11.6965', '11.6848'),
('11.6654', '11.6855'),
('11.6701', '11.6855'),
('11.6966', '11.6855'),
('11.6560', '11.6860'),
('11.6660', '11.6860'),
('11.6728', '11.6860'),
('11.6583', '11.6863'),
('11.6738', '11.6863'),
('11.6842', '11.6863'),
('11.6611', '11.6866'),
('11.6825', '11.6866'),
('11.6834', '11.6866'),
('11.6662', '11.6877'),
('11.6734', '11.6877'),
('11.6905', '11.6877'),
('11.6639', '11.6879'),
('11.6644', '11.6879'),
('11.6907', '11.6879'),
('11.6533', '11.6882'),
('11.6671', '11.6882'),
('11.6958', '11.6882'),
('11.6529', '11.6886'),
('11.6718', '11.6886'),
('11.6542', '11.6892'),
('11.6633', '11.6892'),
('11.6970', '11.6892'),
('10.6291', '11.6895'),
('11.6707', '11.6895'),
('11.6731', '11.6895'),
('11.6674', '11.6896'),
('11.6780', '11.6896'),
('11.6824', '11.6896'),
('11.6522', '11.6897'),
('11.6755', '11.6897'),
('11.6919', '11.6897'),
('11.6746', '11.6901'),
('11.6773', '11.6901'),
('11.6851', '11.6901'),
('11.6632', '11.6902'),
('11.6695', '11.6902'),
('11.6752', '11.6902'),
('11.6516', '11.6904'),
('11.6517', '11.6904'),
('11.6876', '11.6904'),
('11.6753', '11.6910'),
('11.6854', '11.6910'),
('11.6924', '11.6910'),
('11.6775', '11.6913'),
('11.6884', '11.6913'),
('11.6900', '11.6913'),
('11.6508', '11.6920'),
('11.6723', '11.6920'),
('11.6799', '11.6920'),
('11.6628', '11.6921'),
('11.6816', '11.6921'),
('11.6614', '11.6926'),
('11.6880', '11.6926'),
('11.6941', '11.6926'),
('10.6331', '11.6928'),
('11.6621', '11.6928'),
('11.6937', '11.6928'),
('11.6761', '11.6933'),
('11.6767', '11.6933'),
('11.6784', '11.6933'),
('11.6550', '11.6943'),
('11.6831', '11.6943'),
('11.6846', '11.6943'),
('11.6513', '11.6949'),
('11.6691', '11.6949'),
('11.6810', '11.6949'),
('11.6570', '11.6959'),
('11.6763', '11.6959'),
('11.6850', '11.6959'),
('11.6540', '11.6960'),
('11.6635', '11.6960'),
('11.6794', '11.6960'),
('11.6547', '11.6973'),
('11.6645', '11.6973'),
('11.6725', '11.6973'),
('11.6721', '11.6978'),
('11.6934', '11.6978'),
('11.6977', '11.6978');

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE IF NOT EXISTS `mahasiswa` (
  `nim` varchar(7) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`nim`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`nim`, `nama`) VALUES
('1', '1'),
('10.6197', 'Aidil Fajri'),
('10.6284', 'Fendik Fandana'),
('10.6288', 'Fitri Diana'),
('10.6291', 'Flendy Yusak Manganguwi'),
('10.6310', 'Herry Yono'),
('10.6314', 'I Gde Eka Dipta Winartha'),
('10.6331', 'Ismalinda Sehaputri Muchsin'),
('10.6432', 'Raymundus Rendra Tri Ananda'),
('10.6445', 'Salman Assad Ibrahim'),
('11.6503', 'Abdur Rasyid'),
('11.6504', 'Achmad Kurnianto'),
('11.6505', 'Achmad Syaiful Mutaqin'),
('11.6508', 'Adeleida Wilhelmina'),
('11.6509', 'Adelina Namira'),
('11.6510', 'Adi Hartomo'),
('11.6511', 'Aditya Etika Sari'),
('11.6512', 'Aditya Sudyana'),
('11.6513', 'Adlina K'),
('11.6514', 'Adnan Abdurrahman'),
('11.6515', 'Afif Muzayyin'),
('11.6516', 'Afifah Sukmawati'),
('11.6517', 'Afriani Niana Danus'),
('11.6518', 'Agata Dionesia Endi'),
('11.6519', 'Agustin Darmayanti'),
('11.6520', 'Ahmad Febri Hutama Wiriansyah'),
('11.6521', 'Ahmad Jailani'),
('11.6522', 'Ahmad Muhaimin'),
('11.6523', 'Ahmad Zulfikar'),
('11.6524', 'Akbar Darmawan'),
('11.6525', 'Akbari Wafridh'),
('11.6526', 'A. Iskandar Zulkarnain'),
('11.6528', 'Alfi Abdina'),
('11.6529', 'Alfrince Sonifati Hulu'),
('11.6530', 'Alifia Nidya Hapsari'),
('11.6531', 'Alivia Dita'),
('11.6532', 'Alsindo Martins'),
('11.6533', 'Alzira Doutel'),
('11.6534', 'Amalia Tangdilambi'),
('11.6535', 'Amarant J.R.M'),
('11.6536', 'Andy M Fikri'),
('11.6537', 'Andi Wahyudin'),
('11.6538', 'Andika Veriyanto'),
('11.6540', 'Anggriani Taroci Ballu'),
('11.6541', 'Anis Fakhrunnisa'),
('11.6542', 'Anis Khoirun Nisak'),
('11.6543', 'Anis Yuliastuti'),
('11.6544', 'Anisa Zuraida'),
('11.6545', 'Anisah Cahyaningtyas'),
('11.6546', 'Anita Rafiqa Zein'),
('11.6547', 'Annebel D. Clarissa'),
('11.6548', 'Annisa Nur Fadhilah'),
('11.6549', 'Annisa Salma Maulidha'),
('11.6550', 'Annisa Yuli Pratiwi'),
('11.6552', 'Anugerah Adi D.Y'),
('11.6553', 'Apella Melianta'),
('11.6554', 'Aprilia Uswatun Chasanah'),
('11.6555', 'Arfina Amalia'),
('11.6557', 'Ari Hidayat'),
('11.6558', 'Arief Yuandi'),
('11.6559', 'Ariesa Setyaningrum'),
('11.6560', 'Arini Ridha Harianti'),
('11.6561', 'Arista Roza Belawan'),
('11.6562', 'Ariyan Riga B.'),
('11.6563', 'Arnold Alfreddy'),
('11.6564', 'Arrazy Ridha Maulana'),
('11.6565', 'Atang Suhendi'),
('11.6566', 'Aulia Dini Rafjani'),
('11.6567', 'Aulia Nugraheni Rahmawati'),
('11.6568', 'Aulia Rahman Prayuza'),
('11.6569', 'Avelino Maria De Jesus Marcal'),
('11.6570', 'Avirian Fajri Herdanto'),
('11.6571', 'Aviv Alvian Nur'),
('11.6572', 'Ayu Komala Dewi'),
('11.6573', 'Ayu Paramudita'),
('11.6574', 'Ayu Pinta G. Siregar'),
('11.6575', 'Ayu Rosita Sari'),
('11.6576', 'Ayub Qolbani'),
('11.6577', 'Baiq Nurul Haqiqi'),
('11.6578', 'Bahrian Nur'),
('11.6579', 'Bakri Malik A.I'),
('11.6580', 'Bambang Edi Tilarsono'),
('11.6583', 'Betik Endaryati'),
('11.6584', 'Betyarningtyas K'),
('11.6585', 'Bondan Fajar'),
('11.6587', 'Brilian Surya Budi'),
('11.6588', 'Bunga Ayu Alimah'),
('11.6589', 'Cahyo Bagus Nofianto'),
('11.6590', 'Chayati Alfi Rochmah'),
('11.6591', 'Chitra C.W. Panjaitan'),
('11.6592', 'Christien Murtie Andries'),
('11.6593', 'Cindy Yunitasari Onthoni'),
('11.6594', 'Clara Srs'),
('11.6596', 'Cucu Rahmat Slamet'),
('11.6597', 'Cynthia Devy A'),
('11.6599', 'David Jonly Daya'),
('11.6600', 'Dearista Herdayanti'),
('11.6601', 'Debby H Harefa'),
('11.6602', 'Dechi Yulpratiwi'),
('11.6604', 'Defanny Artha M.'),
('11.6605', 'Derma Jaya Putra Waruwu'),
('11.6606', 'Desiana Rahayu'),
('11.6607', 'Desneli Irma'),
('11.6608', 'Destia'),
('11.6609', 'Devi Yanti'),
('11.6610', 'Dewi Maulizar'),
('11.6611', 'Dewi Puspita Sari'),
('11.6612', 'Dewi Sartika Sari'),
('11.6613', 'Diah Ayu P.'),
('11.6614', 'Dian Saskia Bani'),
('11.6615', 'Dicky Muhammad Ramdhani'),
('11.6616', 'Didcy Mai Hendri'),
('11.6617', 'Didik Abidin'),
('11.6618', 'Didit Aditya P'),
('11.6619', 'Dimas Tresna S'),
('11.6620', 'Dina Nur Rahmawati'),
('11.6621', 'Dinar Ayu H.M'),
('11.6622', 'Dini Rianti'),
('11.6623', 'Dita Selviana Faradilla'),
('11.6624', 'Dris D. Bangas'),
('11.6625', 'Dwi Hendro Siswo Purnomo'),
('11.6626', 'Dwi Indri Arieska'),
('11.6628', 'Dwi Sulistiarini'),
('11.6629', 'Dwi Wahyudi'),
('11.6630', 'Dwijayanti Lia Lita B.'),
('11.6631', 'Dyonisius H.S. Jewaru'),
('11.6632', 'Eka Fitria'),
('11.6633', 'Eka Marwitasari'),
('11.6634', 'Elfiona Nathasa Adenanta K.'),
('11.6635', 'Elisamarta Rotua Ibagariang'),
('11.6636', 'Ema Yulandika Sp'),
('11.6637', 'Emilia Annisa'),
('11.6639', 'Era Miftakhul Jannah'),
('11.6640', 'Erfin T Harefa'),
('11.6641', 'Erwin S.A'),
('11.6642', 'Esteria Siagian'),
('11.6643', 'Euclidesia Finella Loong'),
('11.6644', 'Evi Arianti'),
('11.6645', 'Evy Sulistiyawaty'),
('11.6646', 'Ezra Priska Donny Anggoro'),
('11.6647', 'F. Tri Ayuningrum'),
('11.6648', 'Faberlius Hulu'),
('11.6649', 'Fadli'),
('11.6650', 'Fadli Udin'),
('11.6652', 'Fahmi Maulana'),
('11.6653', 'Fakhmol Risepdo'),
('11.6654', 'Fakhriyanto'),
('11.6656', 'Fania Pratiwi'),
('11.6657', 'Fanisa Dwita Hanggarani'),
('11.6658', 'Fardhan Anushi Setyahadi'),
('11.6659', 'Faridatun Nihayah'),
('11.6660', 'Fauzul Hidayah'),
('11.6661', 'Faviana Bosco De Sousa'),
('11.6662', 'Febri Lia Adi Candra'),
('11.6663', 'Fenny Pebrina Marpaung'),
('11.6665', 'Fikri Handoko Putra'),
('11.6666', 'Fiqih Widiar Oktasari'),
('11.6668', 'Fitri Dwiyanti'),
('11.6669', 'Fitri Intan Pratiwi'),
('11.6670', 'Fradina Sri Oktaviani'),
('11.6671', 'Francisca Onny T'),
('11.6672', 'Francisco Crisanto'),
('11.6674', 'Friska S.'),
('11.6675', 'Galuh Diantoro'),
('11.6676', 'Ganiswara Fitriani'),
('11.6677', 'Geni Andalria Harefa'),
('11.6679', 'Ghessani Nurina Khaq'),
('11.6680', 'Haedar Ardi A.'),
('11.6681', 'Hafshoh Mahmudah'),
('11.6682', 'Haiban Hajjid Arsyadana'),
('11.6683', 'Haidir Magribi'),
('11.6684', 'Hana Dwi Kristanti'),
('11.6685', 'Hani Annisa Nauli Harahap'),
('11.6686', 'Hanik Stiyaningsih'),
('11.6687', 'Hanin Rahma Septina'),
('11.6688', 'Hari Akhiardy'),
('11.6690', 'Hasrat Ifolala'),
('11.6691', 'Hasta Nurhusada'),
('11.6692', 'Hasti Amanda Ilmi Putri'),
('11.6693', 'Hasti Putri Hulu'),
('11.6694', 'Hasty Aulia'),
('11.6695', 'Heny Suryani Wira'),
('11.6696', 'Herly Gestari'),
('11.6697', 'Hesti Ayuningtiyas'),
('11.6699', 'Hujaji Ramli'),
('11.6700', 'Huzaimah'),
('11.6701', 'I Gusti Ngurah Veryl Tanaka'),
('11.6702', 'I Komang Deddy Surya Putra'),
('11.6703', 'Iangrea Mustikane Bumi'),
('11.6704', 'Ibrahim Thaha'),
('11.6706', 'Ida Ayu Wayan Regita Iswari Puri'),
('11.6707', 'Idho Najib Y.S'),
('11.6708', 'Idrus Effendy'),
('11.6709', 'Ifah D.N'),
('11.6710', 'Iffah Alfiana'),
('11.6712', 'Imansyah'),
('11.6713', 'Indah Noor Safrida'),
('11.6715', 'Indriyanty Yakub'),
('11.6716', 'Irvan Patuan M.S'),
('11.6717', 'Irza Ichsanul Annasya'),
('11.6718', 'Ismiana Putri'),
('11.6719', 'Isna Muflichatul F.'),
('11.6720', 'Jacob Da Costa'),
('11.6721', 'Jamik Safitri'),
('11.6722', 'Januario Dos Santos Do Rosario'),
('11.6723', 'Jawani Eka Pyansahcilia'),
('11.6724', 'Jemi Natalino Rosario'),
('11.6725', 'Jeraus Wiratama Wau'),
('11.6726', 'Jhonatan Ade Suranta M.'),
('11.6727', 'Jimmy Saputra Sebayang'),
('11.6728', 'Joanico Jose Freitas'),
('11.6729', 'Jodi Jhouranda Siregar'),
('11.6730', 'John Marselino A. Akwan'),
('11.6731', 'Julian Emba Mangosa'),
('11.6732', 'Julias Penata Utama'),
('11.6733', 'Julmiati'),
('11.6734', 'Jurd K Lase'),
('11.6735', 'Kamil Aulia'),
('11.6736', 'Karen G. Naya Pratiwi'),
('11.6737', 'Karina Astuti'),
('11.6738', 'Karmila Putri'),
('11.6739', 'Kartika N S'),
('11.6740', 'Khairunnisa'),
('11.6742', 'Khodijah Kamilatul Muslimah'),
('11.6743', 'Khoirotunnisa'''),
('11.6744', 'Khotimah'),
('11.6745', 'Khusnul Kotimah'),
('11.6746', 'Kiky Claudia Nawaji'),
('11.6747', 'Koko Kevin H.D.'),
('11.6748', 'Krisman Yusuf Nazara'),
('11.6749', 'Ksatrio Jati'),
('11.6750', 'Kurnia Rahmasari'),
('11.6751', 'La Sarima'),
('11.6752', 'Laily Nur Haqiqi'),
('11.6753', 'Laura De J. Moreira'),
('11.6754', 'Leila Husna'),
('11.6755', 'Leonardus O F'),
('11.6756', 'Lewis Anggi Sibarani'),
('11.6757', 'Lidia Anggita Putri'),
('11.6758', 'Lidia Harni Pratiwi Aceh'),
('11.6760', 'Lihardo Faisal S'),
('11.6761', 'Linda Dit Balubun'),
('11.6762', 'Lita Gadis Pertiwi'),
('11.6763', 'Lola Dwi Febryanty'),
('11.6764', 'Lukmi Ana Purbasari'),
('11.6766', 'Maimunah Nasution'),
('11.6767', 'Mardha Tilla Septiani'),
('11.6768', 'Maria Carlin Bepsi Costa'),
('11.6769', 'Maria De Fatima Pereira Mesquita'),
('11.6770', 'Maria Yoana K'),
('11.6771', 'Marlin Anastasia Ariesta'),
('11.6772', 'Marsweet Karunia Gulo'),
('11.6773', 'Martha Boris Tiodora Napitupulu'),
('11.6775', 'Martinho Celcius Yeros'),
('11.6776', 'Martini Pratiwi'),
('11.6777', 'Maryama Yuyinatun M.'),
('11.6778', 'Mega Ingga Melati'),
('11.6779', 'Mega Thursina'),
('11.6780', 'Mei Fadlillah Ningcahyanti'),
('11.6781', 'Meilisa Hajriani'),
('11.6782', 'Memori Supersemar Zebua'),
('11.6783', 'Merisa Widyasari'),
('11.6784', 'Miftahul Jannah'),
('11.6785', 'Moch Miftachul Mubbarak'),
('11.6786', 'Mochamad Asryl Aziz'),
('11.6787', 'Moh Jabir Mubarok'),
('11.6788', 'Mohammad Hilman'),
('11.6789', 'Mohammad Wildan Muharam'),
('11.6790', 'Monalisa Sipahutar'),
('11.6791', 'Muh Tabrani'),
('11.6792', 'Muhamad Fikri Anwar'),
('11.6793', 'Muhammad Aja Fajrian'),
('11.6794', 'Muhammad Arif Fakhrudin'),
('11.6795', 'Muhammad Bayu Prakoso Aji'),
('11.6796', 'Muhammad Budiman'),
('11.6797', 'Muhammad Eka Prasetya'),
('11.6798', 'Muhammad Hidayat'),
('11.6799', 'Muhammad  Ihsan'),
('11.6800', 'Muhammad Miftakhul Romadlon'),
('11.6801', 'Muhammad Rizki Syazali'),
('11.6802', 'Muhammad Saiful Hadi'),
('11.6804', 'Muksalmina Jamil'),
('11.6805', 'Mutiara Nawarni'),
('11.6806', 'Nana Fitriana'),
('11.6807', 'Narezi Febriansa'),
('11.6808', 'Navis'),
('11.6809', 'Nera Difia'),
('11.6810', 'Ni Luh Putu Oka Andriani'),
('11.6811', 'Ni Putu Sumartini'),
('11.6812', 'Ni Wayan Nuariastini'),
('11.6813', 'Nia Afriani Salim'),
('11.6814', 'Nia Ratri Arumsari'),
('11.6815', 'Nida Annisa M F'),
('11.6816', 'Niken Dwi Anggraini'),
('11.6817', 'Nilton Vicente'),
('11.6818', 'Nimas Ayu Florentyna'),
('11.6819', 'Nita Aprilia'),
('11.6821', 'Nofri Kamila'),
('11.6822', 'Noor Laila F.S.'),
('11.6823', 'Nopiyanto'),
('11.6824', 'Novi Kristina Sirait'),
('11.6825', 'Nuha Azizah Gunawan'),
('11.6826', 'Nunung Hartati Renuat'),
('11.6827', 'Nur Amanah'),
('11.6828', 'Nur Kholis'),
('11.6829', 'Nur Lisa Syahbani'),
('11.6830', 'Nuradralena'),
('11.6831', 'Nurcita Suci Firmani'),
('11.6832', 'Nurfadhilah'),
('11.6833', 'Nuri Fitri Purnama S'),
('11.6834', 'Nurine Kristy'),
('11.6835', 'Nurul Ardhiani'),
('11.6836', 'Nurul Lia Sinta Dewi'),
('11.6837', 'Nurul Solikha Nofiani'),
('11.6838', 'Nurwahida'),
('11.6839', 'Octavia Rizky P.'),
('11.6840', 'Octaviana Maria De F.S. Lemos'),
('11.6841', 'Okta Merkuriana'),
('11.6842', 'Olivia Da Costa Alves Barreto'),
('11.6843', 'Prima Agatha Yunioro Tahapary'),
('11.6844', 'Prima Puspita'),
('11.6846', 'Puja Fitriani'),
('11.6847', 'Putu Arry Novelina Ristinadewi '),
('11.6848', 'Putu Purba Padma Pratiwi'),
('11.6850', 'Rahmi Hidayati'),
('11.6851', 'Raissa Samantha Hutajulu'),
('11.6852', 'Raja Bona Hasangapon Saragih'),
('11.6853', 'Ratu Fani Rizqiani'),
('11.6854', 'Refnita Mulya Aknur'),
('11.6855', 'Rengga Anggia'),
('11.6856', 'Reni Anggraini'),
('11.6857', 'Reni Juwita'),
('11.6858', 'Resti Denni Puspa Mira'),
('11.6859', 'Retno Sari Mumpuni'),
('11.6860', 'Reza Aprianto'),
('11.6861', 'Reza Vahlevi'),
('11.6862', 'Rezanerri Noer'),
('11.6863', 'Rezky Mayda P.'),
('11.6864', 'Ridho Fadillah'),
('11.6865', 'Rieko Dita Hermawati'),
('11.6866', 'Risa Ristiana'),
('11.6867', 'Riska Fina Ayuninda'),
('11.6869', 'Risky'),
('11.6870', 'Rizma Karlia'),
('11.6871', 'Risna Yuliani'),
('11.6872', 'Ristama Ika P.M.'),
('11.6873', 'Riyana Dewi'),
('11.6874', 'Rizal Fahmi Cholis'),
('11.6875', 'Rizka Novalina'),
('11.6876', 'Rizky Dwita'),
('11.6877', 'Rizki Tri Anggara'),
('11.6878', 'Rizky Amalia Nugraheni'),
('11.6879', 'Rizky Fajariani'),
('11.6880', 'Rizqy Amalia Hanif'),
('11.6881', 'Rizqy Oktora'),
('11.6882', 'Robby Adwa Fahlepi'),
('11.6883', 'Rolinta Damanik'),
('11.6884', 'Rosmeyanna Daeli'),
('11.6885', 'Rosyid Faqih Redianto'),
('11.6886', 'Rouwvalth Rumaseuw'),
('11.6887', 'Royhan Faradis'),
('11.6888', 'Rumpaka Sari Rahmani'),
('11.6889', 'Ruth Nirmala Nadapdap'),
('11.6890', 'Ryan Hawari'),
('11.6891', 'Saad Tazkiahtu D'),
('11.6892', 'Salindri Trikusuma Wardhani'),
('11.6893', 'Salsa Nopian Pamungkas'),
('11.6894', 'Sanefa Mofu'),
('11.6895', 'Saputra Noviansyah'),
('11.6896', 'Satiti Sukma Dewi'),
('11.6897', 'Satria June Adwendi'),
('11.6898', 'Satrio Farli Tangkudung'),
('11.6899', 'Sein Religi'),
('11.6900', 'Serafina Maria R.T'),
('11.6901', 'Shahnaz Khairunnisa'),
('11.6902', 'Silli Hajjah Tarmulia'),
('11.6903', 'Silmia Putri Arini'),
('11.6904', 'Silvia Hanifah Parinduri'),
('11.6905', 'Siti Barokatun Solihah'),
('11.6906', 'Siti Zulaikha'),
('11.6907', 'Sofi Ariani'),
('11.6908', 'Sonia Hajar Maropahita'),
('11.6910', 'Sri Sundari'),
('11.6911', 'Stephani Magdhalena Tambunan'),
('11.6912', 'Suci Trianingsih'),
('11.6913', 'Sudarman Ifolala Sarumaha'),
('11.6914', 'Sulastin Savitri'),
('11.6916', 'Sundari'),
('11.6917', 'Supriadi Hia'),
('11.6918', 'Syafaqatul Humairoh'),
('11.6919', 'Syafiq Afif M Nur'),
('11.6920', 'Syaiful Nugroho Adi S.'),
('11.6921', 'Syarifa Adimira'),
('11.6922', 'Syfa Aulia Rahmi'),
('11.6923', 'Teguh Haryono'),
('11.6924', 'Teta Puti Sugesti'),
('11.6925', 'Tetri Desvira'),
('11.6926', 'Teuku Rizki Sunandarsyah'),
('11.6927', 'Theresa Novalia'),
('11.6928', 'Tiara Kusuma Widianingrum'),
('11.6929', 'Tiara Setyati'),
('11.6930', 'Tiya Mitasari'),
('11.6931', 'Tiyar Tunjungsari'),
('11.6932', 'Toto Surya Perdana'),
('11.6933', 'Try Asty Widita'),
('11.6934', 'Triratna N. Arumsari'),
('11.6935', 'Trisari N. C. Zebua'),
('11.6936', 'Try Novian Hidayat'),
('11.6937', 'Tudzla Hernita'),
('11.6938', 'Uci Yumanda Rizki'),
('11.6939', 'Ulfa Mardiyah'),
('11.6940', 'Ulfia Aisyara Sinurat'),
('11.6941', 'Uluan Raja Sitorus'),
('11.6942', 'Usnul Nur Saidah Rohmah'),
('11.6943', 'Uswatun Nurul Afifah'),
('11.6944', 'Vania Ayu Asterina'),
('11.6945', 'Vievien Abigail D. Djara'),
('11.6946', 'Vocalyn Khaleda Muliantari'),
('11.6947', 'Wahyu Parmonangan Akbar'),
('11.6948', 'Wa Ode Hasmayuli'),
('11.6949', 'Wahyu Ahmad Kautsar'),
('11.6950', 'Wahyu Parmonangan Akbar'),
('11.6951', 'Wahyu Razi Indrawan'),
('11.6952', 'Wara Dwi Wahyu H P'),
('11.6953', 'Wening Ulinnuha M.'),
('11.6954', 'Wiwik Andriyani'),
('11.6955', 'Wondo Alifianto'),
('11.6956', 'Yamanora Sylvia'),
('11.6957', 'Yenro P. Sagala'),
('11.6958', 'Yesdi C. Calvin'),
('11.6959', 'Yoga Wira Pratama'),
('11.6960', 'Yoppy Akhmad Fathoni'),
('11.6961', 'Yosefina Irwan'),
('11.6962', 'Yosta Rambu Lika Enga'),
('11.6963', 'Yostryan Chenata'),
('11.6964', 'Yoviana Yulta'),
('11.6965', 'Yovita Kenyo Widyastuti'),
('11.6966', 'Yuanda Arya Dewa'),
('11.6967', 'Yulia Atma Putri'),
('11.6968', 'Yulia Bentari Kahitela'),
('11.6969', 'Yulia Fitri'),
('11.6970', 'Yunisa Ari Nastiti'),
('11.6971', 'Yunita Kristy'),
('11.6972', 'Yunita Nur Khasanah'),
('11.6973', 'Yusfil Khoir Pulungan'),
('11.6974', 'Zakia Nur Fadillah'),
('11.6976', 'Zezen S.R'),
('11.6977', 'Zichi Nila Esa Pitaloka'),
('11.6978', 'Zukha Latifah');

-- --------------------------------------------------------

--
-- Table structure for table `no_bs`
--

CREATE TABLE IF NOT EXISTS `no_bs` (
  `nobs_id` varchar(12) CHARACTER SET latin1 NOT NULL DEFAULT '',
  `B1R1` varchar(2) DEFAULT NULL,
  `B1R2` varchar(3) DEFAULT NULL,
  `B1R3` varchar(3) DEFAULT NULL,
  `B1R5A` varchar(4) CHARACTER SET latin1 DEFAULT NULL,
  PRIMARY KEY (`nobs_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `no_bs`
--

INSERT INTO `no_bs` (`nobs_id`, `B1R1`, `B1R2`, `B1R3`, `B1R5A`) VALUES
('10010005001B', '10', '10', '5', '001B'),
('10010007005B', '10', '10', '7', '005B'),
('10010008008B', '10', '10', '8', '008B'),
('10010008016B', '10', '10', '8', '016B'),
('10010013001B', '10', '10', '13', '001B'),
('10010013011B', '10', '10', '13', '011B'),
('10010014006B', '10', '10', '14', '006B'),
('10010015002B', '10', '10', '15', '002B'),
('10010018002B', '10', '10', '18', '002B'),
('10010018017B', '10', '10', '18', '017B'),
('10020001005B', '10', '20', '1', '005B'),
('10020001016B', '10', '20', '1', '016B'),
('10020002004B', '10', '20', '2', '004B'),
('10020002013B', '10', '20', '2', '013B'),
('10020003009B', '10', '20', '3', '009B'),
('10020003017B', '10', '20', '3', '017B'),
('10020004004B', '10', '20', '4', '004B'),
('10020004015B', '10', '20', '4', '015B'),
('10020006004B', '10', '20', '6', '004B'),
('10020007005B', '10', '20', '7', '005B'),
('10020007012B', '10', '20', '7', '012B'),
('10030001009B', '10', '30', '1', '009B'),
('10030002008B', '10', '30', '2', '008B'),
('10030004001B', '10', '30', '4', '001B'),
('10030005003B', '10', '30', '5', '003B'),
('10030006007B', '10', '30', '6', '007B'),
('10030006017B', '10', '30', '6', '017B'),
('10030007008B', '10', '30', '7', '008B'),
('10030008002B', '10', '30', '8', '002B'),
('10030010009B', '10', '30', '10', '009B'),
('10030011007B', '10', '30', '11', '007B'),
('10030012009B', '10', '30', '12', '009B'),
('10030014002B', '10', '30', '14', '002B'),
('10030015005B', '10', '30', '15', '005B'),
('10030017003B', '10', '30', '17', '003B'),
('10030018004B', '10', '30', '18', '004B'),
('10030018016B', '10', '30', '18', '016B'),
('10030020003B', '10', '30', '20', '003B'),
('10030021003B', '10', '30', '21', '003B'),
('10030023003B', '10', '30', '23', '003B'),
('10030024008B', '10', '30', '24', '008B'),
('10040007006B', '10', '40', '7', '006B'),
('10040008004B', '10', '40', '8', '004B'),
('10040009003B', '10', '40', '9', '003B'),
('10040009016B', '10', '40', '9', '016B'),
('10040011010B', '10', '40', '11', '010B'),
('10040012004B', '10', '40', '12', '004B'),
('10040012019B', '10', '40', '12', '019B'),
('10040013007B', '10', '40', '13', '007B'),
('10040015008B', '10', '40', '15', '008B'),
('10040016012B', '10', '40', '16', '012B'),
('10040016026B', '10', '40', '16', '026B'),
('10040017004B', '10', '40', '17', '004B'),
('10040017017B', '10', '40', '17', '017B'),
('10040018001B', '10', '40', '18', '001B'),
('10040018011B', '10', '40', '18', '011B'),
('10040019002B', '10', '40', '19', '002B'),
('10040019018B', '10', '40', '19', '018B'),
('10040020004B', '10', '40', '20', '004B'),
('10040020014B', '10', '40', '20', '014B'),
('10040021002B', '10', '40', '21', '002B'),
('10050001009B', '10', '50', '1', '009B'),
('10050002006B', '10', '50', '2', '006B'),
('10050004005B', '10', '50', '4', '005B'),
('10050005005B', '10', '50', '5', '005B'),
('10050006001B', '10', '50', '6', '001B'),
('10050007003B', '10', '50', '7', '003B'),
('10050007012B', '10', '50', '7', '012B'),
('10050008006B', '10', '50', '8', '006B'),
('10050008015B', '10', '50', '8', '015B'),
('10050009001B', '10', '50', '9', '001B'),
('10050009011B', '10', '50', '9', '011B'),
('10050009024B', '10', '50', '9', '024B'),
('10050010007B', '10', '50', '10', '007B'),
('10050011004B', '10', '50', '11', '004B'),
('10050012002B', '10', '50', '12', '002B'),
('10050012012B', '10', '50', '12', '012B'),
('10050013008B', '10', '50', '13', '008B'),
('10050014008B', '10', '50', '14', '008B'),
('10050015007B', '10', '50', '15', '007B'),
('10060002009B', '10', '60', '2', '009B'),
('10060003010B', '10', '60', '3', '010B'),
('10060004007B', '10', '60', '4', '007B'),
('10060006003B', '10', '60', '6', '003B'),
('10060007001B', '10', '60', '7', '001B'),
('10060008003B', '10', '60', '8', '003B'),
('10060009002B', '10', '60', '9', '002B'),
('10060009010B', '10', '60', '9', '010B'),
('10060009022B', '10', '60', '9', '022B'),
('10060011001B', '10', '60', '11', '001B'),
('10060012005B', '10', '60', '12', '005B'),
('10060022008B', '10', '60', '22', '008B'),
('10060022019B', '10', '60', '22', '019B'),
('10070001003B', '10', '70', '1', '003B'),
('10070003008B', '10', '70', '3', '008B'),
('10070005004B', '10', '70', '5', '004B'),
('10070006006B', '10', '70', '6', '006B'),
('10070007010B', '10', '70', '7', '010B'),
('10070008005B', '10', '70', '8', '005B'),
('10070009002B', '10', '70', '9', '002B'),
('10080005003B', '10', '80', '5', '003B'),
('10080005011B', '10', '80', '5', '011B'),
('10080005020B', '10', '80', '5', '020B'),
('10080005030B', '10', '80', '5', '030B'),
('10080006003B', '10', '80', '6', '003B'),
('10080006012B', '10', '80', '6', '012B'),
('10080008001B', '10', '80', '8', '001B'),
('10080010001B', '10', '80', '10', '001B'),
('10080010011B', '10', '80', '10', '011B'),
('10080010024B', '10', '80', '10', '024B'),
('10080011007B', '10', '80', '11', '007B'),
('5012001003B', '5', '12', '1', '003B'),
('5012003005B', '5', '12', '3', '005B'),
('5012005005B', '5', '12', '5', '005B'),
('5012007001B', '5', '12', '7', '001B'),
('5012009003B', '5', '12', '9', '003B'),
('5012012002B', '5', '12', '12', '002B'),
('5012014002B', '5', '12', '14', '002B'),
('5012014017B', '5', '12', '14', '017B'),
('5012016002B', '5', '12', '16', '002B'),
('5020004001B', '5', '20', '4', '001B'),
('5020004012B', '5', '20', '4', '012B'),
('5020004030B', '5', '20', '4', '030B'),
('5020005019B', '5', '20', '5', '019B'),
('5020007008B', '5', '20', '7', '008B'),
('5020008007B', '5', '20', '8', '007B'),
('5020008018B', '5', '20', '8', '018B'),
('5020017011B', '5', '20', '17', '011B'),
('5020018006B', '5', '20', '18', '006B'),
('5020019006B', '5', '20', '19', '006B'),
('5020020007B', '5', '20', '20', '007B'),
('5020020023B', '5', '20', '20', '023B'),
('5020022001B', '5', '20', '22', '001B'),
('5020022018B', '5', '20', '22', '018B'),
('5020022030B', '5', '20', '22', '030B'),
('5040017003B', '5', '40', '17', '003B'),
('5040017018B', '5', '40', '17', '018B'),
('5040019007B', '5', '40', '19', '007B'),
('5040021002B', '5', '40', '21', '002B'),
('5040022005B', '5', '40', '22', '005B'),
('5040023006B', '5', '40', '23', '006B'),
('5040024006B', '5', '40', '24', '006B'),
('5040026003B', '5', '40', '26', '003B'),
('5040027006B', '5', '40', '27', '006B'),
('5040028008B', '5', '40', '28', '008B'),
('5040029011B', '5', '40', '29', '011B'),
('5040030008B', '5', '40', '30', '008B'),
('5060001012B', '5', '60', '1', '012B'),
('5060007006B', '5', '60', '7', '006B'),
('5060008008B', '5', '60', '8', '008B'),
('5060010001B', '5', '60', '10', '001B'),
('5060011009B', '5', '60', '11', '009B'),
('5060012005B', '5', '60', '12', '005B'),
('5080006009B', '5', '80', '6', '009B'),
('5080008006B', '5', '80', '8', '006B'),
('5080008026B', '5', '80', '8', '026B'),
('5080009001B', '5', '80', '9', '001B'),
('5080010002B', '5', '80', '10', '002B'),
('5080010017B', '5', '80', '10', '017B'),
('5080011005B', '5', '80', '11', '005B'),
('5080011020B', '5', '80', '11', '020B'),
('5080012009B', '5', '80', '12', '009B'),
('5080013007B', '5', '80', '13', '007B'),
('5080013021B', '5', '80', '13', '021B'),
('5080013034B', '5', '80', '13', '034B'),
('5080013060B', '5', '80', '13', '060B'),
('5080015001B', '5', '80', '15', '001B'),
('5080015017B', '5', '80', '15', '017B'),
('5080015031B', '5', '80', '15', '031B'),
('5080016014B', '5', '80', '16', '014B'),
('5080016026B', '5', '80', '16', '026B'),
('5100001015B', '5', '100', '1', '015B'),
('5100003005B', '5', '100', '3', '005B'),
('5100004006B', '5', '100', '4', '006B'),
('5100005007B', '5', '100', '5', '007B'),
('5100007002B', '5', '100', '7', '002B'),
('5100008014B', '5', '100', '8', '014B'),
('5100010003B', '5', '100', '10', '003B'),
('5100011008B', '5', '100', '11', '008B'),
('5100013009B', '5', '100', '13', '009B'),
('5111002004B', '5', '111', '2', '004B'),
('5111004003B', '5', '111', '4', '003B'),
('5111006001B', '5', '111', '6', '001B'),
('5130001002B', '5', '130', '1', '002B'),
('5130002004B', '5', '130', '2', '004B'),
('5130012002B', '5', '130', '12', '002B'),
('5130014003B', '5', '130', '14', '003B'),
('5130015005B', '5', '130', '15', '005B'),
('5130016008B', '5', '130', '16', '008B'),
('5130019002B', '5', '130', '19', '002B'),
('5130020023B', '5', '130', '20', '023B'),
('5130022012B', '5', '130', '22', '012B'),
('71010001007B', '71', '10', '1', '007B'),
('71010002003B', '71', '10', '2', '003B'),
('71010002018B', '71', '10', '2', '018B'),
('71010003005B', '71', '10', '3', '005B'),
('71010003023B', '71', '10', '3', '023B'),
('71010004001B', '71', '10', '4', '001B'),
('71010005010B', '71', '10', '5', '010B'),
('71010006009B', '71', '10', '6', '009B'),
('71010007012B', '71', '10', '7', '012B'),
('71010008014B', '71', '10', '8', '014B'),
('71020001013B', '71', '20', '1', '013B'),
('71020002021B', '71', '20', '2', '021B'),
('71020003012B', '71', '20', '3', '012B'),
('71020003032B', '71', '20', '3', '032B'),
('71020005002B', '71', '20', '5', '002B'),
('71020005015B', '71', '20', '5', '015B'),
('71020005029B', '71', '20', '5', '029B'),
('71020006013B', '71', '20', '6', '013B'),
('71020006038B', '71', '20', '6', '038B'),
('71020007006B', '71', '20', '7', '006B'),
('71020008006B', '71', '20', '8', '006B'),
('71020008025B', '71', '20', '8', '025B'),
('71020009022B', '71', '20', '9', '022B'),
('71020010018B', '71', '20', '10', '018B'),
('71020011008B', '71', '20', '11', '008B'),
('71030001010B', '71', '30', '1', '010B'),
('71030002007B', '71', '30', '2', '007B'),
('71030002022B', '71', '30', '2', '022B'),
('71030003002B', '71', '30', '3', '002B'),
('71030003018B', '71', '30', '3', '018B'),
('71030003039B', '71', '30', '3', '039B'),
('71030004023B', '71', '30', '4', '023B'),
('71030006010B', '71', '30', '6', '010B'),
('71030007008B', '71', '30', '7', '008B'),
('71030009020B', '71', '30', '9', '020B'),
('71040001015B', '71', '40', '1', '015B'),
('71040002019B', '71', '40', '2', '019B'),
('71040003003B', '71', '40', '3', '003B'),
('71040004006B', '71', '40', '4', '006B'),
('71040005004B', '71', '40', '5', '004B'),
('71040006010B', '71', '40', '6', '010B'),
('71040007005B', '71', '40', '7', '005B'),
('71040008022B', '71', '40', '8', '022B'),
('71040008044B', '71', '40', '8', '044B'),
('71040009019B', '71', '40', '9', '019B'),
('71040011001B', '71', '40', '11', '001B'),
('71040011017B', '71', '40', '11', '017B'),
('71040011043B', '71', '40', '11', '043B'),
('71040011071B', '71', '40', '11', '071B'),
('71050001018B', '71', '50', '1', '018B'),
('71050003002B', '71', '50', '3', '002B'),
('71050003017B', '71', '50', '3', '017B'),
('71050004005B', '71', '50', '4', '005B'),
('71050006007B', '71', '50', '6', '007B'),
('71050007005B', '71', '50', '7', '005B'),
('71050008008B', '71', '50', '8', '008B'),
('71050009010B', '71', '50', '9', '010B'),
('71050010008B', '71', '50', '10', '008B'),
('71060001009B', '71', '60', '1', '009B'),
('71060002006B', '71', '60', '2', '006B'),
('71060004001B', '71', '60', '4', '001B'),
('71060005014B', '71', '60', '5', '014B'),
('71060006018B', '71', '60', '6', '018B'),
('71060006035B', '71', '60', '6', '035B'),
('71060007012B', '71', '60', '7', '012B'),
('71060007029B', '71', '60', '7', '029B'),
('71060008010B', '71', '60', '8', '010B'),
('71060010007B', '71', '60', '10', '007B'),
('71060010023B', '71', '60', '10', '023B'),
('71070002001B', '71', '70', '2', '001B'),
('71070003006B', '71', '70', '3', '006B'),
('71070004013B', '71', '70', '4', '013B'),
('71070004030B', '71', '70', '4', '030B'),
('71070004046B', '71', '70', '4', '046B'),
('71070005010B', '71', '70', '5', '010B'),
('71070005033B', '71', '70', '5', '033B'),
('71070006008B', '71', '70', '6', '008B'),
('71070006021B', '71', '70', '6', '021B'),
('71070009007B', '71', '70', '9', '007B'),
('71071001002B', '71', '71', '1', '002B'),
('71071002005B', '71', '71', '2', '005B'),
('71071004004B', '71', '71', '4', '004B'),
('71071004027B', '71', '71', '4', '027B'),
('71071005004B', '71', '71', '5', '004B'),
('71071005019B', '71', '71', '5', '019B'),
('71071005034B', '71', '71', '5', '034B'),
('71071006010B', '71', '71', '6', '010B'),
('71071006036B', '71', '71', '6', '036B'),
('71071007003B', '71', '71', '7', '003B'),
('71071007020B', '71', '71', '7', '020B'),
('71080001007B', '71', '80', '1', '007B'),
('71080002009B', '71', '80', '2', '009B'),
('71080003002B', '71', '80', '3', '002B'),
('71080003018B', '71', '80', '3', '018B'),
('71080004029B', '71', '80', '4', '029B'),
('71080005010B', '71', '80', '5', '010B'),
('71080005024B', '71', '80', '5', '024B'),
('71080006016B', '71', '80', '6', '016B'),
('71080006041B', '71', '80', '6', '041B'),
('71080009011B', '71', '80', '9', '011B'),
('71080013017B', '71', '80', '13', '017B'),
('71080013038B', '71', '80', '13', '038B'),
('71081002003B', '71', '81', '2', '003B'),
('71081002031B', '71', '81', '2', '031B'),
('71081002051B', '71', '81', '2', '051B'),
('71081003013B', '71', '81', '3', '013B'),
('71081004008B', '71', '81', '4', '008B'),
('71082001005B', '71', '82', '1', '005B'),
('71082001024B', '71', '82', '1', '024B'),
('71082002018B', '71', '82', '2', '018B'),
('71082002042B', '71', '82', '2', '042B'),
('71082003010B', '71', '82', '3', '010B'),
('71082004006B', '71', '82', '4', '006B'),
('71090003007B', '71', '90', '3', '007B'),
('71090003023B', '71', '90', '3', '023B'),
('71090004011B', '71', '90', '4', '011B'),
('71090005008B', '71', '90', '5', '008B'),
('71090005026B', '71', '90', '5', '026B'),
('71090005046B', '71', '90', '5', '046B'),
('71090009014B', '71', '90', '9', '014B'),
('71090009034B', '71', '90', '9', '034B'),
('71090009050B', '71', '90', '9', '050B'),
('71090010018B', '71', '90', '10', '018B'),
('71091001008B', '71', '91', '1', '008B'),
('71091001028B', '71', '91', '1', '028B'),
('71091002005B', '71', '91', '2', '005B'),
('71091003002B', '71', '91', '3', '002B'),
('71091003015B', '71', '91', '3', '015B'),
('71091004010B', '71', '91', '4', '010B'),
('71091005014B', '71', '91', '5', '014B'),
('71091006012B', '71', '91', '6', '012B'),
('71091006034B', '71', '91', '6', '034B');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b1r4`
--

CREATE TABLE IF NOT EXISTS `opsi_b1r4` (
  `B1R4` enum('1','2') NOT NULL COMMENT 'Kode Klasifikasi desa/kelurahan',
  `Value` varchar(10) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B1R4`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b1r4`
--

INSERT INTO `opsi_b1r4` (`B1R4`, `Value`) VALUES
('1', 'Perkotaan'),
('2', 'Perdesaan');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r5`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r5` (
  `B3R5` enum('1','2','3','4','5','6','7','8','9','10','11','12','13') NOT NULL COMMENT 'Kode Tipe tempat menjalankan usaha',
  `Value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R5`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r5`
--

INSERT INTO `opsi_b3r5` (`B3R5`, `Value`) VALUES
('1', 'Di rumah dengan tidak ada ruangan khusus'),
('2', 'Di rumah dengan tempat bekerja di luar'),
('3', 'Tempat usaha dengan lokasi tetap, pisah dengan rum'),
('4', 'Ladang atau lahan pertanian sendiri'),
('5', 'Rumah atau tempat kerja dari pelanggan'),
('6', 'Tempat semi permanen'),
('7', 'Pasar, bazar, pekan raya'),
('8', 'Jalan, trotoar dengan tempat tetap'),
('9', 'Rumah majikan'),
('10', 'Lainnya'),
('11', 'kendaraan'),
('12', 'Lokasi yang tidak tetap '),
('13', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r6`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r6` (
  `B3R6` enum('1','2','3','4','5') NOT NULL COMMENT 'Kode Status kepemilikan',
  `Value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R6`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r6`
--

INSERT INTO `opsi_b3r6` (`B3R6`, `Value`) VALUES
('1', 'Milik sendiri'),
('2', 'Sewa'),
('3', 'Kontrak'),
('4', 'Milik bersama'),
('5', 'Meminjam (bebas sewa)');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r10`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r10` (
  `B3R10` enum('1','2','3','4','5') NOT NULL COMMENT 'Kode Sistem Pengupahan',
  `Value` varchar(25) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R10`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r10`
--

INSERT INTO `opsi_b3r10` (`B3R10`, `Value`) VALUES
('1', 'Inflasi/kenaikan harga'),
('2', 'Standar upah perusahaan'),
('3', 'Laba perusahaan'),
('4', 'Tanpa pedoman'),
('5', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r13b`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r13b` (
  `B3R13B` enum('0','1','2','3') NOT NULL COMMENT 'Kode Kegiatan',
  `Value` varchar(25) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R13B`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r13b`
--

INSERT INTO `opsi_b3r13b` (`B3R13B`, `Value`) VALUES
('0', 'Tidak ada kegiatan'),
('1', 'Minimum'),
('2', 'Rata-rata'),
('3', 'Maksimum');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r15e`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r15e` (
  `B3R15E` enum('1','2','3','4','5') NOT NULL COMMENT 'Kode Status Pekerjaan',
  `Value` varchar(50) NOT NULL COMMENT 'Text',
  PRIMARY KEY (`B3R15E`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r15e`
--

INSERT INTO `opsi_b3r15e` (`B3R15E`, `Value`) VALUES
('1', 'Buruh/karyawan/pegawai'),
('2', 'Pekerja bebas di pertanian'),
('3', 'Pekerja bebas di non pertanian'),
('4', 'Pekerja keluarga / tidak dibayar');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r15f`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r15f` (
  `B3R15F` enum('1','2','3','4','5') NOT NULL COMMENT 'Kode Kontrak Kerja',
  `Value` varchar(50) NOT NULL COMMENT 'Text',
  PRIMARY KEY (`B3R15F`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r15f`
--

INSERT INTO `opsi_b3r15f` (`B3R15F`, `Value`) VALUES
('1', 'Kontrak tertulis tanpa jangka waktu tertentu'),
('2', 'Kontrak tertulis dengan jangka waktu tertentu'),
('3', 'Perjanjian lisan'),
('4', 'Masa percobaan'),
('5', 'Tanpa kontrak');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r15i`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r15i` (
  `B3R15I` enum('1','2','3','4') NOT NULL COMMENT 'Kode Jenis Pembayaran',
  `Value` varchar(20) NOT NULL COMMENT 'Text',
  PRIMARY KEY (`B3R15I`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r15i`
--

INSERT INTO `opsi_b3r15i` (`B3R15I`, `Value`) VALUES
('1', 'Uang'),
('2', 'Barang'),
('3', 'Uang dan Barang'),
('4', 'Tidak Dibayar');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r15j`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r15j` (
  `B3R15J` enum('1','2','3','4','5','6','7') NOT NULL COMMENT 'Kode Dasar Pembayaran',
  `Value` varchar(20) NOT NULL,
  PRIMARY KEY (`B3R15J`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r15j`
--

INSERT INTO `opsi_b3r15j` (`B3R15J`, `Value`) VALUES
('1', 'Per jam'),
('2', 'Per hari'),
('3', 'Per minggu'),
('4', 'Per bulan'),
('5', 'Per pekerjaan'),
('6', 'Lainnya'),
('7', 'Tidak dibayar');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r19`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r19` (
  `B3R19` enum('1','2','3','4','5','6','7') NOT NULL COMMENT 'Kode Sumber Modal',
  `Value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R19`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r19`
--

INSERT INTO `opsi_b3r19` (`B3R19`, `Value`) VALUES
('1', 'Pribadi'),
('2', 'Keluarga'),
('3', 'Koperasi'),
('4', 'Bank'),
('5', 'Lembaga keuangan mikro'),
('6', 'Pinjaman dari perorangan'),
('7', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r21`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r21` (
  `B3R21` enum('1','2','3','4','5','6','7') NOT NULL COMMENT 'Kode alasan tidak pernah mengajukan permohonan ke bank',
  `Value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R21`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r21`
--

INSERT INTO `opsi_b3r21` (`B3R21`, `Value`) VALUES
('1', 'Prosedurnya rumit'),
('2', 'Bunga terlalu tinggi'),
('3', 'Jaminan yang disyaratkan terlalu besar nilainya'),
('4', 'Tidak ada skema pinjaman yang cocok  dengan yang d'),
('5', 'Tidak tertarik untuk meminjam'),
('6', 'Tidak memerlukan pinjaman'),
('7', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r22b`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r22b` (
  `B3R22B` enum('1','2','3','4','5','6') NOT NULL COMMENT 'Kode bgmana mengetahui jasa lembaga keuangan mikro',
  `value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R22B`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r22b`
--

INSERT INTO `opsi_b3r22b` (`B3R22B`, `value`) VALUES
('1', 'Secara lisan (keluarga, teman, tetangga, dan lain-'),
('2', 'Melalui rekan kerja'),
('3', 'Melalui asosiasi di lingkungan tempat tinggal'),
('4', 'Mengunjungi salah satu lembaga'),
('5', 'Melalui iklan misalnya, media massa, Internet, pos'),
('6', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r22d`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r22d` (
  `B3R22D` enum('1','2','3','4','5','6','7','8') NOT NULL COMMENT 'Kode alasan utama tidak mengajukan pinjaman',
  `Value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R22D`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r22d`
--

INSERT INTO `opsi_b3r22d` (`B3R22D`, `Value`) VALUES
('1', 'Jumlah pinjaman yang ditawarkan tidak mencukupi'),
('2', 'Prosedurnya rumit'),
('3', 'Bunga terlalu tinggi'),
('4', 'Jatuh tempo terlalu pendek'),
('5', 'Jaminan yang disyaratkan terlalu besar nilainya'),
('6', 'Tidak memerlukan pinjaman'),
('7', 'Tidak yakin sanggup membayar bunga'),
('8', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r22f`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r22f` (
  `B3R22F` enum('1','2','3','4','5','6') NOT NULL COMMENT 'Kode alasan utama permohonanan pinjaman ditolak',
  `Value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R22F`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r22f`
--

INSERT INTO `opsi_b3r22f` (`B3R22F`, `Value`) VALUES
('1', 'Dokumen tidak lengkap'),
('2', 'Lengkap tetapi dokumen tidak meyakinkan '),
('3', 'Tidak mencukupi ada jaminan'),
('4', 'Modal awal tidak mencukupi'),
('5', 'Perusahaan sudah tidak aktif'),
('6', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r23a`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r23a` (
  `B3R23A` enum('1','2','3','4','5','6','7','8') NOT NULL COMMENT 'Kode Bantuan utama Lainnya yg pernah diperoleh',
  `Value` varchar(50) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R23A`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r23a`
--

INSERT INTO `opsi_b3r23a` (`B3R23A`, `Value`) VALUES
('1', 'Program atau proyek internasional'),
('2', 'Program atau proyek pemerintah'),
('3', 'Pemerintah daerah'),
('4', 'Asosiasi profesional/LSM'),
('5', 'Lembaga keuangan pemerintah (Perum Pegadaian)'),
('6', 'Koperasi'),
('7', 'Lainnya '),
('8', 'Tidak ada');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r26`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r26` (
  `B3R26` enum('1','2','3','4') NOT NULL COMMENT 'Kesulitan Bahan Baku',
  `Value` varchar(25) NOT NULL COMMENT 'text',
  PRIMARY KEY (`B3R26`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r26`
--

INSERT INTO `opsi_b3r26` (`B3R26`, `Value`) VALUES
('1', 'Bahan baku langka'),
('2', 'Bahan baku mahal'),
('3', 'Lokasi bahan baku jauh'),
('4', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3r36`
--

CREATE TABLE IF NOT EXISTS `opsi_b3r36` (
  `B3R36` enum('1','2','3') NOT NULL COMMENT 'Kode tindakan lanjutan terhadap usaha',
  `Value` varchar(30) DEFAULT NULL COMMENT 'text',
  PRIMARY KEY (`B3R36`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3r36`
--

INSERT INTO `opsi_b3r36` (`B3R36`, `Value`) VALUES
('1', 'Tetap di usaha yang sama'),
('2', 'Beralih ke usaha lain'),
('3', 'Tidak berusaha lagi');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b3_r34_r35`
--

CREATE TABLE IF NOT EXISTS `opsi_b3_r34_r35` (
  `kode` enum('1','2','3') NOT NULL,
  `value` varchar(11) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b3_r34_r35`
--

INSERT INTO `opsi_b3_r34_r35` (`kode`, `value`) VALUES
('1', 'Menurun'),
('2', 'Sama Saja'),
('3', 'Meningkat');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b4r3`
--

CREATE TABLE IF NOT EXISTS `opsi_b4r3` (
  `B4R3` enum('1','2','3','4','5','6','7','8','9') NOT NULL,
  `value` varchar(25) NOT NULL,
  PRIMARY KEY (`B4R3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b4r3`
--

INSERT INTO `opsi_b4r3` (`B4R3`, `value`) VALUES
('1', 'Kepala rumah tangga'),
('2', 'Istri/suami'),
('3', 'Anak'),
('4', 'Menantu'),
('5', 'Cucu'),
('6', 'Orang tua/mertua'),
('7', 'Famili lain'),
('8', 'Pembantu rumah tangga'),
('9', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b4r18`
--

CREATE TABLE IF NOT EXISTS `opsi_b4r18` (
  `B4R18` enum('1','2','3','4') NOT NULL,
  `value` varchar(50) NOT NULL,
  PRIMARY KEY (`B4R18`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b4r18`
--

INSERT INTO `opsi_b4r18` (`B4R18`, `value`) VALUES
('1', 'Tidak ada pembukuan tertulis'),
('2', 'Ada catatan tapi untuk keperluan sendiri'),
('3', 'Ada pembukuan untuk keperluan pembayaran pajak'),
('4', 'Pembukuan lengkap');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b5r5`
--

CREATE TABLE IF NOT EXISTS `opsi_b5r5` (
  `B5R5` enum('1','2','3','4') NOT NULL COMMENT 'Kode status perkawinan',
  `Value` varchar(25) NOT NULL,
  PRIMARY KEY (`B5R5`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b5r5`
--

INSERT INTO `opsi_b5r5` (`B5R5`, `Value`) VALUES
('1', 'Belum kawin'),
('2', 'Kawin'),
('3', 'Cerai hidup'),
('4', 'Cerai mati');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b5r9`
--

CREATE TABLE IF NOT EXISTS `opsi_b5r9` (
  `b5R9` enum('1','2','3') NOT NULL DEFAULT '1',
  `value` varchar(30) NOT NULL,
  PRIMARY KEY (`b5R9`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b5r9`
--

INSERT INTO `opsi_b5r9` (`b5R9`, `value`) VALUES
('1', 'Tidak/belum pernah sekolah'),
('2', 'Masih bersekolah'),
('3', 'Tidak bersekolah lagi');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b5r11`
--

CREATE TABLE IF NOT EXISTS `opsi_b5r11` (
  `b5R11` enum('1','2','3','4','5','6','7','8','9') NOT NULL DEFAULT '1',
  `value` varchar(30) NOT NULL,
  PRIMARY KEY (`b5R11`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b5r11`
--

INSERT INTO `opsi_b5r11` (`b5R11`, `value`) VALUES
('1', 'Tidak/belum tamat SD'),
('2', 'Tamat SD/MI/sederajat'),
('3', 'Tamat SMP/MTs/sederajat'),
('4', 'Tamat SMA/MA/sederajat'),
('5', 'Tamat SM Kejuruan'),
('6', 'Tamat Dip I/II'),
('7', 'Tamat Dip III/Akademi'),
('8', 'Tamat Dip IV/S1'),
('9', 'Tamat S2/S3');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b5r13`
--

CREATE TABLE IF NOT EXISTS `opsi_b5r13` (
  `b5R13` enum('1','2','3') NOT NULL DEFAULT '1',
  `value` varchar(100) NOT NULL,
  PRIMARY KEY (`b5R13`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b5r13`
--

INSERT INTO `opsi_b5r13` (`b5R13`, `value`) VALUES
('1', 'Tidak pernah mengikuti pelatihan kerja'),
('2', 'Pernah mengikuti pelatihan kerja tapi tidak bersertifikat'),
('3', 'Pernah mengikuti pelatihan kerja dan mendapat');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b6r3`
--

CREATE TABLE IF NOT EXISTS `opsi_b6r3` (
  `B6R3` enum('1','2','3','4','5','6','7','8','9','10','11','12','13') NOT NULL DEFAULT '1',
  `value` varchar(100) NOT NULL,
  PRIMARY KEY (`B6R3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b6r3`
--

INSERT INTO `opsi_b6r3` (`B6R3`, `value`) VALUES
('1', 'Di rumah dengan tidak ada ruangan khusus'),
('2', 'Di rumah dengan tempat bekerja di luar'),
('3', 'Tempat usaha dengan lokasi tetap, pisah dengan rumah'),
('4', 'Ladang atau lahan pertanian sendiri'),
('5', 'Rumah atau tempat kerja dari rekan pelanggan'),
('6', 'Lokasi konstruksi/ gedung'),
('7', 'Pasar/bazaar/pekan raya'),
('8', 'Jalan/trotoar dengan tempat tetap'),
('9', 'Rumah majikan'),
('10', 'Tempat tetap lainnya'),
('11', 'Kendaraan'),
('12', 'Lokasi yang tidak tetap, contohnya berpindah-pindah, dari pintu ke pintu, jalan tanpa lokasi yang te'),
('13', 'Tempat tidak tetap lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b6r6utama&lain`
--

CREATE TABLE IF NOT EXISTS `opsi_b6r6utama&lain` (
  `B6R6utama&lain` int(2) NOT NULL,
  `value` varchar(50) NOT NULL COMMENT 'alasan utama',
  PRIMARY KEY (`B6R6utama&lain`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b6r6utama&lain`
--

INSERT INTO `opsi_b6r6utama&lain` (`B6R6utama&lain`, `value`) VALUES
(1, 'Tidak diterima bekerja di tempat lain'),
(2, 'Menambah Pendapatan'),
(4, 'Pendapatan Lebih Stabil'),
(8, 'Hanya pekerjaan ini yang saya ketahui '),
(16, 'Tradisi Keluarga'),
(32, 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b6r12a`
--

CREATE TABLE IF NOT EXISTS `opsi_b6r12a` (
  `B6R12A` enum('1','2','3') NOT NULL,
  `value` varchar(100) NOT NULL COMMENT 'Jenis Kecelakaan',
  PRIMARY KEY (`B6R12A`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b6r12a`
--

INSERT INTO `opsi_b6r12a` (`B6R12A`, `value`) VALUES
('1', 'Kecelakaan non-fatal atau kecelakaan ringan di tempat kerja yang tidak mempengaruhi kemampuan bekerj'),
('2', 'Kecelakaan yang menyebabkan ketidakmampuan bekerja sementara'),
('3', 'Kecelakaan yang menyebabkan kelumpuhan permanen dan kerugian waktu kerja yang signifikan');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b6r16`
--

CREATE TABLE IF NOT EXISTS `opsi_b6r16` (
  `B6R16` enum('1','2','3','4') NOT NULL,
  `value` varchar(20) NOT NULL COMMENT 'bentuk pembayaran upah',
  PRIMARY KEY (`B6R16`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b6r16`
--

INSERT INTO `opsi_b6r16` (`B6R16`, `value`) VALUES
('1', 'Uang'),
('2', 'Barang'),
('3', 'Uang dan barang'),
('4', 'Tidak dibayar');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b6r17`
--

CREATE TABLE IF NOT EXISTS `opsi_b6r17` (
  `B6R17` enum('1','2','3','4','5','6') NOT NULL,
  `value` varchar(25) NOT NULL,
  PRIMARY KEY (`B6R17`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b6r17`
--

INSERT INTO `opsi_b6r17` (`B6R17`, `value`) VALUES
('1', 'Per jam'),
('2', 'Per hari'),
('3', 'Per minggu'),
('4', 'Per bulan'),
('5', 'Per pekerjaan'),
('6', 'lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b6r18`
--

CREATE TABLE IF NOT EXISTS `opsi_b6r18` (
  `B6R18` enum('1','2','3') NOT NULL,
  `value` varchar(25) NOT NULL,
  PRIMARY KEY (`B6R18`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b6r18`
--

INSERT INTO `opsi_b6r18` (`B6R18`, `value`) VALUES
('1', 'Ya, selalu'),
('2', 'Ya, kadang-kadang'),
('3', 'Tidak');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b6r22a`
--

CREATE TABLE IF NOT EXISTS `opsi_b6r22a` (
  `B6R22A` enum('1','2','3') NOT NULL,
  `value` varchar(25) NOT NULL,
  PRIMARY KEY (`B6R22A`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b6r22a`
--

INSERT INTO `opsi_b6r22a` (`B6R22A`, `value`) VALUES
('1', 'Ya, dari tempat bekerja'),
('2', 'Ya, membayar sendiri'),
('3', 'Tidak');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b7r3`
--

CREATE TABLE IF NOT EXISTS `opsi_b7r3` (
  `B7R3` enum('1','2','3') NOT NULL,
  `value` varchar(35) NOT NULL,
  PRIMARY KEY (`B7R3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b7r3`
--

INSERT INTO `opsi_b7r3` (`B7R3`, `value`) VALUES
('1', 'Tidak/belum pernah bersekolah'),
('2', 'Masih bersekolah'),
('3', 'Tidak bersekolah lagi');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b7r4`
--

CREATE TABLE IF NOT EXISTS `opsi_b7r4` (
  `B7R4` enum('1','2','3','4','5','6','7','8','9') NOT NULL,
  `value` varchar(40) NOT NULL,
  PRIMARY KEY (`B7R4`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b7r4`
--

INSERT INTO `opsi_b7r4` (`B7R4`, `value`) VALUES
('1', 'Tidak/belum tamat SD'),
('2', 'Tamat SD/MI/sederajat'),
('3', 'Tamat SMP/MTs/sederajat'),
('4', 'Tamat SMA/MA/sederajat'),
('5', 'Tamat SM Kejuruan'),
('6', 'Tamat Dip I/II'),
('7', 'Tamat Dip III/Akademi'),
('8', 'Tamat Dip IV/S1'),
('9', 'Tamat S2/S3');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r1`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r1` (
  `B8R1` enum('1','2','3','4','5','6','7') NOT NULL,
  `Value` varchar(15) NOT NULL,
  PRIMARY KEY (`B8R1`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r1`
--

INSERT INTO `opsi_b8r1` (`B8R1`, `Value`) VALUES
('1', 'Beton'),
('2', 'Genteng'),
('3', 'Sirap'),
('4', 'Seng'),
('5', 'Asbes'),
('6', 'Ijuk/rumbia'),
('7', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r2`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r2` (
  `B8R2` enum('1','2','3','4') NOT NULL,
  `Value` varchar(10) NOT NULL,
  PRIMARY KEY (`B8R2`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r2`
--

INSERT INTO `opsi_b8r2` (`B8R2`, `Value`) VALUES
('1', 'Tembok'),
('2', 'Kayu'),
('3', 'Bambu'),
('4', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r3`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r3` (
  `b8R3` enum('1','2','3','4','5','6') NOT NULL,
  `Value` varchar(25) NOT NULL,
  PRIMARY KEY (`b8R3`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r3`
--

INSERT INTO `opsi_b8r3` (`b8R3`, `Value`) VALUES
('1', 'Marmer/keramik/granit'),
('2', 'Tegel/teraso'),
('3', 'Semen'),
('4', 'Kayu'),
('5', 'Tanah'),
('6', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r5a`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r5a` (
  `b8R5A` enum('1','2','3','4','5','6','7','8','9','10','11','12') NOT NULL DEFAULT '1',
  `Value` varchar(25) NOT NULL,
  PRIMARY KEY (`b8R5A`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r5a`
--

INSERT INTO `opsi_b8r5a` (`b8R5A`, `Value`) VALUES
('1', 'Air kemasan bermerk'),
('2', 'Air isi ulang'),
('3', 'Leding meteran'),
('4', 'Leding eceran'),
('5', 'Sumur bor/pompa'),
('6', 'Sumur terlindung'),
('7', 'Sumur tak terlindung'),
('8', 'Mata air terlindung'),
('9', 'Mata air tak terlindung'),
('10', 'Air sungai'),
('11', 'Air hujan '),
('12', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r5b`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r5b` (
  `b8R5B` enum('1','2','3') NOT NULL,
  `Value` varchar(15) NOT NULL,
  PRIMARY KEY (`b8R5B`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r5b`
--

INSERT INTO `opsi_b8r5b` (`b8R5B`, `Value`) VALUES
('1', '< 10 m'),
('2', '>= 10 m '),
('3', 'Tidak tahu');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r6`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r6` (
  `b8R6` enum('1','2','3','4','5','6','7','8','9','10','11','12') NOT NULL COMMENT 'sumber air mandi',
  `value` varchar(25) NOT NULL,
  PRIMARY KEY (`b8R6`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r6`
--

INSERT INTO `opsi_b8r6` (`b8R6`, `value`) VALUES
('1', 'Air kemasan bermerk'),
('2', 'Air isi ulang'),
('3', 'Leding meteran'),
('4', 'Leding eceran'),
('5', 'Sumur bor/pompa'),
('6', 'Sumur terlindung'),
('7', 'Sumur tak terlindung'),
('8', 'Mata air terlindung'),
('9', 'Mata air tak terlindung'),
('10', 'Air sungai'),
('11', 'Air Hujan'),
('12', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r7a`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r7a` (
  `b8R7A` enum('1','2','3','4') NOT NULL COMMENT 'penggunaan tempat BAB',
  `value` varchar(10) NOT NULL,
  PRIMARY KEY (`b8R7A`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r7a`
--

INSERT INTO `opsi_b8r7a` (`b8R7A`, `value`) VALUES
('1', 'Sendiri'),
('2', 'Bersama'),
('3', 'Umum'),
('4', 'Tidak ada');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r7b`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r7b` (
  `b8R7B` enum('1','2','3','4') NOT NULL COMMENT 'jenis kloset',
  `value` varchar(20) NOT NULL,
  PRIMARY KEY (`b8R7B`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r7b`
--

INSERT INTO `opsi_b8r7b` (`b8R7B`, `value`) VALUES
('1', 'Leher angsa'),
('2', 'Plengsengan'),
('3', 'Cemplung/cubluk'),
('4', 'Tidak Pakai');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r8`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r8` (
  `b8R8` enum('1','2','3','4','5','6') NOT NULL COMMENT 'sumber penerangan',
  `value` varchar(20) NOT NULL,
  PRIMARY KEY (`b8R8`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r8`
--

INSERT INTO `opsi_b8r8` (`b8R8`, `value`) VALUES
('1', 'Listrik PLN dengan m'),
('2', 'Listrik PLN tanpa me'),
('3', 'Listrik Non PLN'),
('4', 'Petromak/Aladin'),
('5', 'Pelita/sentir/obor'),
('6', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_b8r9`
--

CREATE TABLE IF NOT EXISTS `opsi_b8r9` (
  `b8R9` enum('1','2','3','4','5','6','7','8') NOT NULL COMMENT 'bahan bakar utama',
  `value` varchar(15) NOT NULL,
  PRIMARY KEY (`b8R9`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_b8r9`
--

INSERT INTO `opsi_b8r9` (`b8R9`, `value`) VALUES
('1', 'Listrik'),
('2', 'Gas/elpiji'),
('3', 'Gas kota'),
('4', 'Minyak tanah'),
('5', 'Arang'),
('6', 'Briket'),
('7', 'Kayu'),
('8', 'Lainnya');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_jeniskelamin`
--

CREATE TABLE IF NOT EXISTS `opsi_jeniskelamin` (
  `kodeJenisKelamin` enum('1','2') NOT NULL,
  `jenisKelamin` varchar(10) NOT NULL,
  PRIMARY KEY (`kodeJenisKelamin`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_jeniskelamin`
--

INSERT INTO `opsi_jeniskelamin` (`kodeJenisKelamin`, `jenisKelamin`) VALUES
('1', 'Laki-laki'),
('2', 'Perempuan');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_listing_b4r16`
--

CREATE TABLE IF NOT EXISTS `opsi_listing_b4r16` (
  `B4R16` enum('1','2','3','4','5','6','7','8','10') NOT NULL,
  `Value` varchar(50) NOT NULL,
  PRIMARY KEY (`B4R16`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_listing_b4r16`
--

INSERT INTO `opsi_listing_b4r16` (`B4R16`, `Value`) VALUES
('1', 'Putus Asa'),
('2', 'Sudah diterima bekerja'),
('3', 'Sedang bersekolah'),
('4', 'Mengurus Rumah Tangga'),
('5', 'Sudah Mempunyai pekerjaan/usaha'),
('6', 'Merasa Sudah Cukup'),
('7', 'Tidak Mampu Melakukan Pekerjaan'),
('8', 'Lainnya'),
('10', 'tidak ada isian');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_rincian_lap_usaha`
--

CREATE TABLE IF NOT EXISTS `opsi_rincian_lap_usaha` (
  `kode` enum('0','1','2','3','4','5','6','7','8','9') NOT NULL,
  `value` varchar(100) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_rincian_lap_usaha`
--

INSERT INTO `opsi_rincian_lap_usaha` (`kode`, `value`) VALUES
('0', 'Anggota Tentara Nasional Indonesia (TNI) dan Kepolisian R.I.'),
('1', 'Pejabat Lembaga Legislatif, Pejabat Tinggi, dan Manajer'),
('2', 'Tenaga Profesional'),
('3', 'Teknisi dan Asisten Tenaga Profesional'),
('4', 'Tenaga Tata Usaha'),
('5', 'Tenaga Usaha Jasa dan Tenaga Penjualan di Toko dan Pasar'),
('6', 'Tenaga Usaha Pertanian dan Peternakan'),
('7', 'Tenaga Pengolahan dan Kerajinan YBDI'),
('8', 'Operator dan Perakit Mesin'),
('9', 'Pekerja Kasar, Tenaga Kebersihan, dan Tenaga YBDI');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_ya_dalamproses_tidak_tidaktahu`
--

CREATE TABLE IF NOT EXISTS `opsi_ya_dalamproses_tidak_tidaktahu` (
  `kode` enum('1','2','3','4') NOT NULL,
  `value` varchar(15) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_ya_dalamproses_tidak_tidaktahu`
--

INSERT INTO `opsi_ya_dalamproses_tidak_tidaktahu` (`kode`, `value`) VALUES
('1', 'Ya'),
('2', 'Dalam proses'),
('3', 'Tidak'),
('4', 'Tidak tahu');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_ya_tidak`
--

CREATE TABLE IF NOT EXISTS `opsi_ya_tidak` (
  `kode` enum('1','2') NOT NULL,
  `value` varchar(6) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_ya_tidak`
--

INSERT INTO `opsi_ya_tidak` (`kode`, `value`) VALUES
('1', 'Ya'),
('2', 'Tidak');

-- --------------------------------------------------------

--
-- Table structure for table `opsi_ya_tidak_tidaktau`
--

CREATE TABLE IF NOT EXISTS `opsi_ya_tidak_tidaktau` (
  `kode` enum('1','2','3') NOT NULL,
  `value` varchar(10) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `opsi_ya_tidak_tidaktau`
--

INSERT INTO `opsi_ya_tidak_tidaktau` (`kode`, `value`) VALUES
('1', 'Ya '),
('2', 'Tidak'),
('3', 'Tidak tahu');

-- --------------------------------------------------------

--
-- Table structure for table `password`
--

CREATE TABLE IF NOT EXISTS `password` (
  `nimPengentri` varchar(7) NOT NULL DEFAULT '',
  `password` varchar(8) DEFAULT NULL,
  PRIMARY KEY (`nimPengentri`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `password`
--

INSERT INTO `password` (`nimPengentri`, `password`) VALUES
('10.6432', 'L10.6432'),
('10.6445', 'L10.6445'),
('11.6503', 'L11.6503'),
('11.6505', 'L11.6505'),
('11.6510', 'L11.6510'),
('11.6514', 'L11.6514'),
('11.6519', 'L11.6519'),
('11.6521', 'L11.6521'),
('11.6524', 'L11.6524'),
('11.6525', 'L11.6525'),
('11.6528', 'L11.6528'),
('11.6530', 'L11.6530'),
('11.6532', 'L11.6532'),
('11.6538', 'L11.6538'),
('11.6543', 'L11.6543'),
('11.6549', 'L11.6549'),
('11.6558', 'L11.6558'),
('11.6559', 'L11.6559'),
('11.6561', 'L11.6561'),
('11.6563', 'L11.6563'),
('11.6567', 'L11.6567'),
('11.6571', 'L11.6571'),
('11.6572', 'L11.6572'),
('11.6576', 'L11.6576'),
('11.6587', 'L11.6587'),
('11.6593', 'L11.6593'),
('11.6599', 'L11.6599'),
('11.6607', 'L11.6607'),
('11.6615', 'L11.6615'),
('11.6619', 'L11.6619'),
('11.6622', 'L11.6622'),
('11.6626', 'L11.6626'),
('11.6637', 'L11.6637'),
('11.6646', 'L11.6646'),
('11.6650', 'L11.6650'),
('11.6653', 'L11.6653'),
('11.6682', 'L11.6682'),
('11.6686', 'L11.6686'),
('11.6687', 'L11.6687'),
('11.6691', 'L11.6691'),
('11.6693', 'L11.6693'),
('11.6697', 'L11.6697'),
('11.6699', 'L11.6699'),
('11.6702', 'L11.6702'),
('11.6709', 'L11.6709'),
('11.6710', 'L11.6710'),
('11.6713', 'L11.6713'),
('11.6716', 'L11.6716'),
('11.6722', 'L11.6722'),
('11.6735', 'L11.6735'),
('11.6740', 'L11.6740'),
('11.6742', 'L11.6742'),
('11.6743', 'L11.6743'),
('11.6748', 'L11.6748'),
('11.6762', 'L11.6762'),
('11.6768', 'L11.6768'),
('11.6771', 'L11.6771'),
('11.6783', 'L11.6783'),
('11.6786', 'L11.6786'),
('11.6787', 'L11.6787'),
('11.6789', 'L11.6789'),
('11.6793', 'L11.6793'),
('11.6795', 'L11.6795'),
('11.6796', 'L11.6796'),
('11.6797', 'L11.6797'),
('11.6798', 'L11.6798'),
('11.6800', 'L11.6800'),
('11.6811', 'L11.6811'),
('11.6812', 'L11.6812'),
('11.6818', 'L11.6818'),
('11.6827', 'L11.6827'),
('11.6829', 'L11.6829'),
('11.6840', 'L11.6840'),
('11.6843', 'L11.6843'),
('11.6844', 'L11.6844'),
('11.6848', 'L11.6848'),
('11.6851', 'L11.6851'),
('11.6852', 'L11.6852'),
('11.6855', 'L11.6855'),
('11.6860', 'L11.6860'),
('11.6863', 'L11.6863'),
('11.6866', 'L11.6866'),
('11.6875', 'L11.6875'),
('11.6877', 'L11.6877'),
('11.6879', 'L11.6879'),
('11.6882', 'L11.6882'),
('11.6888', 'L11.6888'),
('11.6890', 'L11.6890'),
('11.6891', 'L11.6891'),
('11.6892', 'L11.6892'),
('11.6895', 'L11.6895'),
('11.6896', 'L11.6896'),
('11.6902', 'L11.6902'),
('11.6904', 'L11.6904'),
('11.6910', 'L11.6910'),
('11.6913', 'L11.6913'),
('11.6919', 'L11.6919'),
('11.6920', 'L11.6920'),
('11.6921', 'L11.6921'),
('11.6926', 'L11.6926'),
('11.6928', 'L11.6928'),
('11.6933', 'L11.6933'),
('11.6942', 'L11.6942'),
('11.6943', 'L11.6943'),
('11.6944', 'L11.6944'),
('11.6951', 'L11.6951'),
('11.6955', 'L11.6955'),
('11.6959', 'L11.6959'),
('11.6960', 'L11.6960'),
('11.6964', 'L11.6964'),
('11.6973', 'L11.6973'),
('11.6977', 'L11.6977'),
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `sektor`
--

CREATE TABLE IF NOT EXISTS `sektor` (
  `kode` enum('1','2','3','4','5','6','7','8','9') NOT NULL,
  `Value` varchar(50) NOT NULL,
  PRIMARY KEY (`kode`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sektor`
--

INSERT INTO `sektor` (`kode`, `Value`) VALUES
('1', 'Pertanian, peternakan, kehutanan, dan perikanan'),
('2', 'Pertambangan dan penggalian'),
('3', 'Industri pengolahan'),
('4', 'Listrik, gas, dan air bersih'),
('5', 'Konstruksi'),
('6', 'Perdagangan, hotel, dan restoran'),
('7', 'Pengangkutan dan komunikasi'),
('8', 'Keuangan, real estate, dan jasa perusahaan'),
('9', 'Jasa-jasa');

-- --------------------------------------------------------

--
-- Table structure for table `status_pekerjaan`
--

CREATE TABLE IF NOT EXISTS `status_pekerjaan` (
  `B4R8` enum('1','2','3','4','5','6','7','10') NOT NULL,
  `value` varchar(60) NOT NULL,
  PRIMARY KEY (`B4R8`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `status_pekerjaan`
--

INSERT INTO `status_pekerjaan` (`B4R8`, `value`) VALUES
('1', 'Berusaha sendiri'),
('2', 'Berusaha dibantu buruh tidak tetap/tidak dibayar'),
('3', 'Berusaha dibantu buruh tetap/dibayar'),
('4', 'Buruh/karyawan/pegawai'),
('5', 'Pekerja bebas di pertanian'),
('6', 'pekerja bebas di non pertanian '),
('7', 'Pekerja keluarga/tidak dibayar'),
('10', 'tidak ada isian');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `1b1_tempat`
--
ALTER TABLE `1b1_tempat`
  ADD CONSTRAINT `1b1_tempat_ibfk_4` FOREIGN KEY (`B1R2`) REFERENCES `kecamatan` (`kecamatan_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `1b1_tempat_ibfk_5` FOREIGN KEY (`B1R3`) REFERENCES `kelurahan` (`kelurahan_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `1b1_tempat_ibfk_7` FOREIGN KEY (`B1R1`) REFERENCES `kabupatenkota` (`kodeKabupaten`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `1b1_tempat_ibfk_8` FOREIGN KEY (`B1R5A`) REFERENCES `no_bs` (`nobs_id`) ON DELETE NO ACTION ON UPDATE CASCADE,
  ADD CONSTRAINT `1b1_tempat_ibfk_9` FOREIGN KEY (`nimPencacah`) REFERENCES `mahasiswa` (`nim`) ON DELETE NO ACTION ON UPDATE CASCADE;

--
-- Constraints for table `1b4_art`
--
ALTER TABLE `1b4_art`
  ADD CONSTRAINT `1b4_art_ibfk_2` FOREIGN KEY (`B4R3`) REFERENCES `opsi_b4r3` (`B4R3`) ON DELETE NO ACTION ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
