import java.io.*;
class Donga
{
int dno,damt;
String dname;

void showDonga()
{
System.out.println("DONGA DETAILS");
System.out.println("ID:-"+dno);
System.out.println("NAME:-"+dname);
System.out.println("AMOUNT :-"+damt);
}
}
class Police
{
int pno,pamt;
String pname;

void showPolice()
{
System.out.println("POLICE DETAILS");
System.out.println("ID:-"+pno);
System.out.println("NAME:-"+pname);
System.out.println("AMOUNT :-"+pamt);
}
void Interogation(Donga x)
{
pamt=x.damt;
x.damt=0;
}
}
class Station
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Donga d=new Donga();
Police p=new Police();
System.out.println("HI TULASI BANDA.....POTTI PAPAAAA");
System.out.println("PLEASE ENTER DONGA NAME:");
d.dname=br.readLine();
System.out.println("PLEASE ENTER DONGA id:");
d.dno=Integer.parseInt(br.readLine());
System.out.println("PLEASE ENTER DONGA amount");
d.damt=Integer.parseInt(br.readLine());
System.out.println("PLEASE ENTER police id:");
p.pno=Integer.parseInt(br.readLine());
System.out.println("PLEASE ENTER police name:");
p.pname=br.readLine();
System.out.println("PLEASE ENTER police amount:");
p.pamt=Integer.parseInt(br.readLine());
System.out.println("BEFORE INVESTIGATION");
d.showDonga();
p.showPolice();

p.Interogation(d);
System.out.println("AFTER INVESTIGATION");
d.showDonga();
p.showPolice();
System.out.println("file closed ");
}
}


