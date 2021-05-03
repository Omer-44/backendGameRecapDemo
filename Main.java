package demo;

public class Main {

	public static void main(String[] args) {
		Gamer gamer=new Gamer("Omer",1234,"1456");
		Game game=new Game(123, "Call Of Duty");
		BudgetController budgetController=new BudgetController(gamer,game);
		GamerController gamerController=new GamerController(gamer);
		GamerManager gamerManager=new GamerManager(gamerController);
		Campaign campaign=new NonCampaign();
		SellManager sellManager=new SellManager(campaign);
        budgetController.checkIt(gamer.getUsername());
        gamerController.checkIt(gamer.getUsername());
        gamerManager.add(gamer);
        gamerManager.delete(gamer);
        gamerManager.update(gamer);
        sellManager.sell(gamer);
        
	}

}
