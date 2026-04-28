package pp;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f35592a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f35592a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.request.MetroSearchRequest", aVar, 2);
        e1Var.j("search_phrase", true);
        e1Var.j("paging", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f0.B(r1.f29848a), f0.B(d.f35595a)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String str = null;
        boolean z11 = true;
        int i11 = 0;
        f fVar = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                str = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                fVar = (f) aVarC.m(serialDescriptor, 1, d.f35595a, fVar);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, str, fVar);
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
        f fVar = cVar.f35594b;
        String str = cVar.f35593a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 0, r1.f29848a, str);
        }
        if (bVarC.C(serialDescriptor) || fVar != null) {
            bVarC.r(serialDescriptor, 1, d.f35595a, fVar);
        }
        bVarC.b(serialDescriptor);
    }
}
