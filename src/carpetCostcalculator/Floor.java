package carpetCostcalculator;

class Main{


    public static void main(String[]args){


//        Floor floor = new Floor(8.0,14.0);
//        Carpet carpet = new Carpet(800.0);
//        Calculator calculator = new Calculator(floor,carpet);
//        System.out.println(calculator.getTotalCost());
    }
}



public class Floor {
    Double width;
    Double length;
    Floor(Double width,Double length){
        this.width=width;
        this.length=length;
    }
    public Double getArea(){
        return width*length;
    }
}
class Carpet{
    Double cost;
    Carpet(Double cost){
        this.cost=cost;
    }
    public Double getCost(){
        return cost;
    }
}

class Calculator{
    Floor floor;
    Carpet carpet;
    Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.carpet=carpet;
    }
    public double getTotalCost(){
        return floor.getArea()*carpet.getCost();
    }
}