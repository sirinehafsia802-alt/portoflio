/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1.Zoo;

import java.time.LocalDate;

/**
 *
 * @author sissi
 */
public class Mammifere extends Animal implements Carnivore 
{

    private final String espece;

    public Mammifere(int x, String y, LocalDate dateNais, String espe) 
    {
        super(x, y, dateNais);
        this.espece = espe;
    }

    @Override
    public void crier() 
    {
        System.out.println(" il cri roar ");
    }

    @Override
    public void manger() 
    {
        System.out.println(" il mange de la viande");
    }

    @Override
    public void afficherInfos() 
    {
        System.out.println("Mammifère [id=" + id + ", nom=" + nom +", espece=" + espece + ", age=" + calculAge() + " ans]");
                
    }

    @Override
    public void chasser() 
    {
        System.out.println(" il chasse ");
    }
}
