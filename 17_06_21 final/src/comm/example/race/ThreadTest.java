package comm.example.race;

public class ThreadTest {
	TwoString twoString=new TwoString();
	new PrintStringThread("Hello", "There",twoString);
	new PrintStringThread("How Are", "You?",twoString);
	new PrintStringThread("Thank You", "Very Much",twoString);
	}


}
