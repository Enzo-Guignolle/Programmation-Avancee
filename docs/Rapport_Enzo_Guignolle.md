Enzo GUIGNOLLE

<div align="center">
<img height="95" width="400" src="images/IUT_Velizy_Villacoublay_logo_2020_ecran.png" title="logo uvsq vélizy"/>
</div>

# Compte-Rendu des TPs

### [Introduction](#I)
### [Première séance de TP](#II)
### [Deuxième séance de TP](#III)
### [Troisième séance de TP](#IV)
### [Quatrième séance de TP](#V)
### [Cinquième séance de TP](#VI)



### <a name="I"></a> Introduction

Ce document permet de synthétisé ce que je réalisé en TP de programmation avancé pour que je puisse savoir chaque chose comment je l'ai réalisés.

Avant de commencer je vais commencer par faire le résumé des spécifications des ordinateurs que j'ai utilisé pour réalisé ces TP.

| Salle |                     Processeur                     |   RAM    | Nombre de coeur | Nombre de Thread | Hyperthearding |
|:-----:|:--------------------------------------------------:|:--------:|:---------------:|:----------------:|:--------------:|
|  I21  | Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz   3.60 GHz | 16.00 Go |    4 coeurs     |    8 threads     |      Oui       |
|  G24  | Intel(R) Core(TM) i7-9700 CPU @ 3.00GHz   3.00 GHz | 32.00 Go |    8 coeurs     |    8 threads     |      Non       |


### <a name="II"></a> Première séance de TP (20/09)

Durant cette première séance de TP, nous devions travailler sur un code réalisé en Java qui permettait d'afficher une fenêtre et dans cette fenêtre un carré s'afficher et bougeait 
de la droite vers la gauche en utilisant la programmation répartie. Le code que nous avions pour commencer à travailler ressemblait à ce diagramme de classe UML :

<img src="images/TP1/diagrammeTP1.jpg" width="400" height="310" alt="diagramme de classe UML représentant le code sur lequel nous devions travailler durant la séance 1">

*figure 1 : Diagramme de classe du TP1 version 1*

Pour permettre de faire bouger le carré, mais en utilisant la programmation répartie. Nous devions alors faire un objet runnable donc sur ce code, c'est **UnMobile** qui a implanté l'interface Runnable et qui peut être exécuter par un thread. Après avoir créé cet objet Runnable, nous devons l'ajouter 
dans la fenêtre pour permettre de le voir se déplacer de ce fait, nous devions instancier l'objet dans le champ 
**sonMobile** de **UneFenetre** et ensuite de l'ajouter à la fenêtre une fois l'objet instancier. <br>
Ensuite, nous devions ajouter sonMobile à un thread pour qu'il puisse être executé. Et ensuite, nous devions start
le Thread pour qu'il puisse être lancé. Le code ajouté ressemblait à cela : 

<img src="images/TP1/ajoutCodeTP1.jpg" width="400" height="154" alt="code ajouté pour permettre de réalisé ce qui était demander">

*figure 2 : Ajout du code pour afficher le mobile*

### <a name="III"></a> Deuxième séance de TP (27/09)

Dans cette deuxième séance de TP, nous devions ajouter la classe Thread dans le diagramme UML. Donc le diagramme UML
ressemble maintenant à cela : 

<img src="images/TP1/diagrammeV2TP1.jpg" width="400" height="310" alt="diagramme de classe UML représentant le code sur lequel nous devions travailler durant la séance 2">

*figure 3 : Diagramme de classe du TP1 version 2*

Nous devions aussi faire en sorte que sonMobile aille de droite à gauche après avoir atteint le bord de la fenêtre.
Pour faire cela, nous devions modifier la méthode run de la classe sonMobile en rajoutant une boucle où il part de l'endroit
où il touche le bord en enlevant sonPas. Donc maintenant la méthode run de sonMobile ressemble à ça :

<img src="images/TP1/ajoutCodeTP1_2.jpg" width="400" height="154" alt="code ajouté pour permettre de réalisé ce qui était demander dans la methode run">

