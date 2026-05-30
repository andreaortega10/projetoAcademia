/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private Connection con;

    public Connection conectar() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            String url =
                "jdbc:mysql://localhost:3306/academia?serverTimezone=America/Sao_Paulo";

            String usuario = "root";
            String senha = "";

            con = DriverManager.getConnection(
                    url,
                    usuario,
                    senha
            );

            System.out.println("Conexão realizada com sucesso!");

        } catch (Exception e) {

            System.out.println(
                    "Erro na conexão: "
                    + e.getMessage()
            );
        }

        return con;
    }

    public void desconectar() {

        try {

            if (con != null) {
                con.close();
            }

        } catch (SQLException e) {

            System.out.println(
                    "Erro ao fechar conexão: "
                    + e.getMessage()
            );
        }
    }
}