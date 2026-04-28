package xp;

import c50.w;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44484a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f44484a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.storeview.network.model.StoreRequest", aVar, 1);
        e1Var.j("origin", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f0.B(LatLngInfo$$serializer.INSTANCE)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        boolean z12 = false;
        LatLngInfo latLngInfo = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else {
                if (iW != 0) {
                    w.e(iW);
                    return null;
                }
                latLngInfo = (LatLngInfo) aVarC.m(serialDescriptor, 0, LatLngInfo$$serializer.INSTANCE, latLngInfo);
                z12 = true;
            }
        }
        aVarC.b(serialDescriptor);
        c cVar = new c();
        if (z12) {
            cVar.f44485a = latLngInfo;
            return cVar;
        }
        cVar.f44485a = null;
        return cVar;
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
        LatLngInfo latLngInfo = cVar.f44485a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || latLngInfo != null) {
            bVarC.r(serialDescriptor, 0, LatLngInfo$$serializer.INSTANCE, latLngInfo);
        }
        bVarC.b(serialDescriptor);
    }
}
