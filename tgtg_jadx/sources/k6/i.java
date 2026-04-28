package k6;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i {
    private static final /* synthetic */ i[] $VALUES;
    public static final i PACKED;
    public static final i SPREAD;
    public static final i SPREAD_INSIDE;
    public static Map<String, i> chainMap;
    public static Map<String, Integer> valueMap;

    static {
        i iVar = new i("SPREAD", 0);
        SPREAD = iVar;
        i iVar2 = new i("SPREAD_INSIDE", 1);
        SPREAD_INSIDE = iVar2;
        i iVar3 = new i("PACKED", 2);
        PACKED = iVar3;
        $VALUES = new i[]{iVar, iVar2, iVar3};
        chainMap = new HashMap();
        valueMap = new HashMap();
        chainMap.put("packed", iVar3);
        chainMap.put("spread_inside", iVar2);
        chainMap.put("spread", iVar);
        valueMap.put("packed", 2);
        valueMap.put("spread_inside", 1);
        valueMap.put("spread", 0);
    }

    public static int a(String str) {
        if (valueMap.containsKey(str)) {
            return valueMap.get(str).intValue();
        }
        return -1;
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) $VALUES.clone();
    }
}
