package gh;

import c50.w;
import com.app.tgtg.model.remote.badge.BadgeProgress;
import com.app.tgtg.model.remote.badge.BadgeProgress$$serializer;
import com.app.tgtg.model.remote.badge.BadgeUserStatus;
import com.app.tgtg.model.remote.badge.BadgeUserStatusSerializer;
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
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20437a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f20437a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.badges.network.model.response.UserBadgeBannerDetail", aVar, 5);
        e1Var.j("user_badge_id", false);
        e1Var.j("image_url", false);
        e1Var.j("user_badge_user_status", false);
        e1Var.j("mobile_user_badge_progress", true);
        e1Var.j("total_achieved_badges", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{l0Var, r1.f29848a, BadgeUserStatusSerializer.INSTANCE, f0.B(BadgeProgress$$serializer.INSTANCE), f0.B(l0Var)};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        boolean z11 = true;
        int i11 = 0;
        int iQ = 0;
        String strU = null;
        BadgeUserStatus badgeUserStatus = null;
        BadgeProgress badgeProgress = null;
        Integer num = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                iQ = aVarC.q(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                strU = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                badgeUserStatus = (BadgeUserStatus) aVarC.n(serialDescriptor, 2, BadgeUserStatusSerializer.INSTANCE, badgeUserStatus);
                i11 |= 4;
            } else if (iW == 3) {
                badgeProgress = (BadgeProgress) aVarC.m(serialDescriptor, 3, BadgeProgress$$serializer.INSTANCE, badgeProgress);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    w.e(iW);
                    return null;
                }
                num = (Integer) aVarC.m(serialDescriptor, 4, l0.f29821a, num);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, descriptor);
            throw null;
        }
        c cVar = new c();
        cVar.f20438a = iQ;
        cVar.f20439b = strU;
        cVar.f20440c = badgeUserStatus;
        if ((i11 & 8) == 0) {
            cVar.f20441d = null;
        } else {
            cVar.f20441d = badgeProgress;
        }
        if ((i11 & 16) == 0) {
            cVar.f20442e = null;
            return cVar;
        }
        cVar.f20442e = num;
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
        int i11 = cVar.f20438a;
        BadgeProgress badgeProgress = cVar.f20441d;
        bVarC.m(0, i11, serialDescriptor);
        bVarC.q(serialDescriptor, 1, cVar.f20439b);
        bVarC.i(serialDescriptor, 2, BadgeUserStatusSerializer.INSTANCE, cVar.f20440c);
        if (bVarC.C(serialDescriptor) || badgeProgress != null) {
            bVarC.r(serialDescriptor, 3, BadgeProgress$$serializer.INSTANCE, badgeProgress);
        }
        if (bVarC.C(serialDescriptor) || cVar.f20442e != null) {
            bVarC.r(serialDescriptor, 4, l0.f29821a, cVar.f20442e);
        }
        bVarC.b(serialDescriptor);
    }
}
