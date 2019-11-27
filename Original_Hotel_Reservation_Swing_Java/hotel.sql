-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 28, 2019 at 02:12 AM
-- Server version: 10.1.37-MariaDB
-- PHP Version: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `check_in` varchar(255) NOT NULL,
  `room_no` int(11) NOT NULL,
  `price` bigint(20) NOT NULL,
  `address` varchar(255) NOT NULL,
  `country` varchar(300) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `check_out` varchar(255) NOT NULL,
  `bed_type` varchar(255) NOT NULL,
  `total_dates` int(11) NOT NULL,
  `phone_no` bigint(20) NOT NULL,
  `id` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`check_in`, `room_no`, `price`, `address`, `country`, `gender`, `check_out`, `bed_type`, `total_dates`, `phone_no`, `id`) VALUES
('Mon Feb 04 00:47:00 CET 2019', 126, 126, '', 'Afghanistan', 'male', 'Mon Feb 04 00:48:00 CET 2019', 'single', 0, 779, NULL),
('Mon Feb 04 00:47:00 CET 2019', 126, 126, '', 'Afghanistan', 'male', 'Mon Feb 04 00:48:00 CET 2019', 'single', 0, 779, NULL),
('Sat Mar 18 21:35:00 CET 1939', 156, 156, '', 'Afghanistan', 'Male', 'Sat Mar 18 21:35:00 CET 1939', 'single', 156, 519, ''),
('Sat Mar 18 21:35:00 CET 1939', 156, 156, 'mekelle', 'Afghanistan', 'Male', 'Mon Nov 18 21:35:00 CEST 1940', 'double', 156, 519, 'mit/ur/1032/10'),
('Sat Mar 18 21:35:00 CET 1939', 156, 156, 'mekelle', 'Ethiopia', 'Male', 'Sat Mar 18 21:35:00 CET 1939', 'triple', 156, 519, 'mit/ur/1032/10'),
('Mon Feb 04 02:47:00 EAT 2019', 126, 126, '', 'Afghanistan', 'male', 'Mon Feb 04 02:48:00 EAT 2019', 'single', 789, 789, ''),
('Mon Feb 04 02:47:00 EAT 2019', 126, 126, '', 'Afghanistan', 'male', 'Mon Feb 04 02:48:00 EAT 2019', 'single', 789, 789, ''),
('Sat Mar 18 23:05:00 EAT 1939', 156, 156, '', 'Afghanistan', 'Male', 'Sat Mar 18 23:05:00 EAT 1939', 'single', 156, 519, ''),
('Sat Mar 18 23:05:00 EAT 1939', 156, 156, '7hj', 'Ethiopia', 'Female', 'Sat Mar 18 23:05:00 EAT 1939', 'triple', 156, 519, '67gh'),
('Sat Mar 18 23:05:00 EAT 1939', 156, 156, '7hj', 'Ethiopia', 'Female', 'Sat Mar 18 23:05:00 EAT 1939', 'triple', 156, 519, '67gh'),
('Sat Mar 18 23:05:00 EAT 1939', 156, 156, '', 'Afghanistan', 'Male', 'Sat Mar 18 23:05:00 EAT 1939', 'single', 156, 519, ''),
('Sat Mar 18 23:05:00 EAT 1939', 156, 156, 'gh', 'Afghanistan', 'Male', 'Sat Mar 18 23:05:00 EAT 1939', 'single', 156, 519, ''),
('Sat Mar 18 23:05:00 EAT 1939', 156, 156, 'MIT', 'Ethiopia', 'Female', 'Sat Mar 18 23:05:00 EAT 1939', 'triple', 156, 519, '1032/10'),
('Sun Aug 18 23:05:00 EAT 1940', 156, 156, 'Newyork', 'Ethiopia', 'Both', 'Mon Dec 18 23:05:00 EAT 1939', 'triple', 156, 519, 'et_wer'),
('Mon Feb 04 02:47:00 EAT 2019', 123, 123, '78', 'E', 'female', 'Mon Feb 04 02:48:00 EAT 2019', 'double', 786, 786, 'tyrygh');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `password`, `email`, `id`) VALUES
('Bruhtesheme', 'bruh@mit', 'BRUH@gmail', '');

-- --------------------------------------------------------

--
-- Table structure for table `registration`
--

CREATE TABLE `registration` (
  `Fname` varchar(255) NOT NULL,
  `Lname` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `confirm` varchar(255) NOT NULL,
  `age` int(20) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `country` varchar(150) NOT NULL,
  `Phone Number` bigint(22) NOT NULL,
  `city` varchar(55) NOT NULL,
  `id` varchar(50) NOT NULL,
  `language` varchar(190) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `registration`
--

INSERT INTO `registration` (`Fname`, `Lname`, `email`, `password`, `confirm`, `age`, `gender`, `country`, `Phone Number`, `city`, `id`, `language`) VALUES
('bruh', 'tesheme', 'bruh@mit', 'password', 'password', 23, 'male', 'ethiopia', 978657865, 'aa', '', '0'),
('hello', 'father', '459bruh12@gmail.com', 'BRUH@MIT', 'bruhtesheme', 20, 'Male', 'Afghanistan', 972140562, 'maray', '12345', 'Amharic '),
('bruh', 'tesheme', 'bruh@mit', 'bruh', 'bruh', 19, 'Female', 'Ethiopia', 972140562, 'maray', '45678', 'Amharic '),
('rjfg', 'dfkkf', 'ljfgdx', 'l;kjhgf', 'kjhgfd', 98, 'Female', 'Albania', 9876543, 'gfdsa', '98765rtcv', 'Amharic '),
('bruh', 'tesheme', 'bruh@mit', 'bruh', 'bruh', 21, 'Female', 'Albania', 972140562, 'maray', 'bruh', 'Amharic '),
('edje', 'frcf', 'f', '', '', 34, 'Male', 'Afghanistan', 976, '', 'ew', 'Amharic '),
('BRUH', 'TESHOME', 'bruhtesheme@yahoo.com', 'BRUH2011@yahoo', 'setVisible(true);', 19, 'Male', 'Eritrea', 972140562, 'wuqromaray', 'Mit/ur/1032/10', 'Tigrigna'),
('TESHEME', 'wneh', '', 'ter', 'ter', 50, 'Male', 'Gabon', 9323420, '', 'ter', 'Tigrigna');

-- --------------------------------------------------------

--
-- Table structure for table `registration admin`
--

CREATE TABLE `registration admin` (
  `Username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD KEY `id` (`id`),
  ADD KEY `id_2` (`id`),
  ADD KEY `id_3` (`id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD KEY `id` (`id`);

--
-- Indexes for table `registration`
--
ALTER TABLE `registration`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `registration admin`
--
ALTER TABLE `registration admin`
  ADD KEY `id` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
