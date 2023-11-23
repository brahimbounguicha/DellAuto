# Grpoue PSFormation

Feature: Home Dell

Scenario: Selectionner un produit 
Given admin is on HomePage
When admin mouseHover on menu "Ordinateurs et accessoires" and submenu "Ordinateurs portables"
And admin click on Produit "Ordinateurs portables XPS"
Then admin is directed to the page "Ord XPS"
