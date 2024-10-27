package com.matheus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private com.matheus.repository.UsuarioRepository usuarioRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);  // Inicializa o Spring Boot
    }

    @Override
    public void run(String... args) {
        /*
        // Criando um novo usuário
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome("Matheus Oliveira Pereira");
        novoUsuario.setEmail("matheus.pereira@gmail.com");
        novoUsuario.setSenha("M@theus_!_30");
        novoUsuario.setDataNascimento("1996-12-28");
        novoUsuario.setCpf("02255788241");
        novoUsuario.setTelefone("98991968439");
        novoUsuario.setEndereco("Rua Ipiranga, 517");

        // Salvando o novo usuário
        usuarioRepository.save(novoUsuario);
        */

        /*
        // Atualizando um usuário existente
        Usuario usuarioExistente = usuarioRepository.findById(1L).orElse(null);
        if (usuarioExistente != null) {
            // Atualizando as informações do usuário
            usuarioExistente.setNome("João Silva Atualizado");

            // Salvando as mudanças
            usuarioRepository.save(usuarioExistente);

            // Mensagem informando o resultado da operação
            System.out.println("Usuário atualizado com sucesso!");
        } else {
            // Mensagem informando o resultado da operação
            System.out.println("Usuário não encontrado.");
        }
        */

        /*
        // Deletando um usuário
        Long idParaDeletar = 1L; // ID do Usuário

        // Buscando o usuário com o ID fornecido
        Usuario usuarioExistente = usuarioRepository.findById(idParaDeletar).orElse(null);

        // Verificando se o este usuário existe
        if (usuarioExistente != null) {
            // Deletando o usuário com o ID fornecido
            usuarioRepository.deleteById(idParaDeletar);

            // Mensagem informando o resultado da operação
            System.out.println("Usuário com ID " + idParaDeletar + " deletado com sucesso.");
        } else {
            // Mensagem informando o resultado da operação
            System.out.println("Usuário não encontrado.");
        }
        */

        // Listar todos os usuários
        List<com.matheus.modelo.Usuario> usuarios = usuarioRepository.findAll();
        usuarios.forEach(usuario ->
                System.out.println("ID: " + usuario.getId() + ", Nome: " + usuario.getNome() + ", Email: " + usuario.getEmail())
        );
    }
}
