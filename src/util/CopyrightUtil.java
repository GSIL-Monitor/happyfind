package util;

import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CopyrightUtil {

	public static String checktitle(ArrayList<ArrayList<String>> list,String titles)
	{
		String returnstr = "";
		
		//String []cels=new String[3];//"姓名,性别,年纪";
		String celstr=titles; //"姓名|string|_|30,性别|string|_|4,年纪|int|_|_";
		String []cels=new String[celstr.split(",").length];
		
		
		int c=0; //列数
		for(String titelgroup:celstr.split(",")){
			cels[c] =titelgroup.split("\\|")[0];
			c++;
		}
		
		String []celNum={"一","二","三","四","五","六","七","八","九","十","十一","十二","十三","十四","十五","十六","十七","十八","十九","二十"};

		int celsize=cels.length;
		
        if(list.size() < 1){
        	returnstr = "excel文件中没有数据！";
        	return returnstr;
        }
        if(list.get(0).size() != celsize ){
        	returnstr = "excel文件中的列数不正确！";
        	return returnstr;
        }
		int i=0;
        for(String cel:cels)
        {
        	i++;
        	String celtitle=list.get(0).get(i-1);
        	if(!celtitle.equals(cel)){
        		returnstr+="excel文件中的第"+celNum[i]+"列应该为“用户名”！\n";
             }
        }
        
        return returnstr;
	}
	
	public static String checkcontent(ArrayList<ArrayList<String>> list,String titles)
	{
		String celstr=titles;//"姓名|string|_|30,性别|string|_|4,年纪|int|_|_";
		String []cels = celstr.split(",");
		String []cel;
		String returnstr = "";
		String content="";
        for(int i=1; i < list.size(); ++i){
            //第index行
        	int index = i+1;
        	int lie=0;
            for(String c:cels){
        	//第n列
            lie++; 
            cel=c.split("\\|"); 
            content=list.get(i).get(lie-1);
            if(!checkcel(content,cel[1],cel[2],cel[3]).equals("")){
            	returnstr+="第 "+index+" 行,第 "+lie+"\""+cel[0]+"\"" ;
            }
            }
        }
		return returnstr;
	}
	
	
	public static String checkcel(String content,String datetype,String dateformate,String lengthstr)
	{
		String returnstr="";
		if(content.equals(""))
		{
			returnstr="空";
			return returnstr;
		}
		if(lengthstr==null||lengthstr.equals("_")){lengthstr="32";}
		
		int length=Integer.parseInt(lengthstr);
		
		if(datetype.equals("string") && content.length() > length){
			returnstr="长度大于"+length;
		}
		if(datetype.equals("int")||datetype.equals("number"))
		{
			String pattern = "[0-9]+(.[0-9]+)?";  
	        //对()的用法总结：将()中的表达式作为一个整体进行处理，必须满足他的整体结构才可以。  
	        //(.[0-9]+)? ：表示()中的整体出现一次或一次也不出现  
	        Pattern p = Pattern.compile(pattern);  
	        Matcher m = p.matcher(content);  
	        boolean b = m.matches();  
	        if(!b){  
	        	returnstr = "不是整数或小数";
	        }
		}
		if(datetype.equals("date")){
			
			if(!DateUtil.CheckDateformate(content,dateformate))
			{
				returnstr = "日期不是"+dateformate+"格式";
			}
		}
		
		return returnstr;
	}
	
	
	/*
	public void importUserToDB(ArrayList<ArrayList<String>> list)
            throws DaoException, Exception {
        
        for(int i=1; i < list.size(); ++i){
            int index = i+1;
                        
            UserBean user = new UserBean();
            //第一列：用户名处理
            String firstColumn = list.get(i).get(0);
            if(firstColumn.equals("")){
                setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第1列“用户名”为空，该行导入失败。<br> ");
                continue;
            }else{
                if(firstColumn.length() > 20){            //长度过大
                    setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第1列“用户名”长度大于20，该行导入失败。<br> ");
                    continue;
                }
                    user.setUserName(firstColumn);
            }
            //第二列：性别处理
            String secondColumn = list.get(i).get(1);
            if(firstColumn.equals("")){
                setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第2列“性别”为空，该行导入失败。<br> ");
                continue;
            }else{
                if((!secondColumn.equals("男"))&&(!secondColumn.equals("女"))){            //长度过大
                    setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第2列“性别”填写错误，该行导入失败。<br> ");
                    continue;
                }
            boolean gender1 = false;            
            if(secondColumn.equals("男")){
                gender1=true;
            }
            user.setGender(gender1);
                
            }
            
            //第三列：邮箱处理
            String thirdColumn = list.get(i).get(2);
            if(thirdColumn.equals("")){
                setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第3列“邮箱”为空，该行导入失败。<br> ");
                continue;
            }else{
                Pattern p = Pattern.compile("(^([\\w-.]+)@csljc.com$)");
                Matcher m = p.matcher(thirdColumn);
                if(thirdColumn.length()>50){
                    setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第3列“邮箱”超过50个字符，该行导入失败。<br> ");
                    continue;
                }else{
                if (!m.find()){
                    setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第3列“邮箱”不符合公司标准，该行导入失败。<br> ");
                    continue;
                }else{
                    if(userDao.existUser(thirdColumn)){
                        setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第3列该“邮箱”对应用户已存在，该行导入失败。<br> ");
                        continue;
                    }
                    user.setEmail(thirdColumn);
                }
                }
            }
                
            
            
            //第四列：电话校验
            String forthColumn = list.get(i).get(3);
            if(forthColumn.length()>11){
                setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第4列“电话”长度超过11位，该行导入失败。<br> ");
                continue;
            }else{
            user.setTEL(forthColumn);
            }
            //第五列：部门校验
            String fifthColumn = list.get(i).get(4);
            if(fifthColumn.equals("")){
                setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第5列“部门”为空，该行导入失败。<br> ");
                continue;
            }else {
                DepartmentBean dp = departmentDao.findByName(fifthColumn);
                if(dp == null){            //该类型在数据库中是否存在
                    setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第5列中的“部门”不正确，该行导入失败。<br> ");
                    continue;
                }
                user.setDepartmentID(dp);
            }
            //第六列：职位校验
            String sixthColumn = list.get(i).get(5);
            if(sixthColumn.equals("")){
                setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第6列“职位”为空，该行导入失败。<br> ");
                continue;
            }else {
                PositionBean pt = positionDao.findByName(sixthColumn);
                if(pt == null){            //该类型在数据库中是否存在
                    setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第6列中的“职位”不正确，该行导入失败。<br> ");
                    continue;
                }
                user.setPositionID(pt);
            }
            //第七列：角色校验
            String seventhColumn = list.get(i).get(6);
            if(seventhColumn.equals("")){
                setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第7列“角色”为空，该行导入失败。<br> ");
                continue;
            }else {
                RoleBean role = roleDao.findByName(seventhColumn);
                if(role == null){            //该类型在数据库中是否存在
                    setImportErrorMess(getImportErrorMess()+"第"+ index + "行，第7列中的“角色”不正确，该行导入失败。<br> ");
                    continue;
                }
                user.setRole(role);
            }
                                        
                user.setPassword(list.get(i).get(2));
                user.setCreaterID(modifyedBy);
                user.setCreateTime(new Date());
                user.setEmployed(true);
                
                this.userDao.addUser(user);
        }
        if(!getImportErrorMess().equals("")){//校验数据出错
            throw new Exception(getImportErrorMess());//抛出异常
        }
        
    }
	*/
	 
}
