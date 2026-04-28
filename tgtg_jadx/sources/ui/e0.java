package ui;

import com.adyen.checkout.components.core.PaymentMethod;
import com.adyen.checkout.core.Environment;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f41190a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        e0 e0Var = new e0();
        f41190a = e0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Adyen.CreditCard", e0Var, 3);
        e1Var.j("method", false);
        e1Var.j("showZipcode", false);
        e1Var.j("adyenEnvironment", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        u70.j[] jVarArr = g0.f41198e;
        return new KSerializer[]{jVarArr[0].getValue(), m90.g.f29797a, jVarArr[2].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = g0.f41198e;
        PaymentMethod paymentMethod = null;
        boolean z11 = true;
        int i11 = 0;
        boolean zT = false;
        Environment environment = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                paymentMethod = (PaymentMethod) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), paymentMethod);
                i11 |= 1;
            } else if (iW == 1) {
                zT = aVarC.t(serialDescriptor, 1);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    c50.w.e(iW);
                    return null;
                }
                environment = (Environment) aVarC.n(serialDescriptor, 2, (i90.b) jVarArr[2].getValue(), environment);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new g0(i11, paymentMethod, zT, environment);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        g0 g0Var = (g0) obj;
        encoder.getClass();
        g0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = g0.f41198e;
        bVarC.i(serialDescriptor, 0, (KSerializer) jVarArr[0].getValue(), g0Var.f41199b);
        bVarC.p(serialDescriptor, 1, g0Var.f41200c);
        bVarC.i(serialDescriptor, 2, (KSerializer) jVarArr[2].getValue(), g0Var.f41201d);
        bVarC.b(serialDescriptor);
    }
}
