package nc;

import android.os.Build;
import java.lang.reflect.Field;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.x0;
import zendesk.messaging.android.internal.analytics.AnalyticsProcessor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements h {
    @Override // nc.h
    public final Map a() {
        Pair pair = new Pair("os_bid", Build.ID);
        Pair pair2 = new Pair("tgs", Build.TAGS);
        Pair pair3 = new Pair("os_btype", Build.TYPE);
        Pair pair4 = new Pair("os", AnalyticsProcessor.CHANNEL_NAME);
        Pair pair5 = new Pair("osr", Build.VERSION.RELEASE);
        Field[] fields = Build.VERSION_CODES.class.getFields();
        int i11 = Build.VERSION.SDK_INT;
        return x0.e(pair, pair2, pair3, pair4, pair5, new Pair("osn", fields[i11].getName()), new Pair("osv", String.valueOf(i11)));
    }
}
