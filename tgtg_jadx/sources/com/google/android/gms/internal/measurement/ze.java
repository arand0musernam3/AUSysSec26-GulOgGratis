package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class ze extends o30.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zw.q2 f12091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f12092i;

    public ze(zw.q2 q2Var, int i11) {
        this.f12091h = q2Var;
        this.f12092i = i11;
    }

    @Override // o30.j
    public final void e() {
        AtomicLong atomicLong;
        long j9;
        int i11;
        int i12;
        boolean z11;
        zw.q2 q2Var = this.f12091h;
        this.f12091h = null;
        if (q2Var == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) q2Var.f48335c;
        do {
            atomicLong = (AtomicLong) q2Var.f48334b;
            j9 = atomicLong.get();
            i11 = (int) j9;
            long j11 = j9 >>> 32;
            if (i11 == Integer.MIN_VALUE) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(j9).length() + 13);
                sb2.append("Refcount is: ");
                sb2.append(j9);
                throw new AssertionError(sb2.toString());
            }
            i12 = (int) j11;
            z11 = i11 == -2147483647;
            if (z11) {
                i12++;
            }
        } while (!atomicLong.compareAndSet(j9, (((long) i12) << 32) | (4294967295L & ((long) (i11 - 1)))));
        if (z11) {
            while (true) {
                af afVar = (af) atomicReference.get();
                if (afVar != null) {
                    if (afVar.f11260h <= this.f12092i) {
                        afVar.cancel(true);
                        while (!atomicReference.compareAndSet(afVar, null)) {
                            if (atomicReference.get() != afVar) {
                                break;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // o30.j
    public final String l() {
        o30.a0 a0Var;
        zw.q2 q2Var = this.f12091h;
        if (q2Var == null || (a0Var = (o30.a0) ((tc) q2Var.f48333a).f11889b) == null) {
            return null;
        }
        String string = a0Var.toString();
        String strN = e0.f.n(new StringBuilder(string.length() + 11), "callable=[", string, "]");
        af afVar = (af) ((AtomicReference) this.f12091h.f48335c).get();
        if (afVar == null) {
            return strN;
        }
        int length = strN.length();
        String string2 = afVar.toString();
        return e0.f.o(new StringBuilder(string2.length() + length + 9 + 1), strN, ", trial=[", string2, "]");
    }
}
