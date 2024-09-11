package Latihan3;

public class Bingo {
		private String name;
	    private String bingo;
	    private int length;

	    public Bingo(String name) {
	        this.name = name;
	        this.bingo = "B-I-N-G-O";
	        this.length = 5;
	    }

	    public void Sing() {
	        for (int clapCount = 0; clapCount <= length; clapCount++) {
	            System.out.println("There was a farmer who had a dog,");
	            System.out.println("And " + name + " was his name-o.");
	            
	            for (int i = 0; i < 3; i++) {
	                for (int j = 0; j < length; j++) {
	                    if (j < clapCount) {
	                        System.out.print("(clap)");
	                    } else {
	                        System.out.print(bingo.charAt(j * 2));
	                    }
	                    if (j < length - 1) {
	                        System.out.print("-");
	                    }
	                }
	                System.out.println();
	            }
	            System.out.println("And " + name + " was his name-o.\n");
	        }
	    }
}