package lx;

import android.os.Bundle;
import ax.a0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.c0;
import kotlin.collections.d0;
import tx.z;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f28399a = c0.c("fb_currency");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f28400b = c0.c("_valueToSum");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f28401c = TimeConstants.ONE_MINUTE_DIFFERENCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f28402d = d0.h(new Pair("fb_iap_product_id", c0.c("fb_iap_product_id")), new Pair("fb_iap_product_description", c0.c("fb_iap_product_description")), new Pair("fb_iap_product_title", c0.c("fb_iap_product_title")), new Pair("fb_iap_purchase_token", c0.c("fb_iap_purchase_token")));

    public static Pair a(Bundle bundle, Bundle bundle2, bx.s sVar) {
        if (bundle == null) {
            return new Pair(bundle2, sVar);
        }
        try {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    Map map = bx.s.f6750b;
                    bx.t tVar = bx.t.IAPParameters;
                    str.getClass();
                    Pair pairK = p30.b.k(tVar, str, string, bundle2, sVar);
                    Bundle bundle3 = (Bundle) pairK.f26485a;
                    sVar = (bx.s) pairK.f26486b;
                    bundle2 = bundle3;
                }
            }
        } catch (Exception unused) {
        }
        return new Pair(bundle2, sVar);
    }

    public static List b(boolean z11) {
        z zVarB = tx.c0.b(a0.b());
        if ((zVarB != null ? zVarB.f40605x : null) != null) {
            List<Pair> list = zVarB.f40605x;
            if (!list.isEmpty()) {
                if (!z11) {
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                for (Pair pair : list) {
                    Iterator it = ((List) pair.f26486b).iterator();
                    while (it.hasNext()) {
                        arrayList.add(new Pair((String) it.next(), c0.c(pair.f26485a)));
                    }
                }
                return arrayList;
            }
        }
        return f28402d;
    }

    public static List c(boolean z11) {
        List<Pair> list;
        z zVarB = tx.c0.b(a0.b());
        if (zVarB == null || (list = zVarB.f40606y) == null || list.isEmpty()) {
            return null;
        }
        if (!z11) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            Iterator it = ((List) pair.f26486b).iterator();
            while (it.hasNext()) {
                arrayList.add(new Pair((String) it.next(), c0.c(pair.f26485a)));
            }
        }
        return arrayList;
    }
}
