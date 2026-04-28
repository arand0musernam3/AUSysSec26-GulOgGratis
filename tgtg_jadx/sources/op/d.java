package op;

import c50.w;
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
public final /* synthetic */ class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f32901a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f32901a = dVar;
        e1 e1Var = new e1("com.app.tgtg.feature.stationPicker.model.MetroSearch", dVar, 3);
        e1Var.j("type", true);
        e1Var.j("line", false);
        e1Var.j("station", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{i.f32905a, f0.B(a.f32895a), f0.B(j.f32907a)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        h hVar = null;
        boolean z11 = true;
        int i11 = 0;
        c cVar = null;
        l lVar = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                hVar = (h) aVarC.n(serialDescriptor, 0, i.f32905a, hVar);
                i11 |= 1;
            } else if (iW == 1) {
                cVar = (c) aVarC.m(serialDescriptor, 1, a.f32895a, cVar);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                lVar = (l) aVarC.m(serialDescriptor, 2, j.f32907a, lVar);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new f(i11, hVar, cVar, lVar);
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
        h hVar = fVar.f32902a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || hVar != h.UNKNOWN) {
            bVarC.i(serialDescriptor, 0, i.f32905a, hVar);
        }
        bVarC.r(serialDescriptor, 1, a.f32895a, fVar.f32903b);
        bVarC.r(serialDescriptor, 2, j.f32907a, fVar.f32904c);
        bVarC.b(serialDescriptor);
    }
}
