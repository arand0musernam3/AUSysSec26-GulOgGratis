package gh;

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
public final /* synthetic */ class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f20443a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f20443a = dVar;
        e1 e1Var = new e1("com.app.tgtg.feature.badges.network.model.response.UserBadgeBannerDetailsResponse", dVar, 3);
        e1Var.j("earning_start_at_utc", true);
        e1Var.j("latest_achieved_badge", true);
        e1Var.j("latest_in_progress_badge", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f0.B(r1.f29848a);
        a aVar = a.f20437a;
        return new KSerializer[]{kSerializerB, f0.B(aVar), f0.B(aVar)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        String str = null;
        c cVar = null;
        c cVar2 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                str = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str);
                i11 |= 1;
            } else if (iW == 1) {
                cVar = (c) aVarC.m(serialDescriptor, 1, a.f20437a, cVar);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                cVar2 = (c) aVarC.m(serialDescriptor, 2, a.f20437a, cVar2);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        f fVar = new f();
        if ((i11 & 1) == 0) {
            fVar.f20445a = null;
        } else {
            fVar.f20445a = str;
        }
        if ((i11 & 2) == 0) {
            fVar.f20446b = null;
        } else {
            fVar.f20446b = cVar;
        }
        if ((i11 & 4) == 0) {
            fVar.f20447c = null;
            return fVar;
        }
        fVar.f20447c = cVar2;
        return fVar;
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
        String str = fVar.f20445a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 0, r1.f29848a, str);
        }
        if (bVarC.C(serialDescriptor) || fVar.f20446b != null) {
            bVarC.r(serialDescriptor, 1, a.f20437a, fVar.f20446b);
        }
        if (bVarC.C(serialDescriptor) || fVar.f20447c != null) {
            bVarC.r(serialDescriptor, 2, a.f20437a, fVar.f20447c);
        }
        bVarC.b(serialDescriptor);
    }
}
