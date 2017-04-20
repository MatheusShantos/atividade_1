
package ListaSimplismenteEncadeada;


public class ElementoLista {
    
    int quantElementos;
    Elemento primeiro, ultimo;
    
    public ElementoLista(){ //inicializando uma lista vazia
        this.quantElementos = 0;
        this.primeiro = null;
        this.ultimo = null;
        
    }
    public void inserirNoComeco(int valor){
            if(this.quantElementos == 0){//se a lista etiver vaizia vai ser 
               Elemento novo = new Elemento(); //criado um novo objeto Elemento
               novo.setValor(valor);
               novo.setElemento(primeiro);
               this.primeiro = novo;
            }
            else{
                Elemento novo2 = new Elemento();
                novo2.setValor(valor);
                novo2.setElemento(primeiro);
                primeiro = novo2;
            }
            this.quantElementos ++;
        }
    public void inserirNoFinal(int valor){
        Elemento novo = new Elemento();
        novo.setValor(valor);
        
        if(this.quantElementos == 0){
            novo.setElemento(ultimo);
            this.primeiro = novo;
            this.ultimo = novo;
        }else{
            ultimo.setElemento(novo);
            ultimo = novo;
        }
        this.quantElementos++;
    }
    public void inserir(int posicao , int valor){
        Elemento novo = new Elemento();
        novo.setValor(valor);
        Elemento aux = this.primeiro;
        if(posicao == this.quantElementos){
            this.inserirNoFinal(valor);            
        }else{
            if(posicao == 0){
                this.inserirNoComeco(valor);
            }else{
                for(int i = 0; i<posicao - 1; i++){
                    aux = aux.getElemento();
                }
                novo.setElemento(aux.getElemento());
                aux.setElemento(novo);
                aux = novo;
                
            }
            this.quantElementos++;
            }
        }
    public void pesquisaElementos(int valor){
        Elemento aux = this.primeiro;
        while(aux.getElemento() != null){
            if(aux.getValor() == valor){
                System.out.println("Encontrei! "+valor);
            }aux = aux.getElemento();
        }
    }
    public void removerNoInicio(){
        if(this.quantElementos == 0){
            System.out.println("Não posso remover, lista vazia");
        }else{
            Elemento aux = primeiro;
            primeiro = primeiro.getElemento();
            aux.setElemento(null);
            this.quantElementos--;
        }
    }
    public void removerNoFinal(){
        if(this.quantElementos == 0){
            System.err.println("Não posso remover, não há elementos");
        }else{
           Elemento aux = primeiro;
           while(aux.getElemento() != null){
                aux =  aux.getElemento();
        }
        aux.setElemento(null);
        quantElementos--; 
        }
        
    }
    
    
    public void imprimir(){
        if(this.quantElementos == 0){
            System.out.print("[]");
        }else{
            System.out.print("[");
            Elemento aux = this.primeiro;
            for(int i = 0; i <this.quantElementos - 1; i++){
                System.out.print(aux.getValor()+", ");
                aux = aux.getElemento();
            }
            System.out.print(aux.getValor()+"]");
            
        }
    }
    
    public static void main(String[] args) {
        ElementoLista por = new ElementoLista();
        
        for(int i = 0;i < 7; i++){
            por.inserirNoFinal(i);
        }
        
        //por.inserirNoComeco(10);
        //por.inserirNoFinal(11);
        //          p   v
        //por.inserir(4, 12);
        //por.pesquisaElementos(4);
        
        por.imprimir();
        
        //por.removerNoInicio();
        por.removerNoFinal();
        System.out.println(" ");       
        por.imprimir();
    }

}
