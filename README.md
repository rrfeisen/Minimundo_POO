# TRABALHO DE CONCLUSÃO DE DISCIPLINA

A presente tarefa objetiva explorar e fixar o conteúdo abordado sobre **Modelagem e Projeto Baseados em Objetos**, elaboração e codificação de entidades, **Mapeamento Objeto-Relacional**, persistência em bancos de dados e **GUI**.

Desenvolva a atividade em equipes de **três ou quatro membros** sendo um destes o líder.

A atuação de cada membro da equipe será verificada por meio dos commits gerados. Assim, após cada alteração relevante nas classes/interfaces/enumerações desenvolvidas, realize marcação de progresso (commit).

A tarefa será valorada em **20 pontos** distribuídos conforme indicado na seção **Estrutura** e sua data de entrega limite é o dia **12 de agosto de 2025, terça-feira, até as 23:59**.

> **Atenção:** Respostas submetidas em até 24 horas após o encerramento do prazo terão valoração reduzida em 40% e não serão valoradas após este novo prazo.

---

## Estrutura

O objetivo é produzir um programa Java com interface gráfica com o usuário (GUI) que permita operações em banco de dados básicas (**CRUD via Repositórios**) considerando-se as entidades individuais especificadas pelo diagrama UML de classes modelado pela equipe diante do minimundo a ser explorado.

### Requisitos

Serão requeridos:
- O minimundo final
- O diagrama UML que modele as classes de entidades (somente as entidades)
- O diagrama UML de classes que modele os repositórios (as entidades devem ser demonstradas em seu formato simplificado, ou seja, sem atributos e métodos)
- O projeto com códigos-fonte
- A apresentação do trabalho desenvolvido em vídeo

### Operações da Lixeira

Além das ações de persistência já encaminhadas, sua equipe deve modelar e implementar operações com função de **Lixeira** sobre cada entidade. As operações são:

1. Movimentação de um objeto para a Lixeira
2. Movimentação de um objeto para a Lixeira sendo o parâmetro a ID e não o objeto em si
3. Movimentação de uma coleção (lista) de objetos para a Lixeira
4. Recuperação (busca) de todos os objetos da lixeira
5. Recuperação de um objeto da Lixeira sendo o parâmetro a ID e não o objeto em si
6. Recuperação de todos os objetos da Lixeira
7. Recuperação de um objeto da Lixeira sendo o parâmetro a ID e não o objeto em si
8. Exclusão definitiva de um objeto da Lixeira
9. Exclusão definitiva de um objeto da Lixeira sendo o parâmetro a ID e não o objeto em si
10. Esvaziamento da Lixeira

> **Importante:** Para que a Lixeira tenha efeito, a recuperação de dados já implementada deve ser modificada de forma a filtrar apenas objetos que não foram movidos para a Lixeira.

### Composição do Projeto

O Projeto deverá ser composto por:

1. **Códigos-fonte** de todas as classes/interfaces/enumerações com projeto disponibilizado em site de controle de versionamento de códigos com acesso público, tal como o GitHub™

2. **Funcionalidades CRUD completas** - Inclusão, edição, exclusão, recuperação e movimentações da/para a Lixeira de todas as entidades individuais envolvidas no sistema via telas próprias

3. **Identificação do projeto** ([organização](https://maven.apache.org/pom.html#Organization) e [desenvolvedores](https://maven.apache.org/pom.html#Developers)), autor, data de geração e versão de cada artefato ([documentação Javadoc](https://www.baeldung.com/javadoc) e [versionamento](https://www.baeldung.com/javadoc-version-since))

---

## Entregáveis

O Trabalho de Conclusão de Disciplina deverá ser entregue contendo:

### 1. Diagrama UML (10%)

Diagrama UML da versão final das entidades e dos repositórios implementados contendo:

- **1.1.** Aplicação de modelagem genérica devidamente representada em interfaces e classes concretas e abstratas
- **1.2.** Entidades sem métodos getters e setters
- **1.3.** Entidades sem construtores
- **1.4.** Entidades com métodos e atributos devidamente tipados e com estereótipos quando aplicável
- **1.5.** Hierarquias de herança e implementações de interfaces devidamente representadas
- **1.6.** Relacionamentos (incluindo relacionamentos de uso – tracejado) com direcionalidade, multiplicidades e atributos que os suportem
  - **1.6.1.** Note que a implementação dos relacionamentos não será cobrada na implementação, mas deve haver a sua expressão nos diagramas
- **1.7.** Repositórios estereotipados e respectivos métodos também estereotipados quando aplicável
- **1.8.** Outros que julgar relevantes, tais como notas empregadas para orientações no desenvolvimento

### 2. Demonstração das Funcionalidades (60%)

Pontos a serem observados:

- **2.1.** Desenvolvimento da apresentação com participação de **todos os membros da equipe** (podem haver ou não o rosto do apresentador). Sugere-se a alternância de falas em recortes sequenciais do tema (divisão seriada de falas curtas/médias) para tornar o material mais dinâmico

- **2.2.** Apresentação objetiva e concisa com duração aproximada de **30 minutos a 50 minutos** e publicada em uma plataforma de compartilhamento de vídeos de sua escolha, tal como o YouTube™

- **2.3.** Vide exemplo de estrutura da apresentação na aula "19. Visibilidade e modificadores de acesso"

- **2.4.** Introdução e apresentação dos membros da equipe

- **2.5.** Contextualização, agenda e introdução com uma visão geral sobre as motivações e o escopo do projeto desenvolvido, tais como seus objetivos, sua aplicação ou outros que julgar relevantes para que seja entendida a sua aplicação no mundo real

- **2.6.** Explanação:
  - **2.6.1.** Dos requisitos para início do funcionamento, tais como carga de dados, cadastros obrigatórios e assemelhados. Caso não haja, informe que o sistema constrói um conjunto de dados inicial para demonstração e, no desenvolvimento, aponte como isso ocorre
  - **2.6.2.** De todas as funcionalidades que podem ser executadas pelo sistema com demonstração da operação das interfaces gráficas e os respectivos reflexos no banco de dados, potencialmente empregando o diagrama UML de classes de entidade
  - **2.6.3.** De pontos dos códigos-fonte que são críticos ou de interesse especial ou que foram desafiadores para implementação
  - **2.6.4.** Das dificuldades enfrentadas e como foram superadas durante todo o desenvolvimento da disciplina, desde anteriormente à primeira entrega

- **2.7.** Apontamento das referências bibliográficas que suportaram o desenvolvimento

- **2.8.** Apresentação de considerações finais

### 3. Códigos-fonte (30%)

Códigos-fonte da versão final em repositório público, tal como o GitHub™.

---

## Submissão

O **Líder da Equipe** deverá disponibilizar através do formulário:

- PDF contendo o minimundo final (< 10 MB)
- Diagrama UML de classes de entidades em formato PNG (< 10 MB)
- Diagrama UML de classes de repositórios com entidades simplificadas em formato PNG (< 10 MB)
- Link do vídeo da apresentação
- Link do repositório dos respectivos códigos-fonte desenvolvidos

**Formulário de submissão:** https://forms.gle/YhPN4zNCfSb9kzkY6

> **Nota:** Apenas contas institucionais podem enviar suas respostas por meio deste formulário.
