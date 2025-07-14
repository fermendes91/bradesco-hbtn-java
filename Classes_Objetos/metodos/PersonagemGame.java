public class PersonagemGame {
  public int saudeAtual;
  public String nome;
  
  public int getSaudeAtual() {
	return saudeAtual;
  }
  public void setSaudeAtual(int saudeAtual) {
	this.saudeAtual = saudeAtual;
  }
  
  public String getNome() {
	return nome;
  }
  public void setNome(String nome) {
	this.nome = nome;
  }
  
  public void tomarDano(int quantidadeDeDano) {
	  int saudeAtual = this.saudeAtual - quantidadeDeDano;
	  this.saudeAtual = saudeAtual < 0 ? 0 : saudeAtual;
  }
  
  public void receberCura(int quantidadeDeCura) {
	  int saudeAtual =  this.saudeAtual + quantidadeDeCura;
	  this.saudeAtual = saudeAtual > 100 ? 100 : saudeAtual;
	  
  }
  
}