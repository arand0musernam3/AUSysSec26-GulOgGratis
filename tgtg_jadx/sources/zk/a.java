package zk;

import c50.w;
import com.app.tgtg.model.remote.user.response.Address;
import com.app.tgtg.model.remote.user.response.Address$$serializer;
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
    public static final a f47958a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f47958a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.locationpicker.newlocationpicker.model.UserPointOfInterest", aVar, 2);
        e1Var.j("type", false);
        e1Var.j("address", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{r1.f29848a, Address$$serializer.INSTANCE};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        boolean z11 = true;
        int i11 = 0;
        Address address = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                address = (Address) aVarC.n(serialDescriptor, 1, Address$$serializer.INSTANCE, address);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, strU, address);
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
        bVarC.q(serialDescriptor, 0, cVar.f47959a);
        bVarC.i(serialDescriptor, 1, Address$$serializer.INSTANCE, cVar.f47960b);
        bVarC.b(serialDescriptor);
    }
}
