class Flower{
String name;
String color;
int noofpetals;
void bloom(){
System.out.println(color+ " "+ name + " is blooming..");
}
public static void main(String []args){
Flower rose= new Flower();
rose.name="Rose";
rose.color="Red";
rose.noofpetals=14;
rose.bloom();

Flower jasmine= new Flower();
jasmine.name="Jasmine";
jasmine.color="White";
jasmine.noofpetals=7;
jasmine.bloom();
}
}