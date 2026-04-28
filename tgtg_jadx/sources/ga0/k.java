package ga0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.h f20327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f20328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f20331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ia0.g f20332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ia0.g f20333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f20334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f20335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f20336j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ia0.f f20337k;

    public k(ia0.h hVar, Random random, boolean z11, boolean z12, long j9) {
        hVar.getClass();
        this.f20327a = hVar;
        this.f20328b = random;
        this.f20329c = z11;
        this.f20330d = z12;
        this.f20331e = j9;
        this.f20332f = new ia0.g();
        this.f20333g = hVar.h();
        this.f20336j = new byte[4];
        this.f20337k = new ia0.f();
    }

    public final void a(int i11, ia0.j jVar) throws IOException {
        if (this.f20334h) {
            i4.a.k("closed");
            return;
        }
        int iE = jVar.e();
        if (iE > 125) {
            i4.a.f("Payload size must be less than or equal to 125");
            return;
        }
        ia0.g gVar = this.f20333g;
        gVar.z0(i11 | 128);
        gVar.z0(iE | 128);
        byte[] bArr = this.f20336j;
        bArr.getClass();
        this.f20328b.nextBytes(bArr);
        gVar.write(bArr, 0, bArr.length);
        if (iE > 0) {
            long j9 = gVar.f23643b;
            gVar.y0(jVar);
            ia0.f fVar = this.f20337k;
            fVar.getClass();
            gVar.L(fVar);
            fVar.e(j9);
            android.support.v4.media.session.a.O(fVar, bArr);
            fVar.close();
        }
        this.f20327a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.f20335i;
        if (aVar != null) {
            r90.e.b(aVar);
        }
        r90.e.b(this.f20327a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(ia0.j r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ga0.k.e(ia0.j):void");
    }
}
