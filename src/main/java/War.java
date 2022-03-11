public class War {
  private Starks starks;
  private Boltons boltons;

  // Внедрение зависимостей(DI) - получение зависимостей из другого места через конструктор
  public War(Starks starks, Boltons boltons){
    this.starks = starks;
    this.boltons = boltons;
  }

  public void prepare(){
    starks.prepareForWar();
    boltons.prepareForWar();
  }

  public void report(){
    starks.reportForWar();
    boltons.reportForWar();
  }
}