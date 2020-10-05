package ProgramaConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TestaPrograma {

    public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	List<ConsumerProdutor> list = new ArrayList<>();

	list.add(new ConsumerProdutor("TV", 900.0f));
	list.add(new ConsumerProdutor("Mouse", 50.0f));
	list.add(new ConsumerProdutor("Tablet", 350.0f));
	list.add(new ConsumerProdutor("HD Case", 80.9f));

	float fator = (float)1.1;

	list.forEach(cp -> cp.setPreco((cp.getPreco() * fator)));

	list.forEach(consumerProdutor -> System.out.println(consumerProdutor.getNome() + ": " + " " + consumerProdutor.getPreco()));
    }
}

