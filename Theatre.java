class Theatre
{
public static void main(String[] args)
{
Theatre raja = new Theatre();
int balance = raja.bookticket(200);
}
int bookticket(int price)
{
int ticket_price=120;
int balance = price-ticket_price;
System.out.println("balanace amount"+balance);
return balance;
}
}
