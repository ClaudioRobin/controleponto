[Início](../README.md)

# POST /point

Registra um novo ponto.

## Parâmetros

| Nome            | Requerido | Tipo    | Descrição                                                   |
| --------------- | --------- | ------- | ----------------------------------------------------------- |
| dateTime        | Sim       | string  | Data e hora do ponto, formato ISO yyyy-MM-dd HH:mm          |
| note            | Não       | string  | Observação sobre o ponto                                    |

## Erros

| HTTP status     | Código             | Descrição                                                    |
| --------------- | ------------------ | ------------------------------------------------------------ |
| 400 Bad Request | DATA_TIME_INVALID  | dateTime com formato inválido ISO                            |

