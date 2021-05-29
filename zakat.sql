-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2021 at 12:44 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `zakat`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_jenis_zakat`
--

CREATE TABLE `tbl_jenis_zakat` (
  `idJenisZakat` int(255) NOT NULL,
  `JenisZakat` varchar(255) NOT NULL,
  `JumlahZakat` int(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_jenis_zakat`
--

INSERT INTO `tbl_jenis_zakat` (`idJenisZakat`, `JenisZakat`, `JumlahZakat`) VALUES
(1, 'Zakat Maal', 2000000),
(2, 'Zakat Fitrah', 1387500),
(3, 'Zakat Pertanian', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_muzakki`
--

CREATE TABLE `tbl_muzakki` (
  `idMuzakki` int(11) NOT NULL,
  `NamaMuzakki` text NOT NULL,
  `AlamatMuzakki` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `hp` varchar(255) NOT NULL,
  `JumlahZakat` int(255) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_muzakki`
--

INSERT INTO `tbl_muzakki` (`idMuzakki`, `NamaMuzakki`, `AlamatMuzakki`, `email`, `hp`, `JumlahZakat`) VALUES
(39, 'Maulana Rizki', 'Kemang, Jakarta Selatan', 'maulana123@gmail.com', '08123456789', 2187500),
(41, 'ivan', 'depok	', 'ivan@gmail.com', '085741835260', 1200000),
(42, 'Rakha', 'Bogor, Jawa Barat	', 'Raka@gmail.com', '085712345678', 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_transaksi_zakat`
--

CREATE TABLE `tbl_transaksi_zakat` (
  `idTransaksi` int(11) NOT NULL,
  `idUser` int(255) NOT NULL,
  `idMuzakki` int(255) DEFAULT NULL,
  `idJenisZakat` int(255) DEFAULT NULL,
  `JumlahZakat` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_transaksi_zakat`
--

INSERT INTO `tbl_transaksi_zakat` (`idTransaksi`, `idUser`, `idMuzakki`, `idJenisZakat`, `JumlahZakat`) VALUES
(92, 1, 39, 2, 187500),
(93, 1, 39, 1, 2000000),
(94, 1, 41, 2, 1200000);

--
-- Triggers `tbl_transaksi_zakat`
--
DELIMITER $$
CREATE TRIGGER `updateDelJenisZakat` AFTER DELETE ON `tbl_transaksi_zakat` FOR EACH ROW UPDATE tbl_jenis_zakat SET tbl_jenis_zakat.JumlahZakat=tbl_jenis_zakat.JumlahZakat - old.JumlahZakat
WHERE tbl_jenis_zakat.idJenisZakat = old.idJenisZakat
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `updateDelMuzakki` AFTER DELETE ON `tbl_transaksi_zakat` FOR EACH ROW UPDATE tbl_muzakki SET tbl_muzakki.JumlahZakat= tbl_muzakki.JumlahZakat - old.JumlahZakat
WHERE tbl_muzakki.idMuzakki = old.idMuzakki
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `updateInsertJenisZakat` AFTER INSERT ON `tbl_transaksi_zakat` FOR EACH ROW UPDATE tbl_jenis_zakat
SET 
tbl_jenis_zakat.JumlahZakat=tbl_jenis_zakat.JumlahZakat + new.JumlahZakat
WHERE 
tbl_jenis_zakat.idJenisZakat = new.idJenisZakat
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `updateInsertMuzakki` AFTER INSERT ON `tbl_transaksi_zakat` FOR EACH ROW UPDATE tbl_muzakki
SET 
tbl_muzakki.JumlahZakat=tbl_muzakki.JumlahZakat + new.JumlahZakat
WHERE 
tbl_muzakki.idMuzakki = new.idMuzakki
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`id`, `username`, `password`, `role`) VALUES
(1, 'ivan', 'ivan123', 'admin'),
(24, 'Maul', 'maul123', 'user');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_jenis_zakat`
--
ALTER TABLE `tbl_jenis_zakat`
  ADD PRIMARY KEY (`idJenisZakat`);

--
-- Indexes for table `tbl_muzakki`
--
ALTER TABLE `tbl_muzakki`
  ADD PRIMARY KEY (`idMuzakki`);

--
-- Indexes for table `tbl_transaksi_zakat`
--
ALTER TABLE `tbl_transaksi_zakat`
  ADD PRIMARY KEY (`idTransaksi`),
  ADD KEY `idJenisZakat` (`idJenisZakat`),
  ADD KEY `tbl_pembayaran_zakat_ibfk_1` (`idMuzakki`),
  ADD KEY `idUser` (`idUser`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_muzakki`
--
ALTER TABLE `tbl_muzakki`
  MODIFY `idMuzakki` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;

--
-- AUTO_INCREMENT for table `tbl_transaksi_zakat`
--
ALTER TABLE `tbl_transaksi_zakat`
  MODIFY `idTransaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=95;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_transaksi_zakat`
--
ALTER TABLE `tbl_transaksi_zakat`
  ADD CONSTRAINT `tbl_transaksi_zakat_ibfk_1` FOREIGN KEY (`idMuzakki`) REFERENCES `tbl_muzakki` (`idMuzakki`),
  ADD CONSTRAINT `tbl_transaksi_zakat_ibfk_2` FOREIGN KEY (`idJenisZakat`) REFERENCES `tbl_jenis_zakat` (`idJenisZakat`),
  ADD CONSTRAINT `tbl_transaksi_zakat_ibfk_3` FOREIGN KEY (`idUser`) REFERENCES `tbl_user` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
