package ui;

import com.app.tgtg.model.remote.order.AbortState;
import com.app.tgtg.model.remote.order.AbortStateSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class y1 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y1 f41301a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        y1 y1Var = new y1();
        f41301a = y1Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Fail.Abort", y1Var, 1);
        e1Var.j("state", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AbortStateSerializer.INSTANCE};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        AbortState abortState = null;
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
                abortState = (AbortState) aVarC.n(serialDescriptor, 0, AbortStateSerializer.INSTANCE, abortState);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new a2(i11, abortState);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a2 a2Var = (a2) obj;
        encoder.getClass();
        a2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.i(serialDescriptor, 0, AbortStateSerializer.INSTANCE, a2Var.f41169b);
        bVarC.b(serialDescriptor);
    }
}
