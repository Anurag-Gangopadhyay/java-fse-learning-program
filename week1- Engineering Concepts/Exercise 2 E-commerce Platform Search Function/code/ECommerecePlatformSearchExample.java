//week 1 Exercise3- E-commerce Platform Search Function

import java.util.*;
class Product {
    String id, name, category;
    int quantity;

    public Product(String id, String name, String category, int quantity) {
        this.id=id;
		this.name = name;
		this.category=category;
        this.quantity = quantity;
    }
}
class SearchProduct {
	Scanner sc= new Scanner(System.in);
	void linearSearch( Product p[] ){
		int ch=0;
		while(ch!=4){
			System.out.println("1.search by id");
			System.out.println("2.search by name");
			System.out.println("3.search by category");
			System.out.println("4.exit menu");
			int choice= sc.nextInt();
			ch=choice;
			if(ch==1){
				System.out.println("Enter id: ");
				sc.nextLine();
				String Id = sc.nextLine();
				for( int i=0; i< p.length; i++){
					if(p[i].id.equals(Id)){
						System.out.println("id= "+p[i].id+" name= "+p[i].name+" category= "+p[i].category+" quantity="+p[i].quantity);
						break;
					}
				}
			}
			else if(ch==2){
				System.out.println("Enter name: ");
				sc.nextLine();
				String Name = sc.nextLine();
				for( int i=0; i< p.length; i++){
					if(p[i].name.equalsIgnoreCase(Name)){
						System.out.println("id= "+p[i].id+" name= "+p[i].name+" category= "+p[i].category+" quantity="+p[i].quantity);
						
					}
				}
			}
			else if(ch==3){
				System.out.println("Enter category: ");
				sc.nextLine();
				String Cat = sc.nextLine();
				for( int i=0; i< p.length; i++){
					if(p[i].category.equalsIgnoreCase(Cat)){
						System.out.println("id= "+p[i].id+" name= "+p[i].name+" category= "+p[i].category+" quantity="+p[i].quantity);
						
					}
				}
			}
		}
		System.out.println("###THANKS FOR USING LINEAR SEARCH###");
	}
	void binarySearch( Product p[] ){
		Arrays.sort(p, Comparator.comparing(prod -> prod.id)); // sort by id
                    System.out.print("Enter ID to search: ");
					sc.nextLine();
                    String id = sc.nextLine();
                    Product key = new Product(id, "", "", 0); // dummy key for search
                    int index = Arrays.binarySearch(p, key, Comparator.comparing(prod -> prod.id));
                    if (index >= 0) {
						System.out.println("id= "+p[index].id+" name= "+p[index].name+" category= "+p[index].category+" quantity="+p[index].quantity);
                    } else {
                        System.out.println("Product with ID " + id + " not found.");
                    }
    }
}

class ECommerecePlatformSearchExample{
	    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        Product[] products = new Product[5];
        products[0] = new Product("P101", "Laptop", "Electronics", 10);
        products[1] = new Product("P102", "Shirt", "Clothing", 25);
        products[2] = new Product("P103", "Notebook", "Stationery", 50);
        products[3] = new Product("P104", "Mobile", "Electronics", 15);
        products[4] = new Product("P105", "Pen", "Stationery", 100);

        SearchProduct sp = new SearchProduct();
		System.out.println("Linear search:");
        sp.linearSearch(products);
		System.out.println("Binary search:");
        sp.binarySearch(products);
    }
}


