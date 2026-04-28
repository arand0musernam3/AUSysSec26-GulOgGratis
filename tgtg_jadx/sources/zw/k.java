package zw;

import com.braze.models.FeatureFlag;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {
    private static final /* synthetic */ k[] $VALUES;
    public static final k UNSUPPORTED;
    public static final k active;
    private static final Map<String, k> cache;
    public static final k checked;
    public static final k disabled;
    public static final k empty;
    public static final k enabled;
    public static final k first_child;
    public static final k first_of_type;
    public static final k focus;
    public static final k hover;
    public static final k indeterminate;
    public static final k lang;
    public static final k last_child;
    public static final k last_of_type;
    public static final k link;
    public static final k not;
    public static final k nth_child;
    public static final k nth_last_child;
    public static final k nth_last_of_type;
    public static final k nth_of_type;
    public static final k only_child;
    public static final k only_of_type;
    public static final k root;
    public static final k target;
    public static final k visited;

    static {
        k kVar = new k("target", 0);
        target = kVar;
        k kVar2 = new k("root", 1);
        root = kVar2;
        k kVar3 = new k("nth_child", 2);
        nth_child = kVar3;
        k kVar4 = new k("nth_last_child", 3);
        nth_last_child = kVar4;
        k kVar5 = new k("nth_of_type", 4);
        nth_of_type = kVar5;
        k kVar6 = new k("nth_last_of_type", 5);
        nth_last_of_type = kVar6;
        k kVar7 = new k("first_child", 6);
        first_child = kVar7;
        k kVar8 = new k("last_child", 7);
        last_child = kVar8;
        k kVar9 = new k("first_of_type", 8);
        first_of_type = kVar9;
        k kVar10 = new k("last_of_type", 9);
        last_of_type = kVar10;
        k kVar11 = new k("only_child", 10);
        only_child = kVar11;
        k kVar12 = new k("only_of_type", 11);
        only_of_type = kVar12;
        k kVar13 = new k("empty", 12);
        empty = kVar13;
        k kVar14 = new k("not", 13);
        not = kVar14;
        k kVar15 = new k("lang", 14);
        lang = kVar15;
        k kVar16 = new k("link", 15);
        link = kVar16;
        k kVar17 = new k("visited", 16);
        visited = kVar17;
        k kVar18 = new k("hover", 17);
        hover = kVar18;
        k kVar19 = new k("active", 18);
        active = kVar19;
        k kVar20 = new k("focus", 19);
        focus = kVar20;
        k kVar21 = new k(FeatureFlag.ENABLED, 20);
        enabled = kVar21;
        k kVar22 = new k("disabled", 21);
        disabled = kVar22;
        k kVar23 = new k("checked", 22);
        checked = kVar23;
        k kVar24 = new k("indeterminate", 23);
        indeterminate = kVar24;
        k kVar25 = new k("UNSUPPORTED", 24);
        UNSUPPORTED = kVar25;
        $VALUES = new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9, kVar10, kVar11, kVar12, kVar13, kVar14, kVar15, kVar16, kVar17, kVar18, kVar19, kVar20, kVar21, kVar22, kVar23, kVar24, kVar25};
        cache = new HashMap();
        for (k kVar26 : values()) {
            if (kVar26 != UNSUPPORTED) {
                cache.put(kVar26.name().replace('_', '-'), kVar26);
            }
        }
    }

    public static k a(String str) {
        k kVar = cache.get(str);
        return kVar != null ? kVar : UNSUPPORTED;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
