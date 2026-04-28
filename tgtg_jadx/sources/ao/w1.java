package ao;

import com.adyen.checkout.googlepay.AllowedCardNetworks;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class w1 {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ w1[] $VALUES;
    public static final w1 BROWSE;
    public static final w1 DISCOVER;
    public static final w1 NONE;

    static {
        w1 w1Var = new w1(AllowedCardNetworks.DISCOVER, 0);
        DISCOVER = w1Var;
        w1 w1Var2 = new w1("BROWSE", 1);
        BROWSE = w1Var2;
        w1 w1Var3 = new w1("NONE", 2);
        NONE = w1Var3;
        w1[] w1VarArr = {w1Var, w1Var2, w1Var3};
        $VALUES = w1VarArr;
        $ENTRIES = new a80.b(w1VarArr);
    }

    public static w1 valueOf(String str) {
        return (w1) Enum.valueOf(w1.class, str);
    }

    public static w1[] values() {
        return (w1[]) $VALUES.clone();
    }
}
