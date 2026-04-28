package xh;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.e1;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements m90.d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f44338a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        f44338a = pVar;
        e1 e1Var = new e1("com.app.tgtg.feature.charity.domain.NavigationCharity.InventoryScreen", pVar, 3);
        e1Var.j("charityItemId", false);
        e1Var.j("showChangelog", false);
        e1Var.j("lastChangelog", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, m90.g.f29797a, o30.f0.B(r1Var)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        String strU = null;
        boolean z11 = true;
        int i11 = 0;
        boolean zT = false;
        String str = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                zT = aVarC.t(serialDescriptor, 1);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    c50.w.e(iW);
                    return null;
                }
                str = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new r(strU, i11, str, zT);
    }

    @Override // i90.b
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        r rVar = (r) obj;
        encoder.getClass();
        rVar.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        String str = rVar.f44339b;
        String str2 = rVar.f44341d;
        bVarC.q(serialDescriptor, 0, str);
        bVarC.p(serialDescriptor, 1, rVar.f44340c);
        if (bVarC.C(serialDescriptor) || str2 != null) {
            bVarC.r(serialDescriptor, 2, r1.f29848a, str2);
        }
        bVarC.b(serialDescriptor);
    }
}
