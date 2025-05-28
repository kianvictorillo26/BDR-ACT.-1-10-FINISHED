-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2025 at 01:49 PM
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
-- Database: `baraggay`
--

-- --------------------------------------------------------

--
-- Table structure for table `citizens`
--

CREATE TABLE `citizens` (
  `citizen_id` int(20) NOT NULL,
  `U_Id` int(20) DEFAULT NULL,
  `registration_date` datetime DEFAULT current_timestamp(),
  `approved_by` int(20) DEFAULT NULL,
  `status` varchar(20) NOT NULL,
  `photo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `citizens`
--

INSERT INTO `citizens` (`citizen_id`, `U_Id`, `registration_date`, `approved_by`, `status`, `photo`) VALUES
(1, 7, '2025-05-18 15:51:44', NULL, 'Active', 'src/userimages/admin-logo.png'),
(2, 6, '2025-05-18 23:06:12', NULL, 'Active', 'src/userimages/admin-logo.png'),
(3, 18, '2025-05-19 15:38:27', NULL, 'Active', 'src/userimages/admin-logo.png'),
(4, 19, '2025-05-19 15:41:46', NULL, 'Active', 'src/userimages/admin-logo.png'),
(5, 20, '2025-05-19 15:44:58', NULL, 'Active', 'src/userimages/admin-logo.png');

-- --------------------------------------------------------

--
-- Table structure for table `documents`
--

CREATE TABLE `documents` (
  `doc_id` int(20) NOT NULL,
  `doc_type` varchar(50) NOT NULL,
  `doc_description` text DEFAULT NULL,
  `created_by` int(20) DEFAULT NULL,
  `date_created` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `documents`
--

INSERT INTO `documents` (`doc_id`, `doc_type`, `doc_description`, `created_by`, `date_created`) VALUES
(8, 'Barangay Clearance', 'A certification that a person is a resident of the barangay and has no criminal or derogatory records.', 6, '2025-05-19 13:00:50'),
(9, 'Barangay Certificate of Residency', 'Certifies that an individual has been residing within the barangay for a specified period.', 6, '2025-05-19 13:01:06'),
(10, 'Barangay Indigency Certificate', 'Issued to residents classified as low-income or indigent.', 6, '2025-05-19 13:01:20');

-- --------------------------------------------------------

--
-- Table structure for table `logs`
--

CREATE TABLE `logs` (
  `log_id` int(20) NOT NULL,
  `user_id` int(20) DEFAULT NULL,
  `action` varchar(255) NOT NULL,
  `timestamp` datetime DEFAULT current_timestamp(),
  `log_level` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `logs`
--

INSERT INTO `logs` (`log_id`, `user_id`, `action`, `timestamp`, `log_level`) VALUES
(1, 18, 'User logged in', '2025-05-19 01:07:09', ''),
(2, 18, 'User logged in', '2025-05-19 01:09:53', ''),
(3, 18, 'User logged in', '2025-05-19 01:10:48', ''),
(4, 6, 'User logged in', '2025-05-19 01:16:28', ''),
(5, 6, 'User logged in', '2025-05-19 01:17:51', ''),
(6, 6, 'User logged in', '2025-05-19 01:18:46', ''),
(7, 6, 'User logged in', '2025-05-19 01:19:18', ''),
(8, 6, 'User logged out', '2025-05-19 01:19:24', ''),
(9, 6, 'User logged in', '2025-05-19 01:19:32', ''),
(10, 6, 'User logged in', '2025-05-19 01:21:38', ''),
(11, 6, 'User logged in', '2025-05-19 01:21:58', ''),
(12, 6, 'User logged in', '2025-05-19 01:22:16', ''),
(13, 7, 'User logged in', '2025-05-19 01:30:55', ''),
(14, 7, 'User logged in', '2025-05-19 01:39:28', ''),
(15, 7, 'User logged in', '2025-05-19 01:40:41', ''),
(16, 7, 'User logged in', '2025-05-19 01:45:37', ''),
(18, 6, 'User logged in', '2025-05-19 12:56:43', ''),
(19, 6, 'User logged in', '2025-05-19 12:58:15', ''),
(20, 6, 'User logged in', '2025-05-19 12:58:30', ''),
(21, 6, 'User logged in', '2025-05-19 13:00:28', ''),
(22, 6, 'User logged in', '2025-05-19 13:04:04', ''),
(23, 6, 'User logged in', '2025-05-19 13:14:15', ''),
(24, 6, 'User logged in', '2025-05-19 13:15:46', ''),
(25, 6, 'User logged in', '2025-05-19 13:17:24', ''),
(26, 6, 'User logged in', '2025-05-19 13:19:38', ''),
(27, 6, 'User logged in', '2025-05-19 13:20:30', ''),
(28, 6, 'User logged in', '2025-05-19 13:21:07', ''),
(29, 6, 'User logged in', '2025-05-19 13:21:59', ''),
(30, 6, 'User logged in', '2025-05-19 13:22:23', ''),
(31, 6, 'User logged in', '2025-05-19 13:34:22', ''),
(32, 6, 'User logged in', '2025-05-19 13:37:27', ''),
(33, 6, 'User logged in', '2025-05-19 13:40:23', ''),
(34, 6, 'User logged in', '2025-05-19 13:42:43', ''),
(35, 6, 'User logged in', '2025-05-19 13:45:13', ''),
(36, 6, 'User logged in', '2025-05-19 13:45:52', ''),
(37, 6, 'User logged in', '2025-05-19 13:46:13', ''),
(38, 6, 'User logged in', '2025-05-19 13:46:32', ''),
(39, 6, 'User logged in', '2025-05-19 13:49:30', ''),
(40, 6, 'User logged in', '2025-05-19 13:50:09', ''),
(41, 6, 'User logged in', '2025-05-19 13:50:58', ''),
(42, 6, 'User logged in', '2025-05-19 13:51:46', ''),
(43, 7, 'User logged in', '2025-05-19 15:18:32', ''),
(44, 18, 'User logged in', '2025-05-19 15:18:49', ''),
(45, 18, 'User logged in', '2025-05-19 15:19:44', ''),
(46, 18, 'User logged in', '2025-05-19 15:23:58', ''),
(47, 18, 'User logged in', '2025-05-19 15:25:21', ''),
(48, 18, 'User logged in', '2025-05-19 15:26:47', ''),
(49, 18, 'User logged in', '2025-05-19 15:27:31', ''),
(50, 18, 'User logged in', '2025-05-19 15:28:37', ''),
(51, 18, 'User logged in', '2025-05-19 15:30:07', ''),
(52, 18, 'User logged in', '2025-05-19 15:33:01', ''),
(53, 18, 'User logged in', '2025-05-19 15:35:34', ''),
(54, 18, 'User logged in', '2025-05-19 15:36:47', ''),
(55, 19, 'User logged in', '2025-05-19 15:41:22', ''),
(56, 19, 'User logged in', '2025-05-19 15:44:20', ''),
(57, 20, 'User logged in', '2025-05-19 15:44:38', ''),
(58, 19, 'User logged in', '2025-05-19 15:54:07', ''),
(59, 19, 'User logged in', '2025-05-19 16:04:51', ''),
(60, 19, 'User logged in', '2025-05-19 16:05:32', ''),
(61, 19, 'User logged in', '2025-05-19 16:06:30', ''),
(62, 19, 'User logged in', '2025-05-19 16:07:42', ''),
(63, 6, 'User logged in', '2025-05-19 16:12:12', ''),
(64, 6, 'User logged out', '2025-05-19 16:12:26', ''),
(65, 19, 'User logged in', '2025-05-19 16:12:31', ''),
(66, 19, 'User logged in', '2025-05-19 16:16:43', ''),
(67, 19, 'User logged in', '2025-05-19 16:17:14', ''),
(68, 19, 'User logged in', '2025-05-19 16:18:37', ''),
(69, 19, 'User logged in', '2025-05-19 16:19:43', ''),
(70, 19, 'User logged in', '2025-05-19 16:20:59', ''),
(71, 19, 'User logged in', '2025-05-19 16:23:44', ''),
(72, 19, 'User logged in', '2025-05-19 16:28:54', ''),
(73, 19, 'User logged in', '2025-05-19 16:30:40', ''),
(74, 19, 'User logged in', '2025-05-19 16:31:23', ''),
(75, 6, 'User logged in', '2025-05-19 16:47:28', ''),
(76, 6, 'User logged in', '2025-05-19 16:50:36', ''),
(77, 6, 'User logged in', '2025-05-19 17:53:53', ''),
(78, 6, 'User logged in', '2025-05-19 17:55:48', ''),
(79, 6, 'User logged in', '2025-05-19 17:57:54', ''),
(80, 6, 'User logged in', '2025-05-19 17:58:52', ''),
(81, 6, 'User logged in', '2025-05-19 18:09:30', ''),
(82, 6, 'User logged in', '2025-05-19 18:19:30', ''),
(83, 19, 'User logged in', '2025-05-19 18:20:33', ''),
(84, 6, 'User logged in', '2025-05-19 18:24:37', ''),
(85, 6, 'User logged in', '2025-05-19 18:25:43', ''),
(86, 6, 'User logged in', '2025-05-19 18:28:49', ''),
(87, 6, 'User logged in', '2025-05-19 18:29:54', ''),
(88, 6, 'User logged in', '2025-05-19 18:41:08', ''),
(89, 6, 'User logged in', '2025-05-19 18:44:04', ''),
(90, 6, 'User logged in', '2025-05-19 18:46:35', ''),
(91, 6, 'User logged in', '2025-05-19 18:48:21', ''),
(92, 6, 'User logged in', '2025-05-19 18:49:11', ''),
(93, 6, 'User logged in', '2025-05-19 18:54:10', ''),
(94, 6, 'User logged in', '2025-05-19 18:56:23', ''),
(95, 6, 'User logged in', '2025-05-19 18:59:32', ''),
(96, 6, 'User logged in', '2025-05-19 19:06:18', ''),
(97, 6, 'User logged in', '2025-05-19 21:18:41', ''),
(98, 6, 'User logged in', '2025-05-22 23:07:42', ''),
(99, 6, 'User logged in', '2025-05-22 23:14:49', ''),
(100, 7, 'User logged in', '2025-05-27 21:45:20', ''),
(101, 7, 'User logged in', '2025-05-27 21:45:30', ''),
(102, 7, 'User logged in', '2025-05-27 21:47:28', ''),
(103, 7, 'User logged in', '2025-05-27 21:48:47', ''),
(104, 7, 'User logged in', '2025-05-27 21:49:25', ''),
(105, 7, 'User logged in', '2025-05-27 21:50:13', ''),
(106, 7, 'User logged in', '2025-05-27 21:55:44', ''),
(107, 7, 'User logged in', '2025-05-27 21:56:20', ''),
(108, 7, 'User logged in', '2025-05-27 21:57:12', ''),
(109, 7, 'User logged in', '2025-05-27 22:01:47', ''),
(110, 7, 'User logged in', '2025-05-27 22:02:16', ''),
(111, 7, 'User logged in', '2025-05-27 22:13:03', ''),
(112, 6, 'User logged in', '2025-05-27 22:13:33', ''),
(113, 7, 'User logged in', '2025-05-27 22:18:55', ''),
(114, 6, 'User logged in', '2025-05-27 22:19:40', ''),
(115, 7, 'User logged in', '2025-05-27 22:22:42', ''),
(116, 6, 'User logged in', '2025-05-27 22:23:08', ''),
(117, 7, 'User logged in', '2025-05-27 22:25:22', ''),
(118, 6, 'User logged in', '2025-05-27 22:26:14', ''),
(119, 7, 'User logged in', '2025-05-27 22:32:15', ''),
(120, 7, 'User logged in', '2025-05-27 23:14:01', ''),
(121, 7, 'User logged in', '2025-05-27 23:16:27', ''),
(122, 7, 'User logged in', '2025-05-27 23:21:20', ''),
(123, 7, 'User logged in', '2025-05-27 23:27:20', ''),
(124, 7, 'User logged in', '2025-05-27 23:29:30', ''),
(125, 7, 'User logged in', '2025-05-27 23:30:19', ''),
(126, 7, 'User logged in', '2025-05-27 23:33:33', ''),
(127, 7, 'User logged in', '2025-05-27 23:34:50', ''),
(128, 7, 'User logged in', '2025-05-28 19:48:18', 'INFO'),
(129, 7, 'Document Request: 9 - Barangay Certificate of Residency', '2025-05-28 19:48:22', 'INFO'),
(130, 7, 'Printed Barangay Certificate of Residency', '2025-05-28 19:48:33', 'INFO'),
(131, 6, 'User logged in', '2025-05-28 19:48:56', 'INFO');

-- --------------------------------------------------------

--
-- Table structure for table `requests`
--

CREATE TABLE `requests` (
  `req_id` int(20) NOT NULL,
  `citizen_id` int(20) DEFAULT NULL,
  `doc_id` int(20) DEFAULT NULL,
  `request_date` datetime DEFAULT current_timestamp(),
  `status` varchar(20) NOT NULL,
  `approved_by` int(20) DEFAULT NULL,
  `approval_date` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `requests`
--

INSERT INTO `requests` (`req_id`, `citizen_id`, `doc_id`, `request_date`, `status`, `approved_by`, `approval_date`) VALUES
(2, 1, 8, '2025-05-19 13:21:19', 'Approved', 6, '2025-05-19 13:34:29'),
(3, 1, 9, '2025-05-19 13:37:36', 'Approved', 6, '2025-05-19 18:20:01'),
(6, 4, 8, '2025-05-19 16:23:47', 'Rejected', 6, '2025-05-19 18:20:04'),
(7, 4, 9, '2025-05-19 18:30:03', 'Approved', 6, '2025-05-19 18:44:23'),
(8, 1, 8, '2025-05-27 22:13:20', 'Pending', NULL, NULL),
(9, 1, 9, '2025-05-27 22:19:01', 'Pending', NULL, NULL),
(10, 1, 10, '2025-05-27 22:22:48', 'Pending', NULL, NULL),
(11, 1, 8, '2025-05-27 22:25:28', 'Pending', NULL, NULL),
(12, 1, 9, '2025-05-27 22:25:32', 'Pending', NULL, NULL),
(13, 1, 10, '2025-05-27 22:25:37', 'Pending', NULL, NULL),
(14, 1, 10, '2025-05-27 22:32:21', 'Pending', NULL, NULL),
(15, 1, 8, '2025-05-27 23:14:06', 'Pending', NULL, NULL),
(16, 1, 8, '2025-05-27 23:16:33', 'Pending', NULL, NULL),
(17, 1, 9, '2025-05-27 23:21:24', 'Pending', NULL, NULL),
(18, 1, 8, '2025-05-27 23:27:25', 'Pending', NULL, NULL),
(19, 1, 10, '2025-05-27 23:29:34', 'Pending', NULL, NULL),
(20, 1, 9, '2025-05-27 23:30:24', 'Pending', NULL, NULL),
(21, 1, 10, '2025-05-27 23:33:45', 'Pending', NULL, NULL),
(22, 1, 10, '2025-05-27 23:34:53', 'Pending', NULL, NULL),
(23, 1, 9, '2025-05-28 19:48:22', 'Pending', NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `U_Id` int(20) NOT NULL,
  `fname` varchar(50) NOT NULL,
  `lname` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `account_type` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `contact` varchar(20) NOT NULL,
  `uname` varchar(50) NOT NULL,
  `pname` varchar(100) NOT NULL,
  `status` varchar(20) NOT NULL,
  `security_question` varchar(255) NOT NULL,
  `security_answer` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`U_Id`, `fname`, `lname`, `address`, `account_type`, `email`, `contact`, `uname`, `pname`, `status`, `security_question`, `security_answer`) VALUES
(6, 'admin', 'admin', 'admin', 'Admin', 'admin@gmail.com', 'admin', 'admin', 'GBODcvrUuUUzzUiB8D3GxpKW3YlyNODO6D9yfi5rH2M=', 'Active', 'what is your favorite color?', 'admin'),
(7, 'User', 'Citizen', 'Purok 1, Ward 4', 'Citizen', 'user@gmail.com', '9876534671', 'user', 'LINbqJZtkCEg+0UEA3+tNO/6S5Rh6YjkxNoHOtUNroI=', 'Active', 'What is your favorite food?', 'boar'),
(18, 'John', 'Doe', 'Purok 3', 'citizen', 'john.doe@example.com', '09171234567', 'johndoe', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'What is your favorite color?', 'Blue'),
(19, 'Jane', 'Smithy', 'Purok 1', 'citizen', 'jane.smith@example.com', '09181234567', 'jane', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'Where were you born?', 'Manila'),
(20, 'Mike', 'Brown', 'Purok 1', 'citizen', 'michael.brown@example.com', '09191234567', 'mike', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'What is the name of your first pet?', 'Buddy'),
(21, 'Emily', 'Johnson', '101 Maple Ave', 'user', 'emily.j@example.com', '09201234567', 'emjohnson', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'pending', 'What is your favorite food?', 'Pizza'),
(22, 'David', 'Lee', '202 Oak Rd', 'user', 'david.lee@example.com', '09211234567', 'dlee', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'What city did you grow up on?', 'Quezon City'),
(23, 'Samantha', 'Garcia', '303 Birch Ln', 'user', 'samantha.g@example.com', '09221234567', 'samgarcia', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'What is your favorite color?', 'Green'),
(24, 'Robert', 'Martinez', '404 Cedar Ct', 'user', 'robert.m@example.com', '09231234567', 'robmart', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'Where were you born?', 'Cebu City'),
(25, 'Jessica', 'Lopez', '505 Spruce Dr', 'user', 'jessica.l@example.com', '09241234567', 'jlopez', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'pending', 'What is the name of your first pet?', 'Max'),
(26, 'Thomas', 'Kim', '606 Willow Way', 'user', 'thomas.k@example.com', '09251234567', 'tomkim', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'What is your favorite food?', 'Sushi'),
(27, 'Linda', 'Clark', '707 Redwood Blvd', 'user', 'linda.c@example.com', '09261234567', 'lclark', 'gxwjeSjmISvtqkRRpRSs4xdFYvZ2H2oVei/lCCs24vs=', 'active', 'What city did you grow up on?', 'Davao City');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `citizens`
--
ALTER TABLE `citizens`
  ADD PRIMARY KEY (`citizen_id`),
  ADD KEY `U_Id` (`U_Id`),
  ADD KEY `approved_by` (`approved_by`);

--
-- Indexes for table `documents`
--
ALTER TABLE `documents`
  ADD PRIMARY KEY (`doc_id`),
  ADD KEY `documents_ibfk_1` (`created_by`);

--
-- Indexes for table `logs`
--
ALTER TABLE `logs`
  ADD PRIMARY KEY (`log_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `requests`
--
ALTER TABLE `requests`
  ADD PRIMARY KEY (`req_id`),
  ADD KEY `citizen_id` (`citizen_id`),
  ADD KEY `doc_id` (`doc_id`),
  ADD KEY `approved_by` (`approved_by`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`U_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `citizens`
--
ALTER TABLE `citizens`
  MODIFY `citizen_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `documents`
--
ALTER TABLE `documents`
  MODIFY `doc_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `logs`
--
ALTER TABLE `logs`
  MODIFY `log_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=132;

--
-- AUTO_INCREMENT for table `requests`
--
ALTER TABLE `requests`
  MODIFY `req_id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `U_Id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `citizens`
--
ALTER TABLE `citizens`
  ADD CONSTRAINT `citizens_ibfk_1` FOREIGN KEY (`U_Id`) REFERENCES `users` (`U_Id`),
  ADD CONSTRAINT `citizens_ibfk_2` FOREIGN KEY (`approved_by`) REFERENCES `users` (`U_Id`);

--
-- Constraints for table `documents`
--
ALTER TABLE `documents`
  ADD CONSTRAINT `documents_ibfk_1` FOREIGN KEY (`created_by`) REFERENCES `users` (`U_Id`) ON UPDATE NO ACTION;

--
-- Constraints for table `logs`
--
ALTER TABLE `logs`
  ADD CONSTRAINT `logs_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`U_Id`);

--
-- Constraints for table `requests`
--
ALTER TABLE `requests`
  ADD CONSTRAINT `requests_ibfk_1` FOREIGN KEY (`citizen_id`) REFERENCES `citizens` (`citizen_id`),
  ADD CONSTRAINT `requests_ibfk_2` FOREIGN KEY (`doc_id`) REFERENCES `documents` (`doc_id`),
  ADD CONSTRAINT `requests_ibfk_3` FOREIGN KEY (`approved_by`) REFERENCES `users` (`U_Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
