package bola;

/**
 *
 * @author Sekar Arum
 */
public class Bola 
{
    //Deklarasi
    public int jarijari;
    public double phi = 3.14;
    public int getjarijari()
        {
            return jarijari;   
        }
    public double getphi()
        {
            return phi;
        }
    public void setjarijari(int newJarijari)
        {
            jarijari = newJarijari;
        }
    public void setphi(double newPhi)
        {
            phi=newPhi;             
        }
    public void showDiameter()
        {
            int D;
            D = jarijari * 2;
            System.out.println("Diameter : " +D+ "cm");
        }
    public void showluas()
        {
            double L;
            L = 4*Math.PI*jarijari*jarijari;
            System.out.println("Luas : " +L+ "cm kuadrat");
        }
    public void showVolume()
        {
            double V;
            V = (4*Math.PI*jarijari*jarijari*jarijari)/3;
            System.out.println("Volume : " +V+ "cm3");
        } 
}

