import java.io.*;

public class CopyByteFile{
	public static void main(String[] args){
		// 1. 変数・データ準備
		FileInputStream		in	= null;
		FileInputStream		in2 = null;
		FileOutputStream	out	= null;
		// 2. ストリーム処理
		//	  1byteずつ、読んで、書く
		try {
			// ストリームをつくる。
			in2	= new FileInputStream("image1.jpg");
			in  = new FileInputStream("3.jpg");
			out	= new FileOutputStream("result.jpg");

			// データを読み書きする。
				int co=0;
				int d=0;
				// while((d = in.read()) != -1){
				for (int i=0; i<184818; i++){
					d = in.read();
					out.write(d);
					System.out.println(d);
					co++;
				}
				if( co >184817 ){
					while((d = in2.read()) != -1){
						d = in2.read();
						out.write(d);
						System.out.println(d);
						co++;
					}
				}
				//}
				System.out.println(co+"回繰り返しましたよ。");
				System.out.println("コピー終わりなのです。");

		} catch(IOException e) {
			System.out.println("IOエラーなのです。");
		} finally {
			// ストリームを閉じる。
			try {
				in.close();
				out.close();
			} catch (IOException e){
				System.out.println("IOエラーなのですよ。閉。");
			}
		}
	}
}