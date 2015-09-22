package com.org.momo.servlet;  
  
import java.awt.Color;  
import java.awt.Font;  
import java.awt.Graphics;  
import java.awt.image.BufferedImage;  
import java.io.IOException;  
import java.util.Random;  
  
import javax.imageio.ImageIO;  
import javax.servlet.ServletException;  
import javax.servlet.ServletOutputStream;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  
  
public class LoginCodeServlet extends HttpServlet {  
  
    public LoginCodeServlet() {  
        super();  
    }  
  
    public void destroy() {  
        super.destroy();  
    }  
  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {    
         //设置输出类型和浏览器不保存缓存  
         response.setContentType("image/jpeg") ;  
         response.setHeader("Cache-Control", "no-cache") ;  
           
         //创建图片对象  
         int width = 60,height = 20 ;  
         BufferedImage image = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB) ;  
           
         Graphics g = image.getGraphics() ;  
           
         //生成随机数  
         Random random = new Random() ;  
         String s = "" ;  
         for(int i=0;i<4;i++){  
             s += random.nextInt(10) ;  
         }  
           
         //把随机数存到Session里面，便于等下比较  
         HttpSession session = request.getSession() ;  
         session.setAttribute("code",s) ;  
           
         //随机生成颜色  Color color =  new Color(255,255,255) ;     random.nextInt(256)的值范围是0~255  
         Color color = new Color(random.nextInt(256),random.nextInt(256),random.nextInt(256)) ;  
           
         //把随机数写到图片上  
         String a = null ;  
         Font font = new Font(a,Font.ITALIC,18) ;  
         g.setColor(color) ;  
         g.setFont(font);  
         g.drawString(s,10,height-5) ;  
         g.dispose() ;    //关闭画笔  
           
         //把图片送到客户端  
         ServletOutputStream output = response.getOutputStream() ;  
         ImageIO.write(image,"JPEG",output) ;  
         output.flush();   //关闭输出流  
    }  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
         this.doGet(request,response) ;  
    }  
      
    public void init() throws ServletException {  
    }  
}  
