package ec.edu.espol.workshops;

/**CarInsurance es una clase para el calculo de un prestamo automovilistico.
 
 * @author ldaca

   EL valor inicial esta dado por la variable base premium
   Se registra el sexo, la edad y el estatus matrimonial*/

public class CarInsurance {
  /**Variable age almacena la edad del cliente*/
  public int age;

  /**
 * Variable sex almacena el sexo del cliente
 */
  public char sex;
  /**
 * la variable matital status se encarga de almacenar
 * el estado civil del cliente, si es true esta casado
 */
  public boolean matital_status;

  /**
 * Integer que tiene el valor inicial de la variable base premium
 */
  public int base_premium = 500;

  /**
   Funcion que permite calcular dependiento del 
   estado del cliente cual sera su base premium
   @return devuelve el total
   
 */
  public int Premium() {
    int total = 0;
    if (sex == 'M' && matital_status == false && age < 25) {
      base_premium += 1500;
      total += 1;
    } else if (sex == 'F' && matital_status) {
      base_premium -= 200;
      total += 1;
    } else if (age >= 45 && age < 65) {
      base_premium -= 100;
      total += 1;
    } else {
      total -= 1;
    }
    return total;
  }

  /**
 * Policies verifica mediante banderas si 
 * la edad y el numero de matricula son validos
 * en caso de no serlo mostrara un resultado False.
 
 * @param numero es el numero de matricula
 
 * @return es el valor booleano regresado
 */
  public boolean Policies(String numero) {
    return (age > 80 && driving_license(numero));
  }

  private static boolean driving_license(String numero) {
    if (numero == null) {
      return false;
    }
    try {
    } catch (NumberFormatException nfe) {
      return false;
    }
    return true;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSex(char sex) {
    this.sex = sex;
  }

  public void setMatital_status(boolean matital_status) {
    this.matital_status = matital_status;
  }

  public void setBase_premium(int base_premium) {
    this.base_premium = base_premium;	
  }

  public int getAge() {
    return this.age;
  }

  public char getSex() {
    return this.sex;
  }

  public boolean getMatital_status() {
    return this.matital_status;
  }

  public int getBase_premium() {
    return this.base_premium;
  }
}
