import java.io.*;

public class Aloha{
	public static void main(String[] args){
		// 1.準備
		String name;
		String msg;

		// 2.メッセージ生成	
		name = args[0];
		msg = "-san Aloha!";
		System.out.println(name+msg);

		// 3.ファイルを開いて、書き込む。
		try{
			File f = new File("aloha.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);

			pw.println(name+msg);

		// 4.閉じる。
			pw.close();
		}catch( IOException e){
			System.out.println("error");
			e.printStackTrace();
		}
	}
}
