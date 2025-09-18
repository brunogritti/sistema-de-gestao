# 🚀 Sistema de Gerenciamento de Projetos

Sistema desenvolvido em Java para gerenciamento de usuários, projetos e equipes em ambiente acadêmico/empresarial.

## 📋 Requisitos Funcionais

### 1. Cadastro de Usuários
- ✅ Nome completo, CPF, e-mail, cargo, login e senha
- ✅ Perfis: Administrador, Gerente ou Colaborador
- ✅ Sistema de autenticação

### 2. Cadastro de Projetos
- ✅ Nome, descrição, data de início e término prevista
- ✅ Status: planejado, em andamento, concluído, cancelado
- ✅ Gerente responsável obrigatório
- ✅ Apenas gerentes e administradores podem cadastrar

### 3. Cadastro de Equipes
- ✅ Nome da equipe, descrição e membros vinculados
- ✅ Uma equipe pode atuar em vários projetos
- ✅ Múltiplos usuários por equipe

## 🏗️ Arquitetura do Sistema

```
📁 Sistema de Gerenciamento
├── 📄 SistemaGerenciamentoProjetos.java (Classe Principal)
├── 📄 Usuario.java (Modelo de Usuário)
├── 📄 Projeto.java (Modelo de Projeto)
└── 📄 Equipe.java (Modelo de Equipe)
```

### Diagrama de Classes

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│     Usuario     │    │     Projeto     │    │     Equipe      │
├─────────────────┤    ├─────────────────┤    ├─────────────────┤
│ - nome          │    │ - nome          │    │ - nome          │
│ - cpf           │    │ - descricao     │    │ - descricao     │
│ - email         │◄───┤ - dataInicio    │    │ - membros[]     │
│ - cargo         │    │ - dataTermino   │    │ - projetos[]    │
│ - login         │    │ - status        │    └─────────────────┘
│ - senha         │    │ - gerente       │
└─────────────────┘    └─────────────────┘
```

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 8+
- **IDE Recomendada:** IntelliJ IDEA, Eclipse ou VS Code
- **Paradigma:** Programação Orientada a Objetos

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Variável de ambiente JAVA_HOME configurada

### Passos para Execução

1. **Clone ou baixe os arquivos do projeto**

2. **Compile o projeto:**
   ```bash
   javac *.java
   ```

3. **Execute o sistema:**
   ```bash
   java SistemaGerenciamentoProjetos
   ```

4. **Utilize os usuários de teste:**
   ```
   👤 Administrador
   Login: admin
   Senha: 123
   
   👤 Gerente  
   Login: maria
   Senha: 456
   
   👤 Colaborador
   Login: pedro
   Senha: 789
   ```

## 📱 Funcionalidades do Sistema

### Menu de Login
- Login de usuários existentes
- Cadastro de novos usuários
- Validação de credenciais

### Menu Principal (Pós-Login)
- **Gerenciar Usuários:** Listar e cadastrar usuários
- **Gerenciar Projetos:** Listar e cadastrar projetos (restrito)
- **Gerenciar Equipes:** Listar e cadastrar equipes
- **Logout:** Encerrar sessão

### Controle de Acesso
- **Administradores:** Acesso total ao sistema
- **Gerentes:** Podem cadastrar projetos e gerenciar equipes
- **Colaboradores:** Acesso limitado à visualização

## 💾 Estrutura de Dados

### Classe Usuario
```java
- String nome
- String cpf
- String email
- String cargo (Administrador/Gerente/Colaborador)
- String login
- String senha
```

### Classe Projeto
```java
- String nome
- String descricao
- LocalDate dataInicio
- LocalDate dataTerminoPrevista
- String status (planejado/em andamento/concluído/cancelado)
- Usuario gerenteResponsavel
```

### Classe Equipe
```java
- String nome
- String descricao
- List<Usuario> membros
- List<Projeto> projetos
```

## 🔒 Regras de Negócio

1. **Autenticação obrigatória** para acesso ao sistema
2. **Apenas gerentes e administradores** podem cadastrar projetos
3. **Todo projeto deve ter um gerente responsável**
4. **Equipes podem ter múltiplos membros** e atuar em vários projetos
5. **Dados são mantidos em memória** durante a execução

## 📊 Dados de Exemplo Incluídos

O sistema já vem com dados de exemplo para facilitar os testes:

- **3 usuários** (1 admin, 1 gerente, 1 colaborador)
- **1 equipe** pré-configurada
- **1 projeto** de exemplo
- **Relacionamentos** já estabelecidos

## 🎯 Casos de Uso Principais

### 1. Login no Sistema
```
1. Usuário informa login e senha
2. Sistema valida credenciais
3. Acesso liberado conforme perfil
```

### 2. Cadastrar Projeto
```
1. Gerente/Admin acessa menu de projetos
2. Informa dados do projeto
3. Seleciona gerente responsável
4. Projeto é criado e armazenado
```

### 3. Formar Equipe
```
1. Usuário acessa menu de equipes
2. Define nome e descrição
3. Seleciona membros disponíveis
4. Equipe é criada
```