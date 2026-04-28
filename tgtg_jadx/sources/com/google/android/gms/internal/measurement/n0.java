package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n0 {
    protected transient int zza;

    public static void d(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof v1) {
            List listA = ((v1) iterable).a();
            if (list != null) {
                org.bouncycastle.jce.provider.a.c();
                return;
            }
            list.size();
            Iterator it = listA.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof u0) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                u0.j(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof i2) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof k2) {
                k2 k2Var = (k2) list;
                int i11 = k2Var.f11557c + size;
                int length = k2Var.f11556b.length;
                if (i11 > length) {
                    if (length != 0) {
                        while (length < i11) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        k2Var.f11556b = Arrays.copyOf(k2Var.f11556b, length);
                    } else {
                        k2Var.f11556b = new Object[Math.max(i11, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    i1.a(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj2 = list2.get(i12);
            if (obj2 == null) {
                i1.a(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    public final byte[] a() {
        try {
            k1 k1Var = (k1) this;
            int iM = k1Var.m();
            byte[] bArr = new byte[iM];
            boolean z11 = b1.f11268b;
            y0 y0Var = new y0(bArr, iM);
            k1Var.f(y0Var);
            if (y0Var.x() > 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (y0Var.x() >= 0) {
                return bArr;
            }
            throw new IllegalStateException("Wrote more data than expected.");
        } catch (IOException e5) {
            String name = getClass().getName();
            a40.d0.o(e0.f.n(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e5);
            return null;
        }
    }

    public final void b(OutputStream outputStream) {
        k1 k1Var = (k1) this;
        int iM = k1Var.m();
        boolean z11 = b1.f11268b;
        if (iM > 4096) {
            iM = 4096;
        }
        z0 z0Var = new z0(outputStream, iM);
        k1Var.f(z0Var);
        if (z0Var.f12076e > 0) {
            z0Var.B();
        }
    }

    public abstract int c(m2 m2Var);
}
