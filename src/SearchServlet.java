

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/search")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SearchServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	    //パラメータから検索ワードを取得
	    String search = request.getParameter("search");
	    //半角スペースを全額スペースに置換し、分割する
	    String[] words = search.replaceAll("\\s+", "　").split("　");
	    //リクエストオブジェクトに格納
	    request.setAttribute("words", words);
	    //result.jspに遷移
	    RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
	    rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
