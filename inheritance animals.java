class Animal
{
	public void move()
	{
		System.out.println("The animal is moving");
	}
}

class Bird extends Animal
{
	public void move()
	{
		System.out.println("The bird is flying");
	}
}

class Fish extends Animal
{
	public void move()
	{
		System.out.println("The fish is swimming");
	}
}

public class animals
{
	public static void main(String[] args)
	{
		Animal a =new Animal();
		a.move();
		
		Bird b =new Bird();
		b.move();
		
		Fish f =new Fish();
		f.move();
	}
}
