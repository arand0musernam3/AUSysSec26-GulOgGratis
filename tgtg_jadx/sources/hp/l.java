package hp;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f22299a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l lVar = new l();
        f22299a = lVar;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeGeneratorAsyncResponse", lVar, 5);
        e1Var.j("polling_id", false);
        e1Var.j("polling_interval_milliseconds", false);
        e1Var.j("user_status", false);
        e1Var.j("rate_limit_interval", false);
        e1Var.j("rate_limit_retry_after_seconds", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        m90.q0 q0Var = m90.q0.f29842a;
        return new KSerializer[]{r1Var, q0Var, r1Var, o30.f0.B(r1Var), o30.f0.B(q0Var)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        String strU = null;
        String strU2 = null;
        String str = null;
        Long l = null;
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
                jK = aVarC.k(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                strU2 = aVarC.u(serialDescriptor, 2);
                i11 |= 4;
            } else if (iW == 3) {
                str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    c50.w.e(iW);
                    return null;
                }
                l = (Long) aVarC.m(serialDescriptor, 4, m90.q0.f29842a, l);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new n(i11, strU, jK, strU2, str, l);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n nVar = (n) obj;
        encoder.getClass();
        nVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.q(serialDescriptor, 0, nVar.f22305a);
        bVarC.B(serialDescriptor, 1, nVar.f22306b);
        bVarC.q(serialDescriptor, 2, nVar.f22307c);
        bVarC.r(serialDescriptor, 3, r1.f29848a, nVar.f22308d);
        bVarC.r(serialDescriptor, 4, m90.q0.f29842a, nVar.f22309e);
        bVarC.b(serialDescriptor);
    }
}
