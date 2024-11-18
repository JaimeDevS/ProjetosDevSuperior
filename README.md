# Anotações

[Spring Start](https://start.spring.io/)

[h2-console](http://localhost:8080/h2-console/)

## Resumo do capítulo 2
### Modelo de Domínio e ORM

__OBS 1:__ quando há uma ligação N x N entre as classes não é obrigatório criar uma classe de associação

__OBS 2:__  a classe de associação numa relação N x N só é necessário quando a classe (tabela) de associação gravar 
informações a mais além das PK's da relação N X N
EX: pk1, pk2, dataHora, Valor
nesse exemplo nequela data em que a informação foi gravada o produto tinha um valor, após esta data o produto pode ter outro 
valor

__OBS 3:__  quando primary key da tabela for composta por mais de um campo é necessário criar uma classe contendo as PK's

__OBS 4:__  O tipo ENUM por padrão já compara objetos com equals
