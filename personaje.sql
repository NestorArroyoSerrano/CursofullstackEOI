-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-03-2023 a las 14:01:20
-- Versión del servidor: 10.4.16-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `harry_potter`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personaje`
--

CREATE TABLE `personaje` (
  `id` varchar(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `species` varchar(200) DEFAULT NULL,
  `gender` varchar(200) DEFAULT NULL,
  `house` varchar(200) DEFAULT NULL,
  `dateOfBirth` date DEFAULT NULL,
  `yearOfBirth` int(11) DEFAULT NULL,
  `wizard` tinyint(1) DEFAULT NULL,
  `ancestry` varchar(200) DEFAULT NULL,
  `eyeColour` varchar(200) DEFAULT NULL,
  `hairColour` varchar(200) DEFAULT NULL,
  `patronus` varchar(200) DEFAULT NULL,
  `hogwartsStudent` tinyint(1) DEFAULT NULL,
  `hogwartsStaff` tinyint(1) DEFAULT NULL,
  `actor` varchar(200) DEFAULT NULL,
  `alive` tinyint(1) DEFAULT NULL,
  `image` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `personaje`
--
ALTER TABLE `personaje`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
