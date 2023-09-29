public class CalculoAreaCubica { 

    public static double calcularAreaCubica(double altura, double comprimento, double largura) { 

        // Valida se a Altura, Largura e Comprimento são não negativos 

        if (altura < 0 || comprimento < 0 || largura < 0) { 

            return 0.0; // Retorna 0 se algum dos valores for negativo 

        } 

        // Calcula a área cúbica 

        double areaCubica = altura * comprimento * largura; 

        return areaCubica; 

    } 

    public static void main(String[] args) { 

        // Exemplo de uso 

        double altura = 2.0; 

        double comprimento = 5.0; 

        double largura = 3.0; 


        double areaCubica = calcularAreaCubica(altura, comprimento, largura); 
  
        System.out.println("A área cúbica é: " + areaCubica + " m³"); 

    } 

} 
