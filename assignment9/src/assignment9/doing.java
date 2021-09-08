package assignment9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Comparator.comparing;


public class doing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<fruit> fruits = Arrays.asList(new fruit("apple",70,10,"red"),
				new fruit("strawberry",120,50,"red"),
				new fruit("pomegranate",22,25,"red"),
				new fruit("orange",60,5,"orange"),
				new fruit("bananana",112,3,"yellow"),
				new fruit("grapes",50,7,"green"));
		
		// fruits calories less than 100
		List<String> cal = fruits.stream()
				.filter(fruit->fruit.getCalories()<100)
				.map(fruit->fruit.getName())
				.sorted((o1,o2)->o2.compareTo(o1))
				.collect(Collectors.toList());
		
		System.out.println(cal);
		
		fruits.forEach(fruit-> System.out.println("name: "+fruit.getName()+" color: "+fruit.getColor()));
		//color of fruit
		List<String> col = fruits.stream()
				.filter(fruit->fruit.getColor()=="red").map(fruit->fruit.getName()).sorted().collect(Collectors.toList());
		
		System.out.println(col);
		
		
		
		System.out.println("**----------------------------------------------------**");
        Trader groot = new Trader("groot", "hyderabad");
        Trader stark = new Trader("stark", "indore");
        Trader ironman = new Trader("ironman", "pune");
        Trader superman = new Trader("superman", "pune");
        
        List<Transaction> transactions = Arrays.asList(new Transaction(ironman, 2011, 300),
                new Transaction(superman, 2012, 1000), 
                new Transaction(superman, 2011, 400),
                new Transaction(groot, 2012, 710), 
                new Transaction(groot, 2012, 700), 
                new Transaction(stark, 2012, 9500));

        //all transaction in 2011
        List<Transaction> tr2011 = transactions.stream().filter(transaction -> transaction.getYear()==2011)
        		.sorted(comparing(Transaction::getValue)).collect(Collectors.toList());
        tr2011.forEach(System.out::println);
        
        //System.out.println(tr2011);
        List<String> cities = transactions.stream().map(transaction->transaction.getTrader().getCity())
        		.distinct().
        		collect(Collectors.toList());

        System.out.println("----------------------------------");
        cities.forEach(System.out::println);
        System.out.println("---------------------------------------");
        
        List<Trader> user = transactions.stream().map(Transaction::getTrader)
        		.filter(trader->trader.getCity().equals("pune"))
        		.distinct().sorted(comparing(Trader::getName)).collect(Collectors.toList());
        user.forEach(System.out::println);
        
        // to get trader names in order
        List<String> tname = transactions.stream().map(transaction->transaction.getTrader()
        		.getName()).sorted().collect(Collectors.toList());
        System.out.println("-----------------------------------");
        tname.forEach(System.out::println);
        
        int highestvalue = transactions.stream().map(Transaction::getValue).reduce(0, Integer::max);
        System.out.println("----------------highest value-----------------");
        System.out.println(highestvalue);
        //
        int lowestvalue = transactions.stream().map(Transaction::getValue).reduce(Integer.MAX_VALUE, Integer::min);
        System.out.println("--------------lowest value-------------------");
        System.out.println(lowestvalue);
        
        //-----------------------------------------------------------------
        
        
        
        
        
	}

}
