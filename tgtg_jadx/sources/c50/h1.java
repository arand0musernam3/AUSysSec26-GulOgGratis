package c50;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f7573a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        h1 h1Var = new h1();
        f7573a = h1Var;
        m90.e1 e1Var = new m90.e1("com.google.firebase.sessions.Time", h1Var, 3);
        e1Var.j("ms", false);
        e1Var.j("us", true);
        e1Var.j("seconds", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        m90.q0 q0Var = m90.q0.f29842a;
        return new KSerializer[]{q0Var, q0Var, q0Var};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        long jK = 0;
        long jK2 = 0;
        long jK3 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                jK = aVarC.k(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                jK2 = aVarC.k(serialDescriptor, 1);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                jK3 = aVarC.k(serialDescriptor, 2);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new j1(i11, jK, jK2, jK3);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        j1 j1Var = (j1) obj;
        encoder.getClass();
        j1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        long j9 = j1Var.f7590a;
        long j11 = j1Var.f7592c;
        long j12 = j1Var.f7591b;
        bVarC.B(serialDescriptor, 0, j9);
        if (bVarC.C(serialDescriptor) || j12 != ((long) 1000) * j9) {
            bVarC.B(serialDescriptor, 1, j12);
        }
        if (bVarC.C(serialDescriptor) || j11 != j9 / ((long) 1000)) {
            bVarC.B(serialDescriptor, 2, j11);
        }
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    public final KSerializer[] typeParametersSerializers() {
        return m90.c1.f29765b;
    }
}
