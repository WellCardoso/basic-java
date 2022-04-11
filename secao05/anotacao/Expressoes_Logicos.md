# Expressões Comparativas

### Operadores:
```
>
<
<=
>=
==
!=
```



# Expressões Lógicas

| Operador | Significado |
|----------|-------------|
| &&       | E           |
| l l      | OU          |
| !        | NÃO         |


### Exemplos de operações lógicas E
```
1) X <= 20 && x == 10, sendo que x vale 5 = FALSO
2) X > 0 && x != 3, sendo que x vale 5 = VERDADEIRO
3) X >= 20 && x == 10 && x != 3, sendo que x vale 5 = FALSO
```
## Tabela verdade do operador E

| A   | B   | A && B | 
|-----|-----|--------|
| F   | F   | F      |
| V   | F   | F      |
| F   | V   | F      |
| V   | V   | V      |


### ------------------------------------------------------------------------


### Exemplos de operações lógicas OU
```
1) X == 10 || x <= 20, sendo que x vale 5 = VERDADEIRO
2) X > 0 || x != 3, sendo que x vale 5 = VERDADEIRO
3) X <= 0 || x != 3 || x != 5, sendo que x vale 5 = VERDADEIRO
```

## Tabela verdade do operador OU

| A   | B   | A l l B | 
|-----|-----|---------|
| F   | F   | F       |
| V   | F   | V       |
| F   | V   | V       |
| V   | V   | V       |

### -----------------------------------------------------------------------------

### Exemplos de operações lógicas NÃO
```
1) X == 10 || x <= 20, sendo que x vale 5 = VERDADEIRO
2) X > 0 || x != 3, sendo que x vale 5 = VERDADEIRO
3) X <= 0 || x != 3 || x != 5, sendo que x vale 5 = VERDADEIRO
```