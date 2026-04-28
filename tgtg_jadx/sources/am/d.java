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
public final /* synthetic */ class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1608a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f1608a = dVar;
        e1 e1Var = new e1("com.app.tgtg.feature.logincharity.ui.email.navigation.NavigationLoginEmailCharity.CountryScreen", dVar, 1);
        e1Var.j("email", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r1.f29848a};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else {
                if (iW != 0) {
                    w.e(iW);
                    return null;
                }
                strU = aVarC.u(serialDescriptor, 0);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new f(i11, strU);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        encoder.getClass();
        fVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.q(serialDescriptor, 0, fVar.f1609b);
        bVarC.b(serialDescriptor);
    }
}
