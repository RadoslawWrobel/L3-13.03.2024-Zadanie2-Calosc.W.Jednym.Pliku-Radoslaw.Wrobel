import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Main 
{
  public static void HelloWorld()
  {
    System.out.println("Hello World!");
    String HelloWorld = "Hello World!";
    for (int i = 0; i < HelloWorld.length(); i++)
      {
        System.out.println(HelloWorld.charAt(i));
      }
  }

  public static void WypisywanieLiczby()
  {
    int ZadeklarowanaLiczba = 1337;
    System.out.println(ZadeklarowanaLiczba);
  }

  public static void Suma()
  {
    int a = 0;
    int b = 0;

    Scanner SkanerSumy = new Scanner(System.in);
    System.out.println("Wprowadz wartosci dla zmiennych a oraz b :\n");

    try  
      {
        a = SkanerSumy.nextInt();
        b = SkanerSumy.nextInt();
      }
    catch (InputMismatchException e)
      {
        System.out.println("Wprowadzono niepoprawne dane!");
      }

    int suma = a + b;
    System.out.println("Suma wynosi: " + suma);
  }

  public static void Kalkulator()
  {
    int a = 0;
    int b = 0;

    Scanner SkanerKalkulatora = new Scanner(System.in);
    System.out.println("Wprowadz wartosci dla zmiennych a oraz b :\n");

    try  
      {
        a = SkanerKalkulatora.nextInt();
        b = SkanerKalkulatora.nextInt();
      }
    catch (InputMismatchException e)
      {
        System.out.println("Wprowadzono niepoprawne dane!");
      }

    int suma = a + b;
    int roznica = a - b;
    int iloczyn = a * b;
    int iloraz = a / b;

  SkanerKalkulatora.nextInt();

    System.out.println("Podaj numer operacji, ktora chcesz wykonac: \n");
    System.out.println("1. Suma\n");
    System.out.println("2. Roznica\n");
    System.out.println("3. Iloczyn\n");
    System.out.println("4. Iloraz\n");

    int wybor = SkanerKalkulatora.nextInt();
    switch(wybor)
      {
        case 1:
          System.out.println("Suma wynosi: " + suma);
          break;
        case 2:
          System.out.println("Roznica wynosi: " + roznica);
          break;
        case 3:
          System.out.println("Iloczyn wynosi: " + iloczyn);
          break;
        case 4:
          if (b == 0)
          {
            System.out.println("Nie mozna dzielic przez zero!\n");
            break;
          }
          else
          {
            System.out.println("Iloraz wynosi: " + iloraz);
            break;
          }
        default:
          {
            System.out.println("Niewlasciwa operacja!\n");
            break;
          }
      }
  }

  public static void LiczbyParzyste()
  {
    for (int i = 0; i < 100; i++)
      {
        if (i % 2 == 0)
        {
          System.out.println("Liczba " + i + " jest parzysta");
        }
      }
  }

  public static void TestLiczbyPierwszej()
  {
    Scanner SkanerLiczbyPierwszej = new Scanner(System.in);
    System.out.println("Wprowadz liczbe do sprawdzenia: ");
    int liczba = SkanerLiczbyPierwszej.nextInt();

    boolean czyPierwsza = true;
    for (int i = 2; i < liczba; i++)
      {
        if (liczba % i == 0)
        {
          czyPierwsza = false;
          break;
        }
      }

    if (czyPierwsza)
    {
      System.out.println("Liczba " + liczba + " jest liczba pierwsza");
    }
    SkanerLiczbyPierwszej.close();
  }

  public static void main(String[] args)
  {
    int wybor;
    do
      {
        Scanner SkanerMaina = new Scanner(System.in);
        System.out.println("====================\n");
        System.out.println("Witaj w pierwszym programie z zajec laboratoryjnych!\n");
        System.out.println("Wybierz jedna z ponizszych opcji: \n");
        System.out.println("1. Wypisanie Hello World na 2 sposoby\n");
        System.out.println("2. Wypisywanie liczby\n");
        System.out.println("3. Suma\n");
        System.out.println("4. Kalkulator\n");
        System.out.println("5. Liczby parzyste\n");
        System.out.println("6. Test liczby pierwszej\n");
        System.out.println("0. Wyjscie z programu\n");
        wybor = SkanerMaina.nextInt();
        switch(wybor)
          {
            case 1:
              HelloWorld();
              break;
            case 2:
              WypisywanieLiczby();
              break;
            case 3:
              Suma();
              break;
            case 4:
              Kalkulator();
              break;
            case 5:
              LiczbyParzyste();
              break;
            case 6:
              TestLiczbyPierwszej();
              break;
            default:
              break;
          }
      }while(wybor!=0);
  }
}