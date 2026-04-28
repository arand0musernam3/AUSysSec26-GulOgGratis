package zendesk.android.settings.internal.model;

import c50.w;
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
import m90.r1;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/android/settings/internal/model/ColorThemeDto.$serializer", "Lm90/d0;", "Lzendesk/android/settings/internal/model/ColorThemeDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/android/settings/internal/model/ColorThemeDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/android/settings/internal/model/ColorThemeDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ColorThemeDto$$serializer implements d0 {

    @NotNull
    public static final ColorThemeDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ColorThemeDto$$serializer colorThemeDto$$serializer = new ColorThemeDto$$serializer();
        INSTANCE = colorThemeDto$$serializer;
        e1 e1Var = new e1("zendesk.android.settings.internal.model.ColorThemeDto", colorThemeDto$$serializer, 19);
        e1Var.j("primary_color", false);
        e1Var.j("on_primary_color", false);
        e1Var.j("message_color", false);
        e1Var.j("on_message_color", false);
        e1Var.j("action_color", false);
        e1Var.j("on_action_color", false);
        e1Var.j("inbound_message_color", false);
        e1Var.j("system_message_color", false);
        e1Var.j("background_color", false);
        e1Var.j("on_background_color", false);
        e1Var.j("elevated_color", false);
        e1Var.j("notify_color", false);
        e1Var.j("success_color", false);
        e1Var.j("danger_color", false);
        e1Var.j("on_danger_color", false);
        e1Var.j("disabled_color", false);
        e1Var.j(InAppMessageBase.ICON_COLOR, false);
        e1Var.j("action_background_color", false);
        e1Var.j("on_action_background_color", false);
        descriptor = e1Var;
    }

    private ColorThemeDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var, r1Var};
    }

    @Override // i90.b
    @NotNull
    public final ColorThemeDto deserialize(@NotNull Decoder decoder) {
        int i11;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i12 = 0;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        String strU5 = null;
        String strU6 = null;
        String strU7 = null;
        String strU8 = null;
        String strU9 = null;
        String strU10 = null;
        String strU11 = null;
        String strU12 = null;
        String strU13 = null;
        String strU14 = null;
        String strU15 = null;
        String strU16 = null;
        String strU17 = null;
        String strU18 = null;
        String strU19 = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    continue;
                case 0:
                    strU = aVarC.u(serialDescriptor, 0);
                    i12 |= 1;
                    continue;
                case 1:
                    strU2 = aVarC.u(serialDescriptor, 1);
                    i12 |= 2;
                    continue;
                case 2:
                    strU3 = aVarC.u(serialDescriptor, 2);
                    i12 |= 4;
                    continue;
                case 3:
                    strU4 = aVarC.u(serialDescriptor, 3);
                    i12 |= 8;
                    continue;
                case 4:
                    strU5 = aVarC.u(serialDescriptor, 4);
                    i12 |= 16;
                    continue;
                case 5:
                    strU6 = aVarC.u(serialDescriptor, 5);
                    i12 |= 32;
                    continue;
                case 6:
                    strU7 = aVarC.u(serialDescriptor, 6);
                    i12 |= 64;
                    continue;
                case 7:
                    strU8 = aVarC.u(serialDescriptor, 7);
                    i12 |= 128;
                    continue;
                case 8:
                    strU9 = aVarC.u(serialDescriptor, 8);
                    i12 |= 256;
                    continue;
                case 9:
                    strU10 = aVarC.u(serialDescriptor, 9);
                    i12 |= 512;
                    continue;
                case 10:
                    strU11 = aVarC.u(serialDescriptor, 10);
                    i12 |= 1024;
                    continue;
                case 11:
                    strU12 = aVarC.u(serialDescriptor, 11);
                    i12 |= NewHope.SENDB_BYTES;
                    continue;
                case 12:
                    strU13 = aVarC.u(serialDescriptor, 12);
                    i12 |= 4096;
                    continue;
                case 13:
                    strU14 = aVarC.u(serialDescriptor, 13);
                    i12 |= 8192;
                    continue;
                case 14:
                    strU15 = aVarC.u(serialDescriptor, 14);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    continue;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    strU16 = aVarC.u(serialDescriptor, 15);
                    i11 = 32768;
                    break;
                case 16:
                    strU17 = aVarC.u(serialDescriptor, 16);
                    i11 = 65536;
                    break;
                case 17:
                    strU18 = aVarC.u(serialDescriptor, 17);
                    i11 = 131072;
                    break;
                case 18:
                    strU19 = aVarC.u(serialDescriptor, 18);
                    i11 = 262144;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
            i12 |= i11;
        }
        aVarC.b(serialDescriptor);
        return new ColorThemeDto(i12, strU, strU2, strU3, strU4, strU5, strU6, strU7, strU8, strU9, strU10, strU11, strU12, strU13, strU14, strU15, strU16, strU17, strU18, strU19, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ColorThemeDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        ColorThemeDto.write$Self$zendesk_zendesk_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
