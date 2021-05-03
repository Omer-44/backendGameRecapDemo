package demo;

public class GamerManager {
	private Controller controller;
	public GamerManager(GamerController controller) {
	this.controller=controller;
	}
public void add(Gamer gamer) {
	System.out.println("oyuncu eklendi: "+gamer.getUsername());
	this.controller.checkIt(gamer.getUsername());
}
public void update(Gamer gamer) {
	System.out.println("oyuncu güncellendi: "+gamer.getUsername());
	this.controller.checkIt(gamer.getUsername());
}
public void delete(Gamer gamer) {
	System.out.println("oyuncu silindi: "+gamer.getUsername());
	this.controller.checkIt(gamer.getUsername());
}
}
