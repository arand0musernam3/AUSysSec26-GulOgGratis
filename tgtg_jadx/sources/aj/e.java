package aj;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e CHARITY;
    public static final e CHECKOUT;
    public static final e ERROR_VIEW;
    public static final e PARCEL_ADDRESS_ENTRY;
    public static final e PARCEL_PICKUP_OPTIONS;

    @NotNull
    private final String route;

    static {
        e eVar = new e("CHECKOUT", 0, "checkout");
        CHECKOUT = eVar;
        e eVar2 = new e("CHARITY", 1, "charity");
        CHARITY = eVar2;
        e eVar3 = new e("PARCEL_ADDRESS_ENTRY", 2, "parcelAddress");
        PARCEL_ADDRESS_ENTRY = eVar3;
        e eVar4 = new e("PARCEL_PICKUP_OPTIONS", 3, "parcelPickupOptions");
        PARCEL_PICKUP_OPTIONS = eVar4;
        e eVar5 = new e("ERROR_VIEW", 4, "errorView");
        ERROR_VIEW = eVar5;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
    }

    public e(String str, int i11, String str2) {
        this.route = str2;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String a() {
        return this.route;
    }
}
