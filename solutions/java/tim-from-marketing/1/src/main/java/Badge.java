class Badge {
    public String print(Integer id, String name, String department) {
        // params are related to a reference variable Integer so can be null.
        // Redundant new String(...)
        // String literals and concatenation already produce String objects in Java. 
        // Wrapping them in new String(...) is unnecessary and wasteful — it explicitly bypasses the string pool.
             
        // print "Charlotte Hale - OWNER"
        if( id == null && department == null ) {
                return name + " - " + "OWNER";
        }

        // print "[254] - Charlotte Hale - OWNER"
        if(id != null && department == null) {
            return "[" + id + "]" + " - " + name + " - " + "OWNER";
        }

        // print "Jane Johnson - PROCUREMENT"
        if(id == null && department != null) {
            return name + " - " + department.toUpperCase();
        }

        // print as normal
        return "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
       
    }
}
