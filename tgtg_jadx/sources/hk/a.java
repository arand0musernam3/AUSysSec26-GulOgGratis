package hk;

import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a FAQ;
    public static final a JOIN_TGTG;
    public static final a ORDER;
    private final int icon;
    private final int text;

    @NotNull
    private final String trackingValue;

    static {
        a aVar = new a("ORDER", 0, "my_order", R.drawable.system_icon_magic_bag, R.string.helpdesk_topic_my_order);
        ORDER = aVar;
        a aVar2 = new a("FAQ", 1, "how_it_works", R.drawable.system_icon_graduation_cap, R.string.helpdesk_topic_how_does_it_work);
        FAQ = aVar2;
        a aVar3 = new a("JOIN_TGTG", 2, "join_tgtg", R.drawable.system_icon_community, R.string.helpdesk_topic_sign_up);
        JOIN_TGTG = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        $VALUES = aVarArr;
        $ENTRIES = new a80.b(aVarArr);
    }

    public a(String str, int i11, String str2, int i12, int i13) {
        this.icon = i12;
        this.text = i13;
        this.trackingValue = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int a() {
        return this.text;
    }

    public final String c() {
        return this.trackingValue;
    }
}
