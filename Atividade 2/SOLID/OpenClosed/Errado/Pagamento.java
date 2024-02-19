package SOLID.OpenClosed.Errado;

public class Pagamento {
    
    public void receberPagamento(Funcionario funcionario){
        //Essa implementacao esta errada, pois para cada tipo de funcionario novo, deve-se alterar o codigo adicionando mais um if, ferindo o principio Open/Closed.
        //Caso tivesse 50 tipos de funcionarios, seria necessario ter pelo menos 49 ifs, o que não é nada legal.
        if(funcionario instanceof FuncionarioPJ){
            ((FuncionarioPJ)funcionario).receberPagamento();
        }else if(funcionario instanceof FuncionarioAssalariado){
            ((FuncionarioAssalariado)funcionario).receberPagamento();
            
        }else{
            ((Estagiario)funcionario).receberPagamento();
        }
    }
}
