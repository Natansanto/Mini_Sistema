package sistema;
import java.util.ArrayList;
import java.util.Scanner;
import service.*;
import classes.sistema.*;

public class SistemaMain {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner inAluno = new Scanner(System.in);
		
	    AlunoService aluno  = new AlunoService();

	    // Atributos
	    boolean x = true;
	    int opcao = -1;
	    int opsAluno = -1;
	 
	   	
		
	    while(x) {
	     System.out.println("------------------------------");
	     System.out.println("SISTEMA ACAD�MICO ");	
	     System.out.println("Encerrar[0] Aluno[1] Professor[2] Curso[3] ");
	     opcao = teclado.nextInt();
	    
	     
	     switch(opcao){
	    	 case 0: 
	    		  System.out.println("Sistema encerrado!");
	    		  x = false;
	    		  break;
	    	 
	    	 case 1:
	    		   System.out.println("Escolha uma op��o para aluno: ");  
	    		   System.out.println("Cadastrar aluno[1] Listagem de alunos[2] Edi��o de aluno[3] Exclus�o de aluno[4]");
	    		   opsAluno = teclado.nextInt();
	    		 	
	    		   if(opsAluno == 1) { 
	    			   System.out.println("================ CADASTRAR ================");
	    			   System.out.println("Digite o nome do aluno: ");
	    			   String nome = inAluno.nextLine();
	    			   System.out.println("Informe o cpf do aluno: ");
	    			   String cpf = inAluno.nextLine();
	    			   System.out.println("Informe a matr�cula do aluno: ");
	                   System.out.println("C�digo do curso + 4 �ltimos d�gitos do cpf + o ano corrente: ");
	                   String matricula = inAluno.nextLine();
	    			   System.out.println("Informe o o endere�o do aluno: ");
	    			   String endereco = inAluno.nextLine();
	    			   System.out.println("Informe o telefone do aluno: ");
	    			   String telefone = inAluno.nextLine();
	    			   System.out.println("Informe o email do aluno: ");
	    			   String email = inAluno.nextLine();
	    			   System.out.println("Aluno cadastrado com sucesso. "); 
	    			   
	    			   aluno.addAluno(nome,cpf,matricula,endereco,email,telefone);
	    			   break;
	    		 	
	    		   }else if(opsAluno == 2) {
	    			  aluno.listAluno();
	    			  break; 
	    			      
	    		   }else if(opsAluno == 3) {
	    			   System.out.println("Digite a matr�cula do aluno :" );
	    			   Aluno a = aluno.buscarAluno(teclado.next());
	    			   System.out.println("Digite o novo nome do aluno: ");
					   aluno.editarAluno(a, inAluno.nextLine());
	   	    		   a.toString();
	   	    		   System.out.println("Altera�oes feitas com sucesso: ");
	    			   break; 
	    		  
	    		   }else if(opsAluno == 4) {
	    				 System.out.println("Digite a matr�cula do aluno :" );
	    			 	 String excluir = teclado.next();	
	    				 aluno.excluirAluno(excluir);
	    				 break;
	    		   }
	    		  
	    	 case 2:
	    		   
	    		   
	    		   
	    		
	     
	     
	     
	     
	     /*switch*/ }
	     
                     
	    			   
	    		   
	    		 
	    	 
	    
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    }   
	    
	    
		
	

}
