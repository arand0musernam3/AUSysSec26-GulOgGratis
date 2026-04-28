package hp;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f22332a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        w0 w0Var = new w0();
        f22332a = w0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.SaveRecipeRequest", w0Var, 1);
        e1Var.j("recipe", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{e.f22262a};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        g gVar = null;
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
                gVar = (g) aVarC.n(serialDescriptor, 0, e.f22262a, gVar);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new y0(i11, gVar);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y0 y0Var = (y0) obj;
        encoder.getClass();
        y0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.i(serialDescriptor, 0, e.f22262a, y0Var.f22336a);
        bVarC.b(serialDescriptor);
    }
}