*figure 4 : Mofication du code dans la méthode run de UnMobile*

Ensuite, nous devions faire en sorte de tester le cycle de vie d'un thread en mettant *en attente* et ensuite de le remettre *en execution* en appuyant sur un bouton. Donc pour réaliser cela, j'ai dû ajouter une petite partie de code qui permet de vérifier l'état du thread pour savoir s'il est *en exécution* ou *en attente*. <br>
Voici ce que j'ai fait :

<img src="images/TP1/ajoutCodeTP1_3.jpg" width="400" height="184" alt="code ajouté pour permettre de réalisé ce qui était demander dans la methode run">

*figure 5 : Code d'ajout du bouton pour arreté ou pas le mobile*

Donc j'ai dû récupéré l'état du thread pour vérifier qu'il soit bien en exécution. Cependant par le faite que dans les boucles de la méthode run
de l'utilisation de *Thread.sleep*, l'état du thread que j'ai dû récupérer est *TIMED_WAITING* qui est un état en java où le thread attend pour une durée determiné la suite de ces instructions. Quand nous étions à l'IUT, j'avais tester et cela ne marchait pas et cela me mettait une erreur donc j'ai voulu tester de réglé le problème de mon coté sur mon ordinateur. Et mon code a marché sans que je comprenne pourquoi et en réfléchissant j'ai découvert que l'IUT avais la dernière version de Java et par conséquent nous ne pouvions plus utilisé ces méthode dans la version 22 de Java puisque sur mon ordinateur j'ai une version plus vielle.

### <a name="IV"></a> Troisième séance de TP (04/10)

Durant cette troisième séance de TP, nous devions réfléchir à faire marcher le suspend et resume dans la version 22 de Java. Donc pour cela nous pouvions mettre suspend
dans la méthode run de la classe UnMobile. Mais nous ne pouvions pas faire de resume car le thread n'était plus en activité.<br>
Ensuite nous devions faire en sorte que plusieurs mobile soit sur la fenêtre et bouge en même temps et pas à la même vitesse. Donc pour réalisé cela j'ai dû modifier le code de cette façon : 

J'ai commencé par ajouter deux liste pour enregistrer chaque mobile et chaque thread associé à chaque mobile

<img src="images/TP1/ajoutCodeTP1_4_p1.jpg" width="300" height="48.5" alt="code ajouté pour permettre de réalisé plusieurs mobile qui bouge, classe UneFenetre">

*figure 6 : Code permettant de créer les champs pour mettre plusieurs mobiles*

Ensuite j'ai créé chaque mobile et associé chaque mobile à un thread distinct et je les ajoute chacun dans leur liste respectif et change aussi le layout de la fenêtre en la mettant en grille.

<img src="images/TP1/ajoutCodeTP1_4_p2.jpg" width="400" height="182,6" alt="code ajouté pour permettre de réalisé plusieurs mobile qui bouge, classe UneFenetre">

*figure 7 : Code permettant d'associer UnMobile a son thread*

Et je finis par faire une boucle pour ajouter chaque mobile à la fenêtre et mettre en exécution chaque thread de chaque mobile.

<img src="images/TP1/ajoutCodeTP1_4_p3.jpg" width="400" height="102,3" alt="code ajouté pour permettre de réalisé plusieurs mobile qui bouge, classe UneFenetre">

*figure 8 : Code permettant d'ajouter plusieurs mobiles à la fenêtre*

Dans la deuxième partie de la séance nous devions travailler sur le TP 2 qui permet de jouer avec des mots et les afficher dans le bonne ordre et eviter que des mots se chevauche. Le code sur lequel nous devions travailler ressemble à cela : 

<img src="images/TP2/diagrammeTP2.jpg" width="425" height="300" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 9 : Diagramme de classe du TP2*

