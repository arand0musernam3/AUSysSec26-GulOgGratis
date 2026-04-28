package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ud {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ke f11939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k30.h f11940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ArrayList f11941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f11942d;

    public ArrayList a(OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        ArrayList arrayList2 = this.f11941c;
        if (!arrayList2.isEmpty()) {
            int i11 = td.f11891b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw e0.f.e(it);
            }
            td tdVar = !arrayList3.isEmpty() ? new td(outputStream, arrayList3) : null;
            if (tdVar != null) {
                arrayList.add(tdVar);
            }
        }
        Iterator it2 = this.f11940b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return arrayList;
        }
        if (it2.next() != null) {
            org.bouncycastle.jce.provider.a.c();
            return null;
        }
        throw null;
    }
}
