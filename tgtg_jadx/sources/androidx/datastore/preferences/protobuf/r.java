package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.bouncycastle.iana.AEADAlgorithm;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f3044c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1 f3045a = c1.g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3046b;

    static {
        new r(0);
    }

    public r(int i11) {
        a();
        a();
    }

    public static void b(l lVar, v1 v1Var, int i11, Object obj) {
        if (v1Var == v1.GROUP) {
            lVar.B(i11, 3);
            ((a) obj).b(lVar);
            lVar.B(i11, 4);
        }
        lVar.B(i11, v1Var.c());
        switch (q.f3028b[v1Var.ordinal()]) {
            case 1:
                lVar.u(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                lVar.s(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                lVar.F(((Long) obj).longValue());
                break;
            case 4:
                lVar.F(((Long) obj).longValue());
                break;
            case 5:
                lVar.w(((Integer) obj).intValue());
                break;
            case 6:
                lVar.u(((Long) obj).longValue());
                break;
            case 7:
                lVar.s(((Integer) obj).intValue());
                break;
            case 8:
                lVar.m(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((a) obj).b(lVar);
                break;
            case 10:
                a aVar = (a) obj;
                lVar.getClass();
                lVar.D(((z) aVar).a(null));
                aVar.b(lVar);
                break;
            case 11:
                if (!(obj instanceof f)) {
                    lVar.A((String) obj);
                } else {
                    lVar.q((f) obj);
                }
                break;
            case 12:
                if (!(obj instanceof f)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    lVar.D(length);
                    lVar.n(bArr, 0, length);
                } else {
                    lVar.q((f) obj);
                }
                break;
            case 13:
                lVar.D(((Integer) obj).intValue());
                break;
            case 14:
                lVar.s(((Integer) obj).intValue());
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                lVar.u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                lVar.D((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                lVar.F((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            case 18:
                lVar.w(((Integer) obj).intValue());
                break;
        }
    }

    public final void a() {
        if (this.f3046b) {
            return;
        }
        c1 c1Var = this.f3045a;
        int size = c1Var.f2940a.size();
        for (int i11 = 0; i11 < size; i11++) {
            Map.Entry entryD = c1Var.d(i11);
            if (entryD.getValue() instanceof z) {
                z zVar = (z) entryD.getValue();
                zVar.getClass();
                x0 x0Var = x0.f3059c;
                x0Var.getClass();
                x0Var.a(zVar.getClass()).c(zVar);
                zVar.h();
            }
        }
        if (!c1Var.f2942c) {
            if (c1Var.f2940a.size() > 0) {
                c1Var.d(0).getKey().getClass();
                org.bouncycastle.jce.provider.a.c();
                return;
            } else {
                Iterator it = c1Var.e().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    org.bouncycastle.jce.provider.a.c();
                    return;
                }
            }
        }
        if (!c1Var.f2942c) {
            c1Var.f2941b = c1Var.f2941b.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1Var.f2941b);
            c1Var.f2944e = c1Var.f2944e.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1Var.f2944e);
            c1Var.f2942c = true;
        }
        this.f3046b = true;
    }

    public final Object clone() {
        r rVar = new r();
        c1 c1Var = this.f3045a;
        if (c1Var.f2940a.size() > 0) {
            Map.Entry entryD = c1Var.d(0);
            if (entryD.getKey() != null) {
                org.bouncycastle.jce.provider.a.c();
                return null;
            }
            entryD.getValue();
            throw null;
        }
        Iterator it = c1Var.e().iterator();
        if (!it.hasNext()) {
            return rVar;
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
        if (obj instanceof r) {
            return this.f3045a.equals(((r) obj).f3045a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3045a.hashCode();
    }

    public r() {
    }
}
