package sr;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f CANCELLED;
    public static final f EMAIL_CONFIRMED;
    public static final f NOT_READY;
    public static final f REFUNDED_MONEY_RETURNED;
    public static final f REFUNDED_RES_LIFTED;
    public static final f REFUNDED_VOUCHER_REINSTATED;
    public static final f THANKS_FOR_INPUT;

    static {
        f fVar = new f("EMAIL_CONFIRMED", 0);
        EMAIL_CONFIRMED = fVar;
        f fVar2 = new f("THANKS_FOR_INPUT", 1);
        THANKS_FOR_INPUT = fVar2;
        f fVar3 = new f("REFUNDED_RES_LIFTED", 2);
        REFUNDED_RES_LIFTED = fVar3;
        f fVar4 = new f("REFUNDED_MONEY_RETURNED", 3);
        REFUNDED_MONEY_RETURNED = fVar4;
        f fVar5 = new f("REFUNDED_VOUCHER_REINSTATED", 4);
        REFUNDED_VOUCHER_REINSTATED = fVar5;
        f fVar6 = new f("NOT_READY", 5);
        NOT_READY = fVar6;
        f fVar7 = new f("CANCELLED", 6);
        CANCELLED = fVar7;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
