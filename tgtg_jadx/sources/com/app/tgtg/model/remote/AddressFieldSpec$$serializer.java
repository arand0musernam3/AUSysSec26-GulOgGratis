package com.app.tgtg.model.remote;

import c50.w;
import com.app.tgtg.model.remote.user.response.AddressField;
import com.app.tgtg.model.remote.user.response.AddressFieldSerializer;
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
import m90.l0;
import m90.m1;
import m90.r1;
import o30.f0;
import org.jetbrains.annotations.NotNull;
import u70.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/app/tgtg/model/remote/AddressFieldSpec.$serializer", "Lm90/d0;", "Lcom/app/tgtg/model/remote/AddressFieldSpec;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/app/tgtg/model/remote/AddressFieldSpec;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/app/tgtg/model/remote/AddressFieldSpec;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@d
public final /* synthetic */ class AddressFieldSpec$$serializer implements d0 {
    public static final int $stable;

    @NotNull
    public static final AddressFieldSpec$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        AddressFieldSpec$$serializer addressFieldSpec$$serializer = new AddressFieldSpec$$serializer();
        INSTANCE = addressFieldSpec$$serializer;
        $stable = 8;
        e1 e1Var = new e1("com.app.tgtg.model.remote.AddressFieldSpec", addressFieldSpec$$serializer, 5);
        e1Var.j("field", true);
        e1Var.j("required", true);
        e1Var.j("max_length", true);
        e1Var.j("regex", true);
        e1Var.j("keyboard_type", true);
        descriptor = e1Var;
    }

    private AddressFieldSpec$$serializer() {
    }

    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{f0.B(AddressFieldSerializer.INSTANCE), f0.B(g.f29797a), f0.B(l0.f29821a), f0.B(r1.f29848a), f0.B(ServerKeyboardTypesSerializer.INSTANCE)};
    }

    @Override // i90.b
    @NotNull
    public final AddressFieldSpec deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        int i11 = 0;
        AddressField addressField = null;
        Boolean bool = null;
        Integer num = null;
        String str = null;
        ServerKeyboardTypes serverKeyboardTypes = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                addressField = (AddressField) aVarC.m(serialDescriptor, 0, AddressFieldSerializer.INSTANCE, addressField);
                i11 |= 1;
            } else if (iW == 1) {
                bool = (Boolean) aVarC.m(serialDescriptor, 1, g.f29797a, bool);
                i11 |= 2;
            } else if (iW == 2) {
                num = (Integer) aVarC.m(serialDescriptor, 2, l0.f29821a, num);
                i11 |= 4;
            } else if (iW == 3) {
                str = (String) aVarC.m(serialDescriptor, 3, r1.f29848a, str);
                i11 |= 8;
            } else {
                if (iW != 4) {
                    w.e(iW);
                    return null;
                }
                serverKeyboardTypes = (ServerKeyboardTypes) aVarC.m(serialDescriptor, 4, ServerKeyboardTypesSerializer.INSTANCE, serverKeyboardTypes);
                i11 |= 16;
            }
        }
        aVarC.b(serialDescriptor);
        return new AddressFieldSpec(i11, addressField, bool, num, str, serverKeyboardTypes, (m1) null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull AddressFieldSpec value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b bVarC = encoder.c(serialDescriptor);
        AddressFieldSpec.write$Self$app(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
