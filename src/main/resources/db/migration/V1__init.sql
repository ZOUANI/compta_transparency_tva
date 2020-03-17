-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 17 mars 2020 à 17:38
-- Version du serveur :  10.4.11-MariaDB
-- Version de PHP : 7.4.1

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `compta_transparency_tva`
--

-- --------------------------------------------------------

--
-- Structure de la table `etat_tva`
--

CREATE TABLE `etat_tva` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Structure de la table `taux_tva`
--

CREATE TABLE `taux_tva` (
  `id` bigint(20) NOT NULL,
  `date_application_debut` datetime DEFAULT NULL,
  `date_application_fin` datetime DEFAULT NULL,
  `majoration` decimal(16,4) DEFAULT NULL,
  `penalite` decimal(16,4) DEFAULT NULL,
  `percentage` decimal(16,4) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `tva`
--

CREATE TABLE `tva` (
  `id` bigint(20) NOT NULL,
  `anne` int(11) DEFAULT NULL,
  `date_creation` datetime DEFAULT NULL,
  `date_saisie` datetime DEFAULT NULL,
  `date_validation` datetime DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `difference_tva` decimal(16,4) DEFAULT NULL,
  `honoraire` decimal(16,4) DEFAULT NULL,
  `majoration` decimal(16,4) DEFAULT NULL,
  `mantant_base_tva` decimal(16,4) DEFAULT NULL,
  `mantant_majoration` decimal(16,4) DEFAULT NULL,
  `mantant_penalite` decimal(16,4) DEFAULT NULL,
  `mantant_retard` decimal(16,4) DEFAULT NULL,
  `mantant_tva` decimal(16,4) DEFAULT NULL,
  `montant_total` decimal(16,4) DEFAULT NULL,
  `nomber_mois_retard` int(11) DEFAULT NULL,
  `penalite` decimal(16,4) DEFAULT NULL,
  `periode` int(11) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `reference_comptable_createur` varchar(255) DEFAULT NULL,
  `reference_comptable_validateur` varchar(255) DEFAULT NULL,
  `reference_societe` varchar(255) DEFAULT NULL,
  `tva_collectee` decimal(16,4) DEFAULT NULL,
  `tva_deductible` decimal(16,4) DEFAULT NULL,
  `etat_tva` bigint(20) DEFAULT NULL,
  `type_tva` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `tva_facture`
--

CREATE TABLE `tva_facture` (
  `id` bigint(20) NOT NULL,
  `reference_facture` varchar(255) DEFAULT NULL,
  `reference_societe` varchar(255) DEFAULT NULL,
  `tva` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `type_tva`
--

CREATE TABLE `type_tva` (
  `id` bigint(20) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `etat_tva`
--
ALTER TABLE `etat_tva`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `taux_tva`
--
ALTER TABLE `taux_tva`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `tva`
--
ALTER TABLE `tva`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKclvc73a9hml3utygkqh0lu3lh` (`etat_tva`),
  ADD KEY `FKqku176qbx3vl1p2nxuh09309b` (`type_tva`);

--
-- Index pour la table `tva_facture`
--
ALTER TABLE `tva_facture`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK4x580gducdpetdu7rmev7xfps` (`tva`);

--
-- Index pour la table `type_tva`
--
ALTER TABLE `type_tva`
  ADD PRIMARY KEY (`id`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
