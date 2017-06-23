import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import org.apache.hadoop.fs.FileSystem;


//class that contain main method
public class HAsignThreeOneTwo {
	//function created that will recursivly call itself if their exist a subdir. into the dir
	//then it will call itself otherwise it will print the filees contained itself
	//dir path is supplied with the parameter when called
	public static void traversingDir(String url) throws IOException{
		//get instance of HDFS which takes path and configuration object
		FileSystem hdfs = FileSystem.get(URI.create(url),new Configuration());
		//Get meta data of he desired Dir
		FileStatus[] fileStatus = hdfs.listStatus(new Path(url));
	
		//loop till all the elements in array are traversed
		for(int i = 0;i<fileStatus.length;i++){
			if(fileStatus[i].isDirectory()){
				//recursively call the method if dir exists
				traversingDir(fileStatus[i].getPath().toString());
			}
			
			else {
				//print thee file name if file exist
				System.out.println("File :"+fileStatus[i].getPath().toString());
			}
		}
		
	}
	
	//main method 
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//calling traveringDir method first time so passed the path which is to be recursilly traversed
			traversingDir("hdfs://localhost:9000/");
	}

}

