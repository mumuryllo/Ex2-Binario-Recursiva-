
public class Controller {

	public static void ConversaoBinario(int numero){
		if(numero>0) {
			ConversaoBinario(numero/2);
			System.out.println(numero %2);
		}
	};
	
}
