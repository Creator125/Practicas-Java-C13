package polimofismo;

public class Polimofismo {

    public static void main(String[] args) {
        Perro miperro = new Perro("chiguagua", "negro", 5 ,"Marian");
        Centro listaDeAnimales = new Centro();
        listaDeAnimales.agregarAnimal(miperro);
        
        Gato migato = new Gato("comun", "Cafe", 6 ,"Boby");
        listaDeAnimales.agregarAnimal(migato);
        
        listaDeAnimales.listarAnimal();
    }
    
}
