
public class Main {

    public static void main(String[] args) {
        Box bigBox = new Box(20); // Se crea una instancia de Box llamada bigBox con un límite de peso de 20 unidades.
        Box box = new Box(10); // Se crea otra instancia de Box llamada box con un límite de peso de 10 unidades.
        bigBox.add(box); // Se añade box a bigBox. Ahora bigBox contiene box, recuerda que no le resta peso a bigBox, una caja vacia no tiene peso
        box.add(new Book("Horstman", "Core Java",5) ); // Se añade un libro a box con un peso de 5 unidades.
        box.add(new Book("Horstman", "Core Java",5)); // Se añade un libro a box con un peso de 5 unidades.
        bigBox.add(new Book ("Hola", "Pepe", 5)); // Se anade un libro a bigBox con un peso de 5 unidades
        System.out.println(bigBox.weight()); // Esto imprimirá el peso total de bigBox, que incluye el peso de box y los libros dentro de box. el peso total de bigBox sería igual al peso de box, que es 10 unidades + 5 por el propio contenido de bigBox
        System.out.println(box.weight()); // Esto imprimirá el peso total de box, que incluye los libros dentro de box. Por lo tanto, el peso total de box es 5 + 5 = 10 unidades.
        System.out.println(bigBox);
        System.out.println(box);
    
    
    }

}
