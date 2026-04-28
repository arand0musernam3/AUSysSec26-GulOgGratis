package cq;

import android.content.Context;
import android.content.res.Resources;
import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;

    @NotNull
    public static final c Companion;
    public static final d MONTHS_ON_PLATFORM_1;
    public static final d MONTHS_ON_PLATFORM_108;
    public static final d MONTHS_ON_PLATFORM_12;
    public static final d MONTHS_ON_PLATFORM_120;
    public static final d MONTHS_ON_PLATFORM_24;
    public static final d MONTHS_ON_PLATFORM_36;
    public static final d MONTHS_ON_PLATFORM_48;
    public static final d MONTHS_ON_PLATFORM_6;
    public static final d MONTHS_ON_PLATFORM_60;
    public static final d MONTHS_ON_PLATFORM_72;
    public static final d MONTHS_ON_PLATFORM_84;
    public static final d MONTHS_ON_PLATFORM_96;
    private int imageSrc;
    private int title = R.string.store_view_badge_fighting_header;
    private int value;

    static {
        d dVar = new d("MONTHS_ON_PLATFORM_1", 0, 1, 2131232049);
        MONTHS_ON_PLATFORM_1 = dVar;
        d dVar2 = new d("MONTHS_ON_PLATFORM_6", 1, 6, 2131232049);
        MONTHS_ON_PLATFORM_6 = dVar2;
        d dVar3 = new d("MONTHS_ON_PLATFORM_12", 2, 12, 2131232046);
        MONTHS_ON_PLATFORM_12 = dVar3;
        d dVar4 = new d("MONTHS_ON_PLATFORM_24", 3, 24, 2131232047);
        MONTHS_ON_PLATFORM_24 = dVar4;
        d dVar5 = new d("MONTHS_ON_PLATFORM_36", 4, 36, 2131232048);
        MONTHS_ON_PLATFORM_36 = dVar5;
        d dVar6 = new d("MONTHS_ON_PLATFORM_48", 5, 48, 2131232048);
        MONTHS_ON_PLATFORM_48 = dVar6;
        d dVar7 = new d("MONTHS_ON_PLATFORM_60", 6, 60, 2131232048);
        MONTHS_ON_PLATFORM_60 = dVar7;
        d dVar8 = new d("MONTHS_ON_PLATFORM_72", 7, 72, 2131232048);
        MONTHS_ON_PLATFORM_72 = dVar8;
        d dVar9 = new d("MONTHS_ON_PLATFORM_84", 8, 84, 2131232048);
        MONTHS_ON_PLATFORM_84 = dVar9;
        d dVar10 = new d("MONTHS_ON_PLATFORM_96", 9, 96, 2131232048);
        MONTHS_ON_PLATFORM_96 = dVar10;
        d dVar11 = new d("MONTHS_ON_PLATFORM_108", 10, 108, 2131232048);
        MONTHS_ON_PLATFORM_108 = dVar11;
        d dVar12 = new d("MONTHS_ON_PLATFORM_120", 11, 120, 2131232048);
        MONTHS_ON_PLATFORM_120 = dVar12;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, dVar8, dVar9, dVar10, dVar11, dVar12};
        $VALUES = dVarArr;
        $ENTRIES = new a80.b(dVarArr);
        Companion = new c();
    }

    public d(String str, int i11, int i12, int i13) {
        this.value = i12;
        this.imageSrc = i13;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    @Override // cq.e
    public final String a(Context context) {
        context.getClass();
        if (this.value >= 12) {
            Resources resources = context.getResources();
            int i11 = this.value;
            String quantityString = resources.getQuantityString(R.plurals.store_view_badge_months_on_platform_years, i11 / 12, Integer.valueOf(i11 / 12));
            quantityString.getClass();
            return quantityString;
        }
        Resources resources2 = context.getResources();
        int i12 = this.value;
        String quantityString2 = resources2.getQuantityString(R.plurals.store_view_badge_months_on_platform_months, i12, Integer.valueOf(i12));
        quantityString2.getClass();
        return quantityString2;
    }

    @Override // cq.e
    public final int c() {
        return this.imageSrc;
    }

    @Override // cq.e
    public final int getTitle() {
        return this.title;
    }

    @Override // cq.e
    public final int getValue() {
        return this.value;
    }
}
