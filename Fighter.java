public class Fighter {
    String name;
    int damage,health,weight;
    double dodge;
    Fighter(String name,int damage,double dodge,int health,int weight)
    {
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.name=name;
        if(dodge>=0&&dodge<=100)
            this.dodge=dodge;
    }


   int hit(Fighter foe){
       System.out.println(this.name+"=>"+foe.name+" "+this.damage+" hasar verdi.");
       if(foe.dodge())
       {
           System.out.println(foe.name+" Hasari Savurdu.");
           return foe.health;
       }
       if(foe.health-this.damage>0)
           return foe.health-this.damage;
        else
            return 0;
   }


  boolean dodge(){
      double rand=Math.random()*100;
        return rand<this.dodge;

  }


}
