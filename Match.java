public class Match {

int minWeight,maxWeight;
Fighter f1,f2;
int starter;
  Match(int minWeight,int maxWeight,Fighter f1,Fighter f2)
  {this.f1=f1;
      this.f2=f2;
      this.minWeight=minWeight;
      this.maxWeight=maxWeight;
      this.starter=starter();
  }


  void run(){
    if(chechWeight())
    {
     while(this.f1.health>0&&this.f2.health>0)
     {
         System.out.println("-----------------------------------------");
        if(starter==1)
        {
            this.f2.health=this.f1.hit(f2);
           if(isWin())
           {
               break;
           }
            this.f1.health=this.f2.hit(f1);
            if (isWin())
            {
                break;
            }

        }
         else {
            this.f1.health = this.f2.hit(f1);
            if (isWin()) {
                break;
            }
            this.f2.health = this.f1.hit(f2);
            if (isWin()) {
                break;
            }

         }
          printScore();
     }

    }
    else
        System.out.println("Siklet farki oldugundan mac baslayamiyor.");

  }


  boolean chechWeight(){

     return (this.f1.weight>=this.minWeight&&this.f1.weight<=this.maxWeight)&&(this.f2.weight>=this.minWeight&&this.f2.weight<=this.maxWeight);
  }


  int starter(){

  return (int)(Math.random()*2+1);
  }

  boolean isWin(){
      if(f1.health==0)
      {
          System.out.println("---------------------------");
          System.out.println(f2.name+"=>"+f2.health+" HP ile Kazandi");
          return true;
      }
      if(f2.health==0)
      {
          System.out.println("---------------------------");
          System.out.println(f1.name+"=>"+f1.health+" HP ile Kazandi");
          return true;
      }
      return false;
  }

  void printScore(){
      System.out.println(f1.name+":"+f1.health+"HP");
      System.out.println(f2.name+":"+f2.health+"HP");


  }
}
