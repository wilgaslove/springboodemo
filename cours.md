## @RestController

Lorsqu'une classe est annotée avec `@RestController`, Spring considère que chaque méthode de cette classe renvoie des données à représenter directement dans le corps de la réponse HTTP en tant que données JSON (ou XML).


## Les méthodes à définir sur un objet java

### equals()
Cette méthode permet de comparer l'objet courant avec un autre objet passé en argument pour déterminer s'ils sont égaux ou non.

### hashCode()
Cette méthode retourne un code de hachage (numéro calculé à partir des valeurs internes de l'objet) entier pour l'objet. Il es important que si deux objets sont égaux selon la méthode `equales()`, Ils aient le même code de hachage.


### toString()

Cette méthode retourne une chaîne de caractyres représentant l'objet. Il est recommandé de redéfinir cette méthode dasn nos classes pour retourner une représentation plus siginicative de l'objet.

## Bean 
Un bean est l'instance d'une classe qui est automatiquement gérer par Java.

