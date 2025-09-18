import java.util.List;
import java.util.ArrayList;

// Classe Equipe
class Equipe {
    private String nome;
    private String descricao;
    private List<Usuario> membros;
    private List<Projeto> projetos;
    
    // Construtor
    public Equipe(String nome, String descricao, List<Usuario> membros) {
        this.nome = nome;
        this.descricao = descricao;
        this.membros = new ArrayList<>(membros);
        this.projetos = new ArrayList<>();
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public List<Usuario> getMembros() {
        return new ArrayList<>(membros);
    }
    
    public void adicionarMembro(Usuario usuario) {
        if (!membros.contains(usuario)) {
            membros.add(usuario);
        }
    }
    
    public void removerMembro(Usuario usuario) {
        membros.remove(usuario);
    }
    
    public List<Projeto> getProjetos() {
        return new ArrayList<>(projetos);
    }
    
    public void adicionarProjeto(Projeto projeto) {
        if (!projetos.contains(projeto)) {
            projetos.add(projeto);
        }
    }
    
    public void removerProjeto(Projeto projeto) {
        projetos.remove(projeto);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Equipe: ").append(nome).append("\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Membros: ");
        
        if (membros.isEmpty()) {
            sb.append("Nenhum membro");
        } else {
            for (int i = 0; i < membros.size(); i++) {
                sb.append(membros.get(i).getNome());
                if (i < membros.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        
        sb.append("\nProjetos ativos: ").append(projetos.size()).append("\n");
        
        return sb.toString();
    }
}