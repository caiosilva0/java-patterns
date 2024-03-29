package DesignPatterns.Builder.Ada.UsandoLombok;

public class TestAnimal {
    public static void main(String[] args) {
       Animal animal = Animal.builder()
                .nome("Lenovo")
                .dono("Caio")
                .dono("Caio").build();
        System.out.println(animal);

    }
}
