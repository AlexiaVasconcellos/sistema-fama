
package pacoDAO;

import pacoDAO.conexao;
import java.sql.Connection;
import pacoteModelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class clienteDAO {
    
    String sSql="";
    Connection con = null;
    PreparedStatement pstmt=null;
    
    public void adcionarCliente(Cliente cli){
        con = conexao.getConexao();
        sSql = "INSERT INTO cliente (cli_cnpjcpf, cli_nome, cli_datanasc, cli_email, cli_endereco, cli_numero, cli_Cidade, cli_uf, cli_complemento, cli_celular, cli_dddcelular, cli_fone, cli_dddfone, cli_tipopessoa, cli_ierg, cli_bairro, cli_cep)"+"VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JOptionPane.showMessageDialog(null,sSql);
        
        try{
            pstmt = con.prepareStatement(sSql);
            pstmt.setString   (1,  cli.getCnpjcpf () );
            pstmt.setString   (2,  cli.getNome()  );
            pstmt.setString   (3,  cli.getDatanasc()  );
            pstmt.setString   (4,  cli.getEmail());
            pstmt.setString   (5,  cli.getEndereco());
            pstmt.setString   (6,  cli.getNumero());
            pstmt.setString   (7,  cli.getCidade());
            pstmt.setString   (8,  cli.getUf());
            pstmt.setString   (9,  cli.getComplemento());
            pstmt.setInt      (10,  cli.getCelular1());
            pstmt.setInt      (11,  cli.getDddcel1());
            pstmt.setInt      (12,  cli.getFone());
            pstmt.setInt      (13,  cli.getDddFone());
            pstmt.setString   (14,  cli.getTipopessoa());
            pstmt.setString   (15,  cli.getIerg());
            pstmt.setString   (16,  cli.getBairro());
            pstmt.setInt      (17,  cli.getCep());
            
            
            pstmt.executeUpdate();
            pstmt.close();
            con.close();    
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erro ao gravar produtos: " + ex.getMessage());
         }
    }
    public void editarCliente(Cliente c){
	//sSql = "UPDATE cliente SET "
	//	+ "cli_nome = ?, cli_datanasc = ?, cli_email = ?, cli_endereco = ?, cli_numero = ?, cli_Cidade = ?, cli_uf = ?, cli_complemento = ?, cli_celular = ?, cli_dddcelular = ?, cli_fone = ?, cli_dddfone = ?, cli_tipopessoa = ?, cli_ierg = ?, cli_bairro = ?, cli_cep = ?"
	//	+ "WHERE cli_cnpjcpf = ?";
            sSql = "UPDATE cliente SET cli_nome = ? where cli_cnpjcpf = ?";
	try {
		con = conexao.getConexao();	
                pstmt = con.prepareStatement(sSql);
                pstmt.setString(1,c.getNome());
                pstmt.setString(2,c.getCnpjcpf());
                pstmt.setString(2,c.getDatanasc());
                pstmt.setString(3,c.getEmail());
                pstmt.setString(4,c.getEndereco());
                pstmt.setString(5,c.getNumero());
                pstmt.setString(6,c.getCidade());
                pstmt.setString(7,c.getUf());
                pstmt.setString(8,c.getComplemento());
                pstmt.setInt(9,c.getCelular1());
                pstmt.setInt(10,c.getDddcel1());
                pstmt.setInt(11,c.getFone());
                pstmt.setInt(12,c.getDddFone());
                pstmt.setString(13,c.getTipopessoa());
                pstmt.setString(14,c.getIerg());
                pstmt.setString(15,c.getBairro());
                pstmt.setInt(16,c.getCep());
                pstmt.setString(17, c.getCnpjcpf () );
		pstmt.executeUpdate();
		pstmt.close();
		con.close();

	} catch (SQLException ex) {
		JOptionPane.showMessageDialog(null, "Erro ao gravar Cliente" + ex.getMessage());
	}
    }
    
    public void excluirCliente(String cCodigo){
	sSql = "DELETE FROM cliente WHERE cli_cnpjcpf = ? ";
	try{
            con = conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, cCodigo);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();
	} catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Atenção !!!" + "\n" +
		"Erro ao Excluir Cliente" + ex.getMessage());
	}
    }
    
    
    
    public List<Cliente> consultarClientePorNome(String cnome){
	List<Cliente> listadeCliente;
	ResultSet rs;
	Cliente c;
	listadeCliente = new ArrayList<>();
	cnome = "%" + cnome + "%";
	sSql = "SELECT * FROM cliente WHERE cli_nome like ?";
	try{
		con = conexao.getConexao();
		pstmt = con.prepareStatement(sSql);
		pstmt.setString(1, cnome);
		rs = pstmt.executeQuery();
		while(rs.next()){
                    c = new Cliente();
                    c.setNome(rs.getString("cli_nome"));
                    c.setCnpjcpf(rs.getString("cli_cnpjcpf"));
                    c.setIerg(rs.getString("cli_ierg"));
                    c.setTipopessoa(rs.getString("cli_tipopessoa"));
                    c.setDatanasc(rs.getString("cli_datanasc"));
                    c.setEmail(rs.getString("cli_email"));
                    c.setDddfone(rs.getInt("cli_dddfone"));
                    c.setFone(rs.getInt("cli_fone"));
                    c.setDddcel1(rs.getInt("cli_dddcelular"));
                    c.setCelular1(rs.getInt("cli_celular"));
                    c.setCep(rs.getInt("cli_cep"));
                    c.setEndereco(rs.getString("cli_endereco"));
                    c.setNumero(rs.getString("cli_numero"));
                    c.setComplemento(rs.getString("cli_complemento"));
                    c.setBairro(rs.getString("cli_bairro"));
                    c.setCidade(rs.getString("cli_bairro"));
                    c.setUf(rs.getString("cli_uf"));
                    
                    listadeCliente.add( c );
		}
		pstmt.close();
		con.close();
	}catch (SQLException ex){
		JOptionPane.showMessageDialog(null, "Cliente não encontrado" + ex.getMessage());
	}
	return listadeCliente;
    }
    
    
    
    public Cliente procurarClienteporCodigo(String codigo){
	ResultSet rs;
	Cliente c = null;
	sSql = "SELECT * FROM cliente WHERE cli_cnpjcpf like ? ";

	try{
            con = conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, codigo);
            rs = pstmt.executeQuery();
            if(rs.next()){
                c = new Cliente();
                c.setNome(rs.getString("cli_nome"));
                c.setCnpjcpf(rs.getString("cli_cnpjcpf"));
                c.setIerg(rs.getString("cli_ierg"));
                c.setTipopessoa(rs.getString("cli_tipopessoa"));
                c.setDatanasc(rs.getString("cli_datanasc"));
                c.setEmail(rs.getString("cli_email"));
                c.setDddfone(rs.getInt("cli_dddfone"));
                c.setFone(rs.getInt("cli_fone"));
                c.setDddcel1(rs.getInt("cli_dddcelular"));
                c.setCelular1(rs.getInt("cli_celular"));
                c.setCep(rs.getInt("cli_cep"));
                c.setEndereco(rs.getString("cli_endereco"));
                c.setNumero(rs.getString("cli_numero"));
                c.setComplemento(rs.getString("cli_complemento"));
                c.setBairro(rs.getString("cli_bairro"));
                c.setCidade(rs.getString("cli_bairro"));
                c.setUf(rs.getString("cli_uf"));
            }
            pstmt.close();
            con.close();
	} catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao procurar Cliente codigo" + ex.getMessage());
	}
	return c;
    }
}
