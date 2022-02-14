package johncustomer;

public class amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int pen = 10;
int pencil = 5;
int book = 50;
int penqy = 6;
int pencilqy =2;
int bookqy = 1;
double price = (pen*penqy)+(pencil*pencilqy)+(book*bookqy);
double afterdiscountprice = (price*90)/100;
double netamount = afterdiscountprice +(afterdiscountprice*5)/100;

System.out.println("Amount paid by john is " + netamount);



	}

}
