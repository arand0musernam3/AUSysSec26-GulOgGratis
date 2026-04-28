package ui;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b2 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b2 f41174a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        b2 b2Var = new b2();
        f41174a = b2Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Fail.Failed", b2Var, 1);
        e1Var.j("reason", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{o30.f0.B(m90.r1.f29848a)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String str = null;
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
                str = (String) aVarC.m(serialDescriptor, 0, m90.r1.f29848a, str);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new d2(i11, str);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d2 d2Var = (d2) obj;
        encoder.getClass();
        d2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.r(serialDescriptor, 0, m90.r1.f29848a, d2Var.f41186b);
        bVarC.b(serialDescriptor);
    }
}
