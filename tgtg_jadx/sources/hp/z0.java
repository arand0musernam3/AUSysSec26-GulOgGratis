package hp;

import com.app.tgtg.model.remote.RecipeId;
import com.app.tgtg.model.remote.RecipeId$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z0 f22338a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        z0 z0Var = new z0();
        f22338a = z0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.SaveRecipeResponse", z0Var, 2);
        e1Var.j("external_id", false);
        e1Var.j("status", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{RecipeId$$serializer.INSTANCE, r1.f29848a};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        String strM253unboximpl = null;
        String strU = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                RecipeId recipeId = (RecipeId) aVarC.n(serialDescriptor, 0, RecipeId$$serializer.INSTANCE, strM253unboximpl != null ? RecipeId.m245boximpl(strM253unboximpl) : null);
                strM253unboximpl = recipeId != null ? recipeId.m253unboximpl() : null;
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
        return new b1(i11, strM253unboximpl, strU);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        b1 b1Var = (b1) obj;
        encoder.getClass();
        b1Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.i(serialDescriptor, 0, RecipeId$$serializer.INSTANCE, RecipeId.m245boximpl(b1Var.f22256a));
        bVarC.q(serialDescriptor, 1, b1Var.f22257b);
        bVarC.b(serialDescriptor);
    }
}
