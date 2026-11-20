/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1.Zoo;

/**
 *
 * @author sissi
 */
import java.time.LocalDate;

public class Reptile extends Animal implements Carnivore 
{
    
    private final boolean venimeux;

    public Reptile(int x, String y, LocalDate dateNais, boolean veni) 
    {
        super(x, y, dateNais);
        this.venimeux = veni;
    }

    @Override
    public void crier()
    {
        System.out.println(" il cri ssss ");
    }

    @Override
    public void manger() 
    {
        System.out.println(" il avale sa nourriture ");
    }

    @Override
    public void afficherInfos() 
    {
        System.out.println("Reptile [id=" + id + ", nom=" + nom + ", venimeux=" + venimeux + ", âge=" + calculAge() + " ans]");
               
    }
    
    @Override
    public void chasser() 
    {
        System.out.println(" il chasse ");
    }
}