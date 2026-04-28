package zendesk.conversationkit.android.internal.rest.model;

import c50.w;
import i90.b;
import java.util.Map;
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
import m90.q0;
import m90.r1;
import o30.f0;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/rest/model/MessageActionDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/rest/model/MessageActionDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageActionDto$$serializer implements d0 {

    @NotNull
    public static final MessageActionDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageActionDto$$serializer messageActionDto$$serializer = new MessageActionDto$$serializer();
        INSTANCE = messageActionDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.rest.model.MessageActionDto", messageActionDto$$serializer, 14);
        e1Var.j("_id", false);
        e1Var.j("type", false);
        e1Var.j(TextBundle.TEXT_ENTRY, false);
        e1Var.j("uri", false);
        e1Var.j("default", false);
        e1Var.j("iconUrl", false);
        e1Var.j("fallback", false);
        e1Var.j("payload", false);
        e1Var.j("metadata", false);
        e1Var.j("amount", false);
        e1Var.j("currency", false);
        e1Var.j("state", false);
        e1Var.j("openOnReceive", false);
        e1Var.j("size", false);
        descriptor = e1Var;
    }

    private MessageActionDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MessageActionDto.$childSerializers;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        g gVar = g.f29797a;
        return new KSerializer[]{r1Var, r1Var, kSerializerB, kSerializerB2, f0.B(gVar), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[8].getValue()), f0.B(q0.f29842a), f0.B(r1Var), f0.B(r1Var), f0.B(gVar), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final MessageActionDto deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MessageActionDto.$childSerializers;
        Map map = null;
        String str6 = null;
        Boolean bool = null;
        String str7 = null;
        Long l = null;
        String str8 = null;
        String strU = null;
        String str9 = null;
        String str10 = null;
        Boolean bool2 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String strU2 = null;
        int i11 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    str3 = str6;
                    str4 = str9;
                    z11 = false;
                    str9 = str4;
                    str6 = str3;
                    break;
                case 0:
                    str3 = str6;
                    str5 = strU;
                    strU2 = aVarC.u(serialDescriptor, 0);
                    i11 |= 1;
                    str9 = str9;
                    strU = str5;
                    str6 = str3;
                    break;
                case 1:
                    str3 = str6;
                    str4 = str9;
                    i11 |= 2;
                    strU = aVarC.u(serialDescriptor, 1);
                    str9 = str4;
                    str6 = str3;
                    break;
                case 2:
                    str5 = strU;
                    str3 = str6;
                    str9 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str9);
                    i11 |= 4;
                    strU = str5;
                    str6 = str3;
                    break;
                case 3:
                    str = strU;
                    str2 = str9;
                    str10 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str10);
                    i11 |= 8;
                    strU = str;
                    str9 = str2;
                    break;
                case 4:
                    str = strU;
                    str2 = str9;
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 4, g.f29797a, bool2);
                    i11 |= 16;
                    strU = str;
                    str9 = str2;
                    break;
                case 5:
                    str = strU;
                    str2 = str9;
                    str11 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str11);
                    i11 |= 32;
                    strU = str;
                    str9 = str2;
                    break;
                case 6:
                    str = strU;
                    str2 = str9;
                    str12 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str12);
                    i11 |= 64;
                    strU = str;
                    str9 = str2;
                    break;
                case 7:
                    str = strU;
                    str2 = str9;
                    str13 = (String) aVarC.m(serialDescriptor, 7, r1.f29848a, str13);
                    i11 |= 128;
                    strU = str;
                    str9 = str2;
                    break;
                case 8:
                    str = strU;
                    str2 = str9;
                    map = (Map) aVarC.m(serialDescriptor, 8, (b) jVarArr[8].getValue(), map);
                    i11 |= 256;
                    strU = str;
                    str9 = str2;
                    break;
                case 9:
                    str = strU;
                    str2 = str9;
                    l = (Long) aVarC.m(serialDescriptor, 9, q0.f29842a, l);
                    i11 |= 512;
                    strU = str;
                    str9 = str2;
                    break;
                case 10:
                    str = strU;
                    str2 = str9;
                    str8 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str8);
                    i11 |= 1024;
                    strU = str;
                    str9 = str2;
                    break;
                case 11:
                    str = strU;
                    str2 = str9;
                    str7 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str7);
                    i11 |= NewHope.SENDB_BYTES;
                    strU = str;
                    str9 = str2;
                    break;
                case 12:
                    str = strU;
                    str2 = str9;
                    bool = (Boolean) aVarC.m(serialDescriptor, 12, g.f29797a, bool);
                    i11 |= 4096;
                    strU = str;
                    str9 = str2;
                    break;
                case 13:
                    str = strU;
                    str2 = str9;
                    str6 = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str6);
                    i11 |= 8192;
                    strU = str;
                    str9 = str2;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new MessageActionDto(i11, strU2, strU, str9, str10, bool2, str11, str12, str13, map, l, str8, str7, bool, str6, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageActionDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MessageActionDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
