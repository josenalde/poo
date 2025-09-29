//package src;
public class App {
    public static void main(String[] args) throws Exception {
        /*Quadrado quadrado = new Quadrado(3);
        Circulo circulo = new Circulo(1);
        System.out.println("Perimetro: " + quadrado.calcularPerimetro());
        System.out.println("Area: " + quadrado.calcularArea());

        System.out.println("Circunferencia: " + circulo.calcularCircunferencia());
        System.out.println("Area: " + circulo.calcularArea());

        System.out.println(FiguraGeometrica.calcularDistancia(4,8));*/

       
              int[] myNumbers = {1, 2, 3};
              int res = 0;
              try {
                  System.out.println(myNumbers[1]);
                  res = 1 / 0;
              } catch (IndexOutOfBoundsException e) {
                  e.printStackTrace();
              } catch (ArithmeticException e) {
                  System.out.println(e);
                  res = 0;
              }  finally {
              System.out.println(res);
              }
            }
          
        

    }

