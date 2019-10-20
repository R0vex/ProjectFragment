package sk.itsovy.ladislavracz.ProjectFragment;

public class Main {

    public static void main(String[] args) {
       /* Fragment f1=new Fragment(32, 48);
        System.out.println(f1.toString());
        f1.changeToBasicShape();
        System.out.println(f1.toString());
        f1.extendFragment(-5);
        System.out.println(f1.toString());
        System.out.println(f1.getRealValue());

        Fragment f2=new Fragment(7,28);
        f2.changeToBasicShape();
        System.out.println(f2.toString());
        System.out.println(f2.isFragmentInBasicShape());

        Fragment f3=new Fragment(7,0);

        Fragment f4= f2.copy();

        Fragment f5=new Fragment(f1);

        MixedNumber m1=new MixedNumber(4,2,7);
        System.out.println(m1.toString());

        MyMath myMath = new MyMath();
        Fragment f6=myMath.add(f1,f2);
        System.out.println(f6.toString());

        f6=MyMath.sub(f1,f2);
        System.out.println(f6.toString());*/

       /*Rectangle rect=new Rectangle(12,5);
        System.out.println("Diagonale: "+rect.calcDiagonale());
        rect.print();
        rect.setCharacter('+');
        rect.showRectangle();
        rect.setFill(true);
        rect.showRectangle(); */
        Bank bank= new Bank("Provident");
        //System.out.println(bank.convert(520,"USD"));
        System.out.println(bank.loan(1000, 4.5 , 20 ));

    }
}
