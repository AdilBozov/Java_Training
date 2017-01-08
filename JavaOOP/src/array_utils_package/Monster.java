package array_utils_package;
import  java.util.Arrays;

public class Monster {
	
	static char[][] battleBoaed = new char[10][10];
	
	public static void buildBattelBoard(){
		
		for(char[] row : battleBoaed){
			
			Arrays.fill(row, '*');
			System.out.println(row);
		}
	}
	
	public static void radrawBoard()
	{
		int k = 1;
		while(k <= 30)
		{
			System.out.print('-'); 
			k++;
		}
		System.out.println();
		
		for (int i = 0; i < battleBoaed.length; i++) 
		{
			for (int j = 0; j < battleBoaed[i].length; j++) 
			{
				System.out.print("|" + battleBoaed[i][j] + "|");
			}
			System.out.println();
		}
		k = 1;
		while(k <= 30)
		{
			System.out.print('-'); 
			k++;
		}
		System.out.println();
	}

	
	public final String TOMBSTONE = "Here Line a Dead monster";
	
	private int health = 500;
	private int attack =  20;
	private int movement = 2;
	
	private boolean alive = true;
	
	public String name = "Big Monster";
	public char nameChar1 = 'B';
	public int xPosition = 0;
	public int yPosition = 0;
	public static int numOfMonster = 0;
	
	public int getAttack(){
		return attack;
	}
	
	public int getMovement(){
		return movement;
	}
	
	public int getHealth(){
		return health;
	}
	
	public boolean getAlive(){
		return alive;
	}
	
	public void setHealth(int decreaseHealth)
	{
		health = health - decreaseHealth;
		if (health < 0) 
		{
			alive = false;
		}
	}
	
	public void setHealth(double decreaseHealth)
	{
		int intDecreaseHealth = (int)decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0)
		{
			alive = false;
		}
	}
	
	public void moveMonster(Monster[] monster, int arrayItemIndex)
	{
		boolean isSpaceOpen = true;
		int maxXBoardSpace = battleBoaed.length - 1;
		int maxYBoardSpace = battleBoaed[0].length - 1;
		
		while(isSpaceOpen)
		{
			int randMoveDirection = (int)(Math.random() * 4);
			int randMoveDistance = (int)(Math.random()*(this.getMovement() +1));
			
			System.out.println(randMoveDistance + " " + randMoveDirection);
			
			battleBoaed[this.yPosition][this.xPosition] = '*';
			
			if(randMoveDirection == 0)
			{
				if((this.yPosition - randMoveDistance) < 0)
				{
					this.yPosition = 0;
				}
				else
				{
					this.yPosition = this.yPosition - randMoveDistance;
				}
			} 
			else if (randMoveDirection == 1)
			{
				if((this.xPosition - randMoveDistance) < maxXBoardSpace)
				{
					this.xPosition = maxXBoardSpace;
				} 
				else
				{
					this.xPosition = this.xPosition - randMoveDistance;
				}
			}
			else if (randMoveDirection == 2)
			{
				if((this.yPosition - randMoveDistance) < maxYBoardSpace)
				{
					this.yPosition = maxYBoardSpace;
				} 
				else
				{
					this.yPosition = this.yPosition - randMoveDistance;
				}
			}
			else
			{
				if((this.xPosition - randMoveDistance) < 0)
				{
					this.xPosition = 0;
				} 
				else
				{
					this.xPosition = this.xPosition - randMoveDistance;
				}
			}
			
			for (int i = 0; i < monster.length; i++)
			{
				if (i == arrayItemIndex)
				{
					continue;
				}
				
				if (onMySpace(monster, i, arrayItemIndex))
				{
					isSpaceOpen = true;
					break;
				} else {
					isSpaceOpen = false;
				}
			}
			
		}// END OF WHILE LOOP
		
		battleBoaed[this.yPosition][this.xPosition] = this.nameChar1;
		
		
	} // END OF moveMonster
	
	public boolean onMySpace (Monster[] monster, int indexToChek1, int indexChek2)
	{
		if((monster[indexToChek1].xPosition) == (monster[indexChek2].xPosition) && (monster[indexToChek1].yPosition) == (monster[indexChek2].yPosition))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	} // END Of onMySace
	
	public Monster(int health, int attack, int movement, String name)
	{
		this.health = health;
		this.attack = attack;
		this.movement = movement;
		this.name = name;
		
		int maxXBoardSpace = battleBoaed.length - 1;
		int maxYBoardSpzce = battleBoaed[0].length -1;
		
	int randNumX, randNumY;
	
	do{
	
	randNumX = (int)(Math.random()* maxXBoardSpace);
	randNumY = (int)(Math.random()* maxYBoardSpzce);
	
	} while(battleBoaed[randNumX][randNumY] != '*');
	
	this.xPosition = randNumX;
	this.yPosition = randNumY;
	
	this.nameChar1 = this.name.charAt(0);
	
	battleBoaed[this.yPosition][this.xPosition] = this.nameChar1;
	
	}
	
	public Monster ()
	{
		numOfMonster++;
	}
	
	public static void main (String[] args){
		
		
		
	}
	
}
