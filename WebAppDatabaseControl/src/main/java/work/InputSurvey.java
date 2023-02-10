package work;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**----------------------------------------------------------------------*
 *■■■InputSurveyクラス■■■
 *概要：サーブレット
 *詳細：HTML文書（回答入力画面）を出力する。
 *----------------------------------------------------------------------**/
public class InputSurvey extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public InputSurvey() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//レスポンス（出力データ）の文字コードを設定
		response.setContentType("text/html;charset=UTF-8");  //文字コードをUTF-8で設定

		//出力用のストリームの取得
		PrintWriter out = response.getWriter();

		//HTML文書（回答入力画面）の出力
		out.println("<html>                                                                                  ");
		out.println("<head>                                                                                  ");
		out.println("  <title>回答入力</title>                                                               ");
		out.println("</head>                                                                                 ");
		out.println("<body>                                                                                  ");
		out.println("  <h2>わんちゃん暮らし改善アンケートフォーム</h2>                                       ");
		out.println("  <form action=\"SaveSurvey\" method=\"post\">                                          ");
		out.println("    <p>名前：                                                                           ");
		out.println("      <input type=\"text\" name=\"NAME\" maxlength = \"20\">                            ");
		out.println("    </p>                                                                                ");
		out.println("    <p>年齢：                                                                           ");
		out.println("      <input type=\"number\" name=\"AGE\" maxlength = \"3\">                            ");
		out.println("    </p>                                                                                ");
		out.println("    <p>性別：                                                                           ");
		out.println("      <input type=\"radio\" name=\"SEX\" value=\"1\" checked>オス                       ");
		out.println("      <input type=\"radio\" name=\"SEX\" value=\"2\">メス                               ");
		out.println("    </p>                                                                                ");
		out.println("    <p> 満足度：                                                                        ");
		out.println("      <select name=\"SATISFACTION_LEVEL\">                                              ");
		out.println("        <option value=\"5\">とても満足</option>                                         ");
		out.println("        <option value=\"4\">満足      </option>                                         ");
		out.println("        <option value=\"3\">普通      </option>                                         ");
		out.println("        <option value=\"2\">不満      </option>                                         ");
		out.println("        <option value=\"1\">とても不満</option>                                         ");
		out.println("      </select>                                                                         ");
		out.println("    </p>                                                                                ");
		out.println("    <p>飼い主へのご意見・ご感想をご記入ください：<br>                                   ");
		out.println("      <textarea name=\"MESSAGE\" rows=\"4\" cols=\"50\" maxlength = \"250\"></textarea> ");
		out.println("    </p>                                                                                ");
		out.println("    <input type=\"submit\" value=\"回答する(SaveSurveyを起動)\">                        ");
		out.println("  </form>                                                                               ");
		out.println("</body>                                                                                 ");
		out.println("</html>                                                                                 ");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
