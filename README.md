# SOLID principles

## S - Single Responsibility Principle

Une classe doit avoir une seule responsabilité. Si une classe a plusieurs responsabilités, il peut y avoir plus facilement des régressions car les modifications nécessaires relatives à une responsabilité vont potentiellement impacter les autres de la classe.

## O - Open/closed principle

Une classe doit-être fermée à la modification mais ouverte à l'extension. Cela évite la regression suite à l'ajout de nouvelles fonctionalités.

## L - Liskov’s Substitution Principle

On doit pouvoir remplacer les classes filles par la classe parent sans que cela brise l'application au runtime.

## I - Interface Segregation Principle

Une interface doit représenter un seul rôle afin que les clients n'aient pas à implémenter des comportements qu'ils n'ont pas besoin.

## D - Dependency Inversion Principle

Les modules haut niveau ne doivent pas dépendre des modules bas niveau mais de leurs abstractions.
