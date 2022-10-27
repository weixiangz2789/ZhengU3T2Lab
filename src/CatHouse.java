public class CatHouse
{
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner)
    {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    public void rollCall()
    {
        if (cat1.getAge() > cat2.getAge()){
            cat1.introduce();
            cat2.introduce();
        }
        if (cat1.getAge() < cat2.getAge()){
            cat2.introduce();
            cat1.introduce();
        }
        else{
            if (cat1.getName().compareTo(cat2.getName()) > 0){
                cat2.introduce();
                cat1.introduce();
            }
            else{
                cat1.introduce();
                cat2.introduce();
            }
        }
    }

    public void catNoise()
    {
        System.out.print(cat1.speak());
        System.out.print(cat2.speak());
    }

    public String toString()
    {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + ", Age: " + cat1.getAge() + "\n";
        str += "Cat 2's Name: " + cat2.getName()+ ", Age: " + cat2.getAge();
        return str;
    }
}