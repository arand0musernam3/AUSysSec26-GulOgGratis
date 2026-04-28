package zendesk.android.internal.proactivemessaging.model;

import c50.w;
import com.braze.ui.actions.brazeactions.steps.StepData;
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
import org.jetbrains.annotations.NotNull;
import u70.d;
import u70.j;
import zendesk.android.internal.proactivemessaging.model.ConditionFunction;
import zendesk.android.internal.proactivemessaging.model.ConditionType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"zendesk/android/internal/proactivemessaging/model/Condition.$serializer", "Lm90/d0;", "Lzendesk/android/internal/proactivemessaging/model/Condition;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lzendesk/android/internal/proactivemessaging/model/Condition;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lzendesk/android/internal/proactivemessaging/model/Condition;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@d
public /* synthetic */ class Condition$$serializer implements d0 {

    @NotNull
    public static final Condition$$serializer INSTANCE;

    @NotNull
    private static final SerialDescriptor descriptor;

    static {
        Condition$$serializer condition$$serializer = new Condition$$serializer();
        INSTANCE = condition$$serializer;
        e1 e1Var = new e1("zendesk.android.internal.proactivemessaging.model.Condition", condition$$serializer, 3);
        e1Var.j("type", false);
        e1Var.j("function", false);
        e1Var.j(StepData.ARGS, false);
        descriptor = e1Var;
    }

    private Condition$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m90.d0
    @NotNull
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ConditionType.ConditionTypeSerializer.INSTANCE, ConditionFunction.ConditionFunctionSerializer.INSTANCE, Condition.$childSerializers[2].getValue()};
    }

    @Override // i90.b
    @NotNull
    public final Condition deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a aVarC = decoder.c(serialDescriptor);
        j[] jVarArr = Condition.$childSerializers;
        int i11 = 0;
        ConditionType conditionType = null;
        ConditionFunction conditionFunction = null;
        List list = null;
        boolean z11 = true;
        while (z11) {
            int iW = aVarC.w(serialDescriptor);
            if (iW == -1) {
                z11 = false;
            } else if (iW == 0) {
                conditionType = (ConditionType) aVarC.n(serialDescriptor, 0, ConditionType.ConditionTypeSerializer.INSTANCE, conditionType);
                i11 |= 1;
            } else if (iW == 1) {
                conditionFunction = (ConditionFunction) aVarC.n(serialDescriptor, 1, ConditionFunction.ConditionFunctionSerializer.INSTANCE, conditionFunction);
                i11 |= 2;
            } else {
                if (iW != 2) {
                    w.e(iW);
                    return null;
                }
                list = (List) aVarC.n(serialDescriptor, 2, (b) jVarArr[2].getValue(), list);
                i11 |= 4;
            }
        }
        aVarC.b(serialDescriptor);
        return new Condition(i11, conditionType, conditionFunction, list, null);
    }

    @Override // i90.b
    @NotNull
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(@NotNull Encoder encoder, @NotNull Condition value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        l90.b bVarC = encoder.c(serialDescriptor);
        Condition.write$Self$zendesk_zendesk_android(value, bVarC, serialDescriptor);
        bVarC.b(serialDescriptor);
    }

    @Override // m90.d0
    @NotNull
    public /* bridge */ /* synthetic */ KSerializer[] typeParametersSerializers() {
        return c1.f29765b;
    }
}
