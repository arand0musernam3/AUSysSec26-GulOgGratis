package aj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d ADDITIONAL_AUTH_PAYMENT_ID_NULL;
    public static final d ADYEN_INIT;
    public static final d CANCEL_ORDER_API;
    public static final d CLASS_CAST_EXCEPTION;
    public static final d GOOGLE_PAY_AVAILABLE;
    public static final d MISSING_TAX_DATA;
    public static final d NO_PAYMENT_METHOD;
    public static final d ORDER_ABORTED;
    public static final d ORDER_TIMED_OUT;
    public static final d PAYMENT_STATUS_ERROR;
    public static final d PAYMENT_STATUS_EXCEPTION_CAUSE;
    public static final d PAYMENT_TIMED_OUT;
    public static final d POLLING_ERROR;
    public static final d RESUME_ORDER_TIMED_OUT;
    public static final d SOLD_OUT;
    public static final d TAX_SERVICE_DOWN;

    static {
        d dVar = new d("ADDITIONAL_AUTH_PAYMENT_ID_NULL", 0);
        ADDITIONAL_AUTH_PAYMENT_ID_NULL = dVar;
        d dVar2 = new d("ADYEN_INIT", 1);
        ADYEN_INIT = dVar2;
        d dVar3 = new d("CLASS_CAST_EXCEPTION", 2);
        CLASS_CAST_EXCEPTION = dVar3;
        d dVar4 = new d("CANCEL_ORDER_API", 3);
        CANCEL_ORDER_API = dVar4;
        d dVar5 = new d("GOOGLE_PAY_AVAILABLE", 4);
        GOOGLE_PAY_AVAILABLE = dVar5;
        d dVar6 = new d("NO_PAYMENT_METHOD", 5);
        NO_PAYMENT_METHOD = dVar6;
        d dVar7 = new d("ORDER_TIMED_OUT", 6);
        ORDER_TIMED_OUT = dVar7;
        d dVar8 = new d("ORDER_ABORTED", 7);
        ORDER_ABORTED = dVar8;
        d dVar9 = new d("PAYMENT_TIMED_OUT", 8);
        PAYMENT_TIMED_OUT = dVar9;
        d dVar10 = new d("PAYMENT_STATUS_EXCEPTION_CAUSE", 9);
        PAYMENT_STATUS_EXCEPTION_CAUSE = dVar10;
        d dVar11 = new d("PAYMENT_STATUS_ERROR", 10);
        PAYMENT_STATUS_ERROR = dVar11;
        d dVar12 = new d("POLLING_ERROR", 11);
        POLLING_ERROR = dVar12;
        d dVar13 = new d("RESUME_ORDER_TIMED_OUT", 12);
        RESUME_ORDER_TIMED_OUT = dVar13;
        d dVar14 = new d("SOLD_OUT", 13);
        SOLD_OUT = dVar14;
        d dVar15 = new d("MISSING_TAX_DATA", 14);
        MISSING_TAX_DATA = dVar15;
        d dVar16 = new d("TAX_SERVICE_DOWN", 15);
        TAX_SERVICE_DOWN = dVar16;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12, dVar13, dVar14, dVar15, dVar16};
        $VALUES = dVarArr;
        $ENTRIES = new a80.b(dVarArr);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
