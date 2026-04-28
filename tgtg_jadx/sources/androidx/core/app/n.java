package androidx.core.app;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.app.tgtg.feature.orderview.manufacture.ManufacturerOrderActivity;
import com.app.tgtg.feature.orderview.surprisebag.SurpriseBagOrderActivity;
import com.app.tgtg.model.local.AppConstants;
import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.order.OrderType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f2637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2640g;

    public n() {
        this.f2636c = new LinkedHashMap();
        this.f2637d = new LinkedHashMap();
        this.f2638e = new LinkedHashMap();
        this.f2639f = new kotlin.collections.t();
        this.f2640g = new kotlin.collections.t();
    }

    public o a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.f2640g;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new o((IconCompat) this.f2636c, (CharSequence) this.f2637d, (PendingIntent) this.f2638e, (Bundle) this.f2639f, arrayList2.isEmpty() ? null : (c1[]) arrayList2.toArray(new c1[arrayList2.size()]), this.f2634a, this.f2635b);
    }

    public f70.b b() {
        OrderType orderType = (OrderType) this.f2636c;
        Class cls = ko.c.$EnumSwitchMapping$0[orderType.ordinal()] == 1 ? ManufacturerOrderActivity.class : SurpriseBagOrderActivity.class;
        Pair pair = new Pair("ORIGIN", (f70.i) this.f2639f);
        Boolean bool = Boolean.FALSE;
        Bundle bundleX = jb.u.x(pair, new Pair("SHOW_RECOMMENDATIONS_BOTTOM_SHEET", bool), new Pair("AUTO_SHOW_REDEEMER_VIEW", bool));
        String str = (String) this.f2637d;
        if (str != null) {
            bundleX.putParcelable("ORDER_ID", OrderId.m209boximpl(str));
            bundleX.putSerializable("ORDER_TYPE", orderType);
        }
        String str2 = (String) this.f2638e;
        if (str2 != null) {
            bundleX.putString("INVITATION_ID", str2);
        }
        String str3 = (String) this.f2640g;
        if (str3 != null) {
            bundleX.putString("INVITATION_FROM_DEEPLINK", str3);
        }
        return new f70.b(cls, bundleX, this.f2635b, false, false, Integer.valueOf(AppConstants.REQUEST_CODE_ORDER_VIEW), this.f2634a ? kotlin.collections.d0.h(32768, 268435456) : kotlin.collections.n0.f26529a, null, null, false, 920);
    }

    public n(OrderType orderType) {
        orderType.getClass();
        this.f2636c = orderType;
        this.f2639f = f70.i.UNKNOWN;
    }

    public n(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f2634a = true;
        this.f2635b = true;
        this.f2636c = iconCompat;
        this.f2637d = s.b(charSequence);
        this.f2638e = pendingIntent;
        this.f2639f = bundle;
        this.f2640g = null;
        this.f2634a = true;
        this.f2635b = true;
    }
}
