package zn;

import i90.h;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@h(with = f.class)
public final class e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    public static final e BADGEPROGRESS;
    public static final e BBMSURVEY;

    @NotNull
    public static final d Companion;
    public static final e NEWSLETTER;
    public static final e PUSH;
    public static final e REFERRAL;
    public static final e UNKNOWN;
    public static final e USERHASEXPIREDREWARDS;
    public static final e USERREDEEMEDREWARDS;

    static {
        e eVar = new e("BBMSURVEY", 0);
        BBMSURVEY = eVar;
        e eVar2 = new e("REFERRAL", 1);
        REFERRAL = eVar2;
        e eVar3 = new e("BADGEPROGRESS", 2);
        BADGEPROGRESS = eVar3;
        e eVar4 = new e("NEWSLETTER", 3);
        NEWSLETTER = eVar4;
        e eVar5 = new e("PUSH", 4);
        PUSH = eVar5;
        e eVar6 = new e("USERREDEEMEDREWARDS", 5);
        USERREDEEMEDREWARDS = eVar6;
        e eVar7 = new e("USERHASEXPIREDREWARDS", 6);
        USERHASEXPIREDREWARDS = eVar7;
        e eVar8 = new e("UNKNOWN", 7);
        UNKNOWN = eVar8;
        e[] eVarArr = {eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8};
        $VALUES = eVarArr;
        $ENTRIES = new a80.b(eVarArr);
        Companion = new d();
    }

    public static a80.a a() {
        return $ENTRIES;
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }
}
