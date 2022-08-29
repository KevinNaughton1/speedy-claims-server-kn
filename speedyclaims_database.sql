
-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               5.7.32 - MySQL Community Server (GPL)
-- Server OS:                    Linux
-- HeidiSQL Version:             11.1.0.6116
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for payments
CREATE DATABASE IF NOT EXISTS `speedyclaims` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `speedyclaims`;

-- Dumping structure for table payments.claims_transactions
CREATE TABLE IF NOT EXISTS `claims_transaction` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date_Of_Claim` datetime DEFAULT NULL,
  `date_Of_Incident` datetime DEFAULT NULL,
  `policy_No` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `cust_Forename` varchar(255) DEFAULT NULL,
  `cust_Surname` varchar(255) DEFAULT NULL,
  `claim_Amount` decimal(19,2) DEFAULT NULL,
  `claim_Reason` varchar(255) DEFAULT NULL,
  `claim_Type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4824 DEFAULT CHARSET=latin1;

-- Dumping data for table speedyclaims.claims_transaction: ~4,796 rows (approximately)
/*!40000 ALTER TABLE `claims_transaction` DISABLE KEYS */;
/*INSERT INTO `cctransactions` (`id`, `amount`, `country`, `currency`, `date`, `order_id`, `tax_code`, `tax_rate`, `type`) VALUES */
INSERT INTO `claims_transaction` (`id`,`date_Of_Claim`,`date_Of_Incident`,`policy_No`,`title`,`cust_Forename`,`cust_Surname`,`claim_Amount`,`claim_Reason`,`claim_Type`) VALUES
	(1, '2016-12-30 00:00:00', '2016-12-31 00:00:00', 'A21253627', 'Mr', 'Mickey', 'Spillane', 475.00, 'Cat operation','Pet'),
	(2, '2021-12-02 00:00:00', '2021-12-01 00:00:00', 'B21233627', 'Mrs', 'Maeve', 'Spillane', 500.00, 'Dog operation','Pet'),
	(3, '2021-12-03 00:00:00', '2021-12-02 00:00:00', 'C21213637', 'Ms', 'Maura', 'Spillane', 345.00, 'Spilt milk on couch','Home'),
	(4, '2021-12-04 00:00:00', '2021-12-04 00:00:00', 'A21213637', 'Mrs', 'Michelle', 'Spillane', 375.00, 'Scratches','Motor'),
	(5, '2021-12-05 00:00:00', '2021-12-03 00:00:00', 'B21213626', 'Mr', 'Mickey', 'Dillane', 375.00, 'Tyres','Motor'),
	(6, '2021-12-06 00:00:00', '2021-12-05 00:00:00', 'C21213647', 'Ms', 'Michele', 'Dillane', 375.00, 'Cat operation','Pet'),
	(7, '2021-12-07 00:00:00', '2021-12-07 00:00:00', 'D21213427', 'Mr', 'Mohammed', 'Salah', 375.00, 'Broken TV','Home'),
	(8, '2021-12-08 00:00:00', '2021-12-08 00:00:00', 'A21214627', 'Mrs', 'Mary', 'Murphy', 35.00, 'Hamster operation','Pet'),
	(9, '2021-12-09 00:00:00', '2021-12-08 00:00:00', 'A21243627', 'Mr', 'Luke', 'Wells', 125.00, 'Battery','Motor'),
	(10, '2016-12-30 00:00:00', '2021-12-30 00:00:00', 'B24213627', 'Mr', 'Javier', 'Vasquez', 175.00, 'Broken window','Home');
	
	/*!40000 ALTER TABLE `claims_transaction` ENABLE KEYS */

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */
/*paymentscctransactionscctransactionscctransactionscctransactionsaccountsaccountsfleetmanemployeeemployeecctransactions*/
