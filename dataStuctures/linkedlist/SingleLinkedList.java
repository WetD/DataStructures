package tryMyself.dataStuctures.linkedlist;

public class SingleLinkedList {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1,"aa","aaa");
        HeroNode hero2 = new HeroNode(2,"bb","bbb");
        HeroNode hero3 = new HeroNode(3,"cc","ccc");
        HeroNode hero4 = new HeroNode(4,"dd","ddd");

        LinkedList linkedList = new LinkedList();
        linkedList.add(hero1);
        linkedList.add(hero2);
        linkedList.add(hero3);
        linkedList.add(hero4);

        linkedList.list();

    }
}

class HeroNode{
    public int no;
    public String name;
    public String nickname;
    public HeroNode next;

    public HeroNode(int hNo, String hName, String hNickname){
        this.no = hNo;
        this.name = hName;
        this.nickname = hNickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}

class LinkedList{
    private HeroNode head = new HeroNode(0,"","");

    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while (true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    public void list(){
        if(head.next == null){
            System.out.println("it is empty");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }
}