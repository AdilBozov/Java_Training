import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;


/*
 * 
 */
public class LessonEightMonster extends Monster {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monster.buildBattelBoard();
		
		char[][] tempBattleBoard = new char[10][10];
		
		//ObjactName[] = ArrayName = new Object[4]
		
		Monster[] Monsters = new Monster[4];
		
		//public Monster(int health, int attack, int movement, String name)
		
		Monsters[0] = new Monster(1000, 20, 1, "Frank");
		Monsters[1] = new Monster(500, 40, 2, "Drac");
		Monsters[2] = new Monster(1000, 20, 1, "Paul");
		Monsters[3] = new Monster(1000, 20, 1, "George");
		
		Monster.radrawBoard();
	
	
	
	for(Monster m : Monsters)
	{
		
		if(m.getAlive())
		{
			int arrayItemIndex = ArrayUtils.indexOf(Monsters, m);
		
			m.moveMonster(Monsters, arrayItemIndex);
		}
		
	}
	Monster.radrawBoard();

}
}
