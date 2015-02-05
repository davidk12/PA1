import java.io.IOException;

public class Main {
	
	/**
	 * starts the game player and waits for messages from the game master <br>
	 * Command line options: [port]
	 */
	public static void main(String[] args){
		try{
			// TODO: put in your agent here
			Agent agent = new PA1Agent();

			int port=4001;
            String algorithm;
			if(args.length>=2){
				port = Integer.parseInt(args[0]);
                algorithm = args[1].toUpperCase();
                if (!algorithm.equals("DFS") || !algorithm.equals("BFS") || !algorithm.equals("UNI")){
                    System.out.println("Algorithm not supported");
                    System.out.println("Supported Algorithms: DFS, BFS, UNI");
                    System.exit(0);
                }
                System.out.println("Using: " + algorithm + " algorithm");
                // TODO: Use the algorithm
			}
            GamePlayer gp=new GamePlayer(port, agent);
			gp.waitForExit();
		}catch(Exception ex){
			ex.printStackTrace();
			System.exit(-1);
		}
	}
}
