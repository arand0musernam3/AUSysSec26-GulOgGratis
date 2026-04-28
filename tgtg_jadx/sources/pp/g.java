package pp;

import c50.w;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f35598a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f35598a = gVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.request.PinnedStationsRequest", gVar, 1);
        e1Var.j("place_ids", false);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i.f35599b[0].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = i.f35599b;
        boolean z11 = true;
        int i11 = 0;
        List list = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else {
                if (iW != 0) {
                    w.e(iW);
                    return null;
                }
                list = (List) aVarC.n(serialDescriptor, 0, (i90.b) jVarArr[0].getValue(), list);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        if (1 != i11) {
            c1.j(i11, 1, descriptor);
            throw null;
        }
        i iVar = new i();
        iVar.f35600a = list;
        return iVar;
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        i iVar = (i) obj;
        encoder.getClass();
        iVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.i(serialDescriptor, 0, (KSerializer) i.f35599b[0].getValue(), iVar.f35600a);
        bVarC.b(serialDescriptor);
    }
}
