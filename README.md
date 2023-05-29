# Kafka com Spring - Arquitetura Orientada a Eventos

Este projeto é uma API REST que implementa a funcionalidade de adicionar eventos a uma fila. Para isso, foram utilizadas as seguintes tecnologias: Apache Kafka, Spring, Java, Intellij e Offset Explorer. A arquitetura adotada é orientada a eventos, o que significa que o sistema é projetado para lidar com eventos assíncronos e reagir a eles de acordo com as necessidades do fluxo de trabalho. O Apache Kafka é utilizado como o sistema de mensageria subjacente, permitindo a troca eficiente de eventos entre os diferentes componentes do sistema. O Spring é utilizado para construir a API REST, enquanto o Java é a linguagem de programação principal. O Intellij é o ambiente de desenvolvimento integrado (IDE) usado para escrever, testar e depurar o código do projeto. Além disso, o Offset Explorer é uma ferramenta específica que foi utilizada para monitorar e explorar os offsets (posições de leitura) dos tópicos do Kafka, permitindo um controle mais preciso sobre o processamento dos eventos.

## Para utilizar esse projeto, siga os seguintes passos:
Crie um diretório para o projeto. Dentro dele, crie um arquivo YAML que conterá as configurações do Kafka. Esse arquivo deve conter as informações necessárias para se conectar ao cluster do Kafka, como o endereço do servidor (HOST) e a porta (PORTA) utilizada.

Faça o download das imagens necessárias para executar o Kafka e o projeto em um ambiente Docker. Essas imagens podem ser obtidas a partir do repositório oficial do Kafka ou de uma plataforma de contêineres, como o Docker Hub. Certifique-se de obter as versões compatíveis com o projeto.

Crie um cluster no Offset Explorer, seguindo as instruções fornecidas no link que você mencionou. O Offset Explorer é uma ferramenta para monitorar e explorar os offsets dos tópicos do Kafka. Durante a criação do cluster, você precisará fornecer as configurações de HOST e PORTA correspondentes ao cluster do Kafka.

Você pode consultar o link fornecido (https://developer.confluent.io/get-started/java/#kafka-setup) para obter um guia passo a passo mais detalhado sobre a configuração do Kafka e a preparação do ambiente para o desenvolvimento em Java.

Esse projeto oferece uma solução eficiente para o gerenciamento de eventos, facilita a integração com outros sistemas, possui uma configuração flexível, permite um monitoramento avançado e possibilita a escalabilidade horizontal. Essas características são essenciais para construir sistemas distribuídos, resilientes e altamente disponíveis, que são cada vez mais necessários no contexto atual da computação em nuvem e da arquitetura de microserviços.

### Contato: 
LinkedIn: https://www.linkedin.com/in/luaraamaral/  
E-mail: luaraamaral.ti@gmail.com  
