package ia0;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt;
import org.bouncycastle.crypto.hpke.HPKE;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f23671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f23672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f23673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f23674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f23675e;

    public r(i iVar) {
        iVar.getClass();
        d0 d0Var = new d0(iVar);
        this.f23672b = d0Var;
        Inflater inflater = new Inflater(true);
        this.f23673c = inflater;
        this.f23674d = new t(d0Var, inflater);
        this.f23675e = new CRC32();
    }

    public static void a(int i11, int i12, String str) throws IOException {
        if (i12 == i11) {
            return;
        }
        StringBuilder sbR = e0.f.r(str, ": actual 0x");
        sbR.append(StringsKt.M(8, b.i(i12)));
        sbR.append(" != expected 0x");
        sbR.append(StringsKt.M(8, b.i(i11)));
        throw new IOException(sbR.toString());
    }

    @Override // ia0.j0
    public final long F(g gVar, long j9) throws IOException {
        r rVar = this;
        gVar.getClass();
        if (j9 < 0) {
            i4.a.i(e0.f.i(j9, "byteCount < 0: "));
            return 0L;
        }
        if (j9 == 0) {
            return 0L;
        }
        byte b8 = rVar.f23671a;
        CRC32 crc32 = rVar.f23675e;
        d0 d0Var = rVar.f23672b;
        if (b8 == 0) {
            d0Var.r0(10L);
            g gVar2 = d0Var.f23623b;
            byte bG = gVar2.G(3L);
            boolean z11 = ((bG >> 1) & 1) == 1;
            if (z11) {
                rVar.e(gVar2, 0L, 10L);
            }
            a(8075, d0Var.readShort(), "ID1ID2");
            d0Var.skip(8L);
            if (((bG >> 2) & 1) == 1) {
                d0Var.r0(2L);
                if (z11) {
                    e(gVar2, 0L, 2L);
                }
                long jZ = gVar2.Z() & HPKE.aead_EXPORT_ONLY;
                d0Var.r0(jZ);
                if (z11) {
                    e(gVar2, 0L, jZ);
                }
                d0Var.skip(jZ);
            }
            if (((bG >> 3) & 1) == 1) {
                long jY = d0Var.y((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jY == -1) {
                    i4.a.b();
                    return 0L;
                }
                if (z11) {
                    e(gVar2, 0L, jY + 1);
                }
                d0Var.skip(jY + 1);
            }
            if (((bG >> 4) & 1) == 1) {
                long jY2 = d0Var.y((byte) 0, 0L, LongCompanionObject.MAX_VALUE);
                if (jY2 == -1) {
                    i4.a.b();
                    return 0L;
                }
                if (z11) {
                    rVar = this;
                    rVar.e(gVar2, 0L, jY2 + 1);
                } else {
                    rVar = this;
                }
                d0Var.skip(jY2 + 1);
            } else {
                rVar = this;
            }
            if (z11) {
                a(d0Var.u(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            rVar.f23671a = (byte) 1;
        }
        if (rVar.f23671a == 1) {
            long j11 = gVar.f23643b;
            long jF = rVar.f23674d.F(gVar, j9);
            if (jF != -1) {
                rVar.e(gVar, j11, jF);
                return jF;
            }
            rVar.f23671a = (byte) 2;
        }
        if (rVar.f23671a == 2) {
            a(d0Var.r(), (int) crc32.getValue(), "CRC");
            a(d0Var.r(), (int) rVar.f23673c.getBytesWritten(), "ISIZE");
            rVar.f23671a = (byte) 3;
            if (!d0Var.a()) {
                i4.a.k("gzip finished without exhausting source");
                return 0L;
            }
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f23674d.close();
    }

    public final void e(g gVar, long j9, long j11) {
        e0 e0Var = gVar.f23642a;
        e0Var.getClass();
        while (true) {
            int i11 = e0Var.f23627c;
            int i12 = e0Var.f23626b;
            if (j9 < i11 - i12) {
                break;
            }
            j9 -= (long) (i11 - i12);
            e0Var = e0Var.f23630f;
            e0Var.getClass();
        }
        while (j11 > 0) {
            int i13 = (int) (((long) e0Var.f23626b) + j9);
            int iMin = (int) Math.min(e0Var.f23627c - i13, j11);
            this.f23675e.update(e0Var.f23625a, i13, iMin);
            j11 -= (long) iMin;
            e0Var = e0Var.f23630f;
            e0Var.getClass();
            j9 = 0;
        }
    }

    @Override // ia0.j0
    public final l0 i() {
        return this.f23672b.f23622a.i();
    }
}
