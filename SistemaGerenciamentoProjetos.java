import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Classe Principal - Main
public class SistemaGerenciamentoProjetos {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Projeto> projetos = new ArrayList<>();
    private static List<Equipe> equipes = new ArrayList<>();
    private static Usuario usuarioLogado = null;
    
    public static void main(String[] args) {
        System.out.println("=== Sistema de Gerenciamento de Projetos ===");
        
        // Criar alguns dados de exemplo
        criarDadosExemplo();
        
        // Menu principal
        while (true) {
            if (usuarioLogado == null) {
                menuLogin();
            } else {
                menuPrincipal();
            }
        }
    }
    
    private static void criarDadosExemplo() {
        // Usuários de exemplo
        usuarios.add(new Usuario("João Silva", "123.456.789-00", "joao@email.com", "Administrador", "admin", "123"));
        usuarios.add(new Usuario("Maria Santos", "987.654.321-00", "maria@email.com", "Gerente", "maria", "456"));
        usuarios.add(new Usuario("Pedro Costa", "111.222.333-44", "pedro@email.com", "Colaborador", "pedro", "789"));
        
        // Equipes de exemplo
        List<Usuario> membrosEquipe1 = Arrays.asList(usuarios.get(1), usuarios.get(2));
        equipes.add(new Equipe("Equipe Desenvolvimento", "Equipe responsável pelo desenvolvimento", membrosEquipe1));
        
        // Projetos de exemplo
        projetos.add(new Projeto("Sistema Web", "Desenvolvimento de sistema web", 
                    LocalDate.now(), LocalDate.now().plusDays(30), "planejado", usuarios.get(1)));
    }
    
