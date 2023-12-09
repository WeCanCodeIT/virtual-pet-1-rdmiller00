import java.util.Random;

public class VirtualPet{
    //attributes
    private String name;
    private int hungerLevel;
    private int boredomLevel;
    private int thirstLevel;
    private int affectionLevel;
    
    public VirtualPet(String name) {
        this.name = name;
        this.hungerLevel = new Random().nextInt(100) + 1;
        this.boredomLevel = new Random().nextInt(100) + 1;
        this.thirstLevel = new Random().nextInt(100) + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public void setBoredomLevel(int boredomLevel) {
        this.boredomLevel = boredomLevel;
    }

    public int getThirstLevel() {
        return thirstLevel;
    }

    public void setThirstLevel(int thirstLevel) {
        this.thirstLevel = thirstLevel;
    }

    public int getAffectionLevel() {
        return affectionLevel;
    }

    public void setAffectionLevel(int affectionLevel) {
        this.affectionLevel = affectionLevel;
    }


    public void hungerCheck(){
        if (hungerLevel > 75) {
            System.out.print(" They are getting pretty hungry. In fact his hunger level is " + hungerLevel +". ");
        } else {
            System.out.print(" Their hunger level is " + hungerLevel + ". ");
        }
    }

    public void thirstCheck(){
        if (thirstLevel > 75) {
            System.out.print(name + " is getting pretty thirsty! I would get them some water ASAP before you have to make a trip to the vet.");
        } else {
            System.out.print(name + " seems to be doing great, make sure you keep giving them plenty of water.");
        }
    }

    public void boredomCheck(){
        if (boredomLevel > 90) {
            System.out.println(name + " just chewed up the couch. You need to get him some more activity!");
        } else if (boredomLevel > 75) {
            System.out.print(name + " is quite bored...I would play fetch or go for a walk before they start destroying things.");
        } else {
            boredomLevel += 5;
            System.out.print(name + " seems to have had plenty of activity today, keep up the good work.");
        }
    }

    public void affectionCheck(){
        if (affectionLevel > 60) {
            System.out.println(name + " is feeling so loved today, just look at that tail wagging!");
        } else {
            System.out.println(name + " might need some extra lovin...I know things have been busy, but they miss you.");
        }
    }
    
    public void petCheck(){
        thirstCheck();
        hungerCheck();
        boredomCheck();
        affectionCheck();
    }

    public void tick(){
        boredomLevel += 5;
        getFood();
        getWater();
        affectionLevel -= 5;
    }

    public void playFetch(){
        boredomLevel -= 15;
        hungerLevel += 10;
        thirstLevel += 25;
        affectionLevel += 15;
        System.out.println("What a great game of fetch!");
        tick();
    }

    public void goForWalk(){
        boredomLevel -= 10;
        hungerLevel += 5;
        thirstLevel += 5;
        affectionLevel += 10;
        System.out.println("What a good walk. That quality time means so much to " + name + ".");
        tick();
    }

    public void snuggle(){
        boredomLevel -= 10;
        affectionLevel += 30;
        System.out.println("THAT IS THE GOOD STUFF! " + name + " goes crazy for those snuggles.");
        tick();
    }

    public void getWater(){
        if (thirstLevel > 55) {  
        thirstLevel -= 20;
        } hungerLevel += 5;
    }

    public void getFood(){
        if(hungerLevel > 75){
        hungerLevel -= 30;
        } hungerLevel += 5;
    }

    public void giveFoodAndWater(){
        thirstLevel = 5;
        hungerLevel = 5;
    }


}
