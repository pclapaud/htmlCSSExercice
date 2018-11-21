package fr.laerce.cinema;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Liste extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {





    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        Integer debut = 0;
        Integer fin = 0;
        String langue = request.getParameter("langue");
        String titre = request.getParameter("titre");
        if(langue !=""){
            if(langue.equals("arabe")){
                debut=1536;
                fin=1791;
            }
            if(langue.equals("tibetain")){
                debut=3840;
                fin=4058;
            }
            if(langue.equals("katakana")){
                debut=12448;
                fin=12543;
            }
            if(langue.equals("hiragana")){
                debut=12352;
                fin=12447;
            }
        }
        else{
            debut = Integer.parseInt(request.getParameter("debut"));
            fin = Integer.parseInt(request.getParameter("fin"));
        }


        ArrayList<String> mesnombres = new ArrayList<>();
        ArrayList<String> mesnombresControl = new ArrayList<>();
        for (int i = debut;i<fin+1;i++){

            if (type.equals("hexadecimal")) {
                String hex = Integer.toHexString(i);

                if (i<33){
                    mesnombresControl.add(hex);
                }
                else{
                    mesnombres.add(hex);
                }

            }
            else {

                if (i<33){
                    mesnombresControl.add(""+i);
                }
                else {
                    mesnombres.add(""+i);
                }
            }
        }
        request.setAttribute ("mesnombresControl", mesnombresControl);
        request.setAttribute ("mesnombres", mesnombres);
        request.setAttribute ("titre", titre);

        String jspview = "liste.jsp";
        getServletConfig().getServletContext()
                .getRequestDispatcher("/WEB-INF/jsp/"+jspview).forward(request, response);

    }
}
