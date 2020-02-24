

/**
 * @author swx
 * @since 1.8
 * <p> creat by 2020/2/14 on 11:54
 *  <p> Test
 *  1.将自定义对象作为元素存到HashSet集合中，并去除重复元素
 *    比如存储 人对象；（同姓名 年龄  为同一对象）
 *   Result
 *  1.复写equals方法，当哈希值相同时被调用，不同时不被调用。
 *    复写hashcode方法，令每个对象都有自己特定的哈希，当哈希值相同时进行equals比较去掉重复内容的对象
 *  </p>
 *
 *   注意 对于判断元素是否存在、删除 等操作，都是依赖于hashcode和equals方法的调用
 */


public class LeetCode {

            public static void main(String[] args) {
                HashSet hs=new HashSet();
                hs.add(new Person("lisi0",12));
                hs.add(new Person("lisi1",20));
                hs.add(new Person("lisi2",18));
                hs.add(new Person("lisi5",33));
                hs.add(new Person("lisi2",18));

                 hs=clearsameStudent(hs);

                Iterator it=hs.iterator();

                while (it.hasNext()){
                    Person p=(Person)it.next();
                    p.prinT();
                }
            }
    public  static  HashSet clearsameStudent(HashSet al){
        HashSet ans=new HashSet();
        Iterator it=al.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            if(!ans.contains(obj)){     //contains方法运行了上述的equals
                ans.add(obj);
            }
        }
        return ans;
    }

}
