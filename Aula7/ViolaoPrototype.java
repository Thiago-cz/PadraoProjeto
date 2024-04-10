public class ViolaoPrototype extends Violao {



    @Override
    public Violao clonar(int opt) throws CloneNotSupportedException {

        switch (opt) {
            case 1:
                return (Violao) this.clone();
            case 2:
                ViolaoPrototype folk = (ViolaoPrototype) this.clone();

                folk.setIndicacaoGenero("Pop rock");
                folk.setTipoCordas("Aço");
                folk.setModelo("Eletrico/eletricoacustico");
                folk.setNome("Folk");
                return folk;

            case 3:
                ViolaoPrototype flet = (ViolaoPrototype) this.clone();

                flet.setIndicacaoUso("Profissional");
                flet.setModelo("Eletrico");
                flet.setNome("Flet");
                return flet;

            case 4:
                ViolaoPrototype jumbo = (ViolaoPrototype) this.clone();

                jumbo.setTipoSom("Grave");
                jumbo.setTipoCordas("Aço");
                jumbo.setIndicacaoGenero("Misto");
                jumbo.setNome("Jumbo");
                return jumbo;

            case 5:
                ViolaoPrototype seteCordas = (ViolaoPrototype) this.clone();

                seteCordas.setQtdCordas(7);
                seteCordas.setIndicacaoGenero("Misto");
                seteCordas.setNome("7 Cordas");
                return seteCordas;

            case 6:
                ViolaoPrototype dozeCordas = (ViolaoPrototype) this.clone();

                dozeCordas.setQtdCordas(12);
                dozeCordas.setIndicacaoUso("Misto");
                dozeCordas.setTipoCordas("Aço");
                dozeCordas.setNome("12 Cordas");
                return dozeCordas;

            case 7:
                ViolaoPrototype violaoZero = (ViolaoPrototype) this.clone();

                violaoZero.setTamanho("Pequeno");
                violaoZero.setIndicacaoGenero("Todos");
                violaoZero.setNome("Violão Zero");
                return violaoZero;

            case 8:
                ViolaoPrototype violaoDuploZero = (ViolaoPrototype) this.clone();

                violaoDuploZero.setTamanho("Pequeno-Medio");
                violaoDuploZero.setIndicacaoGenero("Todos");
                violaoDuploZero.setIndicacaoUso("FingerStyle");
                violaoDuploZero.setNome("Violão Duplo Zero");
                return violaoDuploZero;

            case 9:
                ViolaoPrototype violaoTriploZero = (ViolaoPrototype) this.clone();

                violaoTriploZero.setTamanho("Medio");
                violaoTriploZero.setIndicacaoGenero("Todos");
                violaoTriploZero.setTipoSom("Peculiar");
                violaoTriploZero.setNome("Violão Triplo Zero");
                return violaoTriploZero;

            default:
                return (Violao) this;

        }

    }

}
