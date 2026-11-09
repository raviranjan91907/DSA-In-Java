//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   Map<String,Integer> m=new HashMap<>();
//   m.put("a",1);
//   Map.Entry<Integer,Integer> e=new AbstractMap.SimpleEntry<>(0,1);
//   Character[] ch=new Character[3];
//   String s=null;
//
//   int ans='a';
//
//   int a=3749;

   Scanner sc=new Scanner(System.in);
   String digits=sc.nextLine();


   Map<Integer,String> keyPad=new HashMap<>();
   keyPad.put(2,"abc");
   keyPad.put(3,"def");
   keyPad.put(4,"ghi");
   keyPad.put(5,"jkl");
   keyPad.put(6,"mno");
   keyPad.put(7,"pqrs");
   keyPad.put(8,"tuv");
   keyPad.put(9,"wxyz");

   String key=keyPad.get(digits.charAt(0)-'0');
   System.out.println(key);
}
