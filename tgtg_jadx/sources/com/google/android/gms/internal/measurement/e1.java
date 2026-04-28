package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f11356c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o2 f11357a = new o2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f11358b;

    static {
        new e1(0);
    }

    public e1(int i11) {
        a();
        a();
    }

    public static void b(b1 b1Var, z2 z2Var, int i11, Object obj) {
        if (z2Var == z2.zzj) {
            b1Var.d(i11, 3);
            ((k1) ((n0) obj)).f(b1Var);
            b1Var.d(i11, 4);
            return;
        }
        b1Var.d(i11, z2Var.c());
        a3 a3Var = a3.zza;
        switch (z2Var.ordinal()) {
            case 0:
                b1Var.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                b1Var.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                b1Var.t(((Long) obj).longValue());
                break;
            case 3:
                b1Var.t(((Long) obj).longValue());
                break;
            case 4:
                b1Var.q(((Integer) obj).intValue());
                break;
            case 5:
                b1Var.u(((Long) obj).longValue());
                break;
            case 6:
                b1Var.s(((Integer) obj).intValue());
                break;
            case 7:
                b1Var.p(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof u0)) {
                    b1Var.v((String) obj);
                } else {
                    b1Var.m((u0) obj);
                }
                break;
            case 9:
                ((k1) ((n0) obj)).f(b1Var);
                break;
            case 10:
                b1Var.o((n0) obj);
                break;
            case 11:
                if (!(obj instanceof u0)) {
                    byte[] bArr = (byte[]) obj;
                    b1Var.n(bArr.length, bArr);
                } else {
                    b1Var.m((u0) obj);
                }
                break;
            case 12:
                b1Var.r(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof m1)) {
                    b1Var.q(((Integer) obj).intValue());
                } else {
                    b1Var.q(((m1) obj).a());
                }
                break;
            case 14:
                b1Var.s(((Integer) obj).intValue());
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                b1Var.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                b1Var.r((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                b1Var.t((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public final void a() {
        if (this.f11358b) {
            return;
        }
        o2 o2Var = this.f11357a;
        int i11 = o2Var.f11684b;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = o2Var.a(i12).f11742b;
            if (obj instanceof k1) {
                k1 k1Var = (k1) obj;
                j2.f11503c.a(k1Var.getClass()).f(k1Var);
                k1Var.h();
            }
        }
        Iterator it = o2Var.b().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof k1) {
                k1 k1Var2 = (k1) value;
                j2.f11503c.a(k1Var2.getClass()).f(k1Var2);
                k1Var2.h();
            }
        }
        if (!o2Var.f11686d) {
            if (o2Var.f11684b > 0) {
                o2Var.a(0).f11741a.getClass();
                org.bouncycastle.jce.provider.a.c();
                return;
            } else {
                Iterator it2 = o2Var.b().iterator();
                if (it2.hasNext()) {
                    ((Map.Entry) it2.next()).getKey().getClass();
                    org.bouncycastle.jce.provider.a.c();
                    return;
                }
            }
        }
        if (!o2Var.f11686d) {
            o2Var.f11685c = o2Var.f11685c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o2Var.f11685c);
            o2Var.f11688f = o2Var.f11688f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(o2Var.f11688f);
            o2Var.f11686d = true;
        }
        this.f11358b = true;
    }

    public final Object clone() {
        e1 e1Var = new e1();
        o2 o2Var = this.f11357a;
        if (o2Var.f11684b > 0) {
            o2Var.a(0).f11741a.getClass();
            org.bouncycastle.jce.provider.a.c();
            return null;
        }
        Iterator it = o2Var.b().iterator();
        if (!it.hasNext()) {
            return e1Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            org.bouncycastle.jce.provider.a.c();
            return null;
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e1) {
            return this.f11357a.equals(((e1) obj).f11357a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f11357a.hashCode();
    }

    public e1() {
    }
}
