package hp;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f22303a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        m0 m0Var = new m0();
        f22303a = m0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeIngredient", m0Var, 4);
        e1Var.j("name", true);
        e1Var.j("amount", true);
        e1Var.j("found_in_picture", true);
        e1Var.j("optional", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        m90.g gVar = m90.g.f29797a;
        return new KSerializer[]{r1Var, r1Var, gVar, gVar};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        boolean zT = false;
        boolean zT2 = false;
        String strU = null;
        String strU2 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                strU2 = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                zT = aVarC.t(serialDescriptor, 2);
                i11 |= 4;
            } else {
                if (iW != 3) {
                    c50.w.e(iW);
                    return null;
                }
                zT2 = aVarC.t(serialDescriptor, 3);
                i11 |= 8;
            }
        }
        aVarC.b(serialDescriptor);
        return new o0(i11, strU, strU2, zT, zT2);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        o0 o0Var = (o0) obj;
        encoder.getClass();
        o0Var.getClass();
        boolean z11 = o0Var.f22314d;
        boolean z12 = o0Var.f22313c;
        String str = o0Var.f22312b;
        String str2 = o0Var.f22311a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str2, "")) {
            bVarC.q(serialDescriptor, 0, str2);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str, "")) {
            bVarC.q(serialDescriptor, 1, str);
        }
        if (bVarC.C(serialDescriptor) || z12) {
            bVarC.p(serialDescriptor, 2, z12);
        }
        if (bVarC.C(serialDescriptor) || z11) {
            bVarC.p(serialDescriptor, 3, z11);
        }
        bVarC.b(serialDescriptor);
    }
}
