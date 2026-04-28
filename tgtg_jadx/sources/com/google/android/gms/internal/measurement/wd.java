package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class wd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f12007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f12008c;

    public wd(ArrayList arrayList) {
        List list = Collections.EMPTY_LIST;
        this.f12006a = new HashMap();
        this.f12007b = new HashMap();
        this.f12008c = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ke keVar = (ke) it.next();
            if (TextUtils.isEmpty(keVar.e())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                ke keVar2 = (ke) this.f12006a.put(keVar.e(), keVar);
                if (keVar2 != null) {
                    String canonicalName = keVar2.getClass().getCanonicalName();
                    String canonicalName2 = keVar.getClass().getCanonicalName();
                    i4.a.f(e0.f.o(new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length()), "Cannot override Backend ", canonicalName, " with ", canonicalName2));
                    throw null;
                }
            }
        }
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            throw e0.f.e(it2);
        }
        this.f12008c.addAll(list);
    }

    public final Object a(Uri uri, vd vdVar) {
        return vdVar.a(b(uri));
    }

    public final ud b(Uri uri) {
        List listL;
        k30.d dVar = k30.h.f25901b;
        ex.i.m(4, "initialCapacity");
        Object[] objArr = new Object[4];
        ex.i.m(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        String encodedFragment = uri.getEncodedFragment();
        if (TextUtils.isEmpty(encodedFragment) || !encodedFragment.startsWith("transform=")) {
            listL = k30.x.f25926e;
        } else {
            listL = k30.h.l(new j30.k(new c5.i2(new e.b(new j30.c("+".charAt(0)), 21), true), encodedFragment.substring(10)));
        }
        int size = listL.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            String str = (String) listL.get(i11);
            Matcher matcher = he.f11473a.matcher(str);
            if (!matcher.matches()) {
                i4.a.f("Invalid fragment spec: ".concat(String.valueOf(str)));
                return null;
            }
            String strGroup = matcher.group(1);
            strGroup.getClass();
            int iD = k30.a.d(objArrCopyOf.length, i12 + 1);
            if (iD > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD);
            }
            objArrCopyOf[i12] = strGroup;
            i11++;
            i12++;
        }
        k30.x xVarJ = k30.h.j(i12, objArrCopyOf);
        if (xVarJ.f25928d > 0) {
            String str2 = (String) xVarJ.get(0);
            if (this.f12007b.get(str2) != null) {
                org.bouncycastle.jce.provider.a.c();
                return null;
            }
            String strValueOf = String.valueOf(uri);
            throw new zzsk(e0.f.o(new StringBuilder(str2.length() + 40 + strValueOf.length()), "Requested transform isn't registered: ", str2, ": ", strValueOf));
        }
        k30.h hVarO = k30.h.j(0, objArr).o();
        ud udVar = new ud();
        String scheme = uri.getScheme();
        ke keVar = (ke) this.f12006a.get(scheme);
        if (keVar == null) {
            throw new zzsk(e0.f.k("Requested backend isn't registered: ", scheme));
        }
        udVar.f11939a = keVar;
        udVar.f11941c = this.f12008c;
        udVar.f11940b = hVarO;
        if (!hVarO.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith(ExpiryDateInput.SEPARATOR)) {
                String str3 = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = hVarO.listIterator(hVarO.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous() != null) {
                        org.bouncycastle.jce.provider.a.c();
                        return null;
                    }
                }
                arrayList.set(arrayList.size() - 1, str3);
                uri = uri.buildUpon().path(TextUtils.join(ExpiryDateInput.SEPARATOR, arrayList)).encodedFragment(null).build();
            }
        }
        udVar.f11942d = uri;
        ud udVar2 = new ud();
        udVar2.f11939a = udVar.f11939a;
        udVar2.f11940b = udVar.f11940b;
        udVar2.f11941c = udVar.f11941c;
        udVar2.f11942d = udVar.f11942d;
        return udVar2;
    }
}
