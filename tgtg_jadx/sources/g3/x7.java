package g3;

import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f19777a = 16;

    public static w7 a(long j9, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, long j24, long j25, long j26, m3.n nVar, int i11) {
        return new w7(j9, j11, (i11 & 4) != 0 ? i4.v.f23314g : j12, (i11 & 8) != 0 ? r0.e(l3.y0.f27249p, nVar) : j13, j14, j15, j16, (i11 & 128) != 0 ? r0.e(l3.y0.f27256w, nVar) : j17, (i11 & 256) != 0 ? i4.g0.k(i4.v.b(l3.y0.f27236b, r0.e(l3.y0.f27235a, nVar)), ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p) : j18, (i11 & 512) != 0 ? i4.g0.k(i4.v.b(l3.y0.f27240f, r0.e(l3.y0.f27239e, nVar)), ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p) : j19, (i11 & 1024) != 0 ? i4.v.f23314g : j21, (i11 & NewHope.SENDB_BYTES) != 0 ? i4.g0.k(i4.v.b(l3.y0.f27238d, r0.e(l3.y0.f27237c, nVar)), ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p) : j22, (i11 & 4096) != 0 ? i4.g0.k(i4.v.b(l3.y0.f27242h, r0.e(l3.y0.f27241g, nVar)), ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p) : j23, (i11 & 8192) != 0 ? i4.g0.k(i4.v.b(l3.y0.f27240f, r0.e(l3.y0.f27245k, nVar)), ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p) : j24, (i11 & BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE) != 0 ? i4.g0.k(i4.v.b(l3.y0.f27240f, r0.e(l3.y0.l, nVar)), ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p) : j25, (i11 & 32768) != 0 ? i4.g0.k(i4.v.b(l3.y0.f27244j, r0.e(l3.y0.f27243i, nVar)), ((p0) ((m3.s) nVar).j(r0.f19375a)).f19281p) : j26);
    }
}
