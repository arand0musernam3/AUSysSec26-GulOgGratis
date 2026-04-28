package fs;

import c50.w;
import com.app.tgtg.model.remote.PushNotificationsSettings;
import com.app.tgtg.model.remote.PushNotificationsSettings$$serializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import m90.d0;
import m90.e1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f17897a;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        f17897a = aVar;
        e1 e1Var = new e1("com.app.tgtg.feature.tabprofile.manageaccount.notificationsettings.network.model.response.PushNotificationSettingsResponse", aVar, 1);
        e1Var.j("push_notification_settings", false);
        descriptor = e1Var;
    }

    @Override // m90.d0
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{PushNotificationsSettings$$serializer.INSTANCE};
    }

    @Override // i90.b
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        l90.a aVarC = decoder.c(serialDescriptor);
        PushNotificationsSettings pushNotificationsSettings = null;
        boolean z11 = true;
        int i11 = 0;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else {
                if (iW != 0) {
                    w.e(iW);
                    return null;
                }
                pushNotificationsSettings = (PushNotificationsSettings) aVarC.n(serialDescriptor, 0, PushNotificationsSettings$$serializer.INSTANCE, pushNotificationsSettings);
                i11 = 1;
            }
        }
        aVarC.b(serialDescriptor);
        return new c(i11, pushNotificationsSettings);
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
        bVarC.i(serialDescriptor, 0, PushNotificationsSettings$$serializer.INSTANCE, cVar.f17898a);
        bVarC.b(serialDescriptor);
    }
}
