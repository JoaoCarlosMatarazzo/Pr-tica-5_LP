package MeuPacote;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Iterator;
public class quest�o2 {

	public static void main(String[] args) {
		int i,j;
		ArrayList<String> cadastro = new ArrayList();
		do {
			String galeria = JOptionPane.showInputDialog("Menu:\n1�-Cadastrar\n2�-Excluir\n3�-Pesquisar\n4�-Sair");
		     i = Integer.parseInt(galeria);
		     switch (i)
		     {
		     case 1:
		    	 //cadastrar
		    	 String nome= JOptionPane.showInputDialog("Por favor, digite o seu nome: "); 
	             String telefone= JOptionPane.showInputDialog("Por favor, digite o seu telefone: ");
	             String instagram= JOptionPane.showInputDialog("Por favor, digite o seu instagram: ");
	             String email= JOptionPane.showInputDialog("Por favor, digite o seu e-mail: ");
	               cadastro.add(nome+";"+telefone+";"+instagram+";"+email);
	                JOptionPane.showMessageDialog(null, "Inserido com Sucesso:\n"+nome+";"+telefone+";"+instagram+";"+email);		    	 
		    	 break;
		     case 2:
		    	 //excluir
		    	 String excluido = JOptionPane.showInputDialog("Digite o Nome: ");
		    	 
		    	 //criar um loop para dentro de get, para assim saber se o nome existe e exclui-lo.
		    	 //System.out.print( "Removendo o Tiririca: " );
		            //bandas.remove("Tiririca");
		            //System.out.println( Arrays.toString( bandas.toArray() ) );
	                 try 
	                 {
	                	 int n = cadastro.size();
	                	 for(i=0; i<n ; i++) {
	                		 if(cadastro.get(i).contains(excluido)) 
	                		 {
	                	 cadastro.remove(excluido);
	                		 }
	                	 }
	                JOptionPane.showMessageDialog(null, "Exclu�do com Sucesso");
	                 } 
	                 catch (IndexOutOfBoundsException e) 
	                 {
	                JOptionPane.showMessageDialog(null, "\nErro: posi��o inv�lida (%s).");
	                 }
		    	 
		    	 break;
		     case 3:
		    	 //pesquisar
		    	 String pesquisado = JOptionPane.showInputDialog("Por favor, digite a informa��o desejada: ");		    	 
		    		int n = cadastro.size();
                	 for(j=0; j<n ; j++) {
                		
						if(cadastro.get(j).contains(pesquisado)) {                	 
                JOptionPane.showMessageDialog(null, "pesquisado.get(j)");
                 }
                	else if(!cadastro.get(j).contains(pesquisado) && j==n-1)
                		JOptionPane.showMessageDialog(null,"Registro n�o encontrado.");
		    	 }
		     
                 break;
		    	 
		     case 4:
		    	 System.out.println("Muito obrigado por usar os nossos servi�os, tenha um �timo dia. ^-^");
		    	 
		    	 break;
		     }
		}
		while (i!=4);
	
}
}