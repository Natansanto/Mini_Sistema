package sistema;
import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import service.*;

public class SistemaMain {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
	    AlunoService aluno  = new AlunoService();
	    ProfessorService professor = new ProfessorService();
	    CursoService  curso = new CursoService();
	    
	    boolean trueMenu = true;
	    int opcao = -1;
	   	
		
	    while(trueMenu) { 
	     System.out.println("========================");
		 System.out.println("          MENU          ");
		 System.out.println("========================");
	     System.out.println("SISTEMA ACADÊMICO");	
	     System.out.println("1 - ALUNO         2 - PROFESSOR");
		 System.out.println("3 - CURSO         0 - ENCERRAR");
	     opcao = teclado.nextInt();
	     
	     int opsAluno = -1;
	     int opsCurso = -1;
	     int opsProfessor = -1;
	     
	     switch(opcao){
	    	 case 0: 
	    		  System.out.println("Sistema encerrado!");
	    		  trueMenu = false;
	    		  break;
	    	 
	    	 case 1:
	    		   while(opsAluno!=0) {
	    			 System.out.println("Escolha uma opção para Aluno:\n");
	  				 System.out.println("1 - Cadastrar aluno");
	  				 System.out.println("2 - Listagem de aluno");
	  				 System.out.println("3 - Editar aluno");
	  				 System.out.println("4 - Excluir aluno");
	  				 System.out.println("0 - Votar ao menu inicial");
	    		   opsAluno = teclado.nextInt();
	    		 	
	    		   switch(opsAluno) {
	    		   case 1:
	    			   System.out.println("================ CADASTRAR ================");
	    			   System.out.println("Digite o nome do aluno: ");
	    			   String nome = teclado.next();
	    			   System.out.println("Informe o cpf do aluno: ");
	    			   String cpf = teclado.next();
	    			   System.out.println("Informe a matrícula do aluno: ");
	                   System.out.println("Código do curso + 4 últimos dígitos do cpf + o ano corrente: ");
	                   String matricula = teclado.next();
	    			   System.out.println("Informe o o endereço do aluno: ");
	    			   String endereco = teclado.next();
	    			   System.out.println("Informe o telefone do aluno: ");
	    			   String telefone = teclado.next();
	    			   System.out.println("Informe o email do aluno: ");
	    			   String email = teclado.next();
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
					   aluno.editarAluno(a, teclado.next());
	   	    		   a.toString();
	   	    		   System.out.println("Alteraçoes feitas com sucesso: ");
	    			   break; 
	    		  
	    		   case 4:
	    			     System.out.println("================ EXCLUIR ================");
	    				 System.out.println("Digite a matrícula do aluno :" );
	    			 	 String excluir = teclado.next();	
	    				 aluno.excluirAluno(excluir);
	    				 break;
	    		   
	    		   default:
						
						break;
		 /*switch aluno*/ }  
	     }
	    		   opsAluno = -1;
	    		   break;
	    		   
	    	 case 2:
	    		 while(opsProfessor!=0) {
	    			 System.out.println("Escolha uma opção para Professor:\n");
	  				 System.out.println("1 - Cadastrar professor");
	  				 System.out.println("2 - Listagem de professor");
	  				 System.out.println("3 - Editar professor");
	  				 System.out.println("4 - Excluir professor");
	  				 System.out.println("0 - Votar ao menu inicial");
	             opsProfessor = teclado.nextInt();
	              
	             switch(opsProfessor) {
	             case 1:
	             System.out.println("================ CADASTRAR ================");
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
	            	 System.out.println("================ EXCLUIR ================");
	            	 System.out.println("Digite o cpf do professor: ");
	            	 String excluirCpf = teclado.next();
	            	 professor.excluirProfessor(excluirCpf);
	            	 break;
	            	 
	             default:
						
					break;
	            	 
	     /*switch professor*/ }
	     }
	    		 opsProfessor = -1;
	    		 break; 
	    	
	    	 case 3:
			while(opsCurso!=0) {
	    		 System.out.println("Escolha uma opção para Curso:\n");
				 System.out.println("1 - Cadastrar curso");
				 System.out.println("2 - Listagem de cursos");
				 System.out.println("3 - Excluir curso");
				 System.out.println("4 - Editar curso");
				 System.out.println("0 - Votar ao menu inicial");
	    		 opsCurso = teclado.nextInt();
	    		 
	    		 switch(opsCurso) {
	    		 case 1:
	    			 System.out.println("================ CADASTRAR ================");
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
	    			 System.out.println("================ EXCLUIR ================");
	    			 System.out.println("Digite o código do curso: ");
	    			 String excluirCurso = teclado.next();
	    			 curso.excluirCurso(excluirCurso); 
	    			 break; 	 
	    		 
	    		 
	    		 case 4:
	    			 int opsCursoEditar = -1;
	    			 do {
	    			 System.out.println("Digite o que deseja editar:");
						System.out.println("1 - Nome do curso.");
						System.out.println("2 - Código do curso.");
						System.out.println("3 - Turno do curso");
						System.out.println("4 - Professor Coordenador do curso.");
						System.out.println("0 - Sair");
						opsCursoEditar = teclado.nextInt();
					 
					 switch(opsCursoEditar) {
					 case 1:
					 System.out.println("================ EDITAR ================");
	    			 System.out.println("Digite o código do curso: ");
	    			 Curso n = curso.buscarCurso(teclado.next());
	    			 if(n == null){
	    				 break;
	    			 } 	    			 
	    			 System.out.println("Digite o novo nome: ");
	    			 curso.editCursoNome(n, teclado.next());
	    			 System.out.println("Alteração feita com sucesso!");
	    			 break; 
	    			 
					 case 2:
					 System.out.println("================ EDITAR ================");
					 System.out.println("Digite o código do curso atual: ");
		    		 Curso c = curso.buscarCurso(teclado.next());
		    		 if(c == null){
		    			break;
		    		 } 	    			 
		    		 System.out.println("Digite o novo código, número de 4 dígitos: ");
		    		 curso.editCursoCod(c, teclado.next());
		    		 System.out.println("Alteração feita com sucesso!");
		    		 break;
					
					 case 3:
					 System.out.println("================ EDITAR ================");
					 System.out.println("Digite o código do curso: ");
		    		 Curso t = curso.buscarCurso(teclado.next());
			   		 if(t == null){
			   			break;
			   		 } 	    			 
		    		 System.out.println("Digite o novo turno:");
		    		 System.out.println("[Manhã] [Tarde] [Noite] "); 
			   		 curso.editCursoTurno(t, teclado.next());
			   		 System.out.println("Alteração feita com sucesso!");
			   		 break; 
					
					 case 4:
					 System.out.println("================ EDITAR ================");
					 System.out.println("Digite o código do curso atual: ");
		    		 Curso p = curso.buscarCurso(teclado.next());
			   		 if(p == null){
			   			break;
			   		 } 	    			 
			   		 System.out.println("Digite o novo professor coordenador do curso: ");
			   		 curso.editCursoProf(p, teclado.next());
			   		 System.out.println("Alteração feita com sucesso!");
			   		 break;    		 
					
					 default:
						
						break;
	    			 
		 }/*switch cursoEditar*/
					 }while (opsCursoEditar!=0);
	    		 
	    			 opsCurso = -1;
	    			 break;
	    
	    
	    		 		 
	    }/*switch curso */ 
	    		 }
	    		 
			
	    	 
	     
	     
	     /*switch menu*/ }
         }
	    
	    
	
	   
	
	}   
	    	

}
