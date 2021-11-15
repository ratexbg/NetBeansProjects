import java.io.*;
import java.net.*;

public class Server
{
	public Server(int portnum)
	{
		try
		{
			server = new ServerSocket(portnum);
		}
		catch (Exception err)
		{
			System.out.println(err);
		}
	}

	public void serve()
	{
		try
		{
			while (true)
			{
				Socket client = server.accept();
				BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
				PrintWriter w = new PrintWriter(client.getOutputStream(), true);
				w.println("Welcome to the Java EchoServer.  Type 'bye' to close.");
				String line;
				do
				{
					line = r.readLine();
					if ( !line.trim().equals("hi") )
						w.println("Got: HEllo");
				}
				while ( !line.trim().equals("bye") );
				client.close();
			}
		}
		catch (Exception err)
		{
			System.err.println(err);
		}
	}

	public static void main(String[] args)
	{
		Server s = new Server(9999);
		s.serve();
	}

	private ServerSocket server;
}
