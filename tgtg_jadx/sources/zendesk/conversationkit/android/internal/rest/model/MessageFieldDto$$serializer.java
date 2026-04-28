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
import m90.l0;
import m90.r1;
import o30.f0;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/rest/model/MessageFieldDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/rest/model/MessageFieldDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class MessageFieldDto$$serializer implements d0 {

    @NotNull
    public static final MessageFieldDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        MessageFieldDto$$serializer messageFieldDto$$serializer = new MessageFieldDto$$serializer();
        INSTANCE = messageFieldDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.rest.model.MessageFieldDto", messageFieldDto$$serializer, 13);
        e1Var.j("_id", false);
        e1Var.j("name", false);
        e1Var.j(AnnotatedPrivateKey.LABEL, false);
        e1Var.j("type", false);
        e1Var.j("metadata", false);
        e1Var.j("placeholder", false);
        e1Var.j(TextBundle.TEXT_ENTRY, false);
        e1Var.j("minSize", false);
        e1Var.j("maxSize", false);
        e1Var.j("email", false);
        e1Var.j("options", false);
        e1Var.j("select", false);
        e1Var.j("selectSize", false);
        descriptor = e1Var;
    }

    private MessageFieldDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = MessageFieldDto.$childSerializers;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B((KSerializer) jVarArr[4].getValue());
        KSerializer kSerializerB2 = f0.B(r1Var);
        KSerializer kSerializerB3 = f0.B(r1Var);
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{r1Var, r1Var, r1Var, r1Var, kSerializerB, kSerializerB2, kSerializerB3, f0.B(l0Var), f0.B(l0Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[10].getValue()), f0.B((KSerializer) jVarArr[11].getValue()), f0.B(l0Var)};
    }

    @Override // i90.b
    @NotNull
    public final MessageFieldDto deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = MessageFieldDto.$childSerializers;
        Integer num = null;
        Integer num2 = null;
        List list = null;
        String str4 = null;
        List list2 = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        Map map = null;
        String str5 = null;
        String str6 = null;
        Integer num3 = null;
        int i11 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    str = strU2;
                    z11 = false;
                    strU2 = str;
                    break;
                case 0:
                    str = strU2;
                    i11 |= 1;
                    strU = aVarC.u(serialDescriptor, 0);
                    strU2 = str;
                    break;
                case 1:
                    str3 = strU;
                    strU2 = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    strU = str3;
                    break;
                case 2:
                    str3 = strU;
                    strU3 = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    strU = str3;
                    break;
                case 3:
                    str3 = strU;
                    strU4 = aVarC.u(serialDescriptor, 3);
                    i11 |= 8;
                    strU = str3;
                    break;
                case 4:
                    str2 = strU;
                    str = strU2;
                    map = (Map) aVarC.m(serialDescriptor, 4, (b) jVarArr[4].getValue(), map);
                    i11 |= 16;
                    strU = str2;
                    strU2 = str;
                    break;
                case 5:
                    str2 = strU;
                    str = strU2;
                    str5 = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str5);
                    i11 |= 32;
                    strU = str2;
                    strU2 = str;
                    break;
                case 6:
                    str2 = strU;
                    str = strU2;
                    str6 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str6);
                    i11 |= 64;
                    strU = str2;
                    strU2 = str;
                    break;
                case 7:
                    str2 = strU;
                    str = strU2;
                    num3 = (Integer) aVarC.m(serialDescriptor, 7, l0.f29821a, num3);
                    i11 |= 128;
                    strU = str2;
                    strU2 = str;
                    break;
                case 8:
                    str2 = strU;
                    str = strU2;
                    num = (Integer) aVarC.m(serialDescriptor, 8, l0.f29821a, num);
                    i11 |= 256;
                    strU = str2;
                    strU2 = str;
                    break;
                case 9:
                    str2 = strU;
                    str = strU2;
                    str4 = (String) aVarC.m(serialDescriptor, 9, r1.f29848a, str4);
                    i11 |= 512;
                    strU = str2;
                    strU2 = str;
                    break;
                case 10:
                    str2 = strU;
                    str = strU2;
                    list2 = (List) aVarC.m(serialDescriptor, 10, (b) jVarArr[10].getValue(), list2);
                    i11 |= 1024;
                    strU = str2;
                    strU2 = str;
                    break;
                case 11:
                    str2 = strU;
                    str = strU2;
                    list = (List) aVarC.m(serialDescriptor, 11, (b) jVarArr[11].getValue(), list);
                    i11 |= NewHope.SENDB_BYTES;
                    strU = str2;
                    strU2 = str;
                    break;
                case 12:
                    str2 = strU;
                    str = strU2;
                    num2 = (Integer) aVarC.m(serialDescriptor, 12, l0.f29821a, num2);
                    i11 |= 4096;
                    strU = str2;
                    strU2 = str;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new MessageFieldDto(i11, strU, strU2, strU3, strU4, map, str5, str6, num3, num, str4, list2, list, num2, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull MessageFieldDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        MessageFieldDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
