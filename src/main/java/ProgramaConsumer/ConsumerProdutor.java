package ProgramaConsumer;

public class ConsumerProdutor {

    private String nome;
    private float preco;

    public ConsumerProdutor(String nome, float preco) {
	this.nome = nome;
	this.preco = preco;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public float getPreco() {
	return preco;
    }

    public void setPreco(float preco) {
	this.preco = preco;
    }
    public static void staticPrecoUpdateConsumer(ConsumerProdutor cp){
        cp.setPreco((float)(cp.getPreco()* 1.1));
    }
    public void naoStaticPrecoUpdateConsumer(){
        preco = (float)(preco * 1.1);
    }
}

