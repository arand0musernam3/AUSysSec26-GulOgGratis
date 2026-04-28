package kn;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.l0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26468a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f26468a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.main.fragments.profile.model.ProfileAvatarDesign", aVar, 3);
        e1Var.j("background", false);
        e1Var.j("graphics", false);
        e1Var.j("tint", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{l0Var, l0Var, l0Var};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        int iQ2 = 0;
        int iQ3 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                iQ = aVarC.q(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                iQ2 = aVarC.q(serialDescriptor, 1);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                iQ3 = aVarC.q(serialDescriptor, 2);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, descriptor);
            throw null;
        }
        c cVar = new c();
        cVar.f26470a = iQ;
        cVar.f26471b = iQ2;
        cVar.f26472c = iQ3;
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
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        bVarC.m(0, cVar.f26470a, serialDescriptor);
        bVarC.m(1, cVar.f26471b, serialDescriptor);
        bVarC.m(2, cVar.f26472c, serialDescriptor);
        bVarC.b(serialDescriptor);
    }
}
