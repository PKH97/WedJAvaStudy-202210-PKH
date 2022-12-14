package j25_문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String4 {
    public static void main(String[] args) {
        String roleString = "ROLE_USER,ROLE_MANAGER,ROLE_ADMIN,TESTER";
        String[] roleArray = roleString.split(",");

        List<String> roleList = Arrays.asList(roleArray);
        System.out.println(roleList);

        List<String> validRoleList = new ArrayList<String>();
        roleList.forEach(role -> {
            if(role.startsWith("ROLE")){
                validRoleList.add(role);
            }
        });
        System.out.println(validRoleList);

        List<String> validRoleList2 = new ArrayList<String>();
        roleList.forEach(role -> {
            if (role.endsWith("MANAGER") || role.endsWith("ADMIN")) {
                validRoleList2.add(role);
            }
        });
        System.out.println(validRoleList2);

//        List<String> roleList = new ArrayList<String>();
//
//        for(String role : roleArray){
//            roleList.add(role);
//        }


    }
}
