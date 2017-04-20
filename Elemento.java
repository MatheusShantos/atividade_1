
package ListaSimplismenteEncadeada;


public class Elemento {
    
        private int valor;
        private Elemento proximo;
        
        public void setValor(int valor){
            this.valor = valor;
        }
        public int getValor(){
            return this.valor;
        }
        public void setElemento(Elemento proximo){
            this.proximo = proximo;
        }
        public Elemento getElemento(){
            return this.proximo;
        }
        
    
}
