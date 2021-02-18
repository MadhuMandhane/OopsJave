
public class Time {

		// TODO Auto-generated method stub
			int hour;
			int minute;
			int second;
			
			Time(int hour, int minute; int second)
			{
				this.hour=hour;
				this.minute=minute;
				this.second=second;
			}
			void add(Time obj2)//method
			{
				this.second += obj2.second;//addition of obj1 real to obj2 real
				this.minute += obj2.minute;//this refers to obj1
				this.hour += obj2.hour;
				// here += is a compound assignment operator
				
				while(this.second>=60)
				{
					this.second=this.second-60;
					this.minute++;
				}
				while(this.minute>=60) {
					this.minute=this.minute-60;
					this.hour++;
				}
			}
			void display()//method
			{
				System.out.println("total time="this.hour+":"+this.minute+":"+this.second);
			
			}

			public static void main(String[] args) {
				Time obj1= new Time(10, 45, 60);
				Time obj2= new Time(3, 55, 60);
				obj1.add(obj2);//calling add method // object passed as arguement here
				obj1.addition();
				obj1.display();

			}

		}

	


