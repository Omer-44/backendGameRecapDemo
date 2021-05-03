package demo;

public class BudgetController implements Controller {
private Gamer gamer;
private Game game;
	public BudgetController(Gamer gamer,Game game) {
		this.gamer=gamer;
		this.game=game;
	}
	public void checkIt(String message) {
		if(this.game.getPrice()<=this.gamer.getBudget()) {
			System.out.println("bütçeniz yeterlidir oyunu alabilirsiniz.");
		}
		
	}

}
