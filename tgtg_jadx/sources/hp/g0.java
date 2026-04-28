package hp;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f22286a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g0 g0Var = new g0();
        f22286a = g0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeGeneratorRequest", g0Var, 3);
        e1Var.j("file_urls", false);
        e1Var.j("tags", true);
        e1Var.j("previous_generated_recipes", true);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        u70.j[] jVarArr = i0.f22289d;
        return new KSerializer[]{jVarArr[0].getValue(), jVarArr[1].getValue(), o30.f0.B((KSerializer) jVarArr[2].getValue())};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = i0.f22289d;
        List list = null;
        boolean z11 = true;
        int i11 = 0;
        List list2 = null;
        List list3 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                list = (List) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), list);
                i11 |= 1;
            } else if (iW == 1) {
                list2 = (List) aVarC.n(serialDescriptor, 1, (i90.b) jVarArr[1].getValue(), list2);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    c50.w.e(iW);
                    return null;
                }
                list3 = (List) aVarC.m(serialDescriptor, 2, (i90.b) jVarArr[2].getValue(), list3);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new i0(i11, list, list2, list3);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i0 i0Var = (i0) obj;
        encoder.getClass();
        i0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = i0.f22289d;
        KSerializer kSerializer = (KSerializer) jVarArr[0].getValue();
        List list = i0Var.f22290a;
        List list2 = i0Var.f22292c;
        List list3 = i0Var.f22291b;
        bVarC.i(serialDescriptor, 0, kSerializer, list);
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(list3, kotlin.collections.n0.f26529a)) {
            bVarC.i(serialDescriptor, 1, (KSerializer) jVarArr[1].getValue(), list3);
        }
        if (bVarC.C(serialDescriptor) || list2 != null) {
            bVarC.r(serialDescriptor, 2, (KSerializer) jVarArr[2].getValue(), list2);
        }
        bVarC.b(serialDescriptor);
    }
}
