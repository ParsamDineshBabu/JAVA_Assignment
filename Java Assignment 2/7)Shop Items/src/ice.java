

public class ice extends Dessert {
	float quantity;
	public ice(float q)
	{
		quantity=q;
	}

	@Override
	public float getcost() {
		float cost = quantity*60f;
		float taxamount=(5f/100f)*cost;
		float totalcost=cost+taxamount;
		return totalcost;
	}

}

