package hp;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f22324a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        s0 s0Var = new s0();
        f22324a = s0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeTag", s0Var, 3);
        e1Var.j("id", true);
        e1Var.j(TextBundle.TEXT_ENTRY, true);
        e1Var.j("pre_selected", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, m90.g.f29797a};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        boolean z11 = true;
        int i11 = 0;
        boolean zT = false;
        String strU2 = null;
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
            } else {
                if (iW != 2) {
                    c50.w.e(iW);
                    return null;
                }
                zT = aVarC.t(serialDescriptor, 2);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new u0(strU, i11, strU2, zT);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        u0 u0Var = (u0) obj;
        encoder.getClass();
        u0Var.getClass();
        boolean z11 = u0Var.f22329c;
        String str = u0Var.f22328b;
        String str2 = u0Var.f22327a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str2, "")) {
            bVarC.q(serialDescriptor, 0, str2);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str, "")) {
            bVarC.q(serialDescriptor, 1, str);
        }
        if (bVarC.C(serialDescriptor) || z11) {
            bVarC.p(serialDescriptor, 2, z11);
        }
        bVarC.b(serialDescriptor);
    }
}
