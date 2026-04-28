package nq;

import com.app.tgtg.model.remote.discover.request.SupportedBucket;
import java.util.ArrayList;
import kotlin.collections.c0;
import kotlin.collections.d0;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n {
    private static final /* synthetic */ a80.a $ENTRIES;
    private static final /* synthetic */ n[] $VALUES;
    public static final n ACTION;

    @NotNull
    public static final m Companion;
    public static final n FILTER;
    public static final n HEADER;
    public static final n ITEM;

    @NotNull
    private final SupportedBucket bucket;

    static {
        o oVar = o.RATE_ORDER;
        o oVar2 = o.MANUFACTURER;
        o oVar3 = o.STORE_REFERRAL;
        o oVar4 = o.DELIVERY_TAB;
        n nVar = new n("ACTION", 0, new SupportedBucket("ACTION", new ArrayList(d0.h(oVar, oVar2, oVar3, oVar4, o.LOYALTY_CARD_BANNER, o.RECIPE_GENERATOR))));
        ACTION = nVar;
        n nVar2 = new n("HEADER", 1, new SupportedBucket("HEADER", new ArrayList(d0.h(o.SOLD_OUT, o.ALMOST_SOLD_OUT, o.NOTHING_NEARBY, o.NOT_LIVE_HERE, o.FILTERS_NO_RESULT))));
        HEADER = nVar2;
        n nVar3 = new n("ITEM", 2, new SupportedBucket("ITEM", new ArrayList(d0.h(o.FLASH_SALES, o.CATEGORY, o.CLASSIC, o.FAVORITES, o.RECOMMENDATIONS, oVar2, oVar4))));
        ITEM = nVar3;
        n nVar4 = new n("FILTER", 3, new SupportedBucket("FILTER", new ArrayList(c0.c(o.QUICK_FILTERS))));
        FILTER = nVar4;
        n[] nVarArr = {nVar, nVar2, nVar3, nVar4};
        $VALUES = nVarArr;
        $ENTRIES = new a80.b(nVarArr);
        Companion = new m();
    }

    public n(String str, int i11, SupportedBucket supportedBucket) {
        this.bucket = supportedBucket;
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) $VALUES.clone();
    }

    public final SupportedBucket a() {
        return this.bucket;
    }
}
