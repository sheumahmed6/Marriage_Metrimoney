import java.lang.*;
import java.util.*; 
import java.io.*; 
import java.nio.file.*;
public class Account 
{
	private String name;
	private String email;
	private String nid;
	private String userName;
	private String pass ;
	private File file;
	private FileWriter fwriter; 
	private Scanner sc; 
	
	public Account()
	{
		
	}
	public Account(String name, String email,String nid,String userName,String pass)
	{
		this.name = name;
		this.email = email;
		this.nid= nid;
		this.userName = userName;
		this.pass = pass;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setEmail(String email )
	{
		this.email = email;
	}
	public void setNid(String nid)
	{
		this.nid= nid;
	}
	public void setUserName(String userName)
	{
		this.userName = userName;
	}
	public void setPassword(String pass)
	{
		this.pass = pass;
	}
	public String getName(){ return this.name; }
	public String getEmail() { return this.email; }
	public String getNid() { return this.nid; }
	public String getUserName() { return this.userName; }
	public String getPassword() { return this.pass; }
	
	public void addAccount()
	{
		try 
		{
			 file = new File("users.txt");
            file.createNewFile(); 
            FileWriter fwriter = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fwriter);

            
            bw.write(userName + "\t" +pass + "\t" + name + "\t" + email + "\t" + nid);
            bw.newLine();
            bw.flush();
            bw.close();

		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
		}
	}
	public boolean checkAccount()
	{
		boolean flag = false;
		file = new File("users.txt");
		try 
		{
			sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String line = sc.nextLine();
				String[] value = line.split("\t");
				if(value.length >= 2 && value[0].equals(userName) && value[1].equals(pass))
				{
					flag = true;
				}
			}
		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
		}
		return flag;
	}
}