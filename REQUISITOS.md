\# Levantamento de Requisitos - Sistema de Gerenciamento de Projetos

---

### Requisitos Funcionais (RF)

\* RF1\: **Gerenciamento de Usuários**\: O sistema deve permitir o cadastro, edição, visualização e exclusão de usuários com os campos\: nome completo, CPF, e-mail, cargo, login e senha\.
\* RF2\: **Gerenciamento de Perfis de Acesso**\: O sistema deve associar cada usuário a um perfil (administrador, gerente ou colaborador) e controlar as permissões de acesso com base nesse perfil\.
\* RF3\: **Gerenciamento de Projetos**\: O sistema deve permitir o cadastro, edição, visualização e exclusão de projetos com os campos\: nome, descrição, data de início, data de término prevista, status e gerente responsável\.
\* RF4\: **Gerenciamento de Equipes**\: O sistema deve permitir o cadastro, edição e visualização de equipes com os campos\: nome, descrição e membros associados\.
\* RF5\: **Alocação de Equipes a Projetos**\: O sistema deve permitir a vinculação de uma ou mais equipes a um projeto\.
\* RF6\: **Gerenciamento de Tarefas**\: O sistema deve permitir o cadastro, edição, visualização e exclusão de tarefas com os campos\: título, descrição, projeto, responsável, status, data de início e fim (previstas e reais)\.
\* RF7\: **Autenticação de Usuário**\: O sistema deve ter uma tela de login que valida as credenciais do usuário no banco de dados\.
\* RF8\: **Geração de Relatórios**\: O sistema deve gerar relatórios e dashboards com resumos de projetos, desempenho de colaboradores e projetos em risco de atraso\.

---

### Requisitos Não Funcionais (RNF)

\* RNF1\: **Usabilidade**\: A interface visual deve ser amigável e intuitiva, permitindo fácil navegação\. O fluxo de trabalho para cadastro, edição e visualização de dados deve ser claro\.
\* RNF2\: **Segurança**\:
  \* **Controle de Acesso**\: O sistema deve garantir que as ações de cada usuário sejam limitadas ao seu perfil de acesso (ex\: um colaborador não pode editar um projeto)\.
  \* **Autenticação**\: O sistema deve proteger a senha do usuário, não armazenando-a em texto puro no banco de dados\.
  \* **Logs de Auditoria**\: O sistema deve registrar as principais atividades de alteração para fins de auditoria\.
\* RNF3\: **Desempenho**\: As consultas e operações no banco de dados devem ser otimizadas para garantir um tempo de resposta aceitável\.
\* RNF4\: **Confiabilidade**\: O sistema deve lidar com erros de forma controlada (ex\: exibir mensagens de erro amigáveis em caso de falha de conexão com o banco)\.
\* RNF5\: **Manutenibilidade**\: O código\-fonte deve ser organizado em pacotes lógicos, ser legível e fácil de manter e evoluir\.

---

### Regras de Negócio (RN)

\* RN1\: Uma equipe pode atuar em vários projetos\.
\* RN2\: Um projeto pode ter mais de uma equipe envolvida\.
\* RN3\: Uma tarefa pertence a um único projeto\.
\* RN4\: A alteração do status de um projeto para "cancelado" deve influenciar o status de suas tarefas vinculadas, mudando\-as para "cancelada"\.
\* RN5\: Um colaborador pode estar em mais de uma equipe\.
\* RN6\: Campos obrigatórios no formulário (ex\: nome do usuário, título da tarefa) devem ter validação para evitar que sejam submetidos vazios\.
\* RN7\: A senha de um usuário deve atender a critérios mínimos de segurança (ex\: 8 caracteres, com letras, números e símbolos)\.