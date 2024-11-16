# Big O

Rules: 
- Drop Constraints exemplo:

- Tendo dois for loops não alinhados a complexidade seria O(2n), removemos a constraint e a complexidade é: O(n).

- Drop Non-Dominants, Se temos um método contendo um for alinhado, sua complexidade é de: O(n²), e se neste mesmo método existir outro for não alinhado na sequencia, eliminariamos ele pois o que mais importa é a complexidade dominante.

2³ = 8
log² 8 = 3 - Significa que se pegasse o numero oito e dividisse ele repetidas vezes por 2, para chegar ao um numero, levariamos tres operações.

- Constant Time O(1) somente uma operação. se um método faz duas operações dropamos a constante para 1, pois o tempo é constante, mesmo que a lista de entrada aumente, serão executadas duas operações somente, sem loop.


# Data Structures

Single LinkedList

## Complexity Operations

| Operacao         | Complexity  |
| --------         | ----------  |
| Append           | O(1)        |
| Remove Last      | O(n)        |
| Prepend          | O(1)        |
| Remove first     | O(1)        |
| Insert           | O(n)        |
| Remove           | O(n)        |
| Lookup by index  | O(n)        |
| Lookup by value  | O(n)        |

