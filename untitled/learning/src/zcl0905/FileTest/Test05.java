package zcl0905.FileTest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test05 {
    public static void main(String[] args) {
        /*
        需求说明：
            统计一个文件夹中每种文件类型的个数并打印出来，需考虑子文件夹。

        打印格式示例：
            txt:3个
            doc:4个
            jpg:6个*/
        File file = new File("D:\\javaFileTest");
        HashMap<String, Integer> hm = getCount(file);
        System.out.println(hm);


    }

    public static HashMap<String, Integer> getCount(File src) {
        HashMap<String,  Integer> map = new HashMap<>();
        File[] files = src.listFiles();
        if(files == null) {
            return map;
        }
        for (File file : files) {
            if(file.isFile()) {
                String name = file.getName();
                String[] arr = name.split("\\.");
                if(arr.length >= 2){
                    String endName = arr[arr.length - 1];

                    if (map.containsKey(endName)) {
                        int count = map.get(endName);
                        count++;
                        map.put(endName, count);
                    }else{
                        map.put(endName, 1);
                    }
                }else {
                    HashMap<String, Integer> hm1 = getCount(file);
                    Set<String> keys = hm1.keySet();
                    for (String key : keys) {
                        int count1 = hm1.get(key);
                        if(map.containsKey(key)) {
                            int count2 = map.get(key);
                            count2 += count1;
                            map.put(key, count2);
                        }else {
                            map.put(key, count1);
                        }
                    }
                }
            }else {
                HashMap<String, Integer> hm2 = getCount(file);
                Set<Map.Entry<String, Integer>> entries = hm2.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    String key = entry.getKey();
                    int value = entry.getValue();
                    if(map.containsKey(key)) {
                        value += map.get(key);
                        map.put(key, value);
                    }else{
                        map.put(key, value);
                    }
                }
            }
            }
        return map;
        }
}
