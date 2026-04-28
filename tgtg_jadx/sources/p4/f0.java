package p4;

import kotlin.jvm.functions.Function0;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f34306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f34307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f34309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f34310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k1 f34311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i4.o f34312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k1 f34313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f34314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f34315k;
    public float l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e0 f34316m;

    public f0(c cVar) {
        this.f34306b = cVar;
        cVar.f34261i = new e0(this, 0);
        this.f34307c = "";
        this.f34308d = true;
        this.f34309e = new a();
        this.f34310f = g.f34318c;
        this.f34311g = m3.i.w(null);
        this.f34313i = m3.i.w(new h4.e(0L));
        this.f34314j = 9205357640488583168L;
        this.f34315k = 1.0f;
        this.l = 1.0f;
        this.f34316m = new e0(this, 1);
    }

    @Override // p4.d0
    public final void a(k4.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(k4.d r33, float r34, i4.w r35) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.f0.e(k4.d, float, i4.w):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f34307c);
        sb2.append("\n\tviewportWidth: ");
        k1 k1Var = this.f34313i;
        sb2.append(Float.intBitsToFloat((int) (((h4.e) k1Var.getValue()).f21392a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((h4.e) k1Var.getValue()).f21392a & 4294967295L)));
        sb2.append("\n");
        return sb2.toString();
    }
}
