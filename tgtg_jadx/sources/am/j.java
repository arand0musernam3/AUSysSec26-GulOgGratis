package am;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f1612a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f1612a = jVar;
        e1 e1Var = new e1("com.app.tgtg.feature.logincharity.ui.email.navigation.NavigationLoginEmailCharity.VerifyEmailScreen", jVar, 2);
        e1Var.j("email", false);
        e1Var.j("pollingId", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        boolean z11 = true;
        int i11 = 0;
        String strU2 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                strU2 = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new l(i11, strU, strU2);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        encoder.getClass();
        lVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.q(serialDescriptor, 0, lVar.f1613b);
        bVarC.q(serialDescriptor, 1, lVar.f1614c);
        bVarC.b(serialDescriptor);
    }
}
