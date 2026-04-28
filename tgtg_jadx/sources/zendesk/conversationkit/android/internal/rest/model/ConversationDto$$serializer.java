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
import m90.m1;
import m90.r1;
import m90.v;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.conversationkit.android.model.ConversationRoutingStatus;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/internal/rest/model/ConversationDto.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/internal/rest/model/ConversationDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ConversationDto$$serializer implements d0 {

    @NotNull
    public static final ConversationDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ConversationDto$$serializer conversationDto$$serializer = new ConversationDto$$serializer();
        INSTANCE = conversationDto$$serializer;
        e1 e1Var = new e1("zendesk.conversationkit.android.internal.rest.model.ConversationDto", conversationDto$$serializer, 15);
        e1Var.j("_id", false);
        e1Var.j("displayName", false);
        e1Var.j("description", false);
        e1Var.j("iconUrl", false);
        e1Var.j("type", false);
        e1Var.j("isDefault", false);
        e1Var.j("appMakers", false);
        e1Var.j("appMakerLastRead", false);
        e1Var.j("lastUpdatedAt", false);
        e1Var.j("participants", false);
        e1Var.j("messages", false);
        e1Var.j("status", false);
        e1Var.j("metadata", false);
        e1Var.j("routingStatus", true);
        e1Var.j("createdAt", false);
        descriptor = e1Var;
    }

    private ConversationDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = ConversationDto.$childSerializers;
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB = f0.B(r1Var);
        KSerializer kSerializerB2 = f0.B(r1Var);
        KSerializer kSerializerB3 = f0.B(r1Var);
        KSerializer kSerializerB4 = f0.B((KSerializer) jVarArr[6].getValue());
        v vVar = v.f29868a;
        return new KSerializer[]{r1Var, kSerializerB, kSerializerB2, kSerializerB3, r1Var, g.f29797a, kSerializerB4, f0.B(vVar), f0.B(vVar), f0.B((KSerializer) jVarArr[9].getValue()), f0.B((KSerializer) jVarArr[10].getValue()), f0.B(r1Var), f0.B((KSerializer) jVarArr[12].getValue()), ConversationRoutingStatus.ConversationRoutingStatusSerializer.INSTANCE, f0.B(vVar)};
    }

    @Override // i90.b
    @NotNull
    public final ConversationDto deserialize(@NotNull Decoder decoder) {
        String str;
        String str2;
        Double d3;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = ConversationDto.$childSerializers;
        Double d11 = null;
        Double d12 = null;
        ConversationRoutingStatus conversationRoutingStatus = null;
        Map map = null;
        List list = null;
        List list2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String strU = null;
        String str7 = null;
        List list3 = null;
        Double d13 = null;
        String strU2 = null;
        int i11 = 0;
        boolean z11 = true;
        boolean zT = false;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    str4 = str4;
                    strU = strU;
                    break;
                case 0:
                    d3 = d12;
                    str3 = strU;
                    strU2 = aVarC.u(serialDescriptor, 0);
                    i11 |= 1;
                    str4 = str4;
                    strU = str3;
                    d12 = d3;
                    break;
                case 1:
                    str3 = strU;
                    d3 = d12;
                    str4 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str4);
                    i11 |= 2;
                    strU = str3;
                    d12 = d3;
                    break;
                case 2:
                    str = str4;
                    str2 = strU;
                    str5 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str5);
                    i11 |= 4;
                    strU = str2;
                    str4 = str;
                    break;
                case 3:
                    str = str4;
                    str2 = strU;
                    str6 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str6);
                    i11 |= 8;
                    strU = str2;
                    str4 = str;
                    break;
                case 4:
                    str = str4;
                    strU = aVarC.u(serialDescriptor, 4);
                    i11 |= 16;
                    str4 = str;
                    break;
                case 5:
                    str = str4;
                    zT = aVarC.t(serialDescriptor, 5);
                    i11 |= 32;
                    str4 = str;
                    break;
                case 6:
                    str = str4;
                    str2 = strU;
                    list3 = (List) aVarC.m(serialDescriptor, 6, (b) jVarArr[6].getValue(), list3);
                    i11 |= 64;
                    strU = str2;
                    str4 = str;
                    break;
                case 7:
                    str = str4;
                    str2 = strU;
                    d13 = (Double) aVarC.m(serialDescriptor, 7, v.f29868a, d13);
                    i11 |= 128;
                    strU = str2;
                    str4 = str;
                    break;
                case 8:
                    str = str4;
                    str2 = strU;
                    d11 = (Double) aVarC.m(serialDescriptor, 8, v.f29868a, d11);
                    i11 |= 256;
                    strU = str2;
                    str4 = str;
                    break;
                case 9:
                    str = str4;
                    str2 = strU;
                    list = (List) aVarC.m(serialDescriptor, 9, (b) jVarArr[9].getValue(), list);
                    i11 |= 512;
                    strU = str2;
                    str4 = str;
                    break;
                case 10:
                    str = str4;
                    str2 = strU;
                    list2 = (List) aVarC.m(serialDescriptor, 10, (b) jVarArr[10].getValue(), list2);
                    i11 |= 1024;
                    strU = str2;
                    str4 = str;
                    break;
                case 11:
                    str = str4;
                    str2 = strU;
                    str7 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str7);
                    i11 |= NewHope.SENDB_BYTES;
                    strU = str2;
                    str4 = str;
                    break;
                case 12:
                    str = str4;
                    str2 = strU;
                    map = (Map) aVarC.m(serialDescriptor, 12, (b) jVarArr[12].getValue(), map);
                    i11 |= 4096;
                    strU = str2;
                    str4 = str;
                    break;
                case 13:
                    str = str4;
                    str2 = strU;
                    conversationRoutingStatus = (ConversationRoutingStatus) aVarC.n(serialDescriptor, 13, ConversationRoutingStatus.ConversationRoutingStatusSerializer.INSTANCE, conversationRoutingStatus);
                    i11 |= 8192;
                    strU = str2;
                    str4 = str;
                    break;
                case 14:
                    str2 = strU;
                    str = str4;
                    d12 = (Double) aVarC.m(serialDescriptor, 14, v.f29868a, d12);
                    i11 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    strU = str2;
                    str4 = str;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        String str8 = strU;
        aVarC.b(serialDescriptor);
        List list4 = list2;
        return new ConversationDto(i11, strU2, str4, str5, str6, str8, zT, list3, d13, d11, list, list4, str7, map, conversationRoutingStatus, d12, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ConversationDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        ConversationDto.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
