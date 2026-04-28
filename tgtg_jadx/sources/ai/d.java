package ai;

import c50.w;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.g;
import m90.r1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f1486a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        f1486a = dVar;
        e1 e1Var = new e1("com.app.tgtg.feature.charity.network.model.CharityUserSettingsResponse", dVar, 5);
        e1Var.j("push_notifications_opt_in", true);
        e1Var.j("sms_notification_opt_in", true);
        e1Var.j("phone_country_code", true);
        e1Var.j("phone_number", true);
        e1Var.j("order_emails_opt_in", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        g gVar = g.f29797a;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{gVar, gVar, r1Var, r1Var, gVar};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        String strU = null;
        String strU2 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                zT = aVarC.t(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                zT2 = aVarC.t(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                strU = aVarC.u(serialDescriptor, 2);
                i11 |= 4;
            } else if (iW == 3) {
                strU2 = aVarC.u(serialDescriptor, 3);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    w.e(iW);
                    return null;
                }
                zT3 = aVarC.t(serialDescriptor, 4);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new f(i11, strU, strU2, zT, zT2, zT3);
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
        boolean z11 = fVar.f1491e;
        String str = fVar.f1490d;
        String str2 = fVar.f1489c;
        boolean z12 = fVar.f1488b;
        boolean z13 = fVar.f1487a;
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        if (bVarC.C(serialDescriptor) || z13) {
            bVarC.p(serialDescriptor, 0, z13);
        }
        if (bVarC.C(serialDescriptor) || z12) {
            bVarC.p(serialDescriptor, 1, z12);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str2, "")) {
            bVarC.q(serialDescriptor, 2, str2);
        }
        if (bVarC.C(serialDescriptor) || !Intrinsics.areEqual(str, "")) {
            bVarC.q(serialDescriptor, 3, str);
        }
        if (bVarC.C(serialDescriptor) || z11) {
            bVarC.p(serialDescriptor, 4, z11);
        }
        bVarC.b(serialDescriptor);
    }
}
