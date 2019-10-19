package model;

public class GMCriadorConcreto extends GMCriador {
    @Override
    public Opala factoryOpala() {
        return new Opala();
    }

    @Override
    public Vectra factoryVectra() {
        return new Vectra();
    }
}
