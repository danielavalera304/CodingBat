/*Esta clase se llama EjerciciosLogic1DanielaValera porque voy a poner aqui
 * todos los ejercicios de Logic1
 * 
 * Autora: DANIELA VALERA FUENTES
 */

public class EjerciciosLogic1DanielaValera{

	//EJERCICIO 1-30: CIGARPARTY
	//Enunciado: Es una fiesta de ardillas fumadoras. La fiesta tiene éxito si se fuman 
	// entre 40 y 60 cigarros, ambos inclusive. A menos que sea fin de semana, 
	// en cuyo caso no hay limite del número de cigarros.
	public boolean cigarParty (int cigars, boolean isWeekend) {
		if (cigars>=40 && cigars<=60){
			return true;
		} 
		else if (isWeekend){
			return true;
		}
		return false;

	}

	//EJERCICIO 2-30: DATEFASHION
	//Enunciado: Tú y tu cita estáis buscando mesa para un restaurante. 
	public int dateFashion (int you, int date) {
		return 0;
	}

	//EJERCICIO 3-30: SQUIRRELPLAY
	//Enunciado: Las ardillas en Palo Alto pasan la mayor parte del día jugando. 
	//Juegan si la temperatura está entre 60 y 90, ambos inclusive. Salvo en verano,
	// que solo juegan si la temperatura está entre 60 y 100.
	public boolean squirrelPlay(int temp, boolean isSummer) {
		if (temp>=60 && temp<=90){
			return true;
		}
		else if (isSummer && temp>=60 && temp<=100){
			return true;
		}
		return false;
	}

	//EJERCICIO 4-30: CAUGHTSPEEDING
	//Enunciado: Estás conduciendo demasiado deprisa y el policia te dice que te pares.
	//Chekea tu velocidad en el aparatito que te da tres valores: 0 (no hay multa),
	// 1(multa pequeña) y 2(gran multa). Si la velocidad es de 60 o menos no hay multa,
	// si la velocidad es entre 61 y 80 inclusive, la multa es pequeña y si la velocidad
	// es de más de 81 entonces la multa es de las gordas. 
	//Salvo que sea tu cumpleaños porque la velocidad puede ser superior a 5 en todos los casos.
	public int caughtSpeeding(int speed, boolean isBirthday) {
		if (isBirthday){
			speed = speed -5;
		}
		if (speed<=60){
			return 0;
		}
		if (speed>=61 && speed<=80){
			return 1;
		} 
		if (speed>=81){
			return 2;
		} 

		return 0;
	}

	//EJERCICIO 5-30: SORTASUM
	//Enunciado: Dados 2 enteros, a y b, devuelve su suma. Si el resultado está entre 10-19
	// inclusive no vale, entonces devuelveme 20.
	public int sortaSum(int a, int b) {
		if (a+b>=10 && a+b<=19){
			return 20;
		}
		else {
			return a+b;
		}
	}

	//EJERCICIO 6-30: ALARMCLOCK
	//Enunciado: Dado un día de la semana en el que 0=Domingo, 1=Lunes, 2=Martes, 3=Miercoles,
	// 4=Jueves, 5=Viernes y 6=Sabado. Entre semana la alarma tiene que sonar a las 7 am y los 
	// fines a las 10 am. Si son vacaciones, entre semana sonará a las 10 am y si es fin de semana
	// que no suene "off".
	public String alarmClock(int day, boolean vacation) {
		if (!vacation && (day>=1 && day<=5)){
			return "7:00";
		}
		if (!vacation && (day==6 || day==0)){
			return "10:00";
		}
		if (vacation && (day>=1 && day<=5)){
			return "10:00";
		}
		if (vacation && (day==6 || day==0)){
			return "off";
		}
		else {
			return "off";
		}
	}

	//EJERCICIO 7-30: LOVE6
	//Enunciado: El numero 6 es un gran numero. Dados dos enteros, a y b, devuelve true si
	// uno de ellos es 6 o si la suma o la resta es 6.
	public boolean love6(int a, int b) {
		if (6 == a || 6 == b){
			return true;
		}
		if (6 == a+b || 6 == Math.abs(a-b)){
			return true;
		}
		else {
			return false;
		}
	}

	//EJERCICIO 8-30: IN1TO10
	//Enunciado: Dado un número n, devuelve true si n está entre 1-10 ambos inclusive.
	//Salvo si "outsideMore" es true entonces devuelve true si el numero es menor o igual que 1
	// o mayor o igual que 0
	public boolean in1To10(int n, boolean outsideMode) {
		return false;
	}

	//EJERCICIO 9-30: SPECIALELEVEN
	//Enunciado: Devuelve true si el resto del multiplo de 11 es 0 y 1.
	public boolean specialEleven(int n) {
		if ((n % 11 == 0)){
			return true;
		}
		if ((n % 11 == 1)){
			return true;
		}
		return false;
	}

	//EJERCICIO 10-30: MORE20
	//Enunciado: Devuelve true si el resto es multiplo de 20. 1 y 2 true.
	public boolean more20(int n) {
		if ((n % 20 == 1)){
			return true;
		}
		if ((n % 20 == 2)){
			return true;
		}
		return false;
	}

