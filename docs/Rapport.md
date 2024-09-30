Enzo GUIGNOLLE

# Compte-Rendu des TPs

## TP1
### Première séance de TP (20/09)

Durant cette première séance de TP, nous devions travailler sur un code réalisé en Java
qui permettait d'afficher une fenêtre et dans cette fenêtre un carré s'afficher et bougeait 
de la droite vers la gauche en utilisant la programmation répartie. Le code que nous avions 
pour commencer à travailler ressemblait à ce diagramme de classe UML :

<img src="images/diagrammeTP1.jpg" width="400" height="310" alt="diagramme de classe UML représentant le code sur lequel nous devions travailler durant la séance 1">

Pour permettre de faire bouger le carré, mais en utilisant la programmation répartie. Nous devions 
alors faire un objet runnable donc sur ce code, c'est **UnMobile** qui a implanté l'interface Runnable et
qui peut être exécuter par un thread. Après avoir créé cet objet Runnable, nous devons l'ajouter 
dans la fenêtre pour permettre de le voir se déplacer de ce fait, nous devions instancier l'objet dans le champ 
**sonMobile** de **UneFenetre** et ensuite de l'ajouter à la fenêtre une fois l'objet instancier. 
Ensuite, nous devions ajouter sonMobile à un thread pour qu'il puisse être executé. Et ensuite, nous devions start
le Thread pour qu'il puisse être lancé. Le code ajouté ressemblait à cela : 

<img src="images/ajoutCodeTP1.jpg" width="400" height="154" alt="code ajouté pour permettre de réalisé ce qui était demander">

### Deuxième séance de TP (27/09)

Dans cette deuxième séance de TP, nous devions ajouter la classe Thread dans le diagramme UML. Donc le diagramme UML
ressemble maintenant à cela : 

<img src="images/diagrammeV2TP1.jpg" width="400" height="310" alt="diagramme de classe UML représentant le code sur lequel nous devions travailler durant la séance 2">

Nous devions aussi faire en sorte que sonMobile aille de droite à gauche après avoir atteint le bord de la fenêtre.
Pour faire cela, nous devions modifier la méthode run de la classe sonMobile en rajoutant une boucle où il part de l'endroit
où il touche le bord en enlevant sonPas. Donc maintenant la méthode run de sonMobile ressemble à ça :

<img src="images/ajoutCodeTP1_2.jpg" width="400" height="154" alt="code ajouté pour permettre de réalisé ce qui était demander dans la methode run">

Ensuite, nous devions faire en sorte de tester le cycle de vie d'un thread en mettant du thread *en attente* et ensuite de le remettre *en execution*
en appuyant sur un bouton. Donc pour réaliser cela, j'ai dû ajouter une petite partie de code qui permet de vérifier l'état du thread pour savoir s'il
est *en exécution* ou *en attente*. Voici ce que j'ai fait :

<img src="images/ajoutCodeTP1_3.jpg" width="400" height="184" alt="code ajouté pour permettre de réalisé ce qui était demander dans la methode run">

Donc j'ai du récupéré l'état du thread pour vérifier qu'il soit bien en exécution. Cependant par le faite que dans les boucles de la méthode run
de l'utilisation de *Thread.sleep*, l'état du thread que j'ai du récupérer est *TIMED_WAITING* qui est un état en java où le thread attend pour une durée
determiné la suite de ces instructions.

### Troisième séance de TP (04/10)

