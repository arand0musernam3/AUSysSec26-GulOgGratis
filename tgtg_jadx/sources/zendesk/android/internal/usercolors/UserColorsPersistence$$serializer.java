package zendesk.android.internal.usercolors;

import c50.w;
import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import com.braze.models.inappmessage.InAppMessageBase;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import l90.a;
import l90.b;
import m90.c1;
import m90.d0;
import m90.e1;
import m90.l0;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/android/internal/usercolors/UserColorsPersistence.$serializer", "Lm90/d0;", "Lzendesk/android/internal/usercolors/UserColorsPersistence;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/android/internal/usercolors/UserColorsPersistence;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/android/internal/usercolors/UserColorsPersistence;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class UserColorsPersistence$$serializer implements d0 {

    @NotNull
    public static final UserColorsPersistence$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserColorsPersistence$$serializer userColorsPersistence$$serializer = new UserColorsPersistence$$serializer();
        INSTANCE = userColorsPersistence$$serializer;
        e1 e1Var = new e1("zendesk.android.internal.usercolors.UserColorsPersistence", userColorsPersistence$$serializer, 15);
        e1Var.j("onMessage", false);
        e1Var.j(InAppMessageBase.MESSAGE, false);
        e1Var.j("action", false);
        e1Var.j("onAction", false);
        e1Var.j("primary", false);
        e1Var.j("onPrimary", false);
        e1Var.j("onBusinessMessage", false);
        e1Var.j("businessMessage", false);
        e1Var.j("background", false);
        e1Var.j("onBackground", false);
        e1Var.j("secondaryAction", false);
        e1Var.j(StatusResponseUtils.RESULT_ERROR, false);
        e1Var.j("onError", false);
        e1Var.j("notify", false);
        e1Var.j("onNotify", false);
        descriptor = e1Var;
    }

    private UserColorsPersistence$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var), f0.B(l0Var)};
    }

    @Override // i90.b
    @NotNull
    public final UserColorsPersistence deserialize(@NotNull Decoder decoder) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        Integer num6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        Integer num7 = null;
        Integer num8 = null;
        Integer num9 = null;
        Integer num10 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        Integer num17 = null;
        Integer num18 = null;
        Integer num19 = null;
        Integer num20 = null;
        Integer num21 = null;
        int i11 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    num = num8;
                    num2 = num14;
                    num3 = num21;
                    z11 = false;
                    num9 = num9;
                    num8 = num;
                    num21 = num3;
                    num14 = num2;
                    break;
                case 0:
                    num = num8;
                    num2 = num14;
                    num3 = num21;
                    num20 = (Integer) aVarC.m(serialDescriptor, 0, l0.f29821a, num20);
                    i11 |= 1;
                    num9 = num9;
                    num13 = num13;
                    num8 = num;
                    num21 = num3;
                    num14 = num2;
                    break;
                case 1:
                    num5 = num8;
                    num6 = num14;
                    num21 = (Integer) aVarC.m(serialDescriptor, 1, l0.f29821a, num21);
                    i11 |= 2;
                    num13 = num13;
                    num14 = num6;
                    num8 = num5;
                    break;
                case 2:
                    num5 = num8;
                    num6 = num14;
                    num13 = (Integer) aVarC.m(serialDescriptor, 2, l0.f29821a, num13);
                    i11 |= 4;
                    num14 = num6;
                    num8 = num5;
                    break;
                case 3:
                    num5 = num8;
                    num14 = (Integer) aVarC.m(serialDescriptor, 3, l0.f29821a, num14);
                    i11 |= 8;
                    num13 = num13;
                    num8 = num5;
                    break;
                case 4:
                    num4 = num13;
                    num2 = num14;
                    num15 = (Integer) aVarC.m(serialDescriptor, 4, l0.f29821a, num15);
                    i11 |= 16;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 5:
                    num4 = num13;
                    num2 = num14;
                    num16 = (Integer) aVarC.m(serialDescriptor, 5, l0.f29821a, num16);
                    i11 |= 32;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 6:
                    num4 = num13;
                    num2 = num14;
                    num17 = (Integer) aVarC.m(serialDescriptor, 6, l0.f29821a, num17);
                    i11 |= 64;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 7:
                    num4 = num13;
                    num2 = num14;
                    num18 = (Integer) aVarC.m(serialDescriptor, 7, l0.f29821a, num18);
                    i11 |= 128;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 8:
                    num4 = num13;
                    num2 = num14;
                    num19 = (Integer) aVarC.m(serialDescriptor, 8, l0.f29821a, num19);
                    i11 |= 256;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 9:
                    num4 = num13;
                    num2 = num14;
                    num7 = (Integer) aVarC.m(serialDescriptor, 9, l0.f29821a, num7);
                    i11 |= 512;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 10:
                    num4 = num13;
                    num2 = num14;
                    num10 = (Integer) aVarC.m(serialDescriptor, 10, l0.f29821a, num10);
                    i11 |= 1024;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 11:
                    num4 = num13;
                    num2 = num14;
                    num11 = (Integer) aVarC.m(serialDescriptor, 11, l0.f29821a, num11);
                    i11 |= NewHope.SENDB_BYTES;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 12:
                    num4 = num13;
                    num2 = num14;
                    num9 = (Integer) aVarC.m(serialDescriptor, 12, l0.f29821a, num9);
                    i11 |= 4096;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 13:
                    num4 = num13;
                    num2 = num14;
                    num8 = (Integer) aVarC.m(serialDescriptor, 13, l0.f29821a, num8);
                    i11 |= 8192;
                    num13 = num4;
                    num14 = num2;
                    break;
                case 14:
                    num4 = num13;
                    num2 = num14;
                    num12 = (Integer) aVarC.m(serialDescriptor, 14, l0.f29821a, num12);
                    i11 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    num13 = num4;
                    num14 = num2;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        Integer num22 = num8;
        Integer num23 = num14;
        aVarC.b(serialDescriptor);
        return new UserColorsPersistence(i11, num20, num21, num13, num23, num15, num16, num17, num18, num19, num7, num10, num11, num9, num22, num12, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserColorsPersistence value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        UserColorsPersistence.write$Self$zendesk_zendesk_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
