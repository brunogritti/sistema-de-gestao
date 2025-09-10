\# Sistema de Gerenciamento de Projetos

## Descrição do Projeto

Este projeto consiste em um sistema completo para o gerenciamento de projetos e equipes. Desenvolvido para facilitar a organização, alocação de recursos e o acompanhamento do andamento de tarefas, o sistema oferece diferentes níveis de acesso para administradores, gerentes e colaboradores.

## Tecnologias Envolvidas

* **Linguagem de Programação**: Java
* **Interface Gráfica**: Java Swing/JavaFX (a ser definido)
* **Banco de Dados**: MySQL
* **Gerenciamento de Dependências**: Maven ou Gradle (a ser definido)

## Funcionalidades Principais

* **Autenticação**: Tela de login com validação de credenciais no banco de dados.
* **Gestão de Entidades**:
    * Cadastro, edição e exclusão de **Usuários** e seus perfis (Administrador, Gerente, Colaborador).
    * Cadastro, edição e exclusão de **Projetos** e seus status (Planejado, Em Andamento, Concluído, Cancelado).
    * Cadastro, edição e exclusão de **Equipes** e seus membros.
    * Cadastro, edição e exclusão de **Tarefas** vinculadas a projetos específicos.
* **Alocação de Recursos**: Vinculação de equipes a projetos e de tarefas a usuários.
* **Relatórios e Dashboards**: Visualização do progresso dos projetos, desempenho de colaboradores e identificação de projetos com atraso.

## Estrutura do Projeto

O projeto segue a arquitetura **MVC (Model-View-Controller)**, com a seguinte organização de pacotes:

* **model**: Contém as classes que representam os dados e a lógica de negócio\.
    * `com.seuprojeto.model.entities`: Classes de domínio (ex\: `Usuario`, `Projeto`)\.
    * `com.seuprojeto.model.dao`: Classes de acesso a dados\.
    * `com.seuprojeto.model.service`: Lógica de negócio principal\.
* **view**: Contém as classes da interface gráfica do usuário\.
    * `com.seuprojeto.view`: Telas e componentes visuais (ex\: `LoginView`, `DashboardView`)\.
* **controller**: Atua como intermediário, recebendo ações do usuário e manipulando o Model e a View\.
    * `com.seuprojeto.controller`: Controladores para as telas (ex\: `LoginController`, `ProjetoController`)\.
    
## Como Executar o Projeto

1.  **Pré\-requisitos**:
    * Java Development Kit (JDK) 8 ou superior instalado.
    * MySQL Server instalado e configurado.
    * IDE (Integrated Development Environment) como IntelliJ IDEA, Eclipse ou NetBeans.

2.  **Configuração do Banco de Dados**:
    * Crie um banco de dados com o nome `projeto_db` (ou o nome que você preferir).
    * Importe o script SQL de criação das tabelas (será fornecido em `src/main/resources/database.sql`).
    * Configure as credenciais de acesso ao MySQL no arquivo `src/main/resources/database.properties`.

3.  **Execução**:
    * Clone o repositório para a sua máquina local.
    * Abra o projeto na sua IDE.
    * Execute a classe principal em `src/main/java/com/seuprojeto/Main.java`.

## Contato

Para mais informações, entre em contato\.