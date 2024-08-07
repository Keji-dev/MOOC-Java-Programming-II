
package dictionary;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    
    private Map<String, String> dictionary;
    private Scanner scanner;

    public SaveableDictionary() throws Exception {
        this.dictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) throws IOException {
        this();
        try {
            this.scanner = new Scanner(Paths.get(file));
        } catch (IOException e) {
            throw new IOException("Error initializing Scanner with file: " + file, e);
        }
    }

    
    public boolean load() {
        
        if (scanner == null) {
            return false;
        }
        
        boolean loaded = false;
        
        try {
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(":");

                dictionary.put(parts[0].trim(), parts[1].trim());

                loaded = true;
            }
        } catch (Exception e) {
            System.out.println("Unable to initialized the Scanner " + e.getMessage());
        }
        
        return loaded;
    }
    
    public void add(String words, String translation) {
        if (!dictionary.containsKey(words)) {
            dictionary.put(words, translation);
        }
    }
    
    public String translate(String word) {
        
        if (this.dictionary.containsKey(word)) {
            return dictionary.get(word);
        }
        
        for(Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(word)) {
                return entry.getKey();
            }
        }
        
        return null;
    }
    
    public void delete(String word) {
        
        for(Map.Entry<String, String> entry : dictionary.entrySet()) {
            if (entry.getValue().equals(word)) {
                word = entry.getKey();
            }
        }
        
        if(dictionary.containsKey(word) || dictionary.containsValue(word)) {
            dictionary.remove(word);
        } 
        
    }    
}
