package najvecinajmanjibr;

public class Najvecinajmanjibr {

    public static void main(String[] args) {

         int brojevi[] = new int[] {-1,2,5,9,6,74,89,23,-231};
        int najmanji = brojevi[0];
        int najveci = brojevi[0];
        
        for (int i=1;i<brojevi.length;i++)
        {
            if(brojevi[i]>najveci)
              najveci = brojevi[i];
            else if (brojevi[i]<najmanji)
                najmanji = brojevi[i];
        }
        
        System.out.println("Najveći broj u nizu je: "+najveci);
        System.out.println("Najmanji broj u nizu je: "+najmanji);
    }
    
}
