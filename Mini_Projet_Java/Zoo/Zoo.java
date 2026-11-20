/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1.Zoo;
import java.util.HashMap;
/**
 *
 * @author sissi
 */
public class Zoo 
{
    final HashMap<String, Enclos>        
    enclos = new HashMap<>();

    public void ajouterEnclos(Enclos e) 
    {
        enclos.put(e.getNom(), e);
    }

    public void afficherTousLesAnimaux() 
    {
        for (Enclos e : enclos.values()) 
        {
            System.out.println("Enclos : " + e.getNom());
            for (Animal a : e.getAnimaux()) 
            {
                a.afficherInfos();
            }
        }
    }

    public void deplacerAnimal(int id, String source, String destination)
            
            throws AnimalNonTrouveException, DeplacementImpossibleException, EnclosPleinException 
    {

        Enclos enclosSource = enclos.get(source);
        Enclos enclosDest = enclos.get(destination);
        if (enclosSource == null || enclosDest == null)
            
            throw new DeplacementImpossibleException("Enclos inexistant ");

        Animal a = enclosSource.trouverAnimal(id);
         if (a == null)
            throw new AnimalNonTrouveException("Animal introuvable ");

        enclosDest.ajouterAnimal(a);
        enclosSource.EnleverAnimal(id);
    }

    public Animal rechercherAnimal(int id) 
    {
        for (Enclos e : enclos.values()) 
        {
            Animal a = e.trouverAnimal(id);
             if (a != null) 
                return a;
        }
        return null;
    }
}