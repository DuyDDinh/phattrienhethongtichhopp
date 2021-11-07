// import java.rmi.Naming;

// public class serverrmis {
//     public serverrmis()
// 	{
// 		try {
// 			//Tạo một object tham chiếu tới Interface
// 			Hello c = new HelloImpl();

// 			//Gắn địa chỉ localhost với Service này
//            // Naming.rebind("rmi://localhost:5000/hello", new HelloImpl());
// 			Naming.rebind("rmi://localhost:5001/1hello", c);
//             System.out.println("server da san sang");
// 		}
// 		catch (Exception e) {
// 			//Nếu có lỗi xảy ra
// 			System.err.println("Lỗi khởi tạo Server, chi tiết lỗi: " + e);
// 		}
// 	}
//     public static void main(String[] args)
// 	{
// 		//Tạo một Object
// 		new serverrmis();
// 	}
    
// }
