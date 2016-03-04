2. if(karel.canPickThing())                                    
{                                                        
    karel.turnRight();                               
} else {                                                   
    karel.turnLeft();                                
}                

 Statement one states that if Karel can pick a thing up, Karel will turn right (turn left three times), but if that
statment does not work Karel will turn left.

if(!karel.canPickThing())
{                                                                          
    karel.turnLeft();
} else {                                                                                                                          
    karel.turnRight();
}         

 If statement two states that if karel can not pick thing, Karel will turn left, but if that that statement does not work 
Karel will turn right.

Therefore, yes, both statements behave the same because in statement 1 it says that if Karel can pick Thing then turn 
   right and so does the second statement say the same by using the an else statement. Also, for the first statement, 
   it says if Karel can not pick up thing, turn left (by using a else statement) and statment 2 says the same by using 
   an if statement. (Answer is shown below as well)

    First if statement = Second else statement
    First else statment = Second if statement