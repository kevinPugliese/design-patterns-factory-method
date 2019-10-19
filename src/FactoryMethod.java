import model.GMCriador;
import model.GMCriadorConcreto;
import model.Opala;
import model.Vectra;

public class FactoryMethod {
    public static void main(String[] args) {
        GMCriador gm = new GMCriadorConcreto();
        Opala opala = gm.factoryOpala();
        Vectra vectra = gm.factoryVectra();

        System.out.println(opala);
        System.out.println(vectra);
    }
}
