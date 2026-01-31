import java.util.HashMap;

import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map M = new HashMap();
        M.put(2, "nikhil");
        M.put(23, "sagar");
        M.put(234, "srisu");
        for (Object key : M.keySet()) {
            System.out.println(key + ">>>>" + M.get(key));
        }
///  deleting
        M.remove(2);
        System.out.println("deketing ");
        for (Object key : M.keySet()) {

            System.out.println(key + ">>>" + M.get(key));

        }
/// // finding deleted item verification
        System.out.println(M.containsKey(2));

        /// / updating value
        M.put(2, "surya");
        for (Object key : M.keySet()) {

            System.out.println(key + ">>>" + M.get(key));
        }
        /// insert if the value is not present
        M.putIfAbsent(2, "lihkin");
        for (Object key : M.keySet()) {
            System.out.println(key + ">>>" + M.get(key));

        }
        System.out.println(M.size());
        //M.clear();
        System.out.println(M.entrySet());

    }
    }
