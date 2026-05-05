package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PostgresTest {

	public static void main(String[] args) throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try {
			//-----------------
			// 接続
			//-----------------
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/homework", // "jdbc:postgresql://[場所(Domain)]:[ポート番号]/[DB名]"
					"postgres", // ログインロール
					"J20239rs"); // パスワード
			statement = connection.createStatement();
			
			
			//テーブル作成
//			statement.executeUpdate(
//				    "CREATE TABLE users ("
//				    + "    id SERIAL PRIMARY KEY,"
//				    + "    name VARCHAR(50),"
//				    + "    email VARCHAR(100),"
//				    + "    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP"
//				    + ");"
//				);
			//インサート文
//			statement.executeUpdate(
//		    "insert into users(name,email) values(\'suzuki\',\'tekitou\');");


			//-----------------
			// SQLの発行
			//-----------------
			//ユーザー情報のテーブル
//			resultSet = statement.executeQuery("SELECT * FROM users");
//
//			//-----------------
//			// 値の取得
//			//-----------------
//			// フィールド一覧を取得
//			List<String> fields = new ArrayList<String>();
//			ResultSetMetaData rsmd = resultSet.getMetaData();
//			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
//				fields.add(rsmd.getColumnName(i));
//			}
//
//			//結果の出力
//			int rowCount = 0;
//			while (resultSet.next()) {
//				rowCount++;
//
//				System.out.println("---------------------------------------------------");
//				System.out.println("--- Rows:" + rowCount);
//				System.out.println("---------------------------------------------------");
//
//				//値は、「resultSet.getString(<フィールド名>)」で取得する。
//				for (String field : fields) {
//					System.out.println(field + ":" + resultSet.getString(field));
//				}
//			}

		} finally {
			//接続を切断する
			if (resultSet != null) {
				resultSet.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (connection != null) {
				connection.close();
			}
		}
	}

}
