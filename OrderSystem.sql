-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Mar 22, 2023 at 07:52 AM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `OrderSystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `customers`
--

CREATE TABLE `customers` (
  `cust_no` int(11) NOT NULL,
  `cust_name` varchar(33) NOT NULL,
  `cust_add` varchar(33) NOT NULL,
  `cust_tel` varchar(13) NOT NULL,
  `order_no` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customers`
--

INSERT INTO `customers` (`cust_no`, `cust_name`, `cust_add`, `cust_tel`, `order_no`) VALUES
(4, 'اكرم قاسم', 'الحصبة', '546546', NULL),
(6, 'ala', '', '', NULL),
(7, 'الثلاثي ', 'مازدا ', '77777777777', NULL),
(11, 'first', 'hhhh', '73333', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `groups`
--

CREATE TABLE `groups` (
  `group_no` int(11) NOT NULL,
  `group_name` varchar(33) NOT NULL,
  `nots` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `groups`
--

INSERT INTO `groups` (`group_no`, `group_name`, `nots`) VALUES
(4, 'f', 'lakjfa'),
(7, 'first ', ''),
(8, 'second', ''),
(9, 'third', ''),
(11, 'akram', 'alfaqih\r\n'),
(12, 'alaa', ''),
(13, 'ali', '');

-- --------------------------------------------------------

--
-- Table structure for table `items`
--

CREATE TABLE `items` (
  `item_no` int(11) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `price_buy` double NOT NULL,
  `group_no` int(11) NOT NULL,
  `unit1` varchar(15) NOT NULL,
  `unit2` varchar(15) NOT NULL,
  `unit3` varchar(15) NOT NULL,
  `store_no` int(11) NOT NULL,
  `unit_m1` double NOT NULL,
  `unit_m2` double NOT NULL,
  `color` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `items`
--

INSERT INTO `items` (`item_no`, `item_name`, `price_buy`, `group_no`, `unit1`, `unit2`, `unit3`, `store_no`, `unit_m1`, `unit_m2`, `color`) VALUES
(37, 'akram', 333, 9, 'جرام', 'حبة', 'كيلو جرام', 16, 55, 55, 'فضي'),
(38, 'phone', 700, 9, 'حبة', 'زوج', 'كرتون', 22, 2, 12, 'فضي'),
(39, 'akram', 300, 7, 'زوج', 'باكت', 'متر طولي', 17, 5, 3, 'ذهبي'),
(40, 'phone', 700, 7, 'حبة', 'زوج', 'كرتون', 17, 2, 12, 'فضي'),
(41, 'sum', 700, 7, 'حبة', 'زوج', 'كرتون', 17, 2, 12, 'فضي'),
(43, 'akram', 300, 11, 'حبة', 'حبة', 'حبة', 3, 5, 3, 'أسود'),
(44, 'kj;lk', 888, 4, 'متر مربع', 'درزن', 'كرتون', 15, 9, 4, 'فضي');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `order_no` int(11) NOT NULL,
  `cust_name` varchar(33) NOT NULL,
  `order_add` varchar(63) NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date DEFAULT NULL,
  `nots` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`order_no`, `cust_name`, `order_add`, `start_date`, `end_date`, `nots`) VALUES
(5, 'jamel', 'alkj;a', '0001-01-05', '0002-02-05', 'poiupoqir'),
(6, 'jamel', 'alkj;a', '0001-01-05', '0002-02-05', 'poiupoqir'),
(10, 'akram', '', '2013-02-05', NULL, ''),
(11, 'esgsdf;kl', 'sdjg;lkjs', '2013-02-05', NULL, '');

-- --------------------------------------------------------

--
-- Table structure for table `stores`
--

CREATE TABLE `stores` (
  `store_no` int(11) NOT NULL,
  `store_name` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `stores`
--

INSERT INTO `stores` (`store_no`, `store_name`) VALUES
(3, 'an'),
(14, 'akram'),
(15, 'alie'),
(16, 'alaa'),
(17, 'dhaia'),
(18, 'gh'),
(19, 'gl'),
(20, 'akrlll'),
(21, 'akm'),
(22, 'n'),
(23, 'gn'),
(24, 'gha'),
(25, 'kljhkjj');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `customers`
--
ALTER TABLE `customers`
  ADD PRIMARY KEY (`cust_no`),
  ADD KEY `order_no` (`order_no`);

--
-- Indexes for table `groups`
--
ALTER TABLE `groups`
  ADD PRIMARY KEY (`group_no`),
  ADD UNIQUE KEY `group_name` (`group_name`);

--
-- Indexes for table `items`
--
ALTER TABLE `items`
  ADD PRIMARY KEY (`item_no`),
  ADD KEY `group_no` (`group_no`),
  ADD KEY `stor_no` (`store_no`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`order_no`);

--
-- Indexes for table `stores`
--
ALTER TABLE `stores`
  ADD PRIMARY KEY (`store_no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `customers`
--
ALTER TABLE `customers`
  MODIFY `cust_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `groups`
--
ALTER TABLE `groups`
  MODIFY `group_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `items`
--
ALTER TABLE `items`
  MODIFY `item_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `order_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `stores`
--
ALTER TABLE `stores`
  MODIFY `store_no` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `customers`
--
ALTER TABLE `customers`
  ADD CONSTRAINT `customers_ibfk_1` FOREIGN KEY (`order_no`) REFERENCES `orders` (`order_no`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `items`
--
ALTER TABLE `items`
  ADD CONSTRAINT `items_ibfk_1` FOREIGN KEY (`store_no`) REFERENCES `stores` (`store_no`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `items_ibfk_2` FOREIGN KEY (`group_no`) REFERENCES `groups` (`group_no`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
