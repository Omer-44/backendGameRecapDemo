package demo;

public class SellManager {
	private Campaign campaign;
	public SellManager(Campaign campaign) {
		this.campaign=campaign;
	}
public void sell(Gamer gamer) {
	this.campaign.applyCampaign(gamer);
	System.out.println(gamer.getUsername()+ " oyun sat�n al�nm��t�r oynayabilirsiniz");
}
}
