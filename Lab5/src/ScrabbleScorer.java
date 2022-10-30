import java.util.*;
/*
* This class scores words in the game of Scrabble.
* A word's score is the total of its individual tile scores.
*/
public class ScrabbleScorer {
 private final Map<Character, Integer> tileScores;

 public ScrabbleScorer() {
 char[] tiles = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

 // TODO: initialise the array of individual letter scores
 
 int[] scores = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4 ,10};
 int keySize = tiles.length;
 // TODO: create the `tileScores` map
 // TODO: populate the `tileScores` map using the `tiles`
 // and `scores` arrays. Use a for loop that iterates over both arrays to create
 // the HashMap.
 
 for (int i = 0; i < keySize; i++) {
	  
     // add them into the HashMap by calling the
     // put() method on the key-value pair
	 tileScores.put(tiles[i], scores[i]);
 }
 }

 /*
 * Calculates the score for an individual letter tile.
 * If the character is not a letter, then 0 is returned.
 */
 public int scoreForTile(char tile) {
 // TODO: convert the tile to an uppercase character. Use the toUpperCase(char) method of
 //the Character class
 // TODO: check if the `tileScores` map contains this tile
 // TODO: get the tile score from the `tileScores` map
 }
 /*
 * Calculates the score for a word.
 */
 public int scoreForWord(String word) {
 char[] tiles = word.toCharArray();

 // TODO: calculate the total score of the tiles
 }

 /*
 * Returns the highest-scoring word from a list of words,
 * or null if the list is empty.
 */
 public String highestScoringWord(List<String> words) {
 // TODO: find the word with the highest score

 }
}
