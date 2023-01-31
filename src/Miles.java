public class Miles {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int cost = 2145;
        int miles = service.calculate(cost);
        System.out.println("Итого начислено миль " + miles);
    }

}
