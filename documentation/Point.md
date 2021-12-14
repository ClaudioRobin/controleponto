[Início](../README)

# POST /point

Registra um novo horário de entrada ou saída.

## Parâmetros

| Nome            | Requerido | Tipo    | Descrição                                                   |
| --------------- | --------- | ------- | ----------------------------------------------------------- |
| dateTime        | Sim       | string  | Data e hora do ponto, formato ISO yyyy-MM-dd HH:mm       |
| isEntry           | Não       | boolean | Especifica se é um horário de entrada ou saída              |

## Erros

| HTTP status     | Código             | Descrição                                                    |
| --------------- | ------------------ | ------------------------------------------------------------ |
| 400 Bad Request | DATA_TIME_INVALID  | Formato ISO inválido                                         |
| 400 Bad Request | OVERLAPPING_PERIOD | O ponto não pode sobrepor um perído de entrada e saída    |
| 400 Bad Request | ENTRY_INVALID      | A ordem dos pontos deve ser sempre entrada seguida de saída  |

## Mais informações

### Parâmetros

- isEntry: Especifica se é um horário de entrada ou saída, caso não especificado, o sistema determinará automaticamente.

### Erros

- OVERLAPPING_PERIOD: O ponto não pode sobrepor um perído de entrada e saída, retorna o perído sobreposto.
    - **overlap_start**: Data e horário de início do perído de sobreposição, formato yyyy-MM-dd HH:mm
    - **overlap_end**: Data e horário de fim do perído de sobreposição, formato yyyy-MM-dd HH:mm

