package m90;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f29808a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i1 f29809b = new i1("kotlin.time.Instant", k90.d.f26221r);

    /* JADX WARN: Removed duplicated region for block: B:195:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e4 A[PHI: r3
      0x00e4: PHI (r3v22 f6.p) = (r3v4 f6.p), (r3v6 f6.p), (r3v8 f6.p), (r3v10 f6.p), (r3v12 f6.p) binds: [B:39:0x00e2, B:42:0x00f4, B:45:0x0104, B:48:0x0116, B:51:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // i90.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder r23) {
        /*
            Method dump skipped, instruction units count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m90.i0.deserialize(kotlinx.serialization.encoding.Decoder):java.lang.Object");
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return f29809b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        p80.l lVar = (p80.l) obj;
        encoder.getClass();
        lVar.getClass();
        encoder.D(lVar.toString());
    }
}
