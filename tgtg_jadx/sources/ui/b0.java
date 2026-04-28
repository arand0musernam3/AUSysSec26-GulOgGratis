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
public final /* synthetic */ class b0 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f41173a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b0 b0Var = new b0();
        f41173a = b0Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Adyen.CashAppPay", b0Var, 2);
        e1Var.j("method", false);
        e1Var.j("adyenEnvironment", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        u70.j[] jVarArr = d0.f41182d;
        return new KSerializer[]{jVarArr[0].getValue(), jVarArr[1].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = d0.f41182d;
        PaymentMethod paymentMethod = null;
        boolean z11 = true;
        int i11 = 0;
        Environment environment = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                paymentMethod = (PaymentMethod) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), paymentMethod);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    c50.w.e(iW);
                    return null;
                }
                environment = (Environment) aVarC.n(serialDescriptor, 1, (i90.b) jVarArr[1].getValue(), environment);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new d0(i11, paymentMethod, environment);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d0 d0Var = (d0) obj;
        encoder.getClass();
        d0Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = d0.f41182d;
        bVarC.i(serialDescriptor, 0, (KSerializer) jVarArr[0].getValue(), d0Var.f41183b);
        bVarC.i(serialDescriptor, 1, (KSerializer) jVarArr[1].getValue(), d0Var.f41184c);
        bVarC.b(serialDescriptor);
    }
}
