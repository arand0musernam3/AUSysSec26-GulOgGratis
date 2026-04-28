package hp;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c1 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c1 f22261a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        c1 c1Var = new c1();
        f22261a = c1Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.SavedRecipeListResponse", c1Var, 2);
        e1Var.j("max_number_of_recipes", false);
        e1Var.j("recipes", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{m90.l0.f29821a, e1.f22269c[1].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = e1.f22269c;
        List list = null;
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
                list = (List) aVarC.n(serialDescriptor, 1, (i90.b) jVarArr[1].getValue(), list);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new e1(list, i11, iQ);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        e1 e1Var = (e1) obj;
        encoder.getClass();
        e1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = e1.f22269c;
        bVarC.m(0, e1Var.f22270a, serialDescriptor);
        bVarC.i(serialDescriptor, 1, (KSerializer) jVarArr[1].getValue(), e1Var.f22271b);
        bVarC.b(serialDescriptor);
    }
}
