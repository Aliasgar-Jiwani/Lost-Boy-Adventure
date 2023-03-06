package entity;

import java.util.Random;

import main.GamePanel;

public class NPC_OldMan extends  Entity {

	public NPC_OldMan(GamePanel gp) {
		super(gp);
		
		direction = "down";
		speed = 1;
		getImage();
		setDialogue();
	}
	
	public void getImage() {
		
		
		up1 = setup("/npc/oldman_up_1",gp.tileSize,gp.tileSize);
		up2 = setup("/npc/oldman_up_2",gp.tileSize,gp.tileSize);
		down1 = setup("/npc/oldman_down_1",gp.tileSize,gp.tileSize);
		down2 = setup("/npc/oldman_down_2",gp.tileSize,gp.tileSize);
		left1 = setup("/npc/oldman_left_1",gp.tileSize,gp.tileSize);
		left2 = setup("/npc/oldman_left_2",gp.tileSize,gp.tileSize);
		right1 = setup("/npc/oldman_right_1",gp.tileSize,gp.tileSize);
		right2 = setup("/npc/oldman_right_2",gp.tileSize,gp.tileSize);
			
	}
	
	public void setDialogue() {
		dialogues[0] = "Kya kaam hai?";
		dialogues[1] = "Tu bhi yaha sabki tarah \nKhazane Ke liye Aagya?";
		dialogues[2] = "Mai bhi aya tha 30 saal pehle";
		dialogues[3] = "Chal Ab Bhag Yaha se!!";
	}
	
	public void setAction() {
		
		//if(onPath == true) {
			
//			int goalCol = 12;
//			int goalRow = 9;
			//searchPath(goalCol,goalRow);
		//}

		//else {
		actionLockCounter++;
		if (actionLockCounter == 120) {
			
			Random random = new Random();
	    	int i = random.nextInt(100)+1;
	    	
	    	if (i <= 25) {
	    		direction = "up";	
			}
	    	if (i > 25 && i <= 50) {
	    		direction = "down";	
			}
	    	if (i > 50 && i<=75) {
	    		direction = "left";	
			}
	    	if (i > 75 && i <= 100) {
	    		direction = "right";	
			}
	    	actionLockCounter = 0;
		}
		
		}
		//}
	public void speak() {
		
		super.speak();
		onPath = true;
		
	}
    	
	

	
}
