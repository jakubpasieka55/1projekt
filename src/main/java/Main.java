
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      java.util.Scanner scanner = new java.util.Scanner(System.in);
      boolean running = true;
      
      while(running) {
        System.out.println("\nMenu:");
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyświetl listę studentów");
        System.out.println("3. Zakończ program");
        System.out.print("Wybierz opcję: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        switch(choice) {
          case 1:
            System.out.println("Podaj imie studenta:");
            String name = scanner.nextLine();
            System.out.println("Podaj wiek studenta:");
            int age = scanner.nextInt();
            s.addStudent(new Student(name, age));
            break;
            
          case 2:
            var students = s.getStudents();
            System.out.println("\nLista studentów:");
            for(Student current : students) {
              System.out.println(current.ToString());
            }
            break;
            
          case 3:
            running = false;
            System.out.println("Program zakończony.");
            break;
            
          default:
            System.out.println("Nieprawidłowa opcja!");
        }
      }
    } catch (IOException e) {
      System.out.println("Błąd: " + e.getMessage());
    }
  }
}
