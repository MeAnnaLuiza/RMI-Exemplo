# Exemplo de implementação RMI

A comunicação entre sistemas distribuídos é uma parte essencial da computação
moderna. O Remote Method Invocation (RMI) é uma tecnologia que permite a
execução remota de métodos de objetos em sistemas distribuídos em Java,
através do uso de objetos e interfaces remotas. O RMI é uma maneira poderosa
de permitir a comunicação e interação entre aplicativos distribuídos em uma
rede. Nesta atividade prática, foi implementado um programa RMI cujo objetivo
é calcular as raízes de uma equação de segundo grau, conhecida como a fórmula
de Bhaskara.
A fórmula de Bhaskara é usada para calcular as raízes de uma equação
quadrática da forma EQUACAO , em que a, b e c são os coeficientes
reais. A fórmula é dada por:

$$
x = \frac{-b \pm \sqrt{b^2 - 4ac}}{2a}
$$

Neste contexto, um cliente envia valores das variáveis a, b e c da função para
um servidor, que executa o cálculo e retorna como resultados para o cliente,
as raízes da função.

## Requisitos

A implementação foi feita utilizando o sistema operacional Linux Ubuntu (22.04.3 LTS). É necessário instalar o compilador Java (parte do Java Development Kit - JDK) e o Java RMI (Remote Method Invocation). Para isso, é possível utilizar os comandos abaixo:

```bash
  sudo apt update
  sudo apt install default-jdk
```

Para verificar se os pacotes foram instalados corretamente, execute os seguintes comandos abaixo. Para o JDK, deve ser exibida a versão do pacote; já o RMI será iniciado na porta padrão 1099.

```bash
  javac -version
  rmiregistry
```

## Implementação

Os arquivos implementados são o servidor, o cliente, a interface que define os contratos e o arquivo que contém a definição dos métodos remotos responsáveis pelo cálculo da função. Antes de executar os arquivos, primeiro é necessário compilá-los. Em um terminal, acesse a pasta 'Servidor' e execute os comandos abaixo. O primeiro comando abaixo é utilizado para compilar os arquivos na pasta, caso não haja erros, o comando não retorna nenhuma mensagem. O segundo é necessário para obter uma porta local disponível para uso, que deve ser alterada no arquivo do cliente. Já o último é utilizado para, de faot, subir o ambiente do servidor; caso não haja erros, a mensagem "Servidor Pronto!" deve aparecer.

```bash
  javac *.java
  rmiregistry &
  java Server
```

Após alterar o aquivo do cliente com a porta correspondente, é necessário compilá-lo e, após isso, subir o ambiente. Para isso, execute os comandos abaixo. Caso não haja erros, o cliente diretamente vai exibir a mensagem para inserção das variáveis. 

```bash
  javac *.java
  java Client
```

Após esses passos, a conexão já estára estabelecida e então é possível fazer os cálculos. Um exemplo da teste é:

```text
CLIENTE
  Entre com os valores a, b, e c, separados por espaço:
  2 -7 3

  Invocando Métodos Remotos...

  As raízes da equação são x1=3.0 e x2=0.5
```

```text
SERVIDOR
  Servidor Pronto!
  A primeira raíz da equação é 3.0
  A segunda raíz da equação é 0.5
```

## Conclusão

O uso do RMI é uma maneira poderosa de implementar comunicação entre sistemas distribuídos em Java. Neste projeto, foi utilizada essa tecnologia para calcular as raízes de uma equação de segundo grau remotamente. Isso demonstra
como o RMI pode ser utilizado para resolver problemas práticos em sistemas distribuídos, permitindo que os clientes executem funções em servidores remotos de maneira transparente. Esta atividade prática ilustra a 
 mportância da comunicação entre sistemas e a utilidade do RMI como uma ferramenta para alcançar essa comunicação.
