package zendesk.guidekit.android.internal.rest.model;

import c50.w;
import com.braze.Constants;
import i90.b;
import java.util.Date;
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
import m90.q0;
import m90.r1;
import o30.f0;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/guidekit/android/internal/rest/model/AttachmentDto.$serializer", "Lm90/d0;", "Lzendesk/guidekit/android/internal/rest/model/AttachmentDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/guidekit/android/internal/rest/model/AttachmentDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/guidekit/android/internal/rest/model/AttachmentDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class AttachmentDto$$serializer implements d0 {

    @NotNull
    public static final AttachmentDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AttachmentDto$$serializer attachmentDto$$serializer = new AttachmentDto$$serializer();
        INSTANCE = attachmentDto$$serializer;
        e1 e1Var = new e1("zendesk.guidekit.android.internal.rest.model.AttachmentDto", attachmentDto$$serializer, 12);
        e1Var.j("article_id", false);
        e1Var.j("content_type", true);
        e1Var.j("content_url", true);
        e1Var.j("created_at", true);
        e1Var.j("display_file_name", true);
        e1Var.j("file_name", true);
        e1Var.j("relative_path", true);
        e1Var.j("updated_at", true);
        e1Var.j("id", false);
        e1Var.j("inline", true);
        e1Var.j("size", true);
        e1Var.j(Constants.BRAZE_WEBVIEW_URL_EXTRA, true);
        descriptor = e1Var;
    }

    private AttachmentDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = AttachmentDto.$childSerializers;
        q0 q0Var = q0.f29842a;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{q0Var, f0.B(r1Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[3].getValue()), f0.B(r1Var), f0.B(r1Var), f0.B(r1Var), f0.B((KSerializer) jVarArr[7].getValue()), q0Var, f0.B(g.f29797a), f0.B(q0Var), f0.B(r1Var)};
    }

    @Override // i90.b
    @NotNull
    public final AttachmentDto deserialize(@NotNull Decoder decoder) {
        j[] jVarArr;
        long jK;
        j[] jVarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr3 = AttachmentDto.$childSerializers;
        String str = null;
        long j9 = 0;
        long jK2 = 0;
        String str2 = null;
        String str3 = null;
        Date date = null;
        Boolean bool = null;
        Long l = null;
        String str4 = null;
        String str5 = null;
        Date date2 = null;
        String str6 = null;
        int i11 = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    jVarArr2 = jVarArr3;
                    z11 = false;
                    jVarArr3 = jVarArr2;
                    break;
                case 0:
                    jVarArr = jVarArr3;
                    jK = aVarC.k(serialDescriptor, 0);
                    i11 |= 1;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 1:
                    jVarArr = jVarArr3;
                    jK = j9;
                    str4 = (String) aVarC.m(serialDescriptor, 1, r1.f29848a, str4);
                    i11 |= 2;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 2:
                    jVarArr = jVarArr3;
                    jK = j9;
                    str5 = (String) aVarC.m(serialDescriptor, 2, r1.f29848a, str5);
                    i11 |= 4;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 3:
                    jVarArr = jVarArr3;
                    jK = j9;
                    date2 = (Date) aVarC.m(serialDescriptor, 3, (b) jVarArr[3].getValue(), date2);
                    i11 |= 8;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 4:
                    jVarArr = jVarArr3;
                    jK = j9;
                    str6 = (String) aVarC.m(serialDescriptor, 4, r1.f29848a, str6);
                    i11 |= 16;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 5:
                    jVarArr = jVarArr3;
                    jK = j9;
                    str = (String) aVarC.m(serialDescriptor, 5, r1.f29848a, str);
                    i11 |= 32;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 6:
                    jVarArr = jVarArr3;
                    jK = j9;
                    str3 = (String) aVarC.m(serialDescriptor, 6, r1.f29848a, str3);
                    i11 |= 64;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 7:
                    jVarArr = jVarArr3;
                    jK = j9;
                    date = (Date) aVarC.m(serialDescriptor, 7, (b) jVarArr[7].getValue(), date);
                    i11 |= 128;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 8:
                    jVarArr2 = jVarArr3;
                    jK2 = aVarC.k(serialDescriptor, 8);
                    i11 |= 256;
                    jVarArr3 = jVarArr2;
                    break;
                case 9:
                    jVarArr = jVarArr3;
                    jK = j9;
                    bool = (Boolean) aVarC.m(serialDescriptor, 9, g.f29797a, bool);
                    i11 |= 512;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 10:
                    jVarArr = jVarArr3;
                    jK = j9;
                    l = (Long) aVarC.m(serialDescriptor, 10, q0.f29842a, l);
                    i11 |= 1024;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                case 11:
                    jVarArr = jVarArr3;
                    jK = j9;
                    str2 = (String) aVarC.m(serialDescriptor, 11, r1.f29848a, str2);
                    i11 |= NewHope.SENDB_BYTES;
                    jVarArr3 = jVarArr;
                    j9 = jK;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new AttachmentDto(i11, j9, str4, str5, date2, str6, str, str3, date, jK2, bool, l, str2, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AttachmentDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        AttachmentDto.write$Self$zendesk_guidekit_guidekit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
