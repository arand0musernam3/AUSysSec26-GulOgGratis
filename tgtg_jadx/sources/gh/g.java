package gh;

import c50.w;
import com.app.tgtg.model.remote.badge.BadgeCTA;
import com.app.tgtg.model.remote.badge.BadgeCTA$$serializer;
import com.app.tgtg.model.remote.badge.BadgeProgress;
import com.app.tgtg.model.remote.badge.BadgeProgress$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.l0;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f20448a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        f20448a = gVar;
        e1 e1Var = new e1("com.app.tgtg.feature.badges.network.model.response.UserBadgeDetailsResponse", gVar, 7);
        e1Var.j("id", false);
        e1Var.j("image_url", false);
        e1Var.j("name", false);
        e1Var.j("achieved_at", true);
        e1Var.j("description", false);
        e1Var.j("progress", true);
        e1Var.j("call_to_action", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{l0.f29821a, r1Var, r1Var, f0.B(r1Var), r1Var, f0.B(BadgeProgress$$serializer.INSTANCE), f0.B(BadgeCTA$$serializer.INSTANCE)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        String strU = null;
        String strU2 = null;
        String str = null;
        String strU3 = null;
        BadgeProgress badgeProgress = null;
        BadgeCTA badgeCTA = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    iQ = aVarC.q(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strU = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strU2 = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                    i11 |= 8;
                    break;
                case 4:
                    strU3 = aVarC.u(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    badgeProgress = (BadgeProgress) aVarC.m(serialDescriptor, 5, BadgeProgress$$serializer.INSTANCE, badgeProgress);
                    i11 |= 32;
                    break;
                case 6:
                    badgeCTA = (BadgeCTA) aVarC.m(serialDescriptor, 6, BadgeCTA$$serializer.INSTANCE, badgeCTA);
                    i11 |= 64;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        if (23 != (i11 & 23)) {
            c1.j(i11, 23, descriptor);
            throw null;
        }
        i iVar = new i();
        iVar.f20449a = iQ;
        iVar.f20450b = strU;
        iVar.f20451c = strU2;
        if ((i11 & 8) == 0) {
            iVar.f20452d = null;
        } else {
            iVar.f20452d = str;
        }
        iVar.f20453e = strU3;
        if ((i11 & 32) == 0) {
            iVar.f20454f = null;
        } else {
            iVar.f20454f = badgeProgress;
        }
        if ((i11 & 64) == 0) {
            iVar.f20455g = null;
            return iVar;
        }
        iVar.f20455g = badgeCTA;
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
        int i11 = iVar.f20449a;
        BadgeCTA badgeCTA = iVar.f20455g;
        BadgeProgress badgeProgress = iVar.f20454f;
        String str = iVar.f20452d;
        bVarC.m(0, i11, serialDescriptor);
        bVarC.q(serialDescriptor, 1, iVar.f20450b);
        bVarC.q(serialDescriptor, 2, iVar.f20451c);
        if (bVarC.C(serialDescriptor) || str != null) {
            bVarC.r(serialDescriptor, 3, r1.f29848a, str);
        }
        bVarC.q(serialDescriptor, 4, iVar.f20453e);
        if (bVarC.C(serialDescriptor) || badgeProgress != null) {
            bVarC.r(serialDescriptor, 5, BadgeProgress$$serializer.INSTANCE, badgeProgress);
        }
        if (bVarC.C(serialDescriptor) || badgeCTA != null) {
            bVarC.r(serialDescriptor, 6, BadgeCTA$$serializer.INSTANCE, badgeCTA);
        }
        bVarC.b(serialDescriptor);
    }
}
