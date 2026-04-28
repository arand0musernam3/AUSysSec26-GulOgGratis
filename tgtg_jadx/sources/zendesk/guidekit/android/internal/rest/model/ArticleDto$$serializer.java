package zendesk.guidekit.android.internal.rest.model;

import c50.w;
import com.braze.Constants;
import i90.b;
import java.util.Date;
import java.util.List;
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
import o30.f0;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/guidekit/android/internal/rest/model/ArticleDto.$serializer", "Lm90/d0;", "Lzendesk/guidekit/android/internal/rest/model/ArticleDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/guidekit/android/internal/rest/model/ArticleDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/guidekit/android/internal/rest/model/ArticleDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class ArticleDto$$serializer implements d0 {

    @NotNull
    public static final ArticleDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        ArticleDto$$serializer articleDto$$serializer = new ArticleDto$$serializer();
        INSTANCE = articleDto$$serializer;
        e1 e1Var = new e1("zendesk.guidekit.android.internal.rest.model.ArticleDto", articleDto$$serializer, 20);
        e1Var.j("author_id", true);
        e1Var.j("comments_disabled", true);
        e1Var.j("created_at", true);
        e1Var.j("html_url", true);
        e1Var.j("label_names", true);
        e1Var.j("section_id", true);
        e1Var.j("source_locale", true);
        e1Var.j("updated_at", true);
        e1Var.j("vote_count", true);
        e1Var.j("vote_sum", true);
        e1Var.j("body", true);
        e1Var.j("draft", true);
        e1Var.j("id", false);
        e1Var.j("locale", false);
        e1Var.j("name", true);
        e1Var.j("outdated", true);
        e1Var.j("position", true);
        e1Var.j("promoted", true);
        e1Var.j(MessageBundle.TITLE_ENTRY, true);
        e1Var.j(Constants.BRAZE_WEBVIEW_URL_EXTRA, true);
        descriptor = e1Var;
    }

    private ArticleDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = ArticleDto.$childSerializers;
        q0 q0Var = q0.f29842a;
        KSerializer kSerializerB = f0.B(q0Var);
        g gVar = g.f29797a;
        KSerializer kSerializerB2 = f0.B(gVar);
        KSerializer kSerializerB3 = f0.B((KSerializer) jVarArr[2].getValue());
        r1 r1Var = r1.f29848a;
        KSerializer kSerializerB4 = f0.B(r1Var);
        KSerializer kSerializerB5 = f0.B((KSerializer) jVarArr[4].getValue());
        KSerializer kSerializerB6 = f0.B(q0Var);
        KSerializer kSerializerB7 = f0.B(r1Var);
        KSerializer kSerializerB8 = f0.B((KSerializer) jVarArr[7].getValue());
        l0 l0Var = l0.f29821a;
        return new KSerializer[]{kSerializerB, kSerializerB2, kSerializerB3, kSerializerB4, kSerializerB5, kSerializerB6, kSerializerB7, kSerializerB8, f0.B(l0Var), f0.B(l0Var), f0.B(r1Var), f0.B(gVar), q0Var, r1Var, f0.B(r1Var), f0.B(gVar), f0.B(l0Var), f0.B(gVar), f0.B(r1Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final ArticleDto deserialize(@NotNull Decoder decoder) {
        String str;
        Long l;
        int i11;
        Boolean bool;
        Long l7;
        String str2;
        Long l11;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = ArticleDto.$childSerializers;
        String str3 = null;
        Boolean bool2 = null;
        String str4 = null;
        Boolean bool3 = null;
        Integer num = null;
        String str5 = null;
        Integer num2 = null;
        Boolean bool4 = null;
        String str6 = null;
        String str7 = null;
        Long l12 = null;
        Long l13 = null;
        Boolean bool5 = null;
        Date date = null;
        String str8 = null;
        String strU = null;
        List list = null;
        long jK = 0;
        int i12 = 0;
        boolean z11 = true;
        Date date2 = null;
        Integer num3 = null;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    bool = bool2;
                    l7 = l13;
                    z11 = false;
                    str4 = str4;
                    l12 = l12;
                    l13 = l7;
                    bool2 = bool;
                    break;
                case 0:
                    bool = bool2;
                    l7 = (Long) aVarC.m(serialDescriptor, 0, q0.f29842a, l13);
                    i12 |= 1;
                    str4 = str4;
                    l12 = l12;
                    str3 = str3;
                    l13 = l7;
                    bool2 = bool;
                    break;
                case 1:
                    bool = bool2;
                    str2 = str3;
                    l11 = l12;
                    bool5 = (Boolean) aVarC.m(serialDescriptor, 1, g.f29797a, bool5);
                    i12 |= 2;
                    date = date;
                    l12 = l11;
                    str3 = str2;
                    bool2 = bool;
                    break;
                case 2:
                    bool = bool2;
                    str2 = str3;
                    l11 = l12;
                    date = (Date) aVarC.m(serialDescriptor, 2, (b) jVarArr[2].getValue(), date);
                    i12 |= 4;
                    l12 = l11;
                    str3 = str2;
                    bool2 = bool;
                    break;
                case 3:
                    bool = bool2;
                    str2 = str3;
                    l11 = l12;
                    str8 = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str8);
                    i12 |= 8;
                    l12 = l11;
                    str3 = str2;
                    bool2 = bool;
                    break;
                case 4:
                    bool = bool2;
                    str2 = str3;
                    l11 = l12;
                    list = (List) aVarC.m(serialDescriptor, 4, (b) jVarArr[4].getValue(), list);
                    i12 |= 16;
                    l12 = l11;
                    str3 = str2;
                    bool2 = bool;
                    break;
                case 5:
                    bool = bool2;
                    str2 = str3;
                    l12 = (Long) aVarC.m(serialDescriptor, 5, q0.f29842a, l12);
                    i12 |= 32;
                    str3 = str2;
                    bool2 = bool;
                    break;
                case 6:
                    bool = bool2;
                    str3 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str3);
                    i12 |= 64;
                    l12 = l12;
                    bool2 = bool;
                    break;
                case 7:
                    str = str3;
                    l = l12;
                    date2 = (Date) aVarC.m(serialDescriptor, 7, (b) jVarArr[7].getValue(), date2);
                    i12 |= 128;
                    l12 = l;
                    str3 = str;
                    break;
                case 8:
                    str = str3;
                    l = l12;
                    num3 = (Integer) aVarC.m(serialDescriptor, 8, l0.f29821a, num3);
                    i12 |= 256;
                    l12 = l;
                    str3 = str;
                    break;
                case 9:
                    str = str3;
                    l = l12;
                    num = (Integer) aVarC.m(serialDescriptor, 9, l0.f29821a, num);
                    i12 |= 512;
                    l12 = l;
                    str3 = str;
                    break;
                case 10:
                    str = str3;
                    l = l12;
                    str5 = (String) aVarC.m(serialDescriptor, 10, r1.f29848a, str5);
                    i12 |= 1024;
                    l12 = l;
                    str3 = str;
                    break;
                case 11:
                    str = str3;
                    l = l12;
                    bool3 = (Boolean) aVarC.m(serialDescriptor, 11, g.f29797a, bool3);
                    i12 |= NewHope.SENDB_BYTES;
                    l12 = l;
                    str3 = str;
                    break;
                case 12:
                    str = str3;
                    jK = aVarC.k(serialDescriptor, 12);
                    i12 |= 4096;
                    str3 = str;
                    break;
                case 13:
                    str = str3;
                    strU = aVarC.u(serialDescriptor, 13);
                    i12 |= 8192;
                    str3 = str;
                    break;
                case 14:
                    str = str3;
                    l = l12;
                    str4 = (String) aVarC.m(serialDescriptor, 14, r1.f29848a, str4);
                    i12 |= BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE;
                    l12 = l;
                    str3 = str;
                    break;
                case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                    str = str3;
                    l = l12;
                    bool2 = (Boolean) aVarC.m(serialDescriptor, 15, g.f29797a, bool2);
                    i11 = 32768;
                    i12 |= i11;
                    l12 = l;
                    str3 = str;
                    break;
                case 16:
                    str = str3;
                    l = l12;
                    num2 = (Integer) aVarC.m(serialDescriptor, 16, l0.f29821a, num2);
                    i11 = 65536;
                    i12 |= i11;
                    l12 = l;
                    str3 = str;
                    break;
                case 17:
                    str = str3;
                    l = l12;
                    bool4 = (Boolean) aVarC.m(serialDescriptor, 17, g.f29797a, bool4);
                    i11 = 131072;
                    i12 |= i11;
                    l12 = l;
                    str3 = str;
                    break;
                case 18:
                    str = str3;
                    l = l12;
                    str6 = (String) aVarC.m(serialDescriptor, 18, r1.f29848a, str6);
                    i11 = 262144;
                    i12 |= i11;
                    l12 = l;
                    str3 = str;
                    break;
                case 19:
                    l = l12;
                    str = str3;
                    str7 = (String) aVarC.m(serialDescriptor, 19, r1.f29848a, str7);
                    i11 = 524288;
                    i12 |= i11;
                    l12 = l;
                    str3 = str;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        Boolean bool6 = bool2;
        Long l14 = l12;
        Long l15 = l13;
        Boolean bool7 = bool5;
        Date date3 = date;
        aVarC.b(serialDescriptor);
        return new ArticleDto(i12, l15, bool7, date3, str8, list, l14, str3, date2, num3, num, str5, bool3, jK, strU, str4, bool6, num2, bool4, str6, str7, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull ArticleDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        ArticleDto.write$Self$zendesk_guidekit_guidekit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
