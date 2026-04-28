package c50;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f7589a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j0 j0Var = new j0();
        f7589a = j0Var;
        m90.e1 e1Var = new m90.e1("com.google.firebase.sessions.SessionData", j0Var, 3);
        e1Var.j("sessionDetails", false);
        e1Var.j("backgroundTime", true);
        e1Var.j("processDataMap", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o0.f7610a, o30.f0.B(h1.f7573a), o30.f0.B(l0.f7598d[2])};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = l0.f7598d;
        q0 q0Var = null;
        boolean z11 = true;
        int i11 = 0;
        j1 j1Var = null;
        Map map = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                q0Var = (q0) aVarC.n(serialDescriptor, 0, o0.f7610a, q0Var);
                i11 |= 1;
            } else if (iW == 1) {
                j1Var = (j1) aVarC.m(serialDescriptor, 1, h1.f7573a, j1Var);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                map = (Map) aVarC.m(serialDescriptor, 2, kSerializerArr[2], map);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new l0(i11, q0Var, j1Var, map);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l0 l0Var = (l0) obj;
        encoder.getClass();
        l0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        KSerializer[] kSerializerArr = l0.f7598d;
        o0 o0Var = o0.f7610a;
        q0 q0Var = l0Var.f7599a;
        Map map = l0Var.f7601c;
        j1 j1Var = l0Var.f7600b;
        bVarC.i(serialDescriptor, 0, o0Var, q0Var);
        if (bVarC.C(serialDescriptor) || j1Var != null) {
            bVarC.r(serialDescriptor, 1, h1.f7573a, j1Var);
        }
        if (bVarC.C(serialDescriptor) || map != null) {
            bVarC.r(serialDescriptor, 2, kSerializerArr[2], map);
        }
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    public final KSerializer[] typeParametersSerializers() {
        return m90.c1.f29765b;
    }
}
