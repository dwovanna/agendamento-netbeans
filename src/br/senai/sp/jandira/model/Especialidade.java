package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
        private int contador;
	private Integer codigo;
	private String nome;
	private String descricao;
	
	//construtor
	
	public Especialidade(String nome) {
		this.nome = nome;
                this.contador++;
	}
	
	public Especialidade(String nome, String descricao) {
		this.nome = nome;
                this.contador++;
                
	}
	
	public Especialidade() {
		this.contador++;
	}
	
	
	//Métodos de acessos aos atributos
	
	public int getContador() {
        return contador;	
	}

    public void setNome(String nome) {
        if(nome.length() >= 3) {
            this.nome = nome;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não é um nome válido.\nDeve conter pelo menos 3 letras!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
	
	public String getNome() {
		return nome;
	}
	
	public void setDescricao(String descricao) {
		if(descricao.length() >= 10) {
		this.descricao = descricao;
		} else {
			JOptionPane.showMessageDialog(null, "A descrição deve conter pelo menos 10 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String getDescricao() {
		return descricao;
	} 

    public Integer getCodigo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCodigo(Integer codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	

}