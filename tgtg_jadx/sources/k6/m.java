package k6;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m ALIGNED;
    public static final m CHAIN;
    public static final m NONE;
    public static Map<String, Integer> valueMap;
    public static Map<String, m> wrapMap;

    static {
        m mVar = new m("NONE", 0);
        NONE = mVar;
        m mVar2 = new m("CHAIN", 1);
        CHAIN = mVar2;
        m mVar3 = new m("ALIGNED", 2);
        ALIGNED = mVar3;
        $VALUES = new m[]{mVar, mVar2, mVar3};
        wrapMap = new HashMap();
        valueMap = new HashMap();
        wrapMap.put("none", mVar);
        wrapMap.put("chain", mVar2);
        wrapMap.put("aligned", mVar3);
        valueMap.put("none", 0);
        valueMap.put("chain", 3);
        valueMap.put("aligned", 2);
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
