package servico;

import dao.LoginDAO;
import modelo.Funcionario;

public class ServicoLogin {
    LoginDAO loginDAO = new LoginDAO();
    
    public boolean verificarLogin(String email, String senha){
        Funcionario func = buscarFuncionario(email);
        
        if(func != null){
            if(func.getEmail().equals(email)){
                if(func.getSenha().equals(senha)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    
    private Funcionario buscarFuncionario(String email){
        Funcionario func = loginDAO.buscarFuncionarioEmail(email);
        if(func != null){
            return func;
        }else{
            return null;
        }
    }
    
}
