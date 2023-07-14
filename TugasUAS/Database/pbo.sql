-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2023 at 12:47 AM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pbo`
--
CREATE DATABASE IF NOT EXISTS `pbo` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `pbo`;

-- --------------------------------------------------------

--
-- Table structure for table `tiket_bioskop`
--

CREATE TABLE `tiket_bioskop` (
  `judul_film` varchar(255) NOT NULL,
  `jam_tayang` varchar(50) NOT NULL,
  `no_kursi` varchar(25) NOT NULL,
  `jumlah_tiket` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tiket_bioskop`
--

INSERT INTO `tiket_bioskop` (`judul_film`, `jam_tayang`, `no_kursi`, `jumlah_tiket`, `total`) VALUES
('The Flash', '09.00 am', 'B2', 2, 80000),
('Avenger', '03.00 pm', 'A1', 1, 40000),
('Titanic', '07.00 pm', 'C5', 4, 160000),
('Avenger', '03.00 pm', 'D4', 1, 40000),
('Avenger', '09.00 am', 'Z2', 4, 160000),
('The Flash', '09.00 am', 'Z4', 1, 40000),
('Avenger', '09.00 am', 'V4', 1, 40000),
('The Flash', '09.00 am', 'T5', 2, 80000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
