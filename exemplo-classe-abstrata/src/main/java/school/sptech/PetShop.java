package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class PetShop {
    private String nome;
    private List<Pet> pets;

    public PetShop(String nome) {
        this.nome = nome;
        this.pets = new ArrayList<>();
    }

    public void receberPet(Pet pet)
    {
        this.pets.add(pet);
    }

    public void alimentarPets()
    {
        if (pets.isEmpty())
        {
            System.out.println("Não há pets para alimentar!");
            return;
        }

        for (Pet pet : pets) {
            if (pet instanceof Peixe)
                pet.comer("Ração de peixe");
            else if(pet instanceof Cachorro)
                System.out.println("Pedigree");
            else
                System.out.println("Whiskas sache");
        }
    }
}
