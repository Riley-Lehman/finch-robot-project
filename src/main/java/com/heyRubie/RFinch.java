package com.heyRubie; 

import com.birdbrain.Finch; 

public class RFinch {

    public static void main(String[] args) {
        Finch bird = new Finch();


//Draw the Initial Square using For Loop
for (int i = 0; i < 4; i++) {
    bird.setMove("F", 10, 50);
    bird.setTurn("R", 90, 50);
}



//PAUSE 
//Transport Finch
bird.pause(6);


//Draw the Smile
bird.setMove("F", 2, 50);
bird.setTurn("L", 90, 50);
bird.setMove("F", 5, 50);
bird.setTurn("L", 90, 50);
bird.setMove("F", 2, 50);


//PAUSE 
//Transport Finch
bird.pause(6);


//Draw Left Eye
bird.setMove("F",2,50);


//PAUSE 
//Transport Finch
bird.pause(6);


//Draw Right Eye
bird.setMove("F",2,50);

//Play Victory Call
bird.playNote(64,1);

        bird.stop();
        bird.disconnect();
    }
}