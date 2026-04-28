package qb;

import androidx.work.OverwritingInputMerger;
import ib.d0;
import ib.g0;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f36827z = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g0 f36829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f36831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ib.h f36832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ib.h f36833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f36834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f36835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f36836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ib.e f36837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f36838k;
    public final ib.a l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f36839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f36840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f36841o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f36842p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f36843q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f36844r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f36845s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f36846t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f36847u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f36848v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f36849w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f36850x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Boolean f36851y;

    static {
        ib.w.f("WorkSpec");
    }

    public /* synthetic */ o(String str, g0 g0Var, String str2, String str3, ib.h hVar, ib.h hVar2, long j9, long j11, long j12, ib.e eVar, int i11, ib.a aVar, long j13, long j14, long j15, long j16, boolean z11, d0 d0Var, int i12, long j17, int i13, int i14, String str4, Boolean bool, int i15) {
        this(str, (i15 & 2) != 0 ? g0.ENQUEUED : g0Var, str2, (i15 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i15 & 16) != 0 ? ib.h.f23726b : hVar, (i15 & 32) != 0 ? ib.h.f23726b : hVar2, (i15 & 64) != 0 ? 0L : j9, (i15 & 128) != 0 ? 0L : j11, (i15 & 256) != 0 ? 0L : j12, (i15 & 512) != 0 ? ib.e.f23710j : eVar, (i15 & 1024) != 0 ? 0 : i11, (i15 & NewHope.SENDB_BYTES) != 0 ? ib.a.EXPONENTIAL : aVar, (i15 & 4096) != 0 ? 30000L : j13, (i15 & 8192) != 0 ? -1L : j14, (i15 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) == 0 ? j15 : 0L, (32768 & i15) != 0 ? -1L : j16, (65536 & i15) != 0 ? false : z11, (131072 & i15) != 0 ? d0.RUN_AS_NON_EXPEDITED_WORK_REQUEST : d0Var, (262144 & i15) != 0 ? 0 : i12, 0, (1048576 & i15) != 0 ? Long.MAX_VALUE : j17, (2097152 & i15) != 0 ? 0 : i13, (4194304 & i15) != 0 ? -256 : i14, (8388608 & i15) != 0 ? null : str4, (i15 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static o b(o oVar, String str, g0 g0Var, ib.h hVar, int i11, long j9, int i12, int i13, long j11, int i14, int i15) {
        String str2 = (i15 & 1) != 0 ? oVar.f36828a : str;
        g0 g0Var2 = (i15 & 2) != 0 ? oVar.f36829b : g0Var;
        String str3 = (i15 & 4) != 0 ? oVar.f36830c : "androidx.work.multiprocess.RemoteListenableDelegatingWorker";
        String str4 = oVar.f36831d;
        ib.h hVar2 = (i15 & 16) != 0 ? oVar.f36832e : hVar;
        ib.h hVar3 = oVar.f36833f;
        long j12 = oVar.f36834g;
        long j13 = oVar.f36835h;
        long j14 = oVar.f36836i;
        ib.e eVar = oVar.f36837j;
        int i16 = (i15 & 1024) != 0 ? oVar.f36838k : i11;
        ib.a aVar = oVar.l;
        long j15 = oVar.f36839m;
        long j16 = (i15 & 8192) != 0 ? oVar.f36840n : j9;
        long j17 = oVar.f36841o;
        long j18 = oVar.f36842p;
        boolean z11 = oVar.f36843q;
        d0 d0Var = oVar.f36844r;
        int i17 = (i15 & 262144) != 0 ? oVar.f36845s : i12;
        int i18 = (i15 & 524288) != 0 ? oVar.f36846t : i13;
        long j19 = (i15 & 1048576) != 0 ? oVar.f36847u : j11;
        int i19 = (i15 & 2097152) != 0 ? oVar.f36848v : i14;
        int i21 = oVar.f36849w;
        String str5 = oVar.f36850x;
        Boolean bool = oVar.f36851y;
        oVar.getClass();
        str2.getClass();
        g0Var2.getClass();
        str3.getClass();
        str4.getClass();
        hVar2.getClass();
        hVar3.getClass();
        eVar.getClass();
        aVar.getClass();
        d0Var.getClass();
        return new o(str2, g0Var2, str3, str4, hVar2, hVar3, j12, j13, j14, eVar, i16, aVar, j15, j16, j17, j18, z11, d0Var, i17, i18, j19, i19, i21, str5, bool);
    }

    public final long a() {
        return w0.e.k(this.f36829b == g0.ENQUEUED && this.f36838k > 0, this.f36838k, this.l, this.f36839m, this.f36840n, this.f36845s, c(), this.f36834g, this.f36836i, this.f36835h, this.f36847u);
    }

    public final boolean c() {
        return this.f36835h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f36828a, oVar.f36828a) && this.f36829b == oVar.f36829b && Intrinsics.areEqual(this.f36830c, oVar.f36830c) && Intrinsics.areEqual(this.f36831d, oVar.f36831d) && Intrinsics.areEqual(this.f36832e, oVar.f36832e) && Intrinsics.areEqual(this.f36833f, oVar.f36833f) && this.f36834g == oVar.f36834g && this.f36835h == oVar.f36835h && this.f36836i == oVar.f36836i && Intrinsics.areEqual(this.f36837j, oVar.f36837j) && this.f36838k == oVar.f36838k && this.l == oVar.l && this.f36839m == oVar.f36839m && this.f36840n == oVar.f36840n && this.f36841o == oVar.f36841o && this.f36842p == oVar.f36842p && this.f36843q == oVar.f36843q && this.f36844r == oVar.f36844r && this.f36845s == oVar.f36845s && this.f36846t == oVar.f36846t && this.f36847u == oVar.f36847u && this.f36848v == oVar.f36848v && this.f36849w == oVar.f36849w && Intrinsics.areEqual(this.f36850x, oVar.f36850x) && Intrinsics.areEqual(this.f36851y, oVar.f36851y);
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f36849w, r8.k.b(this.f36848v, e0.f.b(r8.k.b(this.f36846t, r8.k.b(this.f36845s, (this.f36844r.hashCode() + r8.k.e(e0.f.b(e0.f.b(e0.f.b(e0.f.b((this.l.hashCode() + r8.k.b(this.f36838k, (this.f36837j.hashCode() + e0.f.b(e0.f.b(e0.f.b((this.f36833f.hashCode() + ((this.f36832e.hashCode() + l1.b(l1.b((this.f36829b.hashCode() + (this.f36828a.hashCode() * 31)) * 31, 31, this.f36830c), 31, this.f36831d)) * 31)) * 31, 31, this.f36834g), 31, this.f36835h), 31, this.f36836i)) * 31, 31)) * 31, 31, this.f36839m), 31, this.f36840n), 31, this.f36841o), 31, this.f36842p), 31, this.f36843q)) * 31, 31), 31), 31, this.f36847u), 31), 31);
        String str = this.f36850x;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f36851y;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return l1.f(new StringBuilder("{WorkSpec: "), this.f36828a, '}');
    }

    public o(String str, g0 g0Var, String str2, String str3, ib.h hVar, ib.h hVar2, long j9, long j11, long j12, ib.e eVar, int i11, ib.a aVar, long j13, long j14, long j15, long j16, boolean z11, d0 d0Var, int i12, int i13, long j17, int i14, int i15, String str4, Boolean bool) {
        str.getClass();
        g0Var.getClass();
        str2.getClass();
        str3.getClass();
        hVar.getClass();
        hVar2.getClass();
        eVar.getClass();
        aVar.getClass();
        d0Var.getClass();
        this.f36828a = str;
        this.f36829b = g0Var;
        this.f36830c = str2;
        this.f36831d = str3;
        this.f36832e = hVar;
        this.f36833f = hVar2;
        this.f36834g = j9;
        this.f36835h = j11;
        this.f36836i = j12;
        this.f36837j = eVar;
        this.f36838k = i11;
        this.l = aVar;
        this.f36839m = j13;
        this.f36840n = j14;
        this.f36841o = j15;
        this.f36842p = j16;
        this.f36843q = z11;
        this.f36844r = d0Var;
        this.f36845s = i12;
        this.f36846t = i13;
        this.f36847u = j17;
        this.f36848v = i14;
        this.f36849w = i15;
        this.f36850x = str4;
        this.f36851y = bool;
    }
}
