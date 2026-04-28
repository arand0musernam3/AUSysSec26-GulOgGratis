package gh;

import c50.w;
import com.app.tgtg.model.remote.badge.Badge;
import com.app.tgtg.model.remote.badge.Badge$$serializer;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
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
public final /* synthetic */ class j implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f20456a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        j jVar = new j();
        f20456a = jVar;
        e1 e1Var = new e1("com.app.tgtg.feature.badges.network.model.response.UserBadgesResponse", jVar, 2);
        e1Var.j("latest_badge", true);
        e1Var.j("mobile_user_badge_groups", true);
        descriptor = e1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f0.B(Badge$$serializer.INSTANCE), l.f20457c[1].getValue()};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        u70.j[] jVarArr = l.f20457c;
        boolean z11 = true;
        int i11 = 0;
        Badge badge = null;
        List list = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                badge = (Badge) aVarC.m(serialDescriptor, 0, Badge$$serializer.INSTANCE, badge);
                i11 |= 1;
            } else {
                if (iW != 1) {
                    w.e(iW);
                    return null;
                }
                list = (List) aVarC.n(serialDescriptor, 1, (i90.b) jVarArr[1].getValue(), list);
                i11 |= 2;
            }
        }
        aVarC.b(serialDescriptor);
        l lVar = new l();
        if ((i11 & 1) == 0) {
            lVar.f20458a = null;
        } else {
            lVar.f20458a = badge;
        }
        if ((i11 & 2) == 0) {
            lVar.f20459b = new ArrayList();
            return lVar;
        }
        lVar.f20459b = list;
        return lVar;
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
        List list = lVar.f20459b;
        Badge badge = lVar.f20458a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        u70.j[] jVarArr = l.f20457c;
        if (bVarC.C(serialDescriptor) || badge != null) {
            bVarC.r(serialDescriptor, 0, Badge$$serializer.INSTANCE, badge);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(list, new ArrayList())) {
            bVarC.i(serialDescriptor, 1, (KSerializer) jVarArr[1].getValue(), list);
        }
        bVarC.b(serialDescriptor);
    }
}
