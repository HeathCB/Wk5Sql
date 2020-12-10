
public class part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = false;
		boolean isWeekday  = true;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.98;
		double moneyInWallet = 7.75;
		short thirstLevel = 7;

		boolean shouldByIcecream = isHotOutside && isWeekday; {
			System.out.println( shouldByIcecream );
		}
		boolean willGoSwimming = isHotOutside && isWeekday; {
			System.out.println( willGoSwimming );
		}
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && isWeekday; {
			System.out.println( isAGoodDay );
		}
		boolean willBuyMilk = isHotOutside && ( thirstLevel >= 3 ) && ( moneyInWallet >= ( 2 * costOfMilk ) ); {
			System.out.println( willBuyMilk );
		}
		System.out.println(2 * costOfMilk);	
	}

}
