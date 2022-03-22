package exercicio2;

public class Item {
        private int codigo, qnt;
        private float preco, total;
        private String desc;
    
    public Item(int codigo, int qnt, float preco, float total, String desc){
        this.codigo=codigo;
        this.qnt=qnt;
        this.preco=preco;
        this.desc=desc;
        this.total=total;
}
    public Item(){
        codigo=0;
        qnt=0;
        preco=0;
        desc="";
        total=0;
}

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.verificaQnt();
        this.qnt = qnt;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.verificaPreco();
        this.preco = preco;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.calculaTotal();
        this.total = total;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    public int verificaQnt(int qnt){
        if(qnt<0)
            qnt=0;
        else
            this.qnt=qnt;
        return qnt;
    }
    public float verificaPreco(float preco){
        if(preco<0)
            preco=0;
        else
            this.preco=0;
        return preco;
    }
    public float calculaTotal(float total){
        total=qnt*preco;
    }
   
}