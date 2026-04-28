package zendesk.conversationkit.android.internal.rest.model;

import c50.w;
import i90.b;
import java.util.List;
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
import m90.v;
import o30.f0;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/rest/model/MessageDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/rest/model/MessageDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/rest/model/MessageDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageDto$$serializer implements d0 {

    @NotNull
    public static final MessageDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageDto$$serializer messageDto$$serializer = new MessageDto$$serializer();
        INSTANCE = messageDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.rest.model.MessageDto", messageDto$$serializer, 27);
        e1Var.j("_id", false);
        e1Var.j("authorId", false);
        e1Var.j("role", false);
        e1Var.j("subroles", false);
        e1Var.j("name", false);
        e1Var.j("avatarUrl", false);
        e1Var.j("received", false);
        e1Var.j("type", false);
        e1Var.j(TextBundle.TEXT_ENTRY, false);
        e1Var.j("textFallback", false);
        e1Var.j("altText", false);
        e1Var.j("payload", false);
        e1Var.j("metadata", false);
        e1Var.j("mediaUrl", false);
        e1Var.j("mediaType", false);
        e1Var.j("mediaSize", false);
        e1Var.j("coordinates", false);
        e1Var.j("location", false);
        e1Var.j("actions", false);
        e1Var.j("items", false);
        e1Var.j("displaySettings", false);
        e1Var.j("blockChatInput", false);
        e1Var.j("fields", false);
        e1Var.j("quotedMessageId", false);
        e1Var.j("source", false);
        e1Var.j("attachmentId", false);
        e1Var.j("htmlText", false);
        descriptor = e1Var;
    }

    private MessageDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MessageDto.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, r1Var, f0.B((KSerializer) jVarArr[3].getValue()), f0.B(r1Var), f0.B(r1Var), v.f29868a, r1Var, f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[12].getValue()), f0.B(r1Var), f0.B(r1Var), f0.B(q0.f29842a), f0.B(CoordinatesDto$$serializer.INSTANCE), f0.B(LocationDto$$serializer.INSTANCE), f0.B((KSerializer) jVarArr[18].getValue()), f0.B((KSerializer) jVarArr[19].getValue()), f0.B(DisplaySettingsDto$$serializer.INSTANCE), f0.B(g.f29797a), f0.B((KSerializer) jVarArr[22].getValue()), f0.B(r1Var), f0.B(MessageSourceDto$$serializer.INSTANCE), f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final MessageDto deserialize(@NotNull Decoder decoder) {
        String str;
        int i11;
        int i12;
        Long l;
        String str2;
        List list;
        String str3;
        List list2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MessageDto.$childSerializers;
        List list3 = null;
        Long l7 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        CoordinatesDto coordinatesDto = null;
        LocationDto locationDto = null;
        List list4 = null;
        List list5 = null;
        DisplaySettingsDto displaySettingsDto = null;
        Boolean bool = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        List list6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        Map map = null;
        String str13 = null;
        double dY = 0.0d;
        int i13 = 0;
        boolean z11 = true;
        String str14 = null;
        MessageSourceDto messageSourceDto = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    i13 = i13;
                    str4 = str4;
                    str9 = str9;
                    list3 = list3;
                    break;
                case 0:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    strU2 = aVarC.u(serialDescriptor, 0);
                    str9 = str9;
                    i13 |= 1;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 1:
                    str = str4;
                    strU3 = aVarC.u(serialDescriptor, 1);
                    str9 = str9;
                    list3 = list3;
                    l7 = l7;
                    i13 |= 2;
                    str4 = str;
                    break;
                case 2:
                    l = l7;
                    strU4 = aVarC.u(serialDescriptor, 2);
                    str9 = str9;
                    list3 = list3;
                    i13 |= 4;
                    l7 = l;
                    break;
                case 3:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str3 = str9;
                    list6 = (List) aVarC.m(serialDescriptor, 3, (b) jVarArr[3].getValue(), list6);
                    i13 |= 8;
                    str9 = str3;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 4:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str3 = str9;
                    str7 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str7);
                    i13 |= 16;
                    str9 = str3;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 5:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str3 = str9;
                    str8 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str8);
                    i13 |= 32;
                    str9 = str3;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 6:
                    l = l7;
                    list2 = list3;
                    dY = aVarC.y(serialDescriptor, 6);
                    i13 |= 64;
                    list3 = list2;
                    l7 = l;
                    break;
                case 7:
                    l = l7;
                    list2 = list3;
                    strU = aVarC.u(serialDescriptor, 7);
                    i13 |= 128;
                    list3 = list2;
                    l7 = l;
                    break;
                case 8:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str9 = (String) aVarC.m(serialDescriptor, 8, r1.f29848a, str9);
                    i13 |= 256;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 9:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str10 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str10);
                    i13 |= 512;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 10:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str11 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str11);
                    i13 |= 1024;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 11:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str12 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str12);
                    i13 |= NewHope.SENDB_BYTES;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 12:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    map = (Map) aVarC.m(serialDescriptor, 12, (b) jVarArr[12].getValue(), map);
                    i13 |= 4096;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 13:
                    l = l7;
                    str2 = str4;
                    list = list3;
                    str13 = (String) aVarC.m(serialDescriptor, 13, r1.f29848a, str13);
                    i13 |= 8192;
                    list3 = list;
                    str4 = str2;
                    l7 = l;
                    break;
                case 14:
                    l = l7;
                    str4 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str4);
                    i13 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    l7 = l;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str = str4;
                    i11 = i13;
                    l7 = (Long) aVarC.m(serialDescriptor, 15, q0.f29842a, l7);
                    i12 = 32768;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 16:
                    str = str4;
                    i11 = i13;
                    coordinatesDto = (CoordinatesDto) aVarC.m(serialDescriptor, 16, CoordinatesDto$$serializer.INSTANCE, coordinatesDto);
                    i12 = 65536;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 17:
                    str = str4;
                    i11 = i13;
                    locationDto = (LocationDto) aVarC.m(serialDescriptor, 17, LocationDto$$serializer.INSTANCE, locationDto);
                    i12 = 131072;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 18:
                    str = str4;
                    i11 = i13;
                    list4 = (List) aVarC.m(serialDescriptor, 18, (b) jVarArr[18].getValue(), list4);
                    i12 = 262144;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 19:
                    str = str4;
                    i11 = i13;
                    list5 = (List) aVarC.m(serialDescriptor, 19, (b) jVarArr[19].getValue(), list5);
                    i12 = 524288;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 20:
                    str = str4;
                    i11 = i13;
                    displaySettingsDto = (DisplaySettingsDto) aVarC.m(serialDescriptor, 20, DisplaySettingsDto$$serializer.INSTANCE, displaySettingsDto);
                    i12 = 1048576;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 21:
                    str = str4;
                    i11 = i13;
                    bool = (Boolean) aVarC.m(serialDescriptor, 21, g.f29797a, bool);
                    i12 = 2097152;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 22:
                    str = str4;
                    i11 = i13;
                    list3 = (List) aVarC.m(serialDescriptor, 22, (b) jVarArr[22].getValue(), list3);
                    i12 = 4194304;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 23:
                    str = str4;
                    i11 = i13;
                    str14 = (String) aVarC.m(serialDescriptor, 23, r1.f29848a, str14);
                    i12 = 8388608;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 24:
                    str = str4;
                    i11 = i13;
                    messageSourceDto = (MessageSourceDto) aVarC.m(serialDescriptor, 24, MessageSourceDto$$serializer.INSTANCE, messageSourceDto);
                    i12 = 16777216;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 25:
                    str = str4;
                    i11 = i13;
                    str5 = (String) aVarC.m(serialDescriptor, 25, r1.f29848a, str5);
                    i12 = 33554432;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                case 26:
                    i11 = i13;
                    str = str4;
                    str6 = (String) aVarC.m(serialDescriptor, 26, r1.f29848a, str6);
                    i12 = 67108864;
                    i13 = i11 | i12;
                    str4 = str;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        String str15 = str4;
        List list7 = list3;
        String str16 = str9;
        int i14 = i13;
        List list8 = list6;
        aVarC.b(serialDescriptor);
        DisplaySettingsDto displaySettingsDto2 = displaySettingsDto;
        String str17 = str7;
        Map map2 = map;
        List list9 = list4;
        return new MessageDto(i14, strU2, strU3, strU4, list8, str17, str8, dY, strU, str16, str10, str11, str12, map2, str13, str15, l7, coordinatesDto, locationDto, list9, list5, displaySettingsDto2, bool, list7, str14, messageSourceDto, str5, str6, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MessageDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
