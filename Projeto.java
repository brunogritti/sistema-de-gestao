import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Classe Projeto
class Projeto {
    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevista;
    private String status; // planejado, em andamento, concluído, cancelado
    private Usuario gerenteResponsavel;
    
    // Construtor
    public Projeto(String nome, String descricao, LocalDate dataInicio, 
                   LocalDate dataTerminoPrevista, String status, Usuario gerenteResponsavel) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevista = dataTerminoPrevista;
        this.status = status;
        this.gerenteResponsavel = gerenteResponsavel;
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
    
    public LocalDate getDataInicio() {
        return dataInicio;
    }
    
    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    public LocalDate getDataTerminoPrevista() {
        return dataTerminoPrevista;
    }
    
    public void setDataTerminoPrevista(LocalDate dataTerminoPrevista) {
        this.dataTerminoPrevista = dataTerminoPrevista;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public Usuario getGerenteResponsavel() {
        return gerenteResponsavel;
    }
    
    public void setGerenteResponsavel(Usuario gerenteResponsavel) {
        this.gerenteResponsavel = gerenteResponsavel;
    }
    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "Projeto: " + nome + 
               "\nDescrição: " + descricao + 
               "\nInício: " + dataInicio.format(formatter) + 
               " | Término: " + dataTerminoPrevista.format(formatter) +
               "\nStatus: " + status + 
               "\nGerente: " + gerenteResponsavel.getNome() + "\n";
    }
}