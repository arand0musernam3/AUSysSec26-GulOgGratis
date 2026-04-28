package c50;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f7506a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c0 c0Var = new c0();
        f7506a = c0Var;
        m90.e1 e1Var = new m90.e1("com.google.firebase.sessions.ProcessData", c0Var, 2);
        e1Var.j("pid", false);
        e1Var.j("uuid", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{m90.l0.f29821a, r1.f29848a};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                iQ = aVarC.q(serialDescriptor, 0);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                strU = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new e0(i11, iQ, strU);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e0 e0Var = (e0) obj;
        encoder.getClass();
        e0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.m(0, e0Var.f7520a, serialDescriptor);
        bVarC.q(serialDescriptor, 1, e0Var.f7521b);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    public final KSerializer[] typeParametersSerializers() {
        return m90.c1.f29765b;
    }
}
