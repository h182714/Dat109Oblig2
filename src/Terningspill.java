import com.sun.deploy.util.StringUtils;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Terningspill implements Runnable {

	private int id;
	private Spiller[] spillere;

	public Terningspill(int id){
		this.id = id;

	}
	public static void main(String[] args){
		leggTilSpiller();
	}


	public static void spill(){

		}
	public static void leggTilSpiller(){

		//sier hvor mange spillere som har lov å bli med
		int id = Integer.parseInt(JOptionPane.showInputDialog("Hvor mange spillere"));
		if(id<=10 && id>=1){

			Spiller[] spillere = new Spiller[id];
			for(int i = 1; id>=i; i++) {

				spillere[i]= new Spiller(JOptionPane.showInputDialog("navn på spiller" + (i) + " : "), i);

			}

		}else if(Objects.equals(id, null)) {
			JOptionPane.showMessageDialog(null, "Ingen spillere prøv igjen");
		}else {
			JOptionPane.showMessageDialog(null, "Feil input, prøv igjen");
			spill();
		}

		}


	public void run(){

	}

}
