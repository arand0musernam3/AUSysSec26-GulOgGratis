package y00;

import com.adyen.checkout.components.core.Address;
import java.math.BigInteger;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class o0 extends i0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f45021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f45022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f45024g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f45025h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f45026i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f45027j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f45028k;
    public List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f45029m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f45030n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f45031o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f45032p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f45033q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f45034r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f45035s;

    public o0(n1 n1Var, long j9, long j11, String str) {
        super(n1Var);
        this.f45034r = 0L;
        this.f45035s = null;
        this.f45027j = j9;
        this.f45028k = j11;
        this.f45030n = str;
    }

    @Override // y00.i0
    public final boolean s() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x025a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0254  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final y00.t4 t(java.lang.String r49) {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y00.o0.t(java.lang.String):y00.t4");
    }

    public final void u() {
        String str;
        p();
        n1 n1Var = (n1) this.f21216b;
        e1 e1Var = n1Var.f44986e;
        w0 w0Var = n1Var.f44987f;
        n1.k(e1Var);
        if (e1Var.w().i(a2.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            r4 r4Var = n1Var.f44990i;
            n1.k(r4Var);
            r4Var.p0().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            n1.m(w0Var);
            w0Var.f45266n.a("Analytics Storage consent is not granted");
            str = null;
        }
        n1.m(w0Var);
        w0Var.f45266n.a("Resetting session stitching token to ".concat(str == null ? Address.ADDRESS_NULL_PLACEHOLDER : "not null"));
        this.f45033q = str;
        n1Var.f44992k.getClass();
        this.f45034r = System.currentTimeMillis();
    }

    public final String v() {
        q();
        com.google.android.gms.common.internal.i0.h(this.f45021d);
        return this.f45021d;
    }

    public final String w() {
        p();
        q();
        com.google.android.gms.common.internal.i0.h(this.f45032p);
        return this.f45032p;
    }
}
