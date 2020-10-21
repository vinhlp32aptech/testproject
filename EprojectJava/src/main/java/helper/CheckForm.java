package helper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckForm {
	 public static boolean checkFullname(String Value) {
	        Pattern pattern = Pattern.compile("^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ" +
	                "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" +
	                "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]{3,16}+$");
	        Matcher matcher = pattern.matcher(Value);
	        if (!matcher.find()) {
	            return false;
	        } else {
	            return true;
	        }
	    }

    public static boolean checkUsername(String Value) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{6,20}$");
        Matcher matcher = pattern.matcher(Value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }



    public static boolean checkPassword(String value) {
        Pattern pattern = Pattern.compile("^(?=.*[A-Za-z0-9])(?=.*\\d)[A-Za-z\\d]{6,20}$");
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }



    public static boolean checkEmail(String value) {
        Pattern pattern = Pattern.compile("[a-zA-Z][_]*\\d*@[a-z]{2,5}[.][a-z]{2,3}");
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }
//    public static boolean checkAddr(String Value) {
//        Pattern pattern = Pattern.compile("^[a-z0-9A-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ" +
//                "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" +
//                "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]{3,16}+$");
//        Matcher matcher = pattern.matcher(Value);
//        if (!matcher.find()) {
//            return false;
//        } else {
//            return true;
//        }
//    }
    public static boolean checkPhoneNumber(String value) {
        Pattern pattern = Pattern.compile("[0]{1}[1,9]{1}[0-9]{8,9}");
        Matcher matcher = pattern.matcher(value);
        if (!matcher.find()) {
            return false;
        } else {
            return true;
        }
    }
}