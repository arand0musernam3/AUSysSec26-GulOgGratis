package zj;

import com.adyen.checkout.googlepay.AllowedCardNetworks;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f DISCOVER;
    public static final f LIST;
    public static final f MAP;

    @NotNull
    private final String trackValue;

    static {
        f fVar = new f(AllowedCardNetworks.DISCOVER, 0, "Screen_Discover");
        DISCOVER = fVar;
        f fVar2 = new f("MAP", 1, "Screen_Map");
        MAP = fVar2;
        f fVar3 = new f("LIST", 2, "Screen_List");
        LIST = fVar3;
        f[] fVarArr = {fVar, fVar2, fVar3};
        $VALUES = fVarArr;
        $ENTRIES = new a80.b(fVarArr);
    }

    public f(String str, int i11, String str2) {
        this.trackValue = str2;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final String a() {
        return this.trackValue;
    }
}
