public class BattleOfBastards {
  //Это пример того как внедрять зависимости при помощи Dagger2
  //Сейчас состояние до внедрения зависимостей
  //https://habr.com/ru/post/344314/
  public static void main(String[] args){
    Starks starks = new Starks();
    Boltons boltons = new Boltons();

    War war = new War(starks,boltons);
    war.prepare();
    war.report();
  }
}