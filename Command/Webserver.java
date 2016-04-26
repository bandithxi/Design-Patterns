//Analogous to client in UML
public class Webserver implements Client {
	public static void main(String[] args) {

		//Devices
		GPU nvidia = new GPU("Geforce 980");
		CPU pentium = new CPU("x86-64");
		Network modem = new Network("Lucent");
		
		//Assign devices to commands
		RayTrace notPhong = new RayTrace(nvidia);
        BlackScreen blankScreen = new BlackScreen(nvidia);
        
        //CPU Jobs
        FinancialComputation beowulf = new FinancialComputation(pentium);
        DistributedComputation HR = new DistributedComputation(pentium);
        
        //Network Jobs
        NetworkFetch search = new NetworkFetch(modem);
        DownloadRequest download = new DownloadRequest(modem);
        
        //Create fake threads and allocate objects
        simThread[] simThreads = new simThread[5];
        
        for (int i = 0; i < 5; i++) {
        	simThreads[i] = new simThread();
        }
        
        
        //Assign jobs to queue
        JobQueue queue = new JobQueue(simThreads);
        queue.addJob(notPhong);
        queue.addJob(blankScreen);
        queue.addJob(notPhong);
        queue.addJob(blankScreen);
        queue.addJob(beowulf);
        queue.addJob(HR);
        queue.addJob(search);
        queue.addJob(download);
        
        queue.run();
        
	}
}
