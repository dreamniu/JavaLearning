class Root
{
   static
   {
     System.out.println("Root�ľ�̬��ʼ����");
   }
   {
     System.out.println("Root����ͨ��ʼ����");
   }
   public Root()
   {
     System.out.println("Root���޲���������");
   }
}
class Mid extends Root
{
   static
   {
     System.out.println("Mid �ľ�̬��ʼ����");
   }
   {
     System.out.println("Mid ����ͨ��ʼ����");
   }
   public Mid()
   {
     System.out.println("Mid ���޲����Ĺ�����");
   }
   public Mid(String msg)
   {
     //ͨ��this����ͬһ�������صĹ�����
     this();
     System.out.println("Mid �Ĵ������Ĺ������������ֵ��"+msg);
   }
}

class Leaf extends Mid
{
   static
   {
     System.out.println("Leaf �ľ�̬��ʼ����");
   }
   {
     System.out.println("Leaf ����ͨ��ʼ����");
   }
   public Leaf()
   {
     //ͨ��super���ø�������һ���ַ��������Ĺ�����
     super("Ȩ��ָ��");
     System.out.println("ִ��Leaf�Ĺ�����");
   }
}
public class TestConstructor
{
   public static void main(String[] args)
   {
    new Leaf();
    new Leaf();
   }
}