package zendesk.android.settings.internal.model;

import c50.w;
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
import m90.g;
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/android/settings/internal/model/SettingsDto.$serializer", "Lm90/d0;", "Lzendesk/android/settings/internal/model/SettingsDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/android/settings/internal/model/SettingsDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/android/settings/internal/model/SettingsDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class SettingsDto$$serializer implements d0 {

    @NotNull
    public static final SettingsDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        SettingsDto$$serializer settingsDto$$serializer = new SettingsDto$$serializer();
        INSTANCE = settingsDto$$serializer;
        e1 e1Var = new e1("zendesk.android.settings.internal.model.SettingsDto", settingsDto$$serializer, 11);
        e1Var.j("identifier", false);
        e1Var.j("light_theme", false);
        e1Var.j("dark_theme", false);
        e1Var.j("show_zendesk_logo", true);
        e1Var.j("attachments_enabled", false);
        e1Var.j("native_messaging", false);
        e1Var.j("sunco_config", true);
        e1Var.j("attachment_rules", true);
        e1Var.j("end_session_enabled", true);
        e1Var.j("reopen_conversation_disabled", true);
        e1Var.j("conversation_transcript_enabled", true);
        descriptor = e1Var;
    }

    private SettingsDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        KSerializer kSerializerB = f0.B(r1.f29848a);
        g gVar = g.f29797a;
        KSerializer kSerializerB2 = f0.B(gVar);
        KSerializer kSerializerB3 = f0.B(SunCoConfigDto$$serializer.INSTANCE);
        KSerializer kSerializerB4 = f0.B(AttachmentsRulesDto$$serializer.INSTANCE);
        ColorThemeDto$$serializer colorThemeDto$$serializer = ColorThemeDto$$serializer.INSTANCE;
        return new KSerializer[]{kSerializerB, colorThemeDto$$serializer, colorThemeDto$$serializer, kSerializerB2, gVar, NativeMessagingDto$$serializer.INSTANCE, kSerializerB3, kSerializerB4, gVar, gVar, gVar};
    }

    @Override // i90.b
    @NotNull
    public final SettingsDto deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        String str = null;
        ColorThemeDto colorThemeDto = null;
        ColorThemeDto colorThemeDto2 = null;
        Boolean bool = null;
        NativeMessagingDto nativeMessagingDto = null;
        SunCoConfigDto sunCoConfigDto = null;
        AttachmentsRulesDto attachmentsRulesDto = null;
        int i11 = 0;
        boolean zT = false;
        boolean zT2 = false;
        boolean zT3 = false;
        boolean zT4 = false;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    str = (String) aVarC.m(serialDescriptor, 0, r1.f29848a, str);
                    i11 |= 1;
                    break;
                case 1:
                    colorThemeDto = (ColorThemeDto) aVarC.n(serialDescriptor, 1, ColorThemeDto$$serializer.INSTANCE, colorThemeDto);
                    i11 |= 2;
                    break;
                case 2:
                    colorThemeDto2 = (ColorThemeDto) aVarC.n(serialDescriptor, 2, ColorThemeDto$$serializer.INSTANCE, colorThemeDto2);
                    i11 |= 4;
                    break;
                case 3:
                    bool = (Boolean) aVarC.m(serialDescriptor, 3, g.f29797a, bool);
                    i11 |= 8;
                    break;
                case 4:
                    zT = aVarC.t(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    nativeMessagingDto = (NativeMessagingDto) aVarC.n(serialDescriptor, 5, NativeMessagingDto$$serializer.INSTANCE, nativeMessagingDto);
                    i11 |= 32;
                    break;
                case 6:
                    sunCoConfigDto = (SunCoConfigDto) aVarC.m(serialDescriptor, 6, SunCoConfigDto$$serializer.INSTANCE, sunCoConfigDto);
                    i11 |= 64;
                    break;
                case 7:
                    attachmentsRulesDto = (AttachmentsRulesDto) aVarC.m(serialDescriptor, 7, AttachmentsRulesDto$$serializer.INSTANCE, attachmentsRulesDto);
                    i11 |= 128;
                    break;
                case 8:
                    zT2 = aVarC.t(serialDescriptor, 8);
                    i11 |= 256;
                    break;
                case 9:
                    zT3 = aVarC.t(serialDescriptor, 9);
                    i11 |= 512;
                    break;
                case 10:
                    zT4 = aVarC.t(serialDescriptor, 10);
                    i11 |= 1024;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new SettingsDto(i11, str, colorThemeDto, colorThemeDto2, bool, zT, nativeMessagingDto, sunCoConfigDto, attachmentsRulesDto, zT2, zT3, zT4, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull SettingsDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        SettingsDto.write$Self$zendesk_zendesk_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
