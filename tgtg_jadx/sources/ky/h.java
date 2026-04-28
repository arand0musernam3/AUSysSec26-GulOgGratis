package ky;

import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.braze.models.FeatureFlag;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h ENABLED;
    public static final h NOT_SUPPORTED;
    public static final h SUPPORTED;
    public static final h UNKNOWN;

    @NotNull
    private final String stringDescription;

    static {
        h hVar = new h("NOT_SUPPORTED", 0, "not_supported");
        NOT_SUPPORTED = hVar;
        h hVar2 = new h("SUPPORTED", 1, "supported");
        SUPPORTED = hVar2;
        h hVar3 = new h("ENABLED", 2, FeatureFlag.ENABLED);
        ENABLED = hVar3;
        h hVar4 = new h("UNKNOWN", 3, PaymentMethodTypes.UNKNOWN);
        UNKNOWN = hVar4;
        h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        $VALUES = hVarArr;
        $ENTRIES = new a80.b(hVarArr);
    }

    public h(String str, int i11, String str2) {
        this.stringDescription = str2;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final String a() {
        return this.stringDescription;
    }
}
