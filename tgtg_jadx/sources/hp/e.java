package hp;

import com.app.tgtg.model.remote.RecipeId;
import com.app.tgtg.model.remote.RecipeId$$serializer;
import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f22262a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        f22262a = eVar;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.Recipe", eVar, 11);
        e1Var.j("external_id", true);
        e1Var.j("name", true);
        e1Var.j("description", true);
        e1Var.j("prep", true);
        e1Var.j("cook", true);
        e1Var.j("portions", true);
        e1Var.j("ingredients", true);
        e1Var.j(ContainerStep.STEPS, true);
        e1Var.j("conclusion", true);
        e1Var.j("total", true);
        e1Var.j("isRecipeSaved", true);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        u70.j[] jVarArr = g.l;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{o30.f0.B(RecipeId$$serializer.INSTANCE), r1Var, o30.f0.B(r1Var), o30.f0.B(r1Var), o30.f0.B(r1Var), o30.f0.B(r1Var), jVarArr[6].getValue(), jVarArr[7].getValue(), o30.f0.B(r1Var), o30.f0.B(r1Var), m90.g.f29797a};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = g.l;
        String str = null;
        boolean z11 = true;
        List list = null;
        int i11 = 0;
        String strM253unboximpl = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list2 = null;
        String strU = null;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    RecipeId recipeId = (RecipeId) aVarC.m(serialDescriptor, 0, RecipeId$$serializer.INSTANCE, strM253unboximpl != null ? RecipeId.m245boximpl(strM253unboximpl) : null);
                    strM253unboximpl = recipeId != null ? recipeId.m253unboximpl() : null;
                    i11 |= 1;
                    break;
                case 1:
                    strU = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    str3 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str3);
                    i11 |= 4;
                    break;
                case 3:
                    str4 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str4);
                    i11 |= 8;
                    break;
                case 4:
                    str5 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str5);
                    i11 |= 16;
                    break;
                case 5:
                    str6 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str6);
                    i11 |= 32;
                    break;
                case 6:
                    list2 = (List) aVarC.n(serialDescriptor, 6, (i90.b) jVarArr[6].getValue(), list2);
                    i11 |= 64;
                    break;
                case 7:
                    list = (List) aVarC.n(serialDescriptor, 7, (i90.b) jVarArr[7].getValue(), list);
                    i11 |= 128;
                    break;
                case 8:
                    str2 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str2);
                    i11 |= 256;
                    break;
                case 9:
                    str = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str);
                    i11 |= 512;
                    break;
                case 10:
                    zT = aVarC.t(serialDescriptor, 10);
                    i11 |= 1024;
                    break;
                default:
                    c50.w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new g(i11, strM253unboximpl, strU, str3, str4, str5, str6, list2, list, str2, str, zT);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g gVar = (g) obj;
        encoder.getClass();
        gVar.getClass();
        boolean z11 = gVar.f22285k;
        String str = gVar.f22284j;
        String str2 = gVar.f22283i;
        List list = gVar.f22282h;
        List list2 = gVar.f22281g;
        String str3 = gVar.f22280f;
        String str4 = gVar.f22279e;
        String str5 = gVar.f22278d;
        String str6 = gVar.f22277c;
        String str7 = gVar.f22276b;
        String str8 = gVar.f22275a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = g.l;
        if (bVarC.C(serialDescriptor) || str8 != null) {
            bVarC.r(serialDescriptor, 0, RecipeId$$serializer.INSTANCE, str8 != null ? RecipeId.m245boximpl(str8) : null);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str7, "")) {
            bVarC.q(serialDescriptor, 1, str7);
        }
        if (bVarC.C(serialDescriptor) || str6 != null) {
            bVarC.r(serialDescriptor, 2, r1.f29848a, str6);
        }
        if (bVarC.C(serialDescriptor) || str5 != null) {
            bVarC.r(serialDescriptor, 3, r1.f29848a, str5);
        }
        if (bVarC.C(serialDescriptor) || str4 != null) {
            bVarC.r(serialDescriptor, 4, r1.f29848a, str4);
        }
        if (bVarC.C(serialDescriptor) || str3 != null) {
            bVarC.r(serialDescriptor, 5, r1.f29848a, str3);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(list2, kotlin.collections.n0.f26529a)) {
            bVarC.i(serialDescriptor, 6, (KSerializer) jVarArr[6].getValue(), list2);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(list, kotlin.collections.n0.f26529a)) {
            bVarC.i(serialDescriptor, 7, (KSerializer) jVarArr[7].getValue(), list);
        }
        if (bVarC.C(serialDescriptor) || str2 != null) {
            bVarC.r(serialDescriptor, 8, r1.f29848a, str2);
        }
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 9, r1.f29848a, str);
        }
        if (bVarC.C(serialDescriptor) || z11) {
            bVarC.p(serialDescriptor, 10, z11);
        }
        bVarC.b(serialDescriptor);
    }
}
