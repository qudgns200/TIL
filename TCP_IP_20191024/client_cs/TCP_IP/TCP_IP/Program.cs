using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.IO;
using System.Net.Sockets;

namespace TCP_IP
{
    class Program
    {
        static void Main(string[] args)
        {
            TcpClient client = null;

            try
            {
                String rMessage;
                String sMessage;

                // Instance a TCP Connection
                client = new TcpClient();
                client.Connect("localhost", 8080);

                // return networkStrem of client for send and receive data
                NetworkStream ns = client.GetStream();
                StreamReader sr = new StreamReader(ns);
                StreamWriter sw = null;

                // Receive a message from server
                rMessage = sr.ReadLine();
                Console.WriteLine(rMessage);

                while (true)
                {
                    Console.Write("메세지 입력 : ");
                    sMessage = Console.ReadLine();

                    // Send the message on a stream
                    sw = new StreamWriter(ns);
                    sw.WriteLine(sMessage);
                    sw.Flush();

                    if (sMessage == "exit") break;

                    // Receivce the message from server(echo)
                    sr = new StreamReader(ns);
                    rMessage = sr.ReadLine();
                    Console.WriteLine(rMessage);
                }
                sr.Close();
                sw.Close();
                ns.Close();
                client.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e.ToString());
            }
        }
    }
}
