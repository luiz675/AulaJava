import java.util.ArrayList;

public class Execucao {
    Profissional profissional;
    Projetos projeto;
    public  String funcao;
    public  int cargaHorariaSemanal;
    public  String  LocalTrabalho;
    private double valorHora;

    public Execucao(Profissional profissional, Projetos projeto, String funcao, int cargaHorariaSemanal, String localTrabalho, double valorHora){
        this.setProfissional(profissional);
        this.setProjeto(projeto);

        projeto.profissionais.add(profissional);
        profissional.projetos.add(projeto);

        this.setFuncao(funcao);
        this.setCargaHorariaSemanal(cargaHorariaSemanal);
        this.setLocalTrabalho(localTrabalho);
        this.setValorHora(valorHora);

    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Projetos getProjeto() {
        return projeto;
    }

    public void setProjeto(Projetos projeto) {
        this.projeto = projeto;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCargaHorariaSemanal() {
        return cargaHorariaSemanal;
    }

    public void setCargaHorariaSemanal(int cargaHorariaSemanal) {
        this.cargaHorariaSemanal = cargaHorariaSemanal;
    }

    public String getLocalTrabalho() {
        return LocalTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        LocalTrabalho = localTrabalho;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "Execucao{" +
                "profissional=" + profissional.getNome() +
                ", \nprojeto=" + projeto.getTitulo() +
                ", \nfuncao='" + funcao + '\'' +
                ", \ncargaHorariaSemanal=" + cargaHorariaSemanal +
                ", \nLocalTrabalho='" + LocalTrabalho + '\'' +
                ", \nvalorHora=" + valorHora +
                "\nValor a pagar = R$ " + this.getCargaHorariaSemanal() +
                '}';
    }
}
