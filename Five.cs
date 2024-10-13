using System;

namespace AeroflotApp
{
    
    struct AEROFLOT
    {
        public string NAZN;  
        public int NUMR;     
        public string TIP;  
    }

    class Program
    {
        static void Main()
        {
          
            AEROFLOT[] AIRPORT = new AEROFLOT[7];

            
            for (int i = 0; i < AIRPORT.Length; i++)
            {
                Console.WriteLine($"Enter details for flight {i + 1}:");
                Console.Write("Destination: ");
                AIRPORT[i].NAZN = Console.ReadLine();
                Console.Write("Flight number: ");
                AIRPORT[i].NUMR = int.Parse(Console.ReadLine());
                Console.Write("Plane type: ");
                AIRPORT[i].TIP = Console.ReadLine();
            }

         
            Array.Sort(AIRPORT, (a1, a2) => a1.NUMR.CompareTo(a2.NUMR));

            
            Console.Write("Enter the destination to search for: ");
            string searchDestination = Console.ReadLine();

            
            bool found = false;
            Console.WriteLine($"Flights to {searchDestination}:");
            foreach (var flight in AIRPORT)
            {
                if (flight.NAZN.Equals(searchDestination, StringComparison.OrdinalIgnoreCase))
                {
                    Console.WriteLine($"Flight number: {flight.NUMR}, Plane type: {flight.TIP}");
                    found = true;
                }
            }

            
            if (!found)
            {
                Console.WriteLine("No flights found for the specified destination.");
            }
        }
    }
}
