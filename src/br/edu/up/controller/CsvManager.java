package br.edu.up.controller;

import br.edu.up.model.Pessoa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class CsvManager {
    public static void escreverPessoaComEndereco(List<Pessoa> pessoas, String arquivo) {
        try (Writer writer = new FileWriter(arquivo)) {
           
            writer.write("codigo;nome;rua;cidade\n");

            for (Pessoa pessoa : pessoas) {
                String linha = pessoa.getCodigo() + ";" +
                               pessoa.getNome() + ";" +
                               (pessoa.getEndereco() != null ? pessoa.getEndereco().getRua() : "") + ";" +
                               (pessoa.getEndereco() != null ? pessoa.getEndereco().getCidade() : "") + "\n";
                writer.write(linha);
            }

            System.out.println("Archivo '" + arquivo + "' creado exitosamente.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}