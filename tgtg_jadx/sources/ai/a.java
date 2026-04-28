package ai;

import c50.w;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import m90.g;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f1480a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f1480a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.charity.network.model.CharityUserSettingsRequest", aVar, 5);
        e1Var.j("push_notifications_opt_in", false);
        e1Var.j("sms_notification_opt_in", false);
        e1Var.j("phone_country_code", false);
        e1Var.j("phone_number", false);
        e1Var.j("order_emails_opt_in", true);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        g gVar = g.f29797a;
        KSerializer kSerializerB = f0.B(gVar);
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{gVar, gVar, r1Var, r1Var, kSerializerB};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        boolean zT = false;
        boolean zT2 = false;
        String strU = null;
        String strU2 = null;
        Boolean bool = null;
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
                bool = (Boolean) aVarC.m(serialDescriptor, 4, g.f29797a, bool);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, zT, zT2, strU, strU2, bool);
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
        boolean z11 = cVar.f1481a;
        Boolean bool = cVar.f1485e;
        bVarC.p(serialDescriptor, 0, z11);
        bVarC.p(serialDescriptor, 1, cVar.f1482b);
        bVarC.q(serialDescriptor, 2, cVar.f1483c);
        bVarC.q(serialDescriptor, 3, cVar.f1484d);
        if (bVarC.C(serialDescriptor) || bool != null) {
            bVarC.r(serialDescriptor, 4, g.f29797a, bool);
        }
        bVarC.b(serialDescriptor);
    }
}
