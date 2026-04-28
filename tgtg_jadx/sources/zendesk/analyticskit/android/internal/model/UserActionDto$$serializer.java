package zendesk.analyticskit.android.internal.model;

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
import m90.r1;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/analyticskit/android/internal/model/UserActionDto.$serializer", "Lm90/d0;", "Lzendesk/analyticskit/android/internal/model/UserActionDto;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/analyticskit/android/internal/model/UserActionDto;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/analyticskit/android/internal/model/UserActionDto;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class UserActionDto$$serializer implements d0 {

    @NotNull
    public static final UserActionDto$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        UserActionDto$$serializer userActionDto$$serializer = new UserActionDto$$serializer();
        INSTANCE = userActionDto$$serializer;
        e1 e1Var = new e1("zendesk.analyticskit.android.internal.model.UserActionDto", userActionDto$$serializer, 4);
        e1Var.j("category", false);
        e1Var.j("action", false);
        e1Var.j(AnnotatedPrivateKey.LABEL, false);
        e1Var.j("value", false);
        descriptor = e1Var;
    }

    private UserActionDto$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        r1 r1Var = r1.f29848a;
        return new KSerializer[]{r1Var, r1Var, r1Var, ValueDto$$serializer.INSTANCE};
    }

    @Override // i90.b
    @NotNull
    public final UserActionDto deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        String strU = null;
        String strU2 = null;
        String strU3 = null;
        ValueDto valueDto = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                strU = aVarC.u(serialDescriptor, 0);
                i11 |= 1;
            } else if (iW == 1) {
                strU2 = aVarC.u(serialDescriptor, 1);
                i11 |= 2;
            } else if (iW == 2) {
                strU3 = aVarC.u(serialDescriptor, 2);
                i11 |= 4;
            } else {
                if (iW != 3) {
                    w.e(iW);
                    return null;
                }
                valueDto = (ValueDto) aVarC.n(serialDescriptor, 3, ValueDto$$serializer.INSTANCE, valueDto);
                i11 |= 8;
            }
        }
        aVarC.b(serialDescriptor);
        return new UserActionDto(i11, strU, strU2, strU3, valueDto, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull UserActionDto value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        UserActionDto.write$Self$zendesk_analyticskit_analyticskit_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
