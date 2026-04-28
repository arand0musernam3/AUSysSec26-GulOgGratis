package pp;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f35595a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f35595a = dVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.request.Paging", dVar, 2);
        e1Var.j("page", false);
        e1Var.j("size", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{l0Var, l0Var};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        int iQ2 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                iQ = aVarC.q(serialDescriptor, 0);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                iQ2 = aVarC.q(serialDescriptor, 1);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new f(i11, iQ, iQ2);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f fVar = (f) obj;
        encoder.getClass();
        fVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.m(0, fVar.f35596a, serialDescriptor);
        bVarC.m(1, fVar.f35597b, serialDescriptor);
        bVarC.b(serialDescriptor);
    }
}
