import java.util.Scanner;

public class Calificaciones {
  String nombre = "";
  int[] calif = new int[5];

  public void setNombre() {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduce el nombre del alumno: ");
    nombre = s.next();
  }

  public void setCalificaciones() {
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < calif.length; i++) {
      System.out.print("Anota la calificación " + (i + 1) + ":");
      calif[i] = s.nextInt();
    }
  }

  public float promedioCal() {
    int suma = 0;
    for (int i = 0; i < calif.length; i++) {
      suma += calif[i];
    }
    return  (float)  suma / calif.length;
  }

  public char getNota(float promedioObt) {
    char nota = ' ';

    if (promedioObt <= 50)
      nota = 'F';
    else if (promedioObt <= 60 && promedioObt > 50)
      nota = 'E';
    else if (promedioObt <= 70 && promedioObt > 60)
      nota = 'D';
    else if (promedioObt <= 80 && promedioObt > 70)
      nota = 'C';
    else if (promedioObt <= 90 && promedioObt > 80)
      nota = 'B';
    else if (promedioObt <= 100 && promedioObt >90)
      nota = 'A';

    return nota;
  }
public static void main(String[] args) {
    Calificaciones app = new Calificaciones();;
    app.setNombre();
    app.setCalificaciones();
    float promedio = app.promedioCal();
    char letra = app.getNota(promedio);

    System.out.println("El alumno " + app.nombre + " tiene un promedio de " + promedio + "\n Nota: " + letra + " ");
  }
}