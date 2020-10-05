package ProgramaConsumer;

import java.util.function.Consumer;

public class PrecoUpdateConsumer implements Consumer <ConsumerProdutor> {

    @Override
    public void accept(ConsumerProdutor cp) {
        cp.setPreco((float)(cp.getPreco() * 1.1));   //Alterar o preço a 10%

    }
}
