package game.level;

import game.character.Character;

import java.util.ArrayList;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;
 
public class Level {
	 
    private TiledMap map;
 
    //a list of all characters present somewhere on this map
    private ArrayList<Character> characters;
 
    public Level(String level) throws SlickException{
        map = new TiledMap("data/levels/" + level + ".tmx","data/img");
        characters = new ArrayList<Character>();
    }
 
    public void addCharacter(Character c){
        characters.add(c);
    }
 
    public void render(){
        //render the map first
        map.render(0, 0);
 
        //and then render the characters on top of the map
        for(Character c : characters){
            c.render();
        }
    }
    
    public ArrayList<Character> getCharacters(){
        return characters;
    }
 
    
}