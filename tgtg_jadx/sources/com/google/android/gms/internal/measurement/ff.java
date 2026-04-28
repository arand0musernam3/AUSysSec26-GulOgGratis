package com.google.android.gms.internal.measurement;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f11421a = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f11422b = new WeakHashMap();

    public static void a(Throwable th2) {
        Throwable cause;
        h1 h1Var;
        Closeable closeable;
        WeakHashMap weakHashMap = f11422b;
        synchronized (weakHashMap) {
            cause = th2;
            while (cause != null) {
                try {
                    if (weakHashMap.containsKey(cause)) {
                        break;
                    } else {
                        cause = cause.getCause();
                    }
                } finally {
                }
            }
            weakHashMap.put(th2, Boolean.valueOf(cause != null));
        }
        if (cause != null) {
            return;
        }
        WeakHashMap weakHashMap2 = f11421a;
        synchronized (weakHashMap2) {
            Throwable cause2 = th2;
            while (cause2 != null) {
                try {
                    if (weakHashMap2.containsKey(cause2)) {
                        break;
                    } else {
                        cause2 = cause2.getCause();
                    }
                } finally {
                }
            }
            if (cause2 == null) {
                h1Var = null;
            } else {
                weakHashMap2.put(th2, (cf) weakHashMap2.get(cause2));
                h1Var = new h1(20);
            }
        }
        if (h1Var != null || (closeable = hf.c().f12043b) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (closeable = hf.c().f12043b; closeable != null; closeable = ((bf) closeable).f11290a) {
            arrayList.add(closeable);
        }
        UUID uuid = ((bf) ((yf) arrayList.get(0))).f11291b;
        if (uuid == null) {
            c50.w.l("Null rootTraceId");
            return;
        }
        ((yf) arrayList.get(0)).getClass();
        int size = arrayList.size();
        k30.d dVar = k30.h.f25901b;
        ex.i.m(size, "expectedSize");
        ex.i.m(size, "initialCapacity");
        Object[] objArrCopyOf = new Object[size];
        int size2 = arrayList.size();
        ex.i.m(size2, "expectedSize");
        ex.i.m(size2, "initialCapacity");
        Object[] objArrCopyOf2 = new Object[size2];
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        boolean z12 = false;
        for (yf yfVar : lx.u.L(arrayList)) {
            String str = ((bf) yfVar).f11293d;
            int iD = k30.a.d(objArrCopyOf2.length, i12 + 1);
            if (iD > objArrCopyOf2.length || z12) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iD);
                z12 = false;
            }
            int i13 = i12 + 1;
            objArrCopyOf2[i12] = str;
            sf sfVarD = yfVar.d();
            sfVarD.getClass();
            int iD2 = k30.a.d(objArrCopyOf.length, i11 + 1);
            if (iD2 > objArrCopyOf.length || z11) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iD2);
                z11 = false;
            }
            objArrCopyOf[i11] = sfVarD;
            i11++;
            i12 = i13;
        }
        WeakHashMap weakHashMap3 = f11421a;
        synchronized (weakHashMap3) {
            try {
                k30.x xVarJ = k30.h.j(i12, objArrCopyOf2);
                if (xVarJ == null) {
                    throw new NullPointerException("Null spansNames");
                }
                k30.x xVarJ2 = k30.h.j(i11, objArrCopyOf);
                if (xVarJ2 == null) {
                    throw new NullPointerException("Null extras");
                }
                weakHashMap3.put(th2, new cf(xVarJ, xVarJ2, uuid));
            } finally {
            }
        }
    }
}
