package usjt;

public class Quadrado extends Poligono implements Diagonal{

   public Quadrado(double base) {
      this.base = base;	
   }
   
   @Override
   public double area() {
      return this.getBase() * this.getBase();
   }
   
   @Override
   public double diagonal() {
      return  getBase() * Math.sqrt(2);
   }
   
   @Override
   public double perimetro() {
      return 4 * this.base;
   }
}
