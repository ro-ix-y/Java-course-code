import java.util.*;
import java.io.*;
public class map {
	public void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String,Integer>learnMap=new HashMap<String,Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            in.nextLine();
            learnMap.put(name,phone);
            
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(learnMap.get(s)==null){
                System.out.println("Not found");
            }
            else{
                System.out.println(s +"="+learnMap.get(s));
            }
        }
        in.close();
    }

	

}
