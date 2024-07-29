import java.io.IOException; // Importa la clase IOException para manejar errores de entrada/salida
import java.nio.file.Files; // Importa la clase Files para operaciones con archivos
import java.nio.file.Paths; // Importa la clase Paths para trabajar con rutas de archivos
import java.util.List; // Importa la interfaz List para manejar colecciones de datos
import java.util.stream.Collectors; // Importa Collectors para recolectar elementos de un flujo en una lista

public class LiteracyComparison {

    public static void main(String[] args) {
        // Inicia el bloque try para manejar posibles excepciones al trabajar con archivos
        try {
            // Lee el archivo CSV línea por línea
            List<String> lines = Files.lines(Paths.get("literacy.csv"))
                // Divide cada línea en partes utilizando la coma como delimitador
                .map(row -> row.split(","))
                
                // Ordena las líneas por el valor numérico en la columna 5 (índice 5)
                .sorted((parts1, parts2) -> 
                    Double.compare(
                        // Convierte el valor de la columna 5 del primer objeto a double
                        Double.parseDouble(parts1[5]), 
                        // Convierte el valor de la columna 5 del segundo objeto a double
                        Double.parseDouble(parts2[5])
                    )
                )
                
                // Mapea cada arreglo de partes a una cadena formateada para la salida
                .map(parts -> 
                    parts[3] + " (" + parts[4] + ")," + // País (columna 3) y Año (columna 4)
                    parts[2].replace(" (%)", ", ") + // Género (columna 2), elimina " (%)" y reemplaza por ", "
                    parts[5] // Valor (columna 5)
                )
                
                // Recoge los resultados en una lista
                .collect(Collectors.toList());

            // Imprime cada línea de la lista en la consola
            lines.forEach(System.out::println);
        } catch (IOException e) {
            // Manejo de errores: Imprime el mensaje de error si ocurre una excepción
            System.out.println("Error: " + e.getMessage());
        }
    }
}
