/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1.Zoo;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author sissi
 */
public abstract class Animal 
{
    protected int id;
    protected String nom;
    protected LocalDate dateNaissance;

    public Animal(int x, String y, LocalDate dateNais) 
    {
        this.id = x;
        this.nom = y;
        this.dateNaissance = dateNais;
        int annee = dateNais.getYear();
        int mois = dateNais.getMonthValue();
        int jour = dateNais.getDayOfMonth();
        if (annee <= 2025 && mois <= 12 && jour <= 31) 
           {this.dateNaissance = dateNais;}  
        else 
        {  System.out.println("Date invalide car La date doit être >= 2025, mois <= 12, jour <= 31");
           this.dateNaissance = LocalDate.of(2025, 1, 1); 
        }
    }

    public int getId() 
    {
        return id;
    }

    public int calculAge() 
    {
        return Period.between(dateNaissance, LocalDate.now()).getYears();
    }

    public abstract void crier();
    public abstract void manger();
    public abstract void afficherInfos();
    
}
