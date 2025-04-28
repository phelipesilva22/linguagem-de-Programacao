package school.sptech;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("----------------- CLASSE ABSTRATA -----------------");

        Gato gato1 = new Gato("Frajola", "Frajola", 5.0);
        Gato gato2 = new Gato("Garfield", "Laranja", 3.0);
        Gato gato3 = new Gato("Murilo", "Cinza", 80.0);

        Cachorro cachorro1 = new Cachorro("Snoopy", "Beagle", 8.0);
        Cachorro cachorro2 = new Cachorro("Caramelo", "Caramelo", 6.0);
        Cachorro cachorro3 = new Cachorro("Mel", "Pinscher", 4.0);

        Peixe peixe1 = new Peixe("Nemo", "Palhaço", 0.05, true);


        PetShop petShop = new PetShop("Sp Pet");
        petShop.alimentarPets();
        petShop.receberPet(peixe1);
        petShop.receberPet(cachorro1);
        petShop.receberPet(cachorro2);
        petShop.receberPet(gato2);
        petShop.alimentarPets();

    }
}