    private static void menuLogin() {
        System.out.println("\n1. Login");
        System.out.println("2. Cadastrar Usuário");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Limpar buffer
        
        switch (opcao) {
            case 1:
                fazerLogin();
                break;
            case 2:
                cadastrarUsuario();
                break;
            case 3:
                System.out.println("Saindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    private static void menuPrincipal() {
        System.out.println("\n=== Menu Principal ===");
        System.out.println("Usuário logado: " + usuarioLogado.getNome() + " (" + usuarioLogado.getCargo() + ")");
        System.out.println("1. Gerenciar Usuários");
        System.out.println("2. Gerenciar Projetos");
        System.out.println("3. Gerenciar Equipes");
        System.out.println("4. Logout");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                menuUsuarios();
                break;
            case 2:
                menuProjetos();
                break;
            case 3:
                menuEquipes();
                break;
            case 4:
                usuarioLogado = null;
                System.out.println("Logout realizado!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
    
    private static void fazerLogin() {
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                System.out.println("Login realizado com sucesso!");
                return;
            }
        }
        System.out.println("Login ou senha incorretos!");
    }
    
    private static void cadastrarUsuario() {
        System.out.println("\n=== Cadastrar Usuário ===");
        System.out.print("Nome completo: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("E-mail: ");
        String email = scanner.nextLine();
        System.out.print("Cargo (Administrador/Gerente/Colaborador): ");
        String cargo = scanner.nextLine();
        System.out.print("Login: ");
        String login = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();
        
        Usuario novoUsuario = new Usuario(nome, cpf, email, cargo, login, senha);
        usuarios.add(novoUsuario);
        System.out.println("Usuário cadastrado com sucesso!");
    }
    
    private static void menuUsuarios() {
        System.out.println("\n=== Gerenciar Usuários ===");
        System.out.println("1. Listar Usuários");
        System.out.println("2. Cadastrar Usuário");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                listarUsuarios();
                break;
            case 2:
                cadastrarUsuario();
                break;
        }
    }
    
    private static void menuProjetos() {
        System.out.println("\n=== Gerenciar Projetos ===");
        System.out.println("1. Listar Projetos");
        System.out.println("2. Cadastrar Projeto");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                listarProjetos();
                break;
            case 2:
                cadastrarProjeto();
                break;
        }
    }
    
    private static void menuEquipes() {
        System.out.println("\n=== Gerenciar Equipes ===");
        System.out.println("1. Listar Equipes");
        System.out.println("2. Cadastrar Equipe");
        System.out.println("3. Voltar");
        System.out.print("Escolha uma opção: ");
        
        int opcao = scanner.nextInt();
        scanner.nextLine();
        
        switch (opcao) {
            case 1:
                listarEquipes();
                break;
            case 2:
                cadastrarEquipe();
                break;
        }
    }
    
    private static void listarUsuarios() {
        System.out.println("\n=== Lista de Usuários ===");
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    
    private static void listarProjetos() {
        System.out.println("\n=== Lista de Projetos ===");
        for (Projeto projeto : projetos) {
            System.out.println(projeto);
        }
    }
    
    private static void listarEquipes() {
        System.out.println("\n=== Lista de Equipes ===");
        for (Equipe equipe : equipes) {
            System.out.println(equipe);
        }
    }
    
    private static void cadastrarProjeto() {
        if (!usuarioLogado.getCargo().equals("Administrador") && !usuarioLogado.getCargo().equals("Gerente")) {
            System.out.println("Apenas Administradores e Gerentes podem cadastrar projetos!");
            return;
        }
        
        System.out.println("\n=== Cadastrar Projeto ===");
        System.out.print("Nome do projeto: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Data de início (dd/mm/yyyy): ");
        String dataInicioStr = scanner.nextLine();
        System.out.print("Data de término prevista (dd/mm/yyyy): ");
        String dataTerminoStr = scanner.nextLine();
        System.out.print("Status (planejado/em andamento/concluído/cancelado): ");
        String status = scanner.nextLine();
        
        // Converter datas
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataInicio = LocalDate.parse(dataInicioStr, formatter);
        LocalDate dataTermino = LocalDate.parse(dataTerminoStr, formatter);
        
        // Selecionar gerente responsável
        System.out.println("Gerentes disponíveis:");
        List<Usuario> gerentes = new ArrayList<>();
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getCargo().equals("Gerente") || usuarios.get(i).getCargo().equals("Administrador")) {
                gerentes.add(usuarios.get(i));
                System.out.println((gerentes.size()) + ". " + usuarios.get(i).getNome());
            }
        }
        System.out.print("Escolha o gerente responsável: ");
        int escolhaGerente = scanner.nextInt();
        scanner.nextLine();
        
        Usuario gerenteResponsavel = gerentes.get(escolhaGerente - 1);
        
        Projeto novoProjeto = new Projeto(nome, descricao, dataInicio, dataTermino, status, gerenteResponsavel);
        projetos.add(novoProjeto);
        System.out.println("Projeto cadastrado com sucesso!");
    }
    
    private static void cadastrarEquipe() {
        System.out.println("\n=== Cadastrar Equipe ===");
        System.out.print("Nome da equipe: ");
        String nome = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        
        System.out.println("Usuários disponíveis:");
        for (int i = 0; i < usuarios.size(); i++) {
            System.out.println((i + 1) + ". " + usuarios.get(i).getNome());
        }
        
        System.out.print("Digite os números dos membros separados por vírgula: ");
        String membrosStr = scanner.nextLine();
        String[] membrosIndices = membrosStr.split(",");
        
        List<Usuario> membros = new ArrayList<>();
        for (String indice : membrosIndices) {
            try {
                int index = Integer.parseInt(indice.trim()) - 1;
                if (index >= 0 && index < usuarios.size()) {
                    membros.add(usuarios.get(index));
                }
            } catch (NumberFormatException e) {
                System.out.println("Índice inválido ignorado: " + indice);
            }
        }
        
        Equipe novaEquipe = new Equipe(nome, descricao, membros);
        equipes.add(novaEquipe);
        System.out.println("Equipe cadastrada com sucesso!");
    }
}