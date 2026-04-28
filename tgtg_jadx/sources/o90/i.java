package o90;

import kotlin.text.c0;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends m0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.w f32169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i2.x f32170e;

    public i(i0.w wVar, n90.c cVar) {
        cVar.getClass();
        this.f32169d = wVar;
        this.f32170e = cVar.f30750b;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final byte A() {
        i0.w wVar = this.f32169d;
        String strQ = wVar.q();
        try {
            return c0.d(strQ);
        } catch (IllegalArgumentException unused) {
            i0.w.t(wVar, e0.f.g('\'', "Failed to parse type 'UByte' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final short B() {
        i0.w wVar = this.f32169d;
        String strQ = wVar.q();
        try {
            return c0.i(strQ);
        } catch (IllegalArgumentException unused) {
            i0.w.t(wVar, e0.f.g('\'', "Failed to parse type 'UShort' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, l90.a
    public final i2.x a() {
        return this.f32170e;
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final int p() {
        i0.w wVar = this.f32169d;
        String strQ = wVar.q();
        try {
            return c0.e(strQ);
        } catch (IllegalArgumentException unused) {
            i0.w.t(wVar, e0.f.g('\'', "Failed to parse type 'UInt' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // m0.c, kotlinx.serialization.encoding.Decoder
    public final long s() {
        i0.w wVar = this.f32169d;
        String strQ = wVar.q();
        try {
            return c0.g(strQ);
        } catch (IllegalArgumentException unused) {
            i0.w.t(wVar, e0.f.g('\'', "Failed to parse type 'ULong' for input '", strQ), 0, null, 6);
            throw null;
        }
    }

    @Override // l90.a
    public final int w(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        throw new IllegalStateException("unsupported");
    }
}
