package sistema;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import service.*;

public class SistemaMain {
	
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Scanner inAluno = new Scanner(System.in);
		
	    AlunoService aluno  = new AlunoService();
	    ProfessorService professor = new ProfessorService();
	    CursoService  curso = new CursoService();

	    // Atributos
	    boolean trueMenu = true;
	    boolean trueAluno = true;
	    boolean trueProfessor = true;
	    boolean trueCurso = true;
	    int opcao = -1;
	    int opsAluno = -1;
	    int opsProfessor = -1;
	 
	   	
		
	    while(trueMenu) {
	     trueAluno = true; 
	     System.out.println("------------------------------");
	     System.out.println("SISTEMA ACADÊMICO ");	
	     System.out.println("Encerrar[0] Aluno[1] Professor[2] Curso[3] ");
	     opcao = teclado.nextInt();
	     
	     switch(opcao){
	    	 case 0: 
	    		  System.out.println("Sistema encerrado!");
	    		  trueMenu = false;
	    		  break;
	    	 
	    	 case 1:
	    		   while(trueAluno) {
	    		   System.out.println("Escolha uma opção para aluno: ");  
	    		   System.out.println("Cadastrar aluno[1] Listagem de alunos[2] Edição de aluno[3] Exclusão de aluno[4]");
	    		   System.out.println("Voltar para o menu inicial[0]");
	    		   opsAluno = teclado.nextInt();
	    		 	
	    		   switch(opsAluno) {
	    		   case 0: 
	 	    		  System.out.println("Saindo do menu aluno ! ");
	 	    		  trueAluno = false;
	 	    		  break;
	 	    	 
	    		   case 1:
	    			   System.out.println("================ CADASTRAR ================");
	    			   System.out.println("Digite o nome do aluno: ");
	    			   String nome = inAluno.nextLine();
	    			   System.out.println("Informe o cpf do aluno: ");
	    			   String cpf = inAluno.nextLine();
	    			   System.out.println("Informe a matrícula do aluno: ");
	                   System.out.println("Código do curso + 4 últimos dígitos do cpf + o ano corrente: ");
	                   String matricula = inAluno.nextLine();
	    			   System.out.println("Informe o o endereço do aluno: ");
	    			   String endereco = inAluno.nextLine();
	    			   System.out.println("Informe o telefone do aluno: ");
	    			   String telefone = inAluno.nextLine();
	    			   System.out.println("Informe o email do aluno: ");
	    			   String email = inAluno.nextLine();
	    			   System.out.println("Aluno cadastrado com sucesso. "); 
	    			   
	    			   aluno.addAluno(nome,cpf,matricula,endereco,email,telefone);
	    			   break;
	    		 	
	    		   case 2:
	    			  aluno.listAluno();
	    			  break; 
	    			      
	    		   case 3: 
	    			   System.out.println("Digite a matrícula do aluno :" );
	    			   Aluno a = aluno.buscarAluno(teclado.next());
	    			   System.out.println("Digite o novo nome do aluno: ");
					   aluno.editarAluno(a, inAluno.nextLine());
	   	    		   a.toString();
	   	    		   System.out.println("Alteraçoes feitas com sucesso: ");
	    			   break; 
	    		  
	    		   case 4:
	    				 System.out.println("Digite a matrícula do aluno :" );
	    			 	 String excluir = teclado.next();	
	    				 aluno.excluirAluno(excluir);
	    				 break;
		 /*switch aluno*/ }  
	     }
	    		   
	    	 case 2:
	    		 while(trueProfessor) {
	    		 System.out.println("Escolha uma opção para professor: ");                  
	             System.out.println("Cadastro professor[1] Listagem de professores[2] Edição de professores[3] Exclusão de professores[4]");
	             System.out.println("Voltar para o menu inicial[0]");
	             opsProfessor = teclado.nextInt();
	              
	             switch(opsProfessor) {
	             case 0: 
	 	    		  System.out.println("Saindo do menu professor ! ");
	 	    		  trueProfessor = false;
	 	    		  break;
	            
	             case 1:
	             System.out.println("Informe o nome do professor: ");
                 String nome = teclado.next();
                 System.out.println("Informe o cpf do professor: ");
                 String cpf = teclado.next();
                 System.out.println("Informe o  endereço do professor: ");
                 String endereco = teclado.next();  
                 System.out.println("Informe o email do professor: ");
                 String email= teclado.next();             
                 System.out.println("Informe o telefone do professor: ");
                 String telefone = teclado.next();
                 System.out.println("Informe a categoria do professor: ");
                 System.out.println("[Especialista] [Mestre] [Doutor] ");
                 String categoria = teclado.next(); 
                 System.out.println("Professor cadastrado com sucesso. ");    
	    		
	             professor.addProfessor(nome, cpf, endereco, email, telefone, categoria);
	             break; 
	             
	             case 2:
	            	 professor.listProfessores();
	            	 break;
	            	 
	            	 
	             case 3:
	            	 
	             
	            	 
	             case 4: 
	            	 System.out.println("Digite o cpf do professor: ");
	            	 String excluirCpf = teclado.next();
	            	 professor.excluirProfessor(excluirCpf);
	            	 break;
	            	 
	     /*switch professor*/ }
	     }
	     
	    	 case 3:
	    		 System.out.println("Escolha uma opção para curso\n");
				 System.out.println("1 - Cadastrar curso");
				 System.out.println("2 - Listagem de cursos");
				 System.out.println("3 - Editar curso");
				 System.out.println("4 - Excluir curso");
				 System.out.println("0 - Votar ao menu inicial");
	    		 opsProfessor = teclado.nextInt();
	    		 
	    		 switch(opsProfessor) {
	    		 case 1:
	    			 System.out.println("Digite o nome do curso: ");
                	 String nome = teclado.next(); 
                	 System.out.println("Digite o código do curso, número de 4 dígitos: ");
                	 String codigo = teclado.next(); 
                	 System.out.println("Digite o turno do curso: ");
                	 System.out.println("[Manhã] [Tarde] [Noite] "); 	 
                	 String turno = teclado.next(); 
                	 System.out.println("Digite o professor coordenador: ");
                	 String nomeProf  = teclado.next(); 
                	 System.out.println("Curso cadastrado com sucesso. "); 
                	 
                	 curso.addCurso(nome, codigo, turno, nomeProf);
                	 break;
	    		 
	    		 case 2: 
	    			 curso.listCurso();
	    			 break;
	    		 
	    		 
	    		 case 3:
	    			 
	    			 System.out.println("Digite o código do curso: ");
	    			 
	    		 
	    		 }
	     
	     
	     
	     /*switch menu*/ }
         }
	    
	    
	    
	   
	
	}   
	    	

}
