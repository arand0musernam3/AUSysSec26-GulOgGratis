package ui;

import com.app.tgtg.model.remote.OrderId;
import com.app.tgtg.model.remote.OrderId$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l2 implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l2 f41237a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        l2 l2Var = new l2();
        f41237a = l2Var;
        m90.e1 e1Var = new m90.e1("com.app.tgtg.feature.checkout.PaymentProviderAndOperations.Success", l2Var, 1);
        e1Var.j("orderId", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{OrderId$$serializer.INSTANCE};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        String strM217unboximpl = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else {
                if (iW != 0) {
                    c50.w.e(iW);
                    return null;
                }
                OrderId orderId = (OrderId) aVarC.n(serialDescriptor, 0, OrderId$$serializer.INSTANCE, strM217unboximpl != null ? OrderId.m209boximpl(strM217unboximpl) : null);
                strM217unboximpl = orderId != null ? orderId.m217unboximpl() : null;
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new n2(i11, strM217unboximpl);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n2 n2Var = (n2) obj;
        encoder.getClass();
        n2Var.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.i(serialDescriptor, 0, OrderId$$serializer.INSTANCE, OrderId.m209boximpl(n2Var.f41254b));
        bVarC.b(serialDescriptor);
    }
}
