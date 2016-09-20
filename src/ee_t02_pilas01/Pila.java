package ee_t02_pilas01;
/**
 * @author Duxabner
 */

public class Pila {

    char[] pila;
    int tope;
    int tamanio;

    public Pila(int tamanio) {

        tope = 0;
        pila = new char[tamanio];
        this.tamanio = tamanio;
    }

    public void push(char dato) {

        if (tope < tamanio) {
            tope++;
            pila[tope] =  dato;

        } else {
            System.out.println(" Desbordamiento");
        }
    }

    public Character pop() {

        Character resultado = ' ';

        if (tope > -1) {

            resultado = pila[tope];
            pila[tope] = ' ';
            tope--;

        } else {
            System.out.println(" Subdesbordamiento ");
        }
        return resultado;
    }

    public char peek() {

        char resultado = ' ';

        if (tope > -1) {
            resultado = pila[tope];

        } else {
            System.out.println(" Subdesbordamiento ");

        }
        return resultado;

    }

    public boolean vacia() {
        boolean bandera = true;

        if (tope == -1) {
            bandera = true;
        } else {
            bandera = false;
        }

        return bandera;
    }


       public void recorrerCadena(String cad, Pila p) {

        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == '(' || cad.charAt(i) == '[' || cad.charAt(i) == '{') {
                p.push(cad.charAt(i));
            } else {

                if (cad.charAt(i) == ')') {
                    if (pila[tope] == '(') // bandera=true;
                    {
                        p.pop();
                    } else {

                        return;
                    }
                } else if (cad.charAt(i) == ']') {
                    if (pila[tope] == '[') {

                        p.pop();
                    } else {

                        return;
                    }
                } else if (cad.charAt(i) == '}') {
                    if (pila[tope] == '{') {

                        p.pop();
                    }
                } else {

                    return;
                }
            }

        }
    
        if (pila[0] == ' ') {
            System.out.println("si");
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {

        Pila pi = new Pila(6);
        pi.recorrerCadena("{[()]}", pi);

    }
}


/*public void leer() {

     try {

     FileReader fr = new FileReader("Leer1.txt");
     BufferedReader br = new BufferedReader(fr);

     tamanio = Integer.parseInt(br.readLine());

     miPila = new Pila(tamanio + 1);

     System.out.println(" Entrada de datos:" + "\n" + tamanio);

     while ((cadena = br.readLine()) != null) {
     miPila.push(cadena);
     System.out.println(cadena);

     }

     } catch (Exception e) {
     System.out.println(" Archivo no encontrado ");

     }
     }*/
 




/*Pila miPila2 = new Pila(tamanio * 100);

        String expresion = miPila.pop();

        char[] pilaa = new char[expresion.length()];
        for (int i = 0; i < expresion.length(); i++) {

            pilaa[i] = expresion.charAt(i);

        }
        boolean flag = false;
        int j = 0;

        while (!flag && j < pilaa.length) {

            if (pilaa[j] == '(' || pilaa[j] == '{' || pilaa[j] == '[') {
                miPila2.push(String.valueOf(pilaa[j]));

            } else {

                if (!miPila2.vacia()) {
                    //System.out.println("no");
                } else {

                    String compara = miPila2.pop();

                    if ((compara + ")").equals("()") || (compara + "]").equals("[]") || (compara + "}").equals("{}")) {
                        System.out.println("YES");

                    }
                }
            }
        }*/


    
