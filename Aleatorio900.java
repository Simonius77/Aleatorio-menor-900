/**Escriba un bucle que imprima repetidamente números aleatorios del 0 al 999 (inclusive) hasta que se imprima un número superior a 900 (es decir, mayor o igual que 900). Siempre se debe imprimir al menos una línea de salida, incluso si el primer número aleatorio está por encima de 900. Aquí hay una ejecución de ejemplo:do/while
**/




Random random =new Random();
int number=0;
do{
number =ramdom.nextInt(1000);
System.out.println("Nuemro ramndom" + number);
}while(number<900);