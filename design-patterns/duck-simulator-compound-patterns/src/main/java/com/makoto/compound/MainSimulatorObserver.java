package com.makoto.compound;

import com.makoto.compound.abstractfactory.AbstractDuckFactory;
import com.makoto.compound.abstractfactory.CountingDuckFactory;
import com.makoto.compound.adapter.GooseAdapter;
import com.makoto.compound.behaivor.Quackable;
import com.makoto.compound.composite.Flock;
import com.makoto.compound.decorator.QuackCounter;
import com.makoto.compound.duck.Goose;

public class MainSimulatorObserver
{
	public static void main(String[] args)
	{
		MainSimulatorObserver simulator =  new MainSimulatorObserver();
		AbstractDuckFactory duckFactory =  new CountingDuckFactory();
		
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory)
	{
		
		Quackable redheadDuck =  duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRedheadDuck();
		Quackable gooseAdapter = new GooseAdapter(new Goose());
		

		Flock flockOfDucks =  new Flock();
		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseAdapter);
		
		Flock flockOfMallards =  new Flock();
		
		Quackable mallarOne =  duckFactory.createMallarDuck();
		Quackable mallarTwo = duckFactory.createMallarDuck();
		Quackable mallarThree = duckFactory.createMallarDuck();
		Quackable mallarFour = duckFactory.createMallarDuck();
		
		flockOfMallards.add(mallarOne);
		flockOfMallards.add(mallarTwo);
		flockOfMallards.add(mallarThree);
		flockOfMallards.add(mallarFour);
		
		flockOfDucks.add(flockOfMallards);
		/*System.out.println("\nDuck Simulator: Whole flock Simulation");
		simulate(flockOfDucks);
		
		System.out.println("\nDuck Simulator: Mallard flock Simulation");
		simulate(flockOfMallards);
		*/
		
		System.out.println("\nDuck Simulator: With Observer");
		
		QuackoLogist quackLogist =  new QuackoLogist();
		flockOfDucks.registerObserver(quackLogist);
		
		simulate(flockOfDucks);
		System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
		
	}

	private void simulate(Quackable duck)
	{
		duck.quack();
	}
}
