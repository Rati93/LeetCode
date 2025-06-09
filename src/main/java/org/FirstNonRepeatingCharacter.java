package org.practice;
import java.util.Map;
import java.util.LinkedHashMap;



// Online IDE - Code Editor, Compiler, Interpreter

public class FirstNonRepeatingCharacter
{
    public static void main(String[] args) {
        String str="ullui";
        str=str.toLowerCase();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch : str.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==1)
            {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
