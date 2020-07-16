/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoDAO;

import pacoDAO.conexao;
import java.sql.Connection;
import pacoteModelo.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class produtoDAO {
        String sSql="";
    Connection con = null;
    PreparedStatement pstmt=null;
    
    public void adcionarProduto(Produto prod){
        con = conexao.getConexao();
        sSql = "INSERT INTO produto(pro_codigo, pro_nome, pro_marca, pro_saldo, pro_codigobarras, pro_unidade, pro_pesobruto, pro_pesoliquido, pro_preco)"+"VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JOptionPane.showMessageDialog(null,sSql);
        
        try{
            pstmt = con.prepareStatement(sSql);
            pstmt.setInt   (1,  prod.getCodigo() );
            pstmt.setString(2,  prod.getNome()   );
            pstmt.setString(3,  prod.getMarca()  );
            pstmt.setDouble(4,  prod.getSaldo()  );
            pstmt.setInt   (5,  prod.getCodigodebarras());
            pstmt.setInt   (6,  prod.getUnidade());
            pstmt.setDouble(7,  prod.getPesob());
            pstmt.setDouble(8,  prod.getPesol());
            pstmt.setDouble(9,  prod.getPreco());
            pstmt.executeUpdate();
            pstmt.close();
            con.close();    
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao gravar produtos: " + ex.getMessage());
         }
    }
    
    public void editarProduto(Produto p){
	sSql = "UPDATE produto SET "
		+ "pro_nome = ?, pro_marca = ?, pro_saldo = ? , pro_codigobarras = ?, pro_unidade = ?, pro_pesobruto = ?, pro_pesoliquido = ?, pro_preco = ?"
		+ "WHERE pro_codigo = ?";
	try {
		con = conexao.getConexao();
		pstmt = con.prepareStatement(sSql);
		pstmt.setString(1, p.getNome());
		pstmt.setString(2, p.getMarca());
		pstmt.setDouble(3, p.getSaldo());
                pstmt.setInt(4, p.getCodigodebarras());
                pstmt.setInt(5, p.getUnidade());
                pstmt.setDouble(6, p.getPesob());
                pstmt.setDouble(7, p.getPesol());
                pstmt.setDouble(8, p.getPreco());
                pstmt.setInt(9,p.getCodigo());
		pstmt.executeUpdate();
		pstmt.close();
		con.close();

	} catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, "Erro ao gravar produto" + ex.getMessage());
	}
    }


    public void excluirProduto(int pCodigo){
	sSql = "DELETE FROM produto WHERE pro_codigo = ? ";
	try{
		con = conexao.getConexao();
		pstmt = con.prepareStatement(sSql);
		pstmt.setInt(1, pCodigo);
		pstmt.executeUpdate();
		pstmt.close();
		con.close();
	} catch (SQLException ex){
		JOptionPane.showMessageDialog(null, "Atenção !!!" + "\n" +
			"Erro ao Excluir Produto" + ex.getMessage());
	}
    }


    public List<Produto> consultarProdutoPorNome(String pnome){
	List<Produto> listadeProduto;
	ResultSet rs;
	Produto p;
	listadeProduto = new ArrayList<>();
	pnome = "%" + pnome + "%";
	sSql = "SELECT * FROM produto WHERE pro_nome like ?";
	try{
		con = conexao.getConexao();
		pstmt = con.prepareStatement(sSql);
		pstmt.setString(1, pnome);
		rs = pstmt.executeQuery();
		while(rs.next()){
                    p = new Produto();
                    p.setCodigo(rs.getInt("pro_codigo"));
                    p.setNome(rs.getString("pro_nome"));
                    p.setMarca(rs.getString("pro_marca"));
                    p.setSaldo(rs.getDouble("pro_saldo"));
                    p.setCodigodebarras(rs.getInt("pro_codigobarras"));
                    p.setUnidade(rs.getInt("pro_unidade"));
                    p.setPesob(rs.getDouble("pro_pesobruto"));
                    p.setPesol(rs.getDouble("pro_pesoliquido"));
                    p.setPreco(rs.getDouble("pro_preco"));
                    listadeProduto.add( p );
		}
		pstmt.close();
		con.close();
	}catch (SQLException ex){
		JOptionPane.showMessageDialog(null, "Produto não encontrado" + ex.getMessage());
	}
	return listadeProduto;
    }
    
    
    public Produto procurarProdutoporCodigo(int codigo){
	ResultSet rs;
	Produto prod = null;
	sSql = "SELECT * FROM produto WHERE pro_codigo = ? ";

	try{
		con = conexao.getConexao();
		pstmt = con.prepareStatement(sSql);
		pstmt.setInt(1, codigo);
		rs = pstmt.executeQuery();
		if(rs.next()){
			prod = new Produto();
			prod.setCodigo(rs.getInt("pro_codigo"));
			prod.setNome(rs.getString("pro_nome"));
			prod.setMarca(rs.getString("pro_marca"));
			prod.setPreco(rs.getDouble("pro_saldo"));
                        prod.setCodigodebarras(rs.getInt("pro_codigobarras"));
                        prod.setUnidade(rs.getInt("pro_unidade"));
                        prod.setPesob(rs.getDouble("pro_pesobruto"));
                        prod.setPesol(rs.getDouble("pro_pesoliquido"));
                        prod.setPreco(rs.getDouble("pro_preco"));
		}
		pstmt.close();
		con.close();
	} catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, "Erro ao procurar produto" + ex.getMessage());
	}
	return prod;
    }
}
