package br.edu.up.view;

import br.edu.up.controller.PessoaController;
import br.edu.up.model.Endereco;
import br.edu.up.model.Pessoa;
import br.edu.up.controller.CsvManager;

import java.util.List;

public class Programa {
    public static void main(String[] args) {
        PessoaController controller = new PessoaController();

        Pessoa pessoa1 = new Pessoa(1, "Paulo");
        Pessoa pessoa2 = new Pessoa(2, "Carlos");
        Pessoa pessoa3 = new Pessoa(3, "Ana");

        controller.adicionarPessoa(pessoa1);
        controller.adicionarPessoa(pessoa2);
        controller.adicionarPessoa(pessoa3);

        Endereco endereco1 = new Endereco("Rua A", "Wiritaba");
        Endereco endereco2 = new Endereco("Rua B", "Sao Paulo");
        Endereco endereco3 = new Endereco("Rua C", "Blumenau");

        controller.adicionarEndereco(1, endereco1);
        controller.adicionarEndereco(1, endereco2); 
        controller.adicionarEndereco(3, endereco3);

        List<Pessoa> pessoasConEndereco = controller.getPessoas();
        CsvManager.escreverPessoaComEndereco(pessoasConEndereco, "PessoaComEndereco.csv");

        System.out.println("Archivo 'PessoaComEndereco.csv' creado exitosamente.");
    }
}