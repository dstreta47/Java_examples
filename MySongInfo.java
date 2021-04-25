/*
 * Program Author : Amit Rana
 * Date Created: 4/22/2021
 * Program Objective: Prints out MetaData for the Song Superstition By Stevie Ray Vaughan
 * Information Stated here is sourced from Google
 */
package mysonginfo;
/**
 *
 * @author Amit Rana
 */
public class MySongInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String Genre= "Blues Rock";
        String Album= "Live Alive";
        int Release_year= 1986;
        char album_type_search_index_alphabet= 'L'; //L for Live album, sorted by studio/live
        float current_ebay_listing_price = 43.99f;
        String Artist= "Stevie Ray Vaughan";
        String Music_format= "Vinyl";
        System.out.println("Genre: "+ Genre + "\n"+
                "Album"+ Album + "\n"+
                "Release Year: "+ Release_year + "\n"+
                "Album Search Index: "+ album_type_search_index_alphabet + "\n"+
                "Current Ebay Listing Price: "+ current_ebay_listing_price + "\n"+
                "Artist: "+ Artist + "\n"+
                "Music format: "+ Music_format + "\n");
        
        // TODO code application logic here
    }
    
}
