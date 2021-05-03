package demo;

public class SellManager {
	private Campaign campaign;
	public SellManager(Campaign campaign) {
		this.campaign=campaign;
	}
public void sell(Gamer gamer) {
	this.campaign.applyCampaign(gamer);
	System.out.println(gamer.getUsername()+ " oyun satýn alýnmýþtýr oynayabilirsiniz");
}
}
