package cq;

import android.content.Context;
import androidx.recyclerview.widget.m0;
import com.app.tgtg.R;
import com.braze.models.inappmessage.InAppMessageBase;
import java.text.NumberFormat;
import org.jetbrains.annotations.NotNull;
import r8.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements e {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;

    @NotNull
    public static final a Companion;
    public static final b MEALS_SAVED_100;
    public static final b MEALS_SAVED_1000;
    public static final b MEALS_SAVED_10000;
    public static final b MEALS_SAVED_250;
    public static final b MEALS_SAVED_2500;
    public static final b MEALS_SAVED_50;
    public static final b MEALS_SAVED_500;
    public static final b MEALS_SAVED_5000;
    public static final b MEALS_SAVED_7500;
    private int imageSrc;
    private int title = R.string.store_view_badge_meals_saved_header;
    private int value;

    static {
        b bVar = new b("MEALS_SAVED_50", 0, 50, 2131231699);
        MEALS_SAVED_50 = bVar;
        b bVar2 = new b("MEALS_SAVED_100", 1, 100, 2131231699);
        MEALS_SAVED_100 = bVar2;
        b bVar3 = new b("MEALS_SAVED_250", 2, m0.DEFAULT_SWIPE_ANIMATION_DURATION, 2131231699);
        MEALS_SAVED_250 = bVar3;
        b bVar4 = new b("MEALS_SAVED_500", 3, 500, 2131231701);
        MEALS_SAVED_500 = bVar4;
        b bVar5 = new b("MEALS_SAVED_1000", 4, 1000, 2131231701);
        MEALS_SAVED_1000 = bVar5;
        b bVar6 = new b("MEALS_SAVED_2500", 5, 2500, 2131231701);
        MEALS_SAVED_2500 = bVar6;
        b bVar7 = new b("MEALS_SAVED_5000", 6, InAppMessageBase.INAPP_MESSAGE_DURATION_DEFAULT_MILLIS, 2131231700);
        MEALS_SAVED_5000 = bVar7;
        b bVar8 = new b("MEALS_SAVED_7500", 7, 7500, 2131231700);
        MEALS_SAVED_7500 = bVar8;
        b bVar9 = new b("MEALS_SAVED_10000", 8, 10000, 2131231700);
        MEALS_SAVED_10000 = bVar9;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
        Companion = new a();
    }

    public b(String str, int i11, int i12, int i13) {
        this.value = i12;
        this.imageSrc = i13;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    @Override // cq.e
    public final String a(Context context) {
        context.getClass();
        return k.l(NumberFormat.getInstance().format(Integer.valueOf(this.value)), "+");
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
