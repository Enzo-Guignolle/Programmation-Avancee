Enzo GUIGNOLLE

# Compte-Rendu des TPs

## TP1
### Exercice 1

Durant cette première séance de TP, nous devions travailler sur un code réalisé en Java
qui permettait d'afficher une fenêtre et dans cette fenêtre un carré s'afficher et bougeait 
de la droite vers la gauche en utilisant la programmation répartie. Le code que nous avions 
pour commencer à travailler ressemblait à ce diagramme de classe UML :

<img src="images/diagrammeTP1.jpg" width="400" height="310" alt="diagramme de classe UML représentant le code sur lequel nous devions travailler">

Pour permettre de faire bouger le carré, mais en utilisant la programmation répartie. Nous devions 
alors faire un objet runnable donc sur ce code, c'est **UnMobile** qui a implanté l'interface Runnable et
qui peut être executer par un thread. Après avoir créé cet objet Runnable, nous devons l'ajouter 
dans la fenêtre pour permettre de le voir se déplacer de ce fait, nous devions instancier l'objet dans le champ 
**sonMobile** de **UneFenetre** et ensuite de l'ajouter à la fenêtre une fois l'objet instancier. 
Ensuite, nous devions ajouter sonMobile à un thread pour qu'il puisse être executé. Et ensuite, nous devions start
le Thread pour qu'il puisse être lancé. Le code ajouté ressemblait à cela : 

<img src="images/ajoutCodeTP1.jpg" width="400" height="154" alt="code ajouté pour permettre de réalisé ce qui était demander">