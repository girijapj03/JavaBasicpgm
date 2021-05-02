class StudentDetails{
String name;
String BEgraduated ;
String college;
String javatraining;
void details() {
System.out.println(name+" is " +BEgraduated+ "."+ "from" +"." + college + "& then joined " +javatraining);
}

public static void main(String []args){
StudentDetails girija= new StudentDetails();
girija.name="Girija PJ";
girija.BEgraduated="electronics & communication  engg";
girija.college="BGMIT college ";
girija.javatraining="Xworkz";
girija.details();

StudentDetails sunita=new StudentDetails();
sunita.name="Sunita";
sunita.BEgraduated="x &y engg";
sunita.college="XYZ college";
sunita.javatraining="Xworkz";
sunita.details();

StudentDetails Vaishnavi=new StudentDetails();
Vaishnavi.name=" Vaishnavi J";
Vaishnavi.BEgraduated="A&B engg";
Vaishnavi.college="ABC college";
Vaishnavi.javatraining="Xworkz";
Vaishnavi.details();

StudentDetails Darshan= new StudentDetails ();
Darshan.name="Darshan";
Darshan.BEgraduated="--- engg";
Darshan.college="ZYX college";
Darshan.javatraining="Xworkz";
Darshan.details();
}
}