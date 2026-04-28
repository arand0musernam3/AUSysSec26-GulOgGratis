package hp;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.r1;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f22316a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p0 p0Var = new p0();
        f22316a = p0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.recipegenerator.model.RecipeStep", p0Var, 2);
        e1Var.j(MessageBundle.TITLE_ENTRY, true);
        e1Var.j("description", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        boolean z11 = true;
        int i11 = 0;
        String strU2 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    c50.w.e(iW);
                    return null;
                }
                strU2 = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new r0(i11, strU, strU2);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r0 r0Var = (r0) obj;
        encoder.getClass();
        r0Var.getClass();
        String str = r0Var.f22322b;
        String str2 = r0Var.f22321a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str2, "")) {
            bVarC.q(serialDescriptor, 0, str2);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str, "")) {
            bVarC.q(serialDescriptor, 1, str);
        }
        bVarC.b(serialDescriptor);
    }
}
