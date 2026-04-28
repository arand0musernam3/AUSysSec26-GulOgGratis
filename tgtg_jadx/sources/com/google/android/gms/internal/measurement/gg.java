package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class gg implements vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jh f11436a = new jh(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kh f11437b = new kh(1);

    public static lh b(Set set) {
        lh lhVar = new lh();
        lhVar.f11613d = f11437b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            tg tgVar = (tg) it.next();
            g1.c(tgVar, "key");
            boolean z11 = tgVar.f11909c;
            HashMap map = lhVar.f11611b;
            HashMap map2 = lhVar.f11610a;
            if (!z11) {
                map.remove(tgVar);
                map2.put(tgVar, lh.f11608e);
            } else {
                if (!z11) {
                    i4.a.f("key must be repeating");
                    return null;
                }
                map2.remove(tgVar);
                map.put(tgVar, lh.f11609f);
            }
        }
        return lhVar;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final InputStream d(ud udVar) {
        de deVarA = udVar.f11939a.a(udVar.f11942d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(deVarA);
        ArrayList arrayList2 = udVar.f11941c;
        if (!arrayList2.isEmpty()) {
            int i11 = sd.f11849b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
            sd sdVar = !arrayList3.isEmpty() ? new sd(deVarA, arrayList3) : null;
            if (sdVar != null) {
                arrayList.add(sdVar);
            }
        }
        Iterator it2 = udVar.f11940b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            org.bouncycastle.jce.provider.a.c();
            return null;
        }
        throw null;
    }

    public static boolean e(byte b8) {
        return b8 > -65;
    }
}
