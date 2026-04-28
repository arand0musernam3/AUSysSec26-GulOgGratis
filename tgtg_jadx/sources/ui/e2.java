package ui;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e2 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e2 f41191a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e2 e2Var = new e2();
        f41191a = e2Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Fail.Thrown", e2Var, 1);
        e1Var.j("throwable", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{g2.f41203c[0].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = g2.f41203c;
        Throwable th2 = null;
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
                th2 = (Throwable) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), th2);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new g2(i11, th2);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g2 g2Var = (g2) obj;
        encoder.getClass();
        g2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.i(serialDescriptor, 0, (KSerializer) g2.f41203c[0].getValue(), g2Var.f41204b);
        bVarC.b(serialDescriptor);
    }
}
