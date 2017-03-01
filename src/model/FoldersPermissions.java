package model;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

public class FoldersPermissions {
	
	AclEntryPermission aclPerm;	
    AclFileAttributeView aclView;
    String path;
    int decision;
    

    public void view_permissions(String path) throws IOException {

        this.aclView = Files.getFileAttributeView(Paths.get(path), AclFileAttributeView.class);        
        List<AclEntry> acl = aclView.getAcl();
        
        

        for (AclEntry x : acl) {
        	
            String temp = x.toString();
            
            if (temp.contains("READ_DATA/WRITE_DATA/APPEND_DATA/READ_NAMED_ATTRS/WRITE_NAMED_ATTRS/EXECUTE/DELETE_CHILD/READ_ATTRIBUTES/WRITE_ATTRIBUTES/DELETE/READ_ACL/WRITE_ACL/WRITE_OWNER/SYNCHRONIZE:FILE_INHERIT/DIRECTORY_INHERIT:ALLOW")) {
           
            	System.out.println(temp.replaceAll("READ_DATA/WRITE_DATA/APPEND_DATA/READ_NAMED_ATTRS/WRITE_NAMED_ATTRS/EXECUTE/DELETE_CHILD/READ_ATTRIBUTES/WRITE_ATTRIBUTES/DELETE/READ_ACL/WRITE_ACL/WRITE_OWNER/SYNCHRONIZE:FILE_INHERIT/DIRECTORY_INHERIT:ALLOW", ""));
           
            } else if (temp.contains("READ_DATA/WRITE_DATA/APPEND_DATA/READ_NAMED_ATTRS/WRITE_NAMED_ATTRS/EXECUTE/READ_ATTRIBUTES/WRITE_ATTRIBUTES/DELETE/READ_ACL/SYNCHRONIZE:FILE_INHERIT/DIRECTORY_INHERIT:ALLOW")) {
                
            	System.out.println(temp.replaceAll("READ_DATA/WRITE_DATA/APPEND_DATA/READ_NAMED_ATTRS/WRITE_NAMED_ATTRS/EXECUTE/READ_ATTRIBUTES/WRITE_ATTRIBUTES/DELETE/READ_ACL/SYNCHRONIZE:FILE_INHERIT/DIRECTORY_INHERIT:ALLOW", ""));
            
            } else if (temp.contains("READ_DATA/READ_NAMED_ATTRS/EXECUTE/READ_ATTRIBUTES/READ_ACL/SYNCHRONIZE:FILE_INHERIT/DIRECTORY_INHERIT:ALLOW")) {
            
            	System.out.println(temp.replaceAll("READ_DATA/READ_NAMED_ATTRS/EXECUTE/READ_ATTRIBUTES/READ_ACL/SYNCHRONIZE:FILE_INHERIT/DIRECTORY_INHERIT:ALLOW", ""));
            
            } else {
           
            	System.out.println(temp);
            }
        }
    }
	
}
