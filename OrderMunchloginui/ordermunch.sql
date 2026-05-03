-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 22, 2024 at 08:35 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ordermunch`
--

-- --------------------------------------------------------

--
-- Table structure for table `cartdetails`
--

CREATE TABLE `cartdetails` (
  `FoodID` int(5) NOT NULL,
  `FoodName` char(255) NOT NULL,
  `Quantity` int(2) NOT NULL,
  `Amount` int(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cartdetails`
--

INSERT INTO `cartdetails` (`FoodID`, `FoodName`, `Quantity`, `Amount`) VALUES
(1, 'LongBurger', 1, 300),
(2, 'Bucketfortwo', 1, 400),
(3, 'Popcornchicken', 0, 0),
(4, 'Chickenroll', 0, 0),
(5, 'Lavacake', 0, 0),
(6, 'VegZingerBox', 0, 0),
(7, 'AlooParatha', 0, 0),
(8, 'Gobi65', 0, 0),
(9, 'IdlyVada', 0, 0),
(10, 'MysorePak', 0, 0),
(11, 'PaneerButterMasala', 0, 0),
(12, 'SouthIndianThali', 0, 0),
(13, 'Charsiu', 0, 0),
(14, 'Chowmein', 0, 0),
(15, 'KungPaoChicken', 0, 0),
(16, 'SpringRoll', 0, 0),
(17, 'SweetSourPork', 0, 0),
(18, 'WontonSoup', 0, 0),
(19, 'Chalupas', 0, 0),
(20, 'Flautas', 0, 0),
(21, 'ChickenMole', 0, 0),
(22, 'FresasConcrema', 0, 0),
(23, 'PicoDeGallo', 0, 0),
(24, 'Sopes', 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `helpdetails`
--

CREATE TABLE `helpdetails` (
  `QueryID` int(5) NOT NULL,
  `Querycomment` varchar(255) NOT NULL,
  `Date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `userlogindetails`
--
-- Error reading structure for table ordermunch.userlogindetails: #1932 - Table &#039;ordermunch.userlogindetails&#039; doesn&#039;t exist in engine
-- Error reading data for table ordermunch.userlogindetails: #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near &#039;FROM `ordermunch`.`userlogindetails`&#039; at line 1

-- --------------------------------------------------------

--
-- Table structure for table `userslogindetails`
--

CREATE TABLE `userslogindetails` (
  `UserID` int(5) NOT NULL,
  `FirstName` char(255) NOT NULL,
  `LastName` char(255) DEFAULT NULL,
  `Username` varchar(255) NOT NULL,
  `Password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userslogindetails`
--

INSERT INTO `userslogindetails` (`UserID`, `FirstName`, `LastName`, `Username`, `Password`) VALUES
(1, 'John', 'Morris', 'johnmors', 'johnmorsacc');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cartdetails`
--
ALTER TABLE `cartdetails`
  ADD PRIMARY KEY (`FoodID`);

--
-- Indexes for table `helpdetails`
--
ALTER TABLE `helpdetails`
  ADD PRIMARY KEY (`QueryID`);

--
-- Indexes for table `userslogindetails`
--
ALTER TABLE `userslogindetails`
  ADD PRIMARY KEY (`UserID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cartdetails`
--
ALTER TABLE `cartdetails`
  MODIFY `FoodID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `helpdetails`
--
ALTER TABLE `helpdetails`
  MODIFY `QueryID` int(5) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `userslogindetails`
--
ALTER TABLE `userslogindetails`
  MODIFY `UserID` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
