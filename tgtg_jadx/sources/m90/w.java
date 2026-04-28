package m90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f29872a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f29873b = new i1("kotlin.time.Duration", k90.d.f26221r);

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        p80.c cVar = p80.d.f34559b;
        String strR = decoder.r();
        cVar.getClass();
        strR.getClass();
        try {
            long jE = p80.g.e(strR);
            if (p80.d.e(jE, p80.d.f34562e)) {
                throw new IllegalStateException("invariant failed");
            }
            return new p80.d(jE);
        } catch (IllegalArgumentException e5) {
            throw new IllegalArgumentException(w.a0.p("Invalid ISO duration string format: '", strR, "'."), e5);
        }
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29873b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j9 = ((p80.d) obj).f34563a;
        encoder.getClass();
        p80.c cVar = p80.d.f34559b;
        StringBuilder sb2 = new StringBuilder();
        if (j9 < 0) {
            sb2.append('-');
        }
        sb2.append("PT");
        long jL = j9 < 0 ? p80.d.l(j9) : j9;
        long j11 = p80.d.j(jL, p80.h.HOURS);
        boolean z11 = false;
        int iJ = p80.d.h(jL) ? 0 : (int) (p80.d.j(jL, p80.h.MINUTES) % ((long) 60));
        int iJ2 = p80.d.h(jL) ? 0 : (int) (p80.d.j(jL, p80.h.SECONDS) % ((long) 60));
        int iG = p80.d.g(jL);
        if (p80.d.h(j9)) {
            j11 = 9999999999999L;
        }
        boolean z12 = j11 != 0;
        boolean z13 = (iJ2 == 0 && iG == 0) ? false : true;
        if (iJ != 0 || (z13 && z12)) {
            z11 = true;
        }
        if (z12) {
            sb2.append(j11);
            sb2.append('H');
        }
        if (z11) {
            sb2.append(iJ);
            sb2.append('M');
        }
        if (z13 || (!z12 && !z11)) {
            p80.d.c(sb2, iJ2, iG, 9, "S", true);
        }
        encoder.D(sb2.toString());
    }
}
