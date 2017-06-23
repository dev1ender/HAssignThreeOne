import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
public class HAsignThreeOneOne{

	public static void main(String[] args)
		throws IOException, URISyntaxException  {
	
		// TODO Auto-generated method stub
		String uri = "/";
		 //1. Get the Configuration instance
	    Configuration configuration = new Configuration();
	    //2. Get the instance of the HDFS
	    FileSystem hdfs = FileSystem.get(URI.create(uri), configuration);
	    //3. Get the metadata of the desired directory
	    FileStatus[] fileStatus = hdfs.listStatus(new Path(uri));
	    //5. Iterate through the directory and display the files in it
	    for(FileStatus file : fileStatus)
	    {
	      System.out.println(file.getPath().getName());
	    }
	}
  
	}

