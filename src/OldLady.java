/***
 * Grading comments:
 *   Very good work.  You definitely reduced typing and
 *   duplication using nesting.
 *  Compiles/Runs: 15/15
 *  Desired Output: 6/6
 *  Consistency: 2/2  -Missed a bracket indentation, but naming 
 *    conventions were good.
 *  Efficiency: 2/2  - You could've done more here - You could have 
 *   reduced typing 'There was an old lady who swallowed" into a 
 *   method, made methods for verses to make main() 
 *   cleaner, but you still did well.
 *   Good job.  25/25
 */
public class OldLady {

	public static void main(String[] args) {
		fly();
		spider();
		swalSpid();
		bird();
		swalBird();
		cat();
		swalCat();
		dog();
		swalCat();
		horse();
	}

	public static void fly() {
		System.out.println("There was an old lady who swallowed a fly.");
		idky();
	}
	
	public static void idky() {
		System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.");
		System.out.println("");
		}
		
	public static void spider()  {
		System.out.println("There was an old lady who swallowed a spider,\nThat wriggled and iggled and jiggled inside her.");
	}
	
	public static void swalSpid() {
		System.out.println("She swallowed the spider to catch the fly,");
		idky();
	}
	
	public static void bird() {
		System.out.println("There was an old lady who swallowed a bird,\nHow absurd to swallow a bird.");
	}
	
	public static void swalBird() {
		System.out.println("She swallowed the bird to catch the spider,");
		swalSpid();
	}
	
	public static void dog() {
		System.out.println("There was an old lady who swallowed a dog,\nWhat a hog to swallow a dog.");
		System.out.println("She swallowed the dog to catch the cat,");
	}
	
	public static void horse() {
		System.out.println("There was an old lady who swallowd a horse,\nShe died of course.");
	}
	
	public static void cat() {
		System.out.println("There was an old lady who swallowed a cat,\nImagine that to swallow a cat");
	}
	
	public static void swalCat() {
		System.out.println("She swallowed the cat to catch the bird,");
		swalBird();
	}
}
