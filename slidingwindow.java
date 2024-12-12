package slidingwindow; 
import java.util.Scanner; 
public class slidingwindow { 
   
    public static void main(String[] args) { 
     Scanner sc = new Scanner(System.in); 
        System.out.print("Enter window size: "); 
        int windowSize = sc.nextInt();

        System.out.print("\nEnter number of frames to transmit: "); 
        int numFrames = sc.nextInt(); 

        int[] frames = new int[numFrames]; 
        System.out.print("\nEnter " + numFrames + " frames: "); 
        for (int i = 0; i < numFrames; i++) 
        { 
            frames[i] = sc.nextInt(); 
        } 

        System.out.println("\nWith sliding window protocol, the frames will be sent in the following manner (assuming no corruption of frames):"); 
        System.out.println("\nAfter sending windowSize frames at each stage, the sender waits for acknowledgment from the receiver.\n"); 

        for (int i = 0; i < numFrames; i++) 
        { 
            System.out.print(frames[i] + " "); 
            if ((i + 1) % windowSize == 0 || i == numFrames - 1) 
            { 
                System.out.println();
                System.out.println("Receiver: Acknowledgment received for frames in the window."); 
                System.out.println("Sender: Acknowledgment received, sliding window...\n"); 
            } 
        }
        sc.close();    
    }  
} 
