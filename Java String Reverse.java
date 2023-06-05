public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String A=sc.next();
/* Enter your code here. Print output to STDOUT. */
StringBuilder sb = new StringBuilder(A);
sb.reverse();
String s2 = sb.toString();
if (A.compareTo(s2) == 0){
System.out.println("Yes");
}
else {
System.out.println("No");
}
}
}
