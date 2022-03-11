import other.Allies;
import other.IronBank;

public class Boltons implements House {
  private Allies allies;
  private IronBank bank;

  public Boltons(Allies allies, IronBank bank) {
    this.bank = bank;
    this.allies = allies;
  }

  @Override
  public void prepareForWar() {
    //что-то происходит
    System.out.println(this.getClass().getSimpleName() + " prepared for war");
  }

  @Override
  public void reportForWar() {
    //что-то происходит
    System.out.println(this.getClass().getSimpleName() + " reporting..");
  }
}