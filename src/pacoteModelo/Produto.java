/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteModelo;

/**
 *
 * @author Alexia
 */
public class Produto {
    private int     codigo;
    private int     codigodebarras;
    private String  nome;
    private int     unidade;
    private String  marca;
    private double  preco;
    private String  imagem;
    private double  pesob;
    private double  pesol;
    private double  saldo;
    
    
    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }
    public int getCodigo()
    {
        return this.codigo;
    }
    
    
    
    public void setCodigodebarras(int codigodebarras)
    {
        this.codigodebarras = codigodebarras;
    }
    public int getCodigodebarras()
    {
        return this.codigodebarras;
    }
    
    
    
     public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    
    
     public void setUnidade(int unidade)
    {
        this.unidade = unidade;
    }
    public int getUnidade()
    {
        return this.unidade;
    }
     
    
    
     public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public String getMarca()
    {
        return this.marca;
    }
    
    
    public void setPreco(double preco)
    {
        this.preco = preco;
    }
    public double getPreco()
    {
        return this.preco;
    }
    
    
    public void setImagem(String imagem)
    {
        this.imagem = imagem;
    }
    public String getImagem()
    {
        return this.imagem;
    }
    
    
    public void setPesol(double pesol)
    {
        this.pesol = pesol;
    }
    public double getPesol()
    {
        return this.pesol;
    }
    
    
    
     public void setPesob(double pesob)
    {
        this.pesob = pesob;
    }
    public double getPesob()
    {
        return this.pesob;
    }
    
    
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    public double getSaldo()
    {
        return this.saldo;
    }

 
}
