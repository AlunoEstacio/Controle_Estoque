package controle;

import servico.ServicoLogin;

public class ControleLogin {
    ServicoLogin servicoLogin = new ServicoLogin();
    
    public boolean verificarLoginFuncionario(String email, String senha){
        boolean resultadoVerificacao = servicoLogin.verificarLogin(email, senha);
        return resultadoVerificacao;
    };
    
}
