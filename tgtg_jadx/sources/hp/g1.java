package hp;

import com.app.tgtg.model.remote.RecipeId;
import com.app.tgtg.model.remote.RecipeId$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g1 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f22287a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g1 g1Var = new g1();
        f22287a = g1Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.ShareRecipeRequest", g1Var, 2);
        e1Var.j("recipe", true);
        e1Var.j("external_recipe_id", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o30.f0.B(e.f22262a), o30.f0.B(RecipeId$$serializer.INSTANCE)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        g gVar = null;
        String strM253unboximpl = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                gVar = (g) aVarC.m(serialDescriptor, 0, e.f22262a, gVar);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    c50.w.e(iW);
                    return null;
                }
                RecipeId recipeId = (RecipeId) aVarC.m(serialDescriptor, 1, RecipeId$$serializer.INSTANCE, strM253unboximpl != null ? RecipeId.m245boximpl(strM253unboximpl) : null);
                strM253unboximpl = recipeId != null ? recipeId.m253unboximpl() : null;
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new i1(i11, gVar, strM253unboximpl);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i1 i1Var = (i1) obj;
        encoder.getClass();
        i1Var.getClass();
        String str = i1Var.f22294b;
        g gVar = i1Var.f22293a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || gVar != null) {
            bVarC.r(serialDescriptor, 0, e.f22262a, gVar);
        }
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 1, RecipeId$$serializer.INSTANCE, str != null ? RecipeId.m245boximpl(str) : null);
        }
        bVarC.b(serialDescriptor);
    }
}
