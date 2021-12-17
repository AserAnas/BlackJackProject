package BlackJackProject;

import java.util.Scanner;

public class Game {

	private int dealertotal;
	private int playertotal;
	private int turn;
	private String Replay;
	private int gameend=0;
	CardType Club=CardType.Club;
	CardType Diamond=CardType.Diamond;
	CardType Spade=CardType.Spade;
	CardType Heart=CardType.Heart;
	CardPicture King=CardPicture.King;
    CardPicture Queen=CardPicture.Queen;
    CardPicture Jack=CardPicture.Jack;
	Scanner S=new Scanner(System.in);
	public Game()
	{
	}
	public void startagame()
	{
	while (true)
	{
    dealertotal=0;
    playertotal=0;
	turn=1;
    System.out.println("Welcome to BlackJack!");	
    System.out.println("-------------------------");			
	while(playertotal<21&&dealertotal<21)
	{
		
		if(turn%2!=0)
		{
	    System.out.println("Player's Turn:......");			
	    Double random1=Math.floor(Math.random()*(13-1+1)+1);
		@SuppressWarnings("removal")
		Double intrandom1 = new Double(random1);
		int drawedcard1 = intrandom1.intValue();
		if(drawedcard1==11)
		{
			System.out.println(CardPicture.Jack + " "+CardType.randomtype()+" has been drawn ");		
			drawedcard1=drawedcard1-1;

		}
		else if(drawedcard1==12)
		{
			System.out.println(CardPicture.Queen + " "+CardType.randomtype()+" has been drawn ");		
	        drawedcard1=drawedcard1-2;

		}
		else if(drawedcard1==13)
		{
			System.out.println(CardPicture.King + " "+CardType.randomtype()+" has been drawn ");		
			drawedcard1=drawedcard1-3;
		}
		else
		{
		System.out.println(drawedcard1 + " "+CardType.randomtype()+" has been drawn ");		
		}
		Double random2=Math.floor(Math.random()*(13-1+1)+1);
		@SuppressWarnings("removal")
		Double intrandom2 = new Double(random2);
		int drawedcard2 = intrandom2.intValue();
		if(drawedcard2==11)
		{
			System.out.println(CardPicture.Jack + " "+CardType.randomtype()+" has been drawn ");		
			drawedcard2=drawedcard2-1;
		}
		else if(drawedcard2==12)
		{
			System.out.println(CardPicture.Queen + " "+CardType.randomtype()+" has been drawn ");	
			drawedcard2=drawedcard2-2;
		}
		else if(drawedcard2==13)
		{
			System.out.println(CardPicture.King + " "+CardType.randomtype()+" has been drawn ");	
			drawedcard2=drawedcard2-3;
		}
		else
		{
		System.out.println(drawedcard2 + " "+CardType.randomtype()+" has been drawn ");		
		}
		System.out.println("Player's total is  "+ playertotal);
		System.out.println("Deal or Hold (deal/hold)");
		while (true){
	    String playerdecision = S.nextLine(); 
		if(playerdecision.equals("deal"))
		{
			playertotal=playertotal+drawedcard1+drawedcard2;
			System.out.println("Player's total is  "+ playertotal);
			System.out.println("-----------------------------------------");
			turn++;
			break;
		}
		else if(playerdecision.equals("hold"))
		{
			System.out.println("Player's total is still "+ playertotal);
			System.out.println("-----------------------------------------");
			turn++;
			break;
		}
		else
		{
			System.out.println("Wrong paramter, pleaser enter again.... ");
		}
		}
		}
		else if(turn%2==0)
		{
	    System.out.println("Dealer's Turn:......");			
	    Double random3=Math.floor(Math.random()*(13-1+1)+1);
		@SuppressWarnings("removal")
		Double intrandom3 = new Double(random3);
		int drawedcard3 = intrandom3.intValue();
		if(drawedcard3==11)
		{
			System.out.println(CardPicture.Jack + " "+CardType.randomtype()+" has been drawn ");		
			drawedcard3=drawedcard3-1;
		}
		else if(drawedcard3==12)
		{
			System.out.println(CardPicture.Queen + " "+CardType.randomtype()+" has been drawn ");	
			drawedcard3=drawedcard3-2;
		}
		else if(drawedcard3==13)
		{
			System.out.println(CardPicture.King + " "+CardType.randomtype()+" has been drawn ");	
			drawedcard3=drawedcard3-3;
		}
		else
		{
		System.out.println(drawedcard3 + " "+CardType.randomtype()+" has been drawn ");		
		}
		Double random4=Math.floor(Math.random()*(13-1+1)+1);
		@SuppressWarnings("removal")
		Double intrandom4 = new Double(random4);
		int drawedcard4 = intrandom4.intValue();
		if(drawedcard4==11)
		{
			System.out.println(CardPicture.Jack + " "+CardType.randomtype()+" has been drawn ");		
			drawedcard4=drawedcard4-1;
		}
		else if(drawedcard4==12)
		{
			System.out.println(CardPicture.Queen + " "+CardType.randomtype()+" has been drawn ");	
			drawedcard4=drawedcard4-2;
		}
		else if(drawedcard4==13)
		{
			System.out.println(CardPicture.King + " "+CardType.randomtype()+" has been drawn ");	
			drawedcard4=drawedcard4-3;
		}
		else
		{
		System.out.println(drawedcard4 + " "+CardType.randomtype()+" has been drawn ");		
		}
		System.out.println("Dealer's total is  "+ dealertotal);
		System.out.println("Deal or Hold (deal/hold)");
		while(true)
		{
	    String dealerdecision = S.nextLine(); 
		if(dealerdecision.equals("deal"))
		{
			dealertotal=dealertotal+drawedcard3+drawedcard4;
			System.out.println("Dealer's total is  "+ dealertotal);
			System.out.println("-----------------------------------------");
			turn++;
			break;

		}
		else if(dealerdecision.equals("hold"))
		{
			System.out.println("Dealer's total is still "+ dealertotal);
			System.out.println("-----------------------------------------");
			turn++;
			break;
		}
		else
		{
			System.out.println("Wrong paramter, pleaser enter again.... ");
		}
		}
	}
		if(playertotal>21)
		{
	    gameend=1;
	    System.out.println("Player Busted!");
		System.out.println("Dealer Won!");
		}
		else if(dealertotal>21)
		{
			gameend=1;
		    System.out.println("Dealer Busted!");
			System.out.println("Player Won!");
	    }
		else if (dealertotal==21)
		{
		    gameend=1;
		    System.out.println("BlackJack!");
			System.out.println("Dealer Won!");
		}
		else if (playertotal==21)
		{
		    gameend=1;
		    System.out.println("BlackJack!");
			System.out.println("Player Won!");
		}
		if(gameend==1)
		{
		while(true)
		{
		System.out.println("Do want to play again?(yes/no)");
	    Replay= S.nextLine(); 
		if(Replay.equals("yes"))
		{
			System.out.println("New game starting.... ");
			break;
		}
		else if(Replay.equals("no"))
		{
			System.out.println("Thank you for playing.... ");
			System.exit(0);
		}
		else 
		{
			System.out.println("Wrong paramter, pleaser enter again.... ");
		}
		}
		break;
		}
}
	}
	}
}

