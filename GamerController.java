package demo;

public class GamerController implements Controller {
	private Gamer gamer;
public GamerController(Gamer gamer) {
	this.gamer=gamer;
}
	public void checkIt(String message) {
		if(!this.gamer.getPassword().isEmpty() && !this.gamer.getUsername().isEmpty()) {
			
			System.out.println("oyuncu kontrol edildi bir sorunla karþýlaþýlmadý : "+message);
		}		
		else {
			System.out.println("bir sorunla karþýlaþtýk lütfen bilgilerinizi kontrol ediniz");
		}

	}
	
}
