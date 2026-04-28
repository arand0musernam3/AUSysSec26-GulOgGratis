package bp;

import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b BOUGHT_MORE;
    public static final b BUY_AGAIN;
    public static final b RETURN_FOR_SURPRISE_BAG;
    public static final b SHOPPED_BEFORE;
    private final int question;

    @NotNull
    private final String trackingValue;

    static {
        b bVar = new b("SHOPPED_BEFORE", 0, R.string.order_rating_shopped_before, "Shopped_Here_Before");
        SHOPPED_BEFORE = bVar;
        b bVar2 = new b("RETURN_FOR_SURPRISE_BAG", 1, R.string.order_rating_return_for_surprise_bag, "Went_For_Surprise_Bag");
        RETURN_FOR_SURPRISE_BAG = bVar2;
        b bVar3 = new b("BOUGHT_MORE", 2, R.string.order_rating_bought_anything_else, "Bought_Anything_Else");
        BOUGHT_MORE = bVar3;
        b bVar4 = new b("BUY_AGAIN", 3, R.string.order_rating_would_buy_again, "Would_Buy_Again");
        BUY_AGAIN = bVar4;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        $VALUES = bVarArr;
        $ENTRIES = new a80.b(bVarArr);
    }

    public b(String str, int i11, int i12, String str2) {
        this.question = i12;
        this.trackingValue = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final int a() {
        return this.question;
    }

    public final String c() {
        return this.trackingValue;
    }
}
