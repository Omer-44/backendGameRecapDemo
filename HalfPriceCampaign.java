package demo;

public class HalfPriceCampaign implements Campaign {

	public void applyCampaign(Gamer gamer) {
		System.out.println("yarý fiyat kampanyasýna sahipsiniz : "+gamer.getUsername());
	}

}
