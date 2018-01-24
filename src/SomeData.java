public class SomeData {
    public static Department[] GetFirstSet() {
        return new Department[] {
            new Department("ABC", 100.32),
            new Department("DEF", 21.45),
            new Department("GHI", 123.45),
            new Department("ABC", 99.87)
        };
    }

    public static Department[] GetSecondList() {
        return new Department[] {
            new Department("XYZ", 109.37),
            new Department("DEF", 92.54),
            new Department("GHI", 123.45)
        };
    }

    public static Department[] GetThirdList() {
        return new Department[] {
            new Department("DEF", 321.54),
            new Department("XYZ", 92.54),
            new Department("ABC", 1.99),
            new Department("GHI", -22.33)
        };
    }
}
