/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ds1.Zoo;
import java.util.Scanner;
import java.time.LocalDate;
/**
 *
 * @author sissi
 */
public class Main 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();

        while (true) 
        {
            System.out.println("\n_____MENU ZOO______");
            System.out.println("1. Ajouter un enclos");
            System.out.println("2. Ajouter un animal");
            System.out.println("3. Deplacer un animal");
            System.out.println("4. Supprimer un animal");
            System.out.println("5. Afficher tous les animaux");
            System.out.println("6. Rechercher un animal par ID");
            System.out.println("7. Quitter");
            System.out.print("Choix : ");
            
            int choix = sc.nextInt();
            switch (choix) 
            {

                case 1: 
                {
                    System.out.print("Nom enclos : ");
                    String nom = sc.next();
                    System.out.print("Capacite : ");
                    int cap = sc.nextInt();
                    System.out.print("Superficie : ");
                    double sup = sc.nextDouble();
                    System.out.print("Localite : ");
                    String loc = sc.next();
                    zoo.ajouterEnclos(new Enclos(nom, cap, sup, loc));
                    System.out.println("Enclos ajoute !");
                    break;
                }

                case 2:
                {
                    System.out.print("ID : ");
                    int id = sc.nextInt();
                    System.out.print("Nom animal : ");
                    String nom = sc.next();
                    System.out.print("jour de naissance: ");
                    int jour = sc.nextInt();
                    System.out.print("mois de naissance: ");
                    int mois = sc.nextInt();
                    System.out.print("annee de naissance: ");
                    int annee = sc.nextInt();
                    LocalDate dateNais = LocalDate.of(annee, mois, jour);
                    System.out.println("Date de naissance : " + jour + "/" + mois + "/" + annee);
                    System.out.print("Type 1=Mammifere, 2=Oiseau, 3=Reptile : ");
                    int type = sc.nextInt();
                    System.out.print(" dans quelle enclos doit mettre l'animal : ");
                    String enclosNom = sc.next();
                    
                    Animal a = null;
                    switch (type) 
                    {
                        case 1 -> 
                        {
                            System.out.print("Espece : ");
                            String esp = sc.next();
                            a = new Mammifere(id, nom, LocalDate.of(annee, 1, 1), esp);
                        }
                        case 2 -> 
                        {
                            System.out.print("Envergure : ");
                            double envergure = sc.nextDouble();
                            a = new Oiseau(id, nom, LocalDate.of(annee, 1, 1), envergure);
                        }
                        case 3 -> 
                        {
                            System.out.print("Venimeux (true/false) : ");
                            boolean ven = sc.nextBoolean();
                            a = new Reptile(id, nom, LocalDate.of(annee, 1, 1), ven);
                        }
                        default -> 
                        {
                        }
                    }

                        try 
                        {
                            zoo.enclos.get(enclosNom).ajouterAnimal(a);
                            System.out.println("Animal ajoute ");
                        } catch (EnclosPleinException e) 
                        {
                            System.out.println(e.getMessage());
                        }
                    }

                case 3: 
                {
                    System.out.print("ID animal : ");
                    int id = sc.nextInt();
                    System.out.print("Enclos source : ");
                    String src = sc.next();
                    System.out.print("Enclos destination : ");
                    String dest = sc.next();

                    try 
                    {
                        zoo.deplacerAnimal(id, src, dest);
                        System.out.println("Deplacement réussi !");
                    } 
                    catch (AnimalNonTrouveException | DeplacementImpossibleException | EnclosPleinException e) 
                    {
                        System.out.println("Erreur : " +e.getMessage());
                    }
                    
                }
                case 4: 
                {
                    System.out.print("Enclos : ");
                    String enc = sc.next();
                    System.out.print("ID animal a supprimer : ");
                    int id = sc.nextInt();
                    zoo.enclos.get(enc).EnleverAnimal(id);
                    System.out.println("Animal supprime.");
                    break;
                }

                case 5:
                 {zoo.afficherTousLesAnimaux();}

                case 6: 
                {
                    System.out.print("ID animal : ");
                    int id = sc.nextInt();
                    Animal a = zoo.rechercherAnimal(id);
                    if (a != null)
                        a.afficherInfos();
                    else 
                        System.out.println("Animal introuvable.");
                    break;
                }

                case 7:
                 { System.out.println(" c'est finit ");
                    System.exit(0);
                 }
            }
        }
    }  
}