	//EJERCICIO 11-30: OLD35
	//Enunciado: Devuelve true si el resto es multiplo de 3 o 5. Pero no de los dos.
	public boolean old35(int n) {
		if ((n % 3 == 0) && (n % 5 == 0)){
			return false;
		}
		if ((n % 3 == 0) || (n % 5 == 0)){
			return true;
		}
		return false;
	}

	//EJERCICIO 12-30: LESS20
	//Enunciado: Devuelve true si el resto es dos menos que los multiplos de 20
	public boolean less20(int n) {
		if ((n % 20 == 18) || (n % 20 == 19)){
			return true;
		}
		return false;
	}

	//EJERCICIO 13-30: NEARTEN
	//Enunciado: Devuelve true si el resto es dos por encima de 10 y dos por debajo
	public boolean nearTen(int num) {
		if ((num % 10 == 8) || (num % 10 == 9) || (num % 10 == 1) || (num % 10 == 2)  || (num % 10 == 0)){
			return true;
		}
		return false;  
	}

	//EJERCICIO 14-30: TEENSUM
	//Enunciado: Si los valores de la suma están en el rango de 13-19 entonces devuelve 19.
	public int teenSum(int a, int b) {
		if (a>=13 && a<=19){
			return 19;
		}
		if (b>=13 && b<=19){
			return 19;
		}
		if (a+b < 13 || a+b >19){
			return a+b;
		}
		else {
			return a+b;
		}
	}

	//EJERCICIO 15-30: ANSWERCELL
	//Enunciado: Tu telefono suena. Si estás durmiendo no lo contestas bajo ninguna circunstancia
	// salvo si es tu madre que si.
	public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
		if (isAsleep){
			return false;
		}
		if (!isMorning){
			return true;
		}
		if (isMom){
			return true;
		}
		return false;
	}

	//EJERCICIO 16-30: TEAPARTY
	//Enunciado: Hay una fiesta con cantidades de té y dulces. La fiesta es muy buena (2) si 
	// de té o de caramelo hay al menos el doble de la cantidad de la otra. En todos los casos,
	// la fiesta es muy mala (0) si de té o de caramelo hay menos de 5. La fiesta es buena (1)
	// si de té o de dulce hay 5.
	public int teaParty(int tea, int candy) {
		if (tea < 5 || candy <5){
			return 0;
		}
		if (tea >= 2* candy || candy >= 2* tea){
			return 2;
		}
		return 1;
	}

	//EJERCICIO 17-30: FIZZSTRING
	//Enunciado: Dada una cadena str, si la cadena comienza con "f" devuelvo "Fizz". 
	//Si la cadena termina con "b" devuelvo "Buzz". 
	//Si en todos los casos, tanto la condiciones "b" "f" y son verdaderas, devuelvo "FizzBuzz".
	// En todos los demás casos, devolverá la cadena sin cambios (return str).
	public String fizzString(String str) {
		if (str.startsWith("f") && str.endsWith("b")){
			return "FizzBuzz";
		}
		if (str.startsWith("f")){
			return "Fizz";
		}
		if (str.endsWith("b")){
			return "Buzz";
		}
		else{
			return str;
		}
	}

	//EJERCICIO 18-30: FIZZSTRING2
	//Enunciado: Devuelve "Fizz" si un número es divisible entre 3. Si es divisible entre 5
	// devuelve "Buzz" y si es divisible entre los dos a la vez devuelve "FizzBuzz"
	public String fizzString2(int n) {
		String palabra = String.valueOf(n) + "!";
		if ((n % 5 == 0) && (n % 3 == 0)){
			return "FizzBuzz"  + "!";
		}
		if ( n % 3 == 0){
			return "Fizz" + "!";
		}
		if ( n % 5 == 0){
			return "Buzz"  + "!";
		}
		return palabra;  
	}

	//EJERCICIO 19-30: TWOASONE
	//Enunciado: Devuelve true si la suma de alguno de los dos enteros es el tercero.
	public boolean twoAsOne(int a, int b, int c) {
		if(a + b == c || b + c == a || c + a == b){
			return true;
		}
		return false;  
	}

	//EJERCICIO 20-30: INORDER
	//Enunciado: Devuelve true si b es mayor que a y c mayor que b. Devuelve true si bOk es true 
	// y b no necesita ser mayor que a.
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if(bOk && c > b){
			return true;
		}
		if (b > a && c > b){
			return true;
		}
		return false;  
	}

	//EJERCICIO 21-30: INORDEREQUAL
	//Enunciado: Devuelve true si equalOk es false y sus enteros tienen un orden descendente.
	//Devuelve true si equalOk es true y sus enteros pueden tener un orden descendente o pueden
	// ser iguales.
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if(equalOk  && a <= b && b <= c && a <= c){
			return true;
		}
		if (!equalOk && a < b && b < c  && a < c){
			return true;
		}
		return false;  
	}

	//EJERCICIO 22-30: LASTDIGIT
	//Enunciado: Devuelve true si el digito de la derecha de un numero (a, b, c) es igual que el
	// digito de la derecha del otro (a, b, c). Ex: (23, 18, 23)
	public boolean lastDigit(int a, int b, int c) {
		if (a%10 == b%10 || b%10 == c%10 || a%10==c%10){
			return true;
		}
		return false;  
	}

	//EJERCICIO 23-30: LESSBY10
	//Enunciado:  
	public boolean lessBy10(int a, int b, int c) {
		return false;
	}
	
	//EJERCICIO 24-30: WITHOUTDOUBLES
	//Enunciado: Tiro dos dados. Dame la suma salvo cuando noDoubles es true y los dos tiros de
	//los dados son iguales, entonces a la suma sumale 1.
	public int withoutDoubles(int die1, int die2, boolean noDoubles) {
		  if (noDoubles && die1 == die2){
		  return die1 + die2 +1;
		  }
		  return die1 + die2;
		}

	public void run(){
		//1: cigarParty
		System.out.println (cigarParty(30, false));
		System.out.println (cigarParty(50, false));
		System.out.println (cigarParty(70, true));

		//2: dateFashion
		System.out.println (dateFashion(5, 10));
		System.out.println (dateFashion(5, 2));
		System.out.println (dateFashion(5, 5));

		//3: squirrelPlay
		System.out.println (squirrelPlay(70, false));
		System.out.println (squirrelPlay(95, false));
		System.out.println (squirrelPlay(95, true));

		//4: caughtSpeeding
		System.out.println (caughtSpeeding(60, false));
		System.out.println (caughtSpeeding(65, false));
		System.out.println (caughtSpeeding(65, true));

		//5: sortaSum
		System.out.println (sortaSum(3, 4));
		System.out.println (sortaSum(9, 4));
		System.out.println (sortaSum(10, 11));

		//6: alarmClock 
		System.out.println (alarmClock(1, false));
		System.out.println (alarmClock(5, false));
		System.out.println (alarmClock(0, false));

		//7: love6
		System.out.println (love6(6, 4));
		System.out.println (love6(4, 5));
		System.out.println (love6(1, 5));

		//8: in1To10 
		System.out.println (in1To10(5, false));
		System.out.println (in1To10(11, false));
		System.out.println (in1To10(11, true));

		//9: specialEleven 
		System.out.println (specialEleven(22));
		System.out.println (specialEleven(23));
		System.out.println (specialEleven(24));

		//10: more20
		System.out.println (more20(20));
		System.out.println (more20(21));
		System.out.println (more20(22));

		//11: old35
		System.out.println (old35(3));
		System.out.println (old35(10));
		System.out.println (old35(15));

		//12: less20
                System.out.println (less20(18));
		System.out.println (less20(19));
		System.out.println (less20(20));

		//13: nearTen
		System.out.println (nearTen (12));
		System.out.println (nearTen (17));
		System.out.println (nearTen (19));

		//14: teenSum 
		System.out.println (teenSum(3, 4));
		System.out.println (teenSum(10, 13));
		System.out.println (teenSum(13, 2));

		//15: answerCell
		System.out.println (answerCell(false, false, false));
		System.out.println (answerCell(false, false, true));
		System.out.println (answerCell(true, false, false));

		//16: teaParty 
		System.out.println (teaParty(6, 8));
		System.out.println (teaParty(3, 8));
		System.out.println (teaParty(20, 6));

		//17: fizzString 
		System.out.println (fizzString("fig"));
		System.out.println (fizzString("dib"));
		System.out.println (fizzString("fib"));

		//18: fizzString2
		System.out.println (fizzString2(1));
		System.out.println (fizzString2(2));
		System.out.println (fizzString2(3));

		//19: twoAsOne
		System.out.println (twoAsOne(1, 2, 3));
		System.out.println (twoAsOne(3, 1, 2));
		System.out.println (twoAsOne(3, 2, 2));

		//20: inOrder 
		System.out.println (inOrder(1, 2, 4, false));
		System.out.println (inOrder(1, 2, 1, false));
		System.out.println (inOrder(1, 1, 2, true));

		//21:inOrderEqual
		System.out.println (inOrderEqual(2, 5, 11, false));
		System.out.println (inOrderEqual(5, 7, 6, false));
		System.out.println (inOrderEqual(5, 5, 7, true));

		//22:lastDigit
		System.out.println (lastDigit(23, 19, 13));
		System.out.println (lastDigit(23, 19, 12));
		System.out.println (lastDigit(23, 19, 3)); 

		//23: lessBy10 
		System.out.println (lessBy10(1, 7, 11)); 
		System.out.println (lessBy10(1, 7, 10)); 
		System.out.println (lessBy10(11, 1, 7)); 

		//24: withoutDoubles
		System.out.println (withoutDoubles(2, 3, true)); 
		System.out.println (withoutDoubles(3, 3, true)); 
		System.out.println (withoutDoubles(3, 3, false)); 

		//25:

		//26:

		//27:

		//28:

		//29:

		//30:
	}

}
