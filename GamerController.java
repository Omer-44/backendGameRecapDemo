package demo;

public class GamerController implements Controller {
	private Gamer gamer;
public GamerController(Gamer gamer) {
	this.gamer=gamer;
}
	public void checkIt(String message) {
		if(!this.gamer.getPassword().isEmpty() && !this.gamer.getUsername().isEmpty()) {
			
			System.out.println("oyuncu kontrol edildi bir sorunla kar��la��lmad� : "+message);
		}		
		else {
			System.out.println("bir sorunla kar��la�t�k l�tfen bilgilerinizi kontrol ediniz");
		}

	}
	
}
