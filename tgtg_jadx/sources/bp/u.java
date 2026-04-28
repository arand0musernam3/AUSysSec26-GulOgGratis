package bp;

import com.adyen.checkout.googlepay.AllowedCardNetworks;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class u {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ u[] $VALUES;
    public static final u DISCOVER;
    public static final u ORDER;

    @NotNull
    private final String attr;

    static {
        u uVar = new u(AllowedCardNetworks.DISCOVER, 0, "Discover");
        DISCOVER = uVar;
        u uVar2 = new u("ORDER", 1, "Order");
        ORDER = uVar2;
        u[] uVarArr = {uVar, uVar2};
        $VALUES = uVarArr;
        $ENTRIES = new a80.b(uVarArr);
    }

    public u(String str, int i11, String str2) {
        this.attr = str2;
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) $VALUES.clone();
    }

    public final String a() {
        return this.attr;
    }
}
