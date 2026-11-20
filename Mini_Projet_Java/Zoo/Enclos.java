/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1.Zoo;
import java.util.ArrayList;


/**
 *
 * @author sissi
 */
public class Enclos 
{
    protected String nom;              
    protected int capaciteMax;         
    protected double superficie;       
    protected String localite;         
    protected ArrayList<Animal> animaux; 
    
     public Enclos(String w, int Capa, double superf, String local) 
     {
        this.nom = w;
        this.capaciteMax = Capa;
        this.superficie = superf;
        this.localite = local;
        this.animaux = new ArrayList<>();
    }

    public String getNom()
    {
        return nom;
    }
    
    public ArrayList<Animal> getAnimaux() 
    {
        return animaux;
    }
    
    public boolean estPlein() 
    {
        return animaux.size() >= capaciteMax;
    }
    
    public void ajouterAnimal(Animal a) 
            
            throws EnclosPleinException 
    {
        if (animaux.size() >= capaciteMax) 
        {
            throw new EnclosPleinException("L'enclos est plein ");
        }
        else
        {  animaux.add(a);
            System.out.println(" Animal ajouté dans l'enclos ");
        }
    }
    
    public void EnleverAnimal(int id) 
    {
        for (int i = 0; i < animaux.size(); i++) 
        {
            Animal a = animaux.get(i);
            if (a.getId() == id)
            {
                animaux.remove(i);  
            }
        }
    }  
    
    public Animal trouverAnimal(int id) 
    {
        for (int i = 0; i < animaux.size(); i++) 
        {
            Animal a = animaux.get(i);
                if (a.getId() == id)
                {
                    return a;
                }    
        } 
        return null;
        
    }
     
}

