package x90;

import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ia0.g f44105a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44107c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f44111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44112h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44106b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44108d = 4096;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d[] f44109e = new d[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f44110f = 7;

    public f(ia0.g gVar) {
        this.f44105a = gVar;
    }

    public final void a(int i11) {
        int i12;
        if (i11 > 0) {
            int length = this.f44109e.length - 1;
            int i13 = 0;
            while (true) {
                i12 = this.f44110f;
                if (length < i12 || i11 <= 0) {
                    break;
                }
                d dVar = this.f44109e[length];
                dVar.getClass();
                i11 -= dVar.f44097c;
                int i14 = this.f44112h;
                d dVar2 = this.f44109e[length];
                dVar2.getClass();
                this.f44112h = i14 - dVar2.f44097c;
                this.f44111g--;
                i13++;
                length--;
            }
            d[] dVarArr = this.f44109e;
            int i15 = i12 + 1;
            System.arraycopy(dVarArr, i15, dVarArr, i15 + i13, this.f44111g);
            d[] dVarArr2 = this.f44109e;
            int i16 = this.f44110f + 1;
            Arrays.fill(dVarArr2, i16, i16 + i13, (Object) null);
            this.f44110f += i13;
        }
    }

    public final void b(d dVar) {
        int i11 = dVar.f44097c;
        int i12 = this.f44108d;
        if (i11 > i12) {
            d[] dVarArr = this.f44109e;
            kotlin.collections.x.m(dVarArr, 0, dVarArr.length, null);
            this.f44110f = this.f44109e.length - 1;
            this.f44111g = 0;
            this.f44112h = 0;
            return;
        }
        a((this.f44112h + i11) - i12);
        int i13 = this.f44111g + 1;
        d[] dVarArr2 = this.f44109e;
        if (i13 > dVarArr2.length) {
            d[] dVarArr3 = new d[dVarArr2.length * 2];
            System.arraycopy(dVarArr2, 0, dVarArr3, dVarArr2.length, dVarArr2.length);
            this.f44110f = this.f44109e.length - 1;
            this.f44109e = dVarArr3;
        }
        int i14 = this.f44110f;
        this.f44110f = i14 - 1;
        this.f44109e[i14] = dVar;
        this.f44111g++;
        this.f44112h += i11;
    }

    public final void c(ia0.j jVar) throws EOFException {
        jVar.getClass();
        int[] iArr = x.f44203a;
        int iE = jVar.e();
        long j9 = 0;
        long j11 = 0;
        for (int i11 = 0; i11 < iE; i11++) {
            byte bJ = jVar.j(i11);
            byte[] bArr = r90.e.f37811a;
            j11 += (long) x.f44204b[bJ & 255];
        }
        int i12 = (int) ((j11 + ((long) 7)) >> 3);
        int iE2 = jVar.e();
        ia0.g gVar = this.f44105a;
        if (i12 >= iE2) {
            e(jVar.e(), 127, 0);
            gVar.y0(jVar);
            return;
        }
        ia0.g gVar2 = new ia0.g();
        int[] iArr2 = x.f44203a;
        int iE3 = jVar.e();
        int i13 = 0;
        for (int i14 = 0; i14 < iE3; i14++) {
            byte bJ2 = jVar.j(i14);
            byte[] bArr2 = r90.e.f37811a;
            int i15 = bJ2 & 255;
            int i16 = x.f44203a[i15];
            byte b8 = x.f44204b[i15];
            j9 = (j9 << b8) | ((long) i16);
            i13 += b8;
            while (i13 >= 8) {
                i13 -= 8;
                gVar2.z0((int) (j9 >> i13));
            }
        }
        if (i13 > 0) {
            gVar2.z0((int) ((j9 << (8 - i13)) | (255 >>> i13)));
        }
        ia0.j jVarQ = gVar2.q(gVar2.f23643b);
        e(jVarQ.e(), 127, 128);
        gVar.y0(jVarQ);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x90.f.d(java.util.ArrayList):void");
    }

    public final void e(int i11, int i12, int i13) {
        ia0.g gVar = this.f44105a;
        if (i11 < i12) {
            gVar.z0(i11 | i13);
            return;
        }
        gVar.z0(i13 | i12);
        int i14 = i11 - i12;
        while (i14 >= 128) {
            gVar.z0(128 | (i14 & 127));
            i14 >>>= 7;
        }
        gVar.z0(i14);
    }
}
