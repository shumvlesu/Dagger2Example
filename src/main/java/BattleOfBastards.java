import other.Allies;
import other.IronBank;

public class BattleOfBastards {
  //Это пример того как внедрять зависимости при помощи Dagger2
  //https://habr.com/ru/post/344314/

  //Усложняем проект новыми зависимостями
  public static void main(String[] args){
    //Усложняем пример, добавляем зависимости.
    IronBank bank = new IronBank();
    Allies allies = new Allies(bank);
    //
    Starks starks = new Starks(allies, bank);    // сильные зависимости allies, bank
    Boltons boltons = new Boltons(allies, bank); // сильные зависимости allies, bank

    War war = new War(starks,boltons);
    war.prepare();
    war.report();
  }
}