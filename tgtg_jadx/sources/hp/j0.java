package hp;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j0 f22295a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j0 j0Var = new j0();
        f22295a = j0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeGeneratorUploadResponse", j0Var, 1);
        e1Var.j("urls", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{l0.f22300b[0].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = l0.f22300b;
        List list = null;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else {
                if (iW != 0) {
                    c50.w.e(iW);
                    return null;
                }
                list = (List) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), list);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new l0(i11, list);
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
        bVarC.i(serialDescriptor, 0, (KSerializer) l0.f22300b[0].getValue(), l0Var.f22301a);
        bVarC.b(serialDescriptor);
    }
}
