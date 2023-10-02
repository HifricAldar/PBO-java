class F1D021041{
    String AnimalName;
    String LivingPlace;
    int AnimalSize;
    String Animal_FoodType;

    //constructor
    F1D021041(String AnimalName, String LivingPlace, int AnimalSize, String Animal_FoodType){
        this.AnimalName = AnimalName;
        this.LivingPlace = LivingPlace;
        this.AnimalSize = AnimalSize;
        this.Animal_FoodType = Animal_FoodType;
    }

    //Mutator
    public void SetName(String AnimalName){
        this.AnimalName = AnimalName;
    }
    public void SetLivingPlace(String LivingPlace){
        this.LivingPlace = LivingPlace;
    }
    public void SetAnimalSize(int AnimalSize){
        this.AnimalSize = AnimalSize;
    }
    public void SetAnimal_FoodType(String Animal_FoodType){
        this.Animal_FoodType = Animal_FoodType;
    }

    //Selector
    public String GetName(){
        return AnimalName;
    }
    public String GetLivingPlace(){
        return LivingPlace;
    }
    public int GetAnimalSize(){
        return AnimalSize;
    }
    public String GetAnimal_FoodType(){
        return Animal_FoodType;
    }

    //display
    public void Display(){
        System.out.println("    Animal  ");
        System.out.println("Animal Name: "+GetName());
        System.out.println("Animal Living Place: "+GetLivingPlace());
        System.out.println("Animal Size: "+GetAnimalSize()+"m");
        System.out.println("Animal Food Type: "+GetAnimal_FoodType());
        System.out.println();
    }

//main
public static void main(String[] args){
    F1D021041 animals = new F1D021041("Orca", "Ocean", 5, "Meat");
    animals.Display();
    animals.SetName("Cow");
    animals.SetLivingPlace("Land");
    animals.SetAnimalSize(1);
    animals.SetAnimal_FoodType("Grass");
    animals.Display();
}


}

