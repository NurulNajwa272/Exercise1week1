public class Driver {

     public static void main(String[] args) {
     	//Fish=data type
     	//nemo=object,fish=class
     	Fish nemo = new Fish();
     	nemo.Swim();
		//nemo.color = "red";  //tukar value
		nemo.SetColor("red");
		nemo.Swim();
		

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();

		// Fish dory = new Fish();   //another object
		// dory.Swim();
		// //dory.color = "purple";
		// dory.SetColor("yellow");
		// dory.Swim();

		// Aquarium fancyAquarium = new Aquarium();
		// fancyAquarium.fillFish();
	}
}