package op;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.q0;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32895a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f32895a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.Line", aVar, 5);
        e1Var.j("id", false);
        e1Var.j("name", false);
        e1Var.j("name_native", false);
        e1Var.j("line_code", false);
        e1Var.j("color", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{q0.f29842a, r1Var, r1Var, r1Var, r1Var};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        long jK = 0;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                jK = aVarC.k(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                strU = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                strU2 = aVarC.u(serialDescriptor, 2);
                i11 |= 4;
            } else if (iW == 3) {
                strU3 = aVarC.u(serialDescriptor, 3);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    w.e(iW);
                    return null;
                }
                strU4 = aVarC.u(serialDescriptor, 4);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, jK, strU, strU2, strU3, strU4);
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
        bVarC.B(serialDescriptor, 0, cVar.f32896a);
        bVarC.q(serialDescriptor, 1, cVar.f32897b);
        bVarC.q(serialDescriptor, 2, cVar.f32898c);
        bVarC.q(serialDescriptor, 3, cVar.f32899d);
        bVarC.q(serialDescriptor, 4, cVar.f32900e);
        bVarC.b(serialDescriptor);
    }
}
