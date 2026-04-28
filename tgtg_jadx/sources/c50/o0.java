package c50;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o0 f7610a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        o0 o0Var = new o0();
        f7610a = o0Var;
        m90.e1 e1Var = new m90.e1("com.google.firebase.sessions.SessionDetails", o0Var, 4);
        e1Var.j("sessionId", false);
        e1Var.j("firstSessionId", false);
        e1Var.j("sessionIndex", false);
        e1Var.j("sessionStartTimestampUs", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, m90.l0.f29821a, m90.q0.f29842a};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        int iQ = 0;
        String strU = null;
        String strU2 = null;
        long jK = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                strU2 = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                iQ = aVarC.q(serialDescriptor, 2);
                i11 |= 4;
            } else {
                if (iW != 3) {
                    w.e(iW);
                    return null;
                }
                jK = aVarC.k(serialDescriptor, 3);
                i11 |= 8;
            }
        }
        aVarC.b(serialDescriptor);
        return new q0(i11, strU, strU2, iQ, jK);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q0 q0Var = (q0) obj;
        encoder.getClass();
        q0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.q(serialDescriptor, 0, q0Var.f7613a);
        bVarC.q(serialDescriptor, 1, q0Var.f7614b);
        bVarC.m(2, q0Var.f7615c, serialDescriptor);
        bVarC.B(serialDescriptor, 3, q0Var.f7616d);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    public final KSerializer[] typeParametersSerializers() {
        return m90.c1.f29765b;
    }
}
