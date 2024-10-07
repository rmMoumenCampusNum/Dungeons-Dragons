package db;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SQL {
    // Remplacez ces informations par les vôtres
    private static final String URL = "jdbc:mysql://localhost:3306/DonjonEtDragon";
    private static final String USER = "Moumen";
    private static final String PASSWORD = "Moumen";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Établir la connexion
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            statement = connection.createStatement();

            // Créer une table
            String sql = "CREATE TABLE IF NOT EXISTS Hero (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "nom VARCHAR(100), " +
                    "type VARCHAR(100)," +
                    "health INT," +
                    "strength INT," +
                    "equipementOffensif VARCHAR(100)," +
                    "equipementDefensif VARCHAR(100)" +
                    ")";
            statement.executeUpdate(sql);
            System.out.println("Table créée avec succès.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Fermer les ressources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        insertHero("Moumen", "fr.campus.DonjonEtDragon.characters.Warrior", 20, 10, "Épée", "Bouclier");
        System.out.println(getHeroes());
    }

    public static void insertHero(String nom, String type, int health, int strength, String equipementOffensif, String equipementDefensif) {
        String query = "INSERT INTO Hero (nom, type, health, strength, equipementOffensif, equipementDefensif) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Définir les paramètres de la requête
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, type);
            preparedStatement.setInt(3, health);
            preparedStatement.setInt(4, strength);
            preparedStatement.setString(5, equipementOffensif);
            preparedStatement.setString(6, equipementDefensif);

            // Exécuter l'insertion
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Héros inséré avec succès.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getHeroes() {
        String query = "SELECT * FROM Hero";
        List<String> heroes = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                String hero = "Nom: " + resultSet.getString("nom") +
                        ", Type: " + resultSet.getString("type") +
                        ", Health: " + resultSet.getInt("health") +
                        ", Strength: " + resultSet.getInt("strength");
                heroes.add(hero);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return heroes;
    }

    public static void deleteHero(int id) {
        String query = "DELETE FROM Hero WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Définir le paramètre de la requête (l'id du héros à supprimer)
            preparedStatement.setInt(1, id);

            // Exécuter la suppression
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Héros supprimé avec succès.");
            } else {
                System.out.println("Aucun héros trouvé avec cet id.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editHero(int id, String nom, String type, int health, int strength, String equipementOffensif, String equipementDefensif) {
        String query = "UPDATE Hero SET nom = ?, type = ?, health = ?, strength = ?, equipementOffensif = ?, equipementDefensif = ? WHERE id = ?";

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            // Définir les paramètres de la requête
            preparedStatement.setString(1, nom);
            preparedStatement.setString(2, type);
            preparedStatement.setInt(3, health);
            preparedStatement.setInt(4, strength);
            preparedStatement.setString(5, equipementOffensif);
            preparedStatement.setString(6, equipementDefensif);
            preparedStatement.setInt(7, id);

            // Exécuter la mise à jour
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Héros mis à jour avec succès.");
            } else {
                System.out.println("Aucun héros trouvé avec cet id.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}


