package demo;

public class HalfPriceCampaign implements Campaign {

	public void applyCampaign(Gamer gamer) {
		System.out.println("yar� fiyat kampanyas�na sahipsiniz : "+gamer.getUsername());
	}

}
