package op;

import c50.w;
import com.app.tgtg.model.remote.item.LatLngInfo;
import com.app.tgtg.model.remote.item.LatLngInfo$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.q0;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f32907a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f32907a = jVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.Station", jVar, 6);
        e1Var.j("id", false);
        e1Var.j("place_id", false);
        e1Var.j("name", false);
        e1Var.j("name_native", false);
        e1Var.j("station_code", true);
        e1Var.j("location", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        q0 q0Var = q0.f29842a;
        KSerializer kSerializerB = f0.B(q0Var);
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{kSerializerB, q0Var, r1Var, r1Var, f0.B(r1Var), f0.B(LatLngInfo$$serializer.INSTANCE)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        Long l = null;
        String strU = null;
        String strU2 = null;
        String str = null;
        LatLngInfo latLngInfo = null;
        long jK = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    l = (Long) aVarC.m(serialDescriptor, 0, q0.f29842a, l);
                    i11 |= 1;
                    break;
                case 1:
                    jK = aVarC.k(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strU = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strU2 = aVarC.u(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    str = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str);
                    i11 |= 16;
                    break;
                case 5:
                    latLngInfo = (LatLngInfo) aVarC.m(serialDescriptor, 5, LatLngInfo$$serializer.INSTANCE, latLngInfo);
                    i11 |= 32;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new l(i11, l, jK, strU, strU2, str, latLngInfo);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        l lVar = (l) obj;
        encoder.getClass();
        lVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        q0 q0Var = q0.f29842a;
        Long l = lVar.f32908a;
        LatLngInfo latLngInfo = lVar.f32913f;
        String str = lVar.f32912e;
        bVarC.r(serialDescriptor, 0, q0Var, l);
        bVarC.B(serialDescriptor, 1, lVar.f32909b);
        bVarC.q(serialDescriptor, 2, lVar.f32910c);
        bVarC.q(serialDescriptor, 3, lVar.f32911d);
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 4, r1.f29848a, str);
        }
        if (bVarC.C(serialDescriptor) || latLngInfo != null) {
            bVarC.r(serialDescriptor, 5, LatLngInfo$$serializer.INSTANCE, latLngInfo);
        }
        bVarC.b(serialDescriptor);
    }
}
