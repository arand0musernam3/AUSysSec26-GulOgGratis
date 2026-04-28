package zendesk.conversationkit.android.model;

import c50.w;
import com.braze.models.FeatureFlag;
import i90.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.g;
import m90.l0;
import m90.m1;
import m90.q0;
import m90.r1;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/RealtimeSettings.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/RealtimeSettings;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/RealtimeSettings;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/RealtimeSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class RealtimeSettings$$serializer implements d0 {

    @NotNull
    public static final RealtimeSettings$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        RealtimeSettings$$serializer realtimeSettings$$serializer = new RealtimeSettings$$serializer();
        INSTANCE = realtimeSettings$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.model.RealtimeSettings", realtimeSettings$$serializer, 8);
        e1Var.j(FeatureFlag.ENABLED, false);
        e1Var.j("baseUrl", false);
        e1Var.j("retryInterval", false);
        e1Var.j("maxConnectionAttempts", false);
        e1Var.j("connectionDelay", false);
        e1Var.j("timeUnit", true);
        e1Var.j("appId", false);
        e1Var.j("userId", false);
        descriptor = e1Var;
    }

    private RealtimeSettings$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = RealtimeSettings.$childSerializers;
        r1 r1Var = r1.f29848a;
        q0 q0Var = q0.f29842a;
        return new KSerializer[]{g.f29797a, r1Var, q0Var, l0.f29821a, q0Var, jVarArr[5].getValue(), r1Var, r1Var};
    }

    @Override // i90.b
    @NotNull
    public final RealtimeSettings deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = RealtimeSettings.$childSerializers;
        TimeUnit timeUnit = null;
        int i11 = 0;
        boolean zT = false;
        int iQ = 0;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        long jK = 0;
        long jK2 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    zT = aVarC.t(serialDescriptor, 0);
                    i11 |= 1;
                    break;
                case 1:
                    strU = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    jK = aVarC.k(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    iQ = aVarC.q(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    jK2 = aVarC.k(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    timeUnit = (TimeUnit) aVarC.n(serialDescriptor, 5, (b) jVarArr[5].getValue(), timeUnit);
                    i11 |= 32;
                    break;
                case 6:
                    strU2 = aVarC.u(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    strU3 = aVarC.u(serialDescriptor, 7);
                    i11 |= 128;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new RealtimeSettings(i11, zT, strU, jK, iQ, jK2, timeUnit, strU2, strU3, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull RealtimeSettings value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        RealtimeSettings.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