Donc dans ce code nous avons deux thread qui sont indépendant l'un de l'autre et qui veulent accéder à la même ressource critique. Donc pour pouvoir éviter qu'ils y accèdent en même temps nous devons déterminer la section critique que nous allons devoir synchroniser pour que chacun son tour ils y accèdent. Pour ce code, la section critique est la boucle for de la méthode run de la classe Affichage puisque la ressource que chaque Thread veut accéder est *System.out*.<br>
Pour pouvoir les synchroniser nous avons deux méthodes, la première méthode est de mettre le mot-clé *synchronised* avec soit entre parenthèse une classe vide ou alors de mettre la ressources critique qu'il veulent accéder donc là *System.out*.<br><br>
La deuxième méthode est l'utilisation d'un sémaphore. Pour cela nous avions un code donné dont je vais décrire son fonctionnement. Avant de décrire sont fonctionnement, un sémaphote utilise 2 méthodes qui sont la méthode Wait() pour faire patienter un ou plusieurs thread(s) si un thread est déjà dans la section critique. La deuxième méthode est la méthode Signal() qui permet d'avertir le thread qui est dans la section critique libère l'accès à la ressource à un thread. Donc pour réaliser un sémaphore la section critique commence toujours par un Wait et finit toujours pas un Signal.
<br>
Maintenant je vais décrire les différentes classe pour réaliser un sémaphore binaire. Donc tout d'abord nous avons la classe semaphoreBinaire qui hérite de la classe semaphore, elle possède son constructeur et la méthode *syncSignal()*. Dans le constructeur de la classe, on doit mettre en paramètre une valeur initial qui est soit 0 soit différent de 0 ensuite elle le donne à la classe mère sémaphore, en fonction de si c'est 0 ou pas, j'expliquerai son fonctionnement ci-après. Dans la méthode syncSignal(), elle appel la méthode syncSignal de la classe mère et si la valeur est supérieur à 1 elle met la valeur à 1.
<br>
Maintenant dans la classe semaphore, nous avons le constructeur de la classe et deux méthode qui sont syncWait() et syncSignal(). Dans le constructeur nous allons mettre dans la valeur qui est un champ de la classe, la valeur initial rentrée en paramètre donc dans ce cas là, la valeur initial envoyer par la classe semaphoreBinaire. <br>
Dans la méthode syncWait(), nous avons une boucle while qui vérifie si la valeur qui est dans le champ de la classe est inférieur et égal à 0 donc si on mets la valeur à 1 le premier thread ne rentre pas dans la boucle while et les autres thread y seront tant que l'autre thread n'aura pas terminé ce qu'il a à faire. Cependant si la valeur donné au début est 0 tout les thread seront dans la boucle while et ne sortiront jamais de la boucle. Après quand un thread n'est plus dans la boucle, on enlève -1 à la boucle. <br>
Dans la méthode syncSignal(), on commence par ajouter +1 à la valeur en champ et il préviens les autres threads que la place est libre.

### <a name="IV"></a> Quatrième séance de TP (11/10)

Durant la première partie de cette quatrième séance, nous avons dû retourner sur le TP 1 et faire en sorte de séparé la fenêtre en 3 parties où les mobiles se trouvent et que dans la partie centrale de la fenêtre un certains nombre de mobile on le droit de passé en même temps dès que la limite de mobile dans la zone est atteint, les autres mobiles qui veulent rentrer dedans doivent attendre qu'un mobile sorte. <br>
Pour réalisé cela nous avons dû reprendre la classe Cemaphore du TP2 et créer une classe CemaphoreGen pour permettre de sécurisé la section critique qui est la zone ou un certains nombre de mobile à le droit de passé en même temps. <br>
Voici la classe CemaphoreGen :

<img src="images/TP1/classeCemaphoreGen.JPG" width="350" height="195" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 10 : Code représentant la classe CemaphoreGen*

Après avoir récupérer la classe Cemaphore et créer la classe CemaphoreGen, nous avons dû modifier la méthode run de la classe UnMobile en mettant 6 boucles différentes en ayant 3 pour l'allée et 3 pour le retour avec la deuxième boucle pour l'aller et pour le retour qu'on délimite avec le semaphore pour bloquer le nombre de mobile.<br>

