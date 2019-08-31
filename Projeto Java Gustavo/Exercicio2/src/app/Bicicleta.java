
package app;


public class Bicicleta extends ProdutoAcabado {
  
    private String marca;
    private float valorfinal;
    
    public Bicicleta (String marca, float valorfinal) {
    this.marca = marca;
    this.valorfinal = valorfinal;
    
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getValorfinal() {
        return valorfinal;
    }

    public void setValorfinal(float valorfinal) {
        this.valorfinal = valorfinal;
    }
    
    
    
}
