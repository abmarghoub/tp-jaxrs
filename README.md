---

# TP 7 : JAXRS / Jersey

---

## Réalisé par

**Abla MARGHOUB**

## Encadré par

**Pr. Mohamed LACHGAR**

## Module

**Techniques de Programmation Avancée**

## Établissement

**École Normale Supérieure - Université Cadi Ayyad**

---
# 1. Objectif du TP

L’objectif principal de ce TP est de :

Mettre en œuvre un microservice RESTful avec Spring Boot.

Manipuler une base de données H2 en mémoire à l’aide de Spring Data JPA.

Exposer des endpoints REST via Jersey (JAX-RS).

Gérer la sérialisation en JSON et XML.

Initialiser la base de données au démarrage avec des données aléatoires.
# 2. Architecture technique
## 2.1 Stack technologique
| Composant           | Technologie utilisée                               |
| ------------------- | -------------------------------------------------- |
| Langage             | **Java 21**                                       |
| Accès aux données   | **Spring Data JPA**                                |
| Base de données     | **H2 (en mémoire)**                                |
| API REST            | **Jersey (JAX-RS)**                                |
| Outil de génération | **Spring Initializr**                              |
| Outils de test      | **SoapUI**                               |
| Lombok              | Pour la génération automatique des getters/setters |
| Formats d’échange   | **JSON** et **XML**                                |
## 2.2 Structure du TP
<img width="524" height="748" alt="image" src="https://github.com/user-attachments/assets/77ea205e-8d52-4b73-a59c-3172098481bc" />

# 3. Base de données

L’application utilise une base de données H2 en mémoire, configurée dans application.properties :

<img width="525" height="110" alt="image" src="https://github.com/user-attachments/assets/e1e5fad3-afb4-4f45-9f51-6171999bc565" />

**L’accès à la console H2 se fait via :** http://localhost:8082/h2-console

 <img width="710" height="486" alt="101" src="https://github.com/user-attachments/assets/857ff237-a8a4-4096-89d9-4674e138bb16" />
 <img width="737" height="454" alt="102" src="https://github.com/user-attachments/assets/b6d2cf62-85c1-4e80-b35a-1321370ab7f1" />

 # 4. Fonctionnalités principales

L’application permet d’effectuer toutes les opérations CRUD sur les comptes bancaires :
| Fonctionnalité                | Méthode HTTP | Endpoint               | Description                                 |
| ----------------------------- | ------------ | ---------------------- | ------------------------------------------- |
|  Consulter tous les comptes | GET          | `/banque/comptes`      | Retourne la liste des comptes (JSON/XML)    |
|  Créer un nouveau compte     | POST         | `/banque/comptes`      | Ajoute un nouveau compte                    |
|  Modifier un compte         | PUT          | `/banque/comptes/{id}` | Met à jour les informations d’un compte     |
|  Supprimer un compte         | DELETE       | `/banque/comptes/{id}` | Supprime un compte de la base               |

# 5. Tests SOAP
 ## 5.1 Tests au format JSON
 **Méthode HTTP GET**
<img width="972" height="501" alt="GET JSON" src="https://github.com/user-attachments/assets/2eb84fe7-544d-4cba-8164-e74244fb186b" />
 **Méthode HTTP POST**
<img width="1155" height="477" alt="POST JSON" src="https://github.com/user-attachments/assets/4ddb46b5-8394-4b67-9b44-b16c377afd33" />
**Méthode HTTP DELETE**
<img width="1184" height="528" alt="DELETE JSON" src="https://github.com/user-attachments/assets/dab13e4c-9863-4751-b464-aadd2985ffd0" />
## 5.2 Tests au format XML
 **Méthode HTTP GET**
<img width="1167" height="587" alt="GET XML" src="https://github.com/user-attachments/assets/65d3d9a4-bdb8-4aea-a7ad-a64c139e4136" />
**Méthode HTTP POST**
<img width="1198" height="509" alt="POST XML" src="https://github.com/user-attachments/assets/9059e046-9ef1-4a31-9631-50afb5046bd8" />
**Méthode HTTP PUT**
<img width="1193" height="585" alt="PUT XML" src="https://github.com/user-attachments/assets/be1db48c-995f-4815-ac6f-6a64be7ce589" />
**Méthode HTTP DELETE**
<img width="1200" height="606" alt="DELETE XML" src="https://github.com/user-attachments/assets/366e0ccc-9407-42d3-93b3-c7aea03ba83a" />



