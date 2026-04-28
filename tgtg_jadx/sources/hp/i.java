package hp;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f22288a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        f22288a = iVar;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeCurrentStatusResponse", iVar, 2);
        e1Var.j("max_number_of_recipes", false);
        e1Var.j("user_status", false);
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
                    c50.w.e(iW);
                    return null;
                }
                strU = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new k(i11, iQ, strU);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        k kVar = (k) obj;
        encoder.getClass();
        kVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.m(0, kVar.f22297a, serialDescriptor);
        bVarC.q(serialDescriptor, 1, kVar.f22298b);
        bVarC.b(serialDescriptor);
    }
}
