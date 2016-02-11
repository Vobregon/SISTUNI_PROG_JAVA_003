
#include <LiquidCrystal.h>

LiquidCrystal lcd(12,11,5,4,3,2);

byte a[8] = {  
    B11111,  
    B11111,
    B11111,  
    B11111,  
    B11111,  
    B11111,  
    B11111,  
    B11111, 
}; 



byte b[8] = {  
    B00000,  
    B00000,
    B00000,  
    B00000,  
    B00000,  
    B00000,  
    B00000,  
    B00000, 
}; 



void setup(){
  
lcd.createChar(1, a);  
lcd.createChar(2, b);




pinMode(8, OUTPUT);
pinMode(9, OUTPUT);
    
  };

  
     

  void loop(){

      pinMode(12,OUTPUT);  
lcd.begin(16,2); 
Serial.begin (9600);
    
      digitalWrite(12,HIGH);
          
      lcd.setCursor(0,0);
      lcd.write(1);
      lcd.setCursor(0,1);
      lcd.write(2);
       
      lcd.setCursor(1,0);
      lcd.write(2); 
      lcd.setCursor(1,1);
      lcd.write(1);
       
      lcd.setCursor(2,0);
      lcd.write(1); 
      lcd.setCursor(2,1);
      lcd.write(2);
      
      lcd.setCursor(3,0);
      lcd.write(2); 
      lcd.setCursor(3,1);
      lcd.write(1);
      
      lcd.setCursor(4,0);
      lcd.write(1); 
      lcd.setCursor(4,1);
      lcd.write(2);
      
      lcd.setCursor(5,0);
      lcd.write(2); 
      lcd.setCursor(5,1);
      lcd.write(1);
      
      lcd.setCursor(6,0);
      lcd.write(1); 
      lcd.setCursor(6,1);
      lcd.write(2);
      
      lcd.setCursor(7,0);
      lcd.write(2); 
      lcd.setCursor(7,1);
      lcd.write(1);
      
      lcd.setCursor(8,0);
      lcd.write(1); 
      lcd.setCursor(8,1);
      lcd.write(2);
      
      lcd.setCursor(9,0);
      lcd.write(2); 
      lcd.setCursor(9,1);
      lcd.write(1);
      
      lcd.setCursor(10,0);
      lcd.write(1);
      lcd.setCursor(10,1);
      lcd.write(2);
       
      lcd.setCursor(11,0);
      lcd.write(2);
      lcd.setCursor(11,1);
      lcd.write(1);
      
      lcd.setCursor(12,0);
      lcd.write(1); 
      lcd.setCursor(12,1);
      lcd.write(2);
      
      lcd.setCursor(13,0);
      lcd.write(2);
      lcd.setCursor(13,1);
      lcd.write(1);
       
      lcd.setCursor(14,0);
      lcd.write(1);
      lcd.setCursor(14,1);
      lcd.write(2);
      
      lcd.setCursor(15,0);
      lcd.write(2);
      lcd.setCursor(15,1);
      lcd.write(1);
      
    delay(3000);
    digitalWrite(12,LOW);
    delay(1000);
    lcd.clear();    
    delay(7000);

    digitalWrite(9, HIGH);
    delay(4000);
    digitalWrite(9, LOW);
    delay(6000);
    
    digitalWrite(8, HIGH);
    delay(6000);
    digitalWrite(9, LOW);
    delay(4000);


    
       
    };
  

