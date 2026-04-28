package zendesk.conversationkit.android.model;

import c50.w;
import i90.b;
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
import m90.l0;
import m90.r1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.conversationkit.android.model.Field;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/conversationkit/android/model/Field.Select.$serializer", "Lm90/d0;", "Lzendesk/conversationkit/android/model/Field$Select;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/conversationkit/android/model/Field$Select;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/conversationkit/android/model/Field$Select;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.conversationkit_conversationkit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class Field$Select$$serializer implements d0 {

    @NotNull
    public static final Field$Select$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Field$Select$$serializer field$Select$$serializer = new Field$Select$$serializer();
        INSTANCE = field$Select$$serializer;
        e1 e1Var = new e1("select", field$Select$$serializer, 8);
        e1Var.j("fieldType", false);
        e1Var.j("id", false);
        e1Var.j("name", false);
        e1Var.j(AnnotatedPrivateKey.LABEL, false);
        e1Var.j("placeholder", false);
        e1Var.j("options", false);
        e1Var.j("selectSize", false);
        e1Var.j("select", false);
        descriptor = e1Var;
    }

    private Field$Select$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        j[] jVarArr = Field.Select.$childSerializers;
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{jVarArr[0].getValue(), r1Var, r1Var, r1Var, r1Var, jVarArr[5].getValue(), l0.f29821a, jVarArr[7].getValue()};
    }

    @Override // i90.b
    @NotNull
    public final Field.Select deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = Field.Select.$childSerializers;
        FieldType fieldType = null;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        String strU4 = null;
        List list = null;
        List list2 = null;
        int i11 = 0;
        int iQ = 0;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            switch (iW) {
                case -1:
                    z11 = false;
                    break;
                case 0:
                    fieldType = (FieldType) aVarC.n(serialDescriptor, 0, (b) jVarArr[0].getValue(), fieldType);
                    i11 |= 1;
                    break;
                case 1:
                    strU = aVarC.u(serialDescriptor, 1);
                    i11 |= 2;
                    break;
                case 2:
                    strU2 = aVarC.u(serialDescriptor, 2);
                    i11 |= 4;
                    break;
                case 3:
                    strU3 = aVarC.u(serialDescriptor, 3);
                    i11 |= 8;
                    break;
                case 4:
                    strU4 = aVarC.u(serialDescriptor, 4);
                    i11 |= 16;
                    break;
                case 5:
                    list = (List) aVarC.n(serialDescriptor, 5, (b) jVarArr[5].getValue(), list);
                    i11 |= 32;
                    break;
                case 6:
                    iQ = aVarC.q(serialDescriptor, 6);
                    i11 |= 64;
                    break;
                case 7:
                    list2 = (List) aVarC.n(serialDescriptor, 7, (b) jVarArr[7].getValue(), list2);
                    i11 |= 128;
                    break;
                default:
                    w.e(iW);
                    return null;
            }
        }
        aVarC.b(serialDescriptor);
        return new Field.Select(i11, fieldType, strU, strU2, strU3, strU4, list, iQ, list2, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Field.Select value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        Field.Select.write$Self$zendesk_conversationkit_conversationkit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
