
// (P1*0.6+((E1+E2)/2)*0.4)*0.5+
// (max(((P1*0.6+((E1+E2)/2)*0.4)-5.9),0)/((P1*0.6+((E1+E2)/2)*0.4)-5.9))*
// (API*0.5)+X+(SUB*0.2)

public class LP1 {
    private int p1, e1, e2, api, x, sub;

    public  LP1(int p1, int e1, int e2, int api, int x, int sub) {
        this.p1 = p1;
        this.e1 = e1;
        this.e2 = e2;
        this.api = api;
    }
    public double max() {
        if ((((p1*0.6+((e1+e2)/2)*0.4)-5.9) > 0)) return (((p1*0.6+((e1+e2)/2)*0.4)-5.9)); else return 0;
    }
    public double min() {
        return (p1*0.6+((e1+e2)/2)*0.4)*0.5;
    }
    public double max2() {
        return ((p1*0.6+((e1+e2)/2)*0.4)-5.9);
    }
    public double aPI() {
        return (api*0.5);
    }
    public double xis() {
        return x;
    }
    public double subb () {
        return sub*0.2;
    }

    public static void main(String[] args) {
        LP1 lp1 = new LP1(10, 10, 10, 10, 10, 10);
        System.out.println(lp1.min()+lp1.max()/lp1.max2()* lp1.aPI()+lp1.xis()+lp1.subb());
    }
}
