package sistema;
import java.util.ArrayList;
import java.util.Scanner;

import classes.sistema.*;

public class SistemaMain {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner inAluno = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Curso curso = new Curso();
		
		
		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		ArrayList<Professor> professores = new ArrayList<Professor>();
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		
		String excluirMatricula;
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
	    			   aluno.setNome(inAluno.nextLine()); 
	    			   System.out.println("Informe o cpf do aluno: ");
	    			   aluno.setCpf(inAluno.nextLine());
	    			   System.out.println("Informe a matr�cula do aluno: ");
	                   System.out.println("C�digo do curso + 4 �ltimos d�gitos do cpf + o ano corrente: ");
	    			   aluno.setMatricula(inAluno.nextLine());
	    			   System.out.println("Informe o o endere�o do aluno: ");
	    			   aluno.setEndereco(inAluno.nextLine());
	    			   System.out.println("Informe o telefone do aluno: ");
	    			   aluno.setTelefone(inAluno.nextLine());
	    			   System.out.println("Informe o email do aluno: ");
	    			   aluno.setEmail(inAluno.nextLine());
	    			   System.out.println("Aluno cadastrado com sucesso. "); 
	    			   
	    			   alunos.add(aluno);
	    			   break;
	    		 	
	    		   }else if(opsAluno == 2) {
	    			   System.out.println("\n=========== LISTA DE ALUNOS  ===========");
	    			   for(Aluno a: alunos) {
	    				  System.out.println(a);
	    			  }
	    			   System.out.println("Total de alunos cadastros: " + alunos.size());
	    			   
	    			   break;
	    			 }else if(opsAluno == 3) {
	    				 System.out.println("================ EDITAR ================");
	    				 
	    				 
	    				 
	    				 
	    			 }else if(opsAluno == 4) {
	    				 System.out.println("================ EXCLUIR ================");
	    				 System.out.println("Digite a matr�cula do aluno :" );
	    				 	 excluirMatricula = teclado.next();	
	    				 for(Aluno a: alunos) {
	    					if(excluirMatricula.equals(a.getMatricula())) {
	    						alunos.remove(a);
	    						System.out.println("Aluno exclu�do com sucesso: ");
	    						break;
	    						}else {
	    							System.out.println("Matr�cula n�o encontrada: ");
	    						}
	    					
	    					}
	    				 
	    				 
	    		   }
	    		  
	    	 case 2:
	    		   
	    		   
	    		   
	    		
	     
	     
	     
	     
	     /*switch*/ }
	     
                     
	    			   
	    		   
	    		 
	    	 
	    
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    
	    
	    }   
	    
	    
		
	

}
