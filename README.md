# htmlCSSExercice
Travaux pratiques

Voici un bout de code HTML qui présente à la fois le code d’un caractère et une représentation de celui-ci sous la forme d’une entité HTML (dérivée du SGML). Une entité HTML est une série de caractères qui représentent un autre caractère (appelée également référence de caractère).

La syntaxe générale d’une entité est composée de 4 symboles réunis (sans espace): &#n; où n représente le code décimal du caractère en question. Par exemple &#64 désigne le caractère @ (64 est l’index de ce caractère dans la table unicode)

...
<h1>TABLE DE CARACTERES</h1>
<table>
<tbody>
<tr> <td><div>64</div> <div>&#64;</div> </td>
     <td><div>65</div> <div>&#65;</div></td>
</tr>
</tbody>
</table>
...

Exemple de rendu par le navigateur : codeCar64et65

1/ Concevoir un programme qui présente la table de caractères de 0 à 255 : Attention, avant 32 les codes ne sont pas représentables (ce sont des codes de contrôles), vous devrez donc trouver une façon de les représenter et/ou les différencier. Vous devrez séparer ce qui est de l’ordre de la structuration des données (document HTML) des instructions de présentation (CSS). Pour mettre en forme les cellules du tableau (les td) n’hésitez pas à jouer sur les bordures.

Voir :

    border-style

    couleurs de fond et autres paramètres comme margin

	ne pas présenter l’ensemble de 255 caractères sur une seule ligne (un seul <tr>) !

2/ Votre application devra permettre à l’utilisateur de :

    Choisir une représentation des codes numériques en : décimal ou hexadécimal

    La possibilité de sélectionner de 1 à plusieurs plages prédéfinies Voir unicode charts, par exemple parmi  (prévoir des liens préparés):

arabe
tibetain
katakana
hiragana

ou explicite (debut et fin, titre) – prévoir un formulaire afin de recueillir ces données :

debut (un entier : indice de début de la plage à présenter)
fin   (un entier : indice de fin de la plage)
titre (chaîne, affichée en début du tableau de caractères)

