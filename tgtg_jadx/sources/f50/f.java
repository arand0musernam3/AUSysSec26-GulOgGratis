package f50;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.l0;
import m90.q0;
import m90.v;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f17346a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        f17346a = fVar;
        e1 e1Var = new e1("com.google.firebase.sessions.settings.SessionConfigs", fVar, 5);
        e1Var.j("sessionsEnabled", false);
        e1Var.j("sessionSamplingRate", false);
        e1Var.j("sessionTimeoutSeconds", false);
        e1Var.j("cacheDurationSeconds", false);
        e1Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f0.B(m90.g.f29797a);
        KSerializer kSerializerB2 = f0.B(v.f29868a);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{kSerializerB, kSerializerB2, f0.B(l0Var), f0.B(l0Var), f0.B(q0.f29842a)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        Boolean bool = null;
        Double d3 = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                bool = (Boolean) aVarC.m(serialDescriptor, 0, m90.g.f29797a, bool);
                i11 |= 1;
            } else if (iW == 1) {
                d3 = (Double) aVarC.m(serialDescriptor, 1, v.f29868a, d3);
                i11 |= 2;
            } else if (iW == 2) {
                num = (Integer) aVarC.m(serialDescriptor, 2, l0.f29821a, num);
                i11 |= 4;
            } else if (iW == 3) {
                num2 = (Integer) aVarC.m(serialDescriptor, 3, l0.f29821a, num2);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    w.e(iW);
                    return null;
                }
                l = (Long) aVarC.m(serialDescriptor, 4, q0.f29842a, l);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new h(i11, bool, d3, num, num2, l);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        h hVar = (h) obj;
        encoder.getClass();
        hVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.r(serialDescriptor, 0, m90.g.f29797a, hVar.f17347a);
        bVarC.r(serialDescriptor, 1, v.f29868a, hVar.f17348b);
        l0 l0Var = l0.f29821a;
        bVarC.r(serialDescriptor, 2, l0Var, hVar.f17349c);
        bVarC.r(serialDescriptor, 3, l0Var, hVar.f17350d);
        bVarC.r(serialDescriptor, 4, q0.f29842a, hVar.f17351e);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    public final KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
