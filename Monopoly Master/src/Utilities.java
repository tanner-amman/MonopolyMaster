
public class Utilities extends BuyableProperties
	{
		protected boolean both;

		// name, type, place on board, price, is bought, cost when landed on, both
		public Utilities(String n, String t, int pOB, int p, boolean b, int cWLO, boolean bo)
			{
				super(n, t, pOB, p, b, cWLO);
				both = bo;
			}

		public boolean isBoth()
			{
				return both;
			}

		public void setBoth(boolean both)
			{
				this.both = both;
			}

	}
