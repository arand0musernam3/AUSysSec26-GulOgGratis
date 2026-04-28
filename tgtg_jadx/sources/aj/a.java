package aj;

import c50.w;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1492a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f1492a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.checkout.models.BasketCheckoutData", aVar, 3);
        e1Var.j("basket_brief_items", false);
        e1Var.j("basket_country", false);
        e1Var.j("basket_id", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{c.f1493d[0].getValue(), r1Var, r1Var};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = c.f1493d;
        List list = null;
        boolean z11 = true;
        int i11 = 0;
        String strU = null;
        String strU2 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                list = (List) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), list);
                i11 |= 1;
            } else if (iW == 1) {
                strU = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                strU2 = aVarC.u(serialDescriptor, 2);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, list, strU, strU2);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c cVar = (c) obj;
        encoder.getClass();
        cVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.i(serialDescriptor, 0, (KSerializer) c.f1493d[0].getValue(), cVar.f1494a);
        bVarC.q(serialDescriptor, 1, cVar.f1495b);
        bVarC.q(serialDescriptor, 2, cVar.f1496c);
        bVarC.b(serialDescriptor);
    }
}
