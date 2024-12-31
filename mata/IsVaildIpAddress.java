package mata;
public class IsVaildIpAddress {
	public static void main(String[] args) {
		String input = "172.001.154.1";
		input = input.replace('.', ' ');
		String[] data = input.split(" ");
		int num =0;
		boolean isValid = false;
		if(data.length ==4)
		{
			for(int i=0;i<data.length;i++) {
				num = Integer.parseInt(data[i]);
				if( (num >=0) &&(num <= 255)) {
					isValid = true;
				}//if
				else {
					isValid = false;
					break;
				}
			}// for
		}
		if(isValid == true) {
			System.out.println("Valid IPv4 Address");
		}
		else {
			System.out.println("Not a Valid IPv4 Address");
		}
	}
}