En deuxième partie de séance nous avons commencer le cours et le TP3 sur les moniteurs. Dans ce TP nous devons réalisé une boite au lettre c'est-à-dire qu'il y a une classe BAL, une classe Facteur et une classe Habitant, le Facteur peut mettre un lettre dans la BAL si elle est vide et l'habitant peut récupérer la lettre dans la bal si elle n'est pas vide.<br>
Pour réalisé cela j'ai dû faire une classe BAL, voici ce qu'il y a dedans : 

<img src="images/TP3/ClasseBAL.JPG" width="400" height="408.2" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 11 : Code représentant la classe BAL*


J'ai ensuite du réaliser une classe Facteur pour mettre une lettre dans la classe BAL, voici comment j'ai réalisé cela : 

<img src="images/TP3/ClasseFacteur.JPG" width="400" height="327" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 12 : Code représentant la classe Facteur version 1*

Pour finir, j'ai dû réaliser une classe Habitant pour récupérer la lettre mise dans la classe BAL, voici comment j'ai réalisé cela : 

<img src="images/TP3/ClasseHabitant.JPG" width="300" height="315.8" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 13 : Code représentant la classe Habitant version 1*

Voici le diagramme de classe que nous avons eu grâce à ce qui a été réalisé : 

<img src="images/TP3/diagrammeTP3.jpg" width="400" height="202" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 14 : Diagramme de classe du TP3*

### <a name="VI"></a> Cinquième séance de TP (18/10)

Durant la première partie de la cinquième séance nous devions commencer par finir la question 2 qui nous été demandé dans l'exercice 1 du TP 3 en utilisant la méthode interrupt mais j'ai aussi modifié mon code que j'avais réalisé pour utilisé une liste au lieu d'un tableau.
Voici la classe Facteur suite au modification : 

<img src="images/TP3/ClasseFacteurV2.JPG" width="300" height="318.9" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 15 : Code représentant la classe Facteur version 2*

Ensuite voici la classe Habitant suite au modification : 

<img src="images/TP3/ClasseHabitantV2.JPG" width="300" height="286" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 16 : Code représentant la classe Habitant version 2*

Et j'ai fini par modifier la méthode retirer de la classe BAL en ajoutant un return pour récupérer la lettre qui à été déposer.

Dans la deuxième partie du cours nous avons du aller voir la notion de API Concurrent dans le blog de Monsieur Paumard dont voici le lien https://blog.paumard.org/cours/java-api/chap05-concurrent-queues.html. 
Ce qui nous a permis de l'introduire et de tester l'API Concurrent avec le code qui nous était mis a disposition dans ce blog en réalisant quelques modifications. 
En testant le code nous nous sommes rendu compte que beaucoup de chose manquait et qui fallait le rajouter nous-même.<br>
Il fallait tout d'abord ajouter un champ boulangerie dans la classe Boulanger et de créer son contructeur donc la classe a fini par ressemblé à ça : 

<img src="images/TP3_API/ClasseBoulanger.JPG" width="500" height="365" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 17 : Code représentant la classe Boulanger*

Nous devions ensuite rajouter dans la classe Mangeur un champ boulangerie et un champ Random mais aussi de créer son constructeur ce qui nous permet d'avoir une classe qui ressemble à cela : 

<img src="images/TP3_API/ClasseMangeur.JPG" width="510" height="454.5" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 18 : Code représentant la classe Mangeur*

Après avoir réalisé toute ses modifications nous avons un diagramme de classe qui ressemble à cela : 

<img src="images/TP3_API/diagrammeTP3_API.jpg" width="500" height="423.7" alt="diagramme de classe UML représentant le code du TP2 sur lequel nous devions travailler durant la séance 3">

*figure 19 : Diagramme de classe du TP3 avec l'API Concurrent*

### <a name="VII"></a> Sixième séance de TP (25/10)