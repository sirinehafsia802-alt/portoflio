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
 public class Oiseau extends Animal implements Herbivore 
 {

    private final double envergure;

    public Oiseau(int x, String y, LocalDate dateNais, double enver) 
    {
        super(x, y, dateNais);
        this.envergure = enver;
    }

    @Override
    public void crier() 
    {
        System.out.println(" il cri kwa kwa");
    }

    @Override
    public void manger() 
    {
        System.out.println(" il mange des graines et les plantes");
    }

    @Override
    public void brouter() 
    {
        System.out.println( " il mange les herbes et les graines de la terre ");
    }

    @Override
    public void afficherInfos() 
    {
        System.out.println("Oiseau ID=" + id +", Nom=" + nom +", age=" + calculAge() + " ans" +", Envergure=" + envergure + " metre" +", Type=Herbivore "); 
                         
    }
}
    

