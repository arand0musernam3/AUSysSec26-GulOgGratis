package zendesk.android.internal.proactivemessaging.model;

import com.braze.ui.actions.brazeactions.steps.StepData;
import e0.f;
import i90.g;
import i90.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import l90.b;
import m90.c1;
import m90.d;
import m90.m1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.j;
import u70.l;
import u70.m;
import xw.a;
import zendesk.android.internal.proactivemessaging.model.ConditionFunction;
import zendesk.android.internal.proactivemessaging.model.ConditionType;
import zendesk.android.internal.proactivemessaging.model.serializer.ExpressionSerializer;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@h
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 22\u00020\u0001:\u000232B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ4\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001cR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010.\u0012\u0004\b0\u00101\u001a\u0004\b/\u0010\u001e¨\u00064"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Condition;", "", "Lzendesk/android/internal/proactivemessaging/model/ConditionType;", "type", "Lzendesk/android/internal/proactivemessaging/model/ConditionFunction;", "function", "", "Lzendesk/android/internal/proactivemessaging/model/Expression;", "expressions", "<init>", "(Lzendesk/android/internal/proactivemessaging/model/ConditionType;Lzendesk/android/internal/proactivemessaging/model/ConditionFunction;Ljava/util/List;)V", "", "seen0", "Lm90/m1;", "serializationConstructorMarker", "(ILzendesk/android/internal/proactivemessaging/model/ConditionType;Lzendesk/android/internal/proactivemessaging/model/ConditionFunction;Ljava/util/List;Lm90/m1;)V", "self", "Ll90/b;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$zendesk_zendesk_android", "(Lzendesk/android/internal/proactivemessaging/model/Condition;Ll90/b;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Lzendesk/android/internal/proactivemessaging/model/ConditionType;", "component2", "()Lzendesk/android/internal/proactivemessaging/model/ConditionFunction;", "component3", "()Ljava/util/List;", "copy", "(Lzendesk/android/internal/proactivemessaging/model/ConditionType;Lzendesk/android/internal/proactivemessaging/model/ConditionFunction;Ljava/util/List;)Lzendesk/android/internal/proactivemessaging/model/Condition;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lzendesk/android/internal/proactivemessaging/model/ConditionType;", "getType", "Lzendesk/android/internal/proactivemessaging/model/ConditionFunction;", "getFunction", "Ljava/util/List;", "getExpressions", "getExpressions$annotations", "()V", "Companion", "$serializer", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Condition {

    @NotNull
    private final List<Expression> expressions;

    @NotNull
    private final ConditionFunction function;

    @NotNull
    private final ConditionType type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final j[] $childSerializers = {null, null, l.a(m.PUBLICATION, new a(18))};

    public /* synthetic */ Condition(int i11, ConditionType conditionType, ConditionFunction conditionFunction, List list, m1 m1Var) {
        if (7 != (i11 & 7)) {
            c1.j(i11, 7, Condition$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.type = conditionType;
        this.function = conditionFunction;
        this.expressions = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
        return new d(ExpressionSerializer.INSTANCE, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Condition copy$default(Condition condition, ConditionType conditionType, ConditionFunction conditionFunction, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            conditionType = condition.type;
        }
        if ((i11 & 2) != 0) {
            conditionFunction = condition.function;
        }
        if ((i11 & 4) != 0) {
            list = condition.expressions;
        }
        return condition.copy(conditionType, conditionFunction, list);
    }

    public static final /* synthetic */ void write$Self$zendesk_zendesk_android(Condition self, b output, SerialDescriptor serialDesc) {
        j[] jVarArr = $childSerializers;
        output.i(serialDesc, 0, ConditionType.ConditionTypeSerializer.INSTANCE, self.type);
        output.i(serialDesc, 1, ConditionFunction.ConditionFunctionSerializer.INSTANCE, self.function);
        output.i(serialDesc, 2, (KSerializer) jVarArr[2].getValue(), self.expressions);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ConditionType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ConditionFunction getFunction() {
        return this.function;
    }

    @NotNull
    public final List<Expression> component3() {
        return this.expressions;
    }

    @NotNull
    public final Condition copy(@NotNull ConditionType type, @NotNull ConditionFunction function, @NotNull List<? extends Expression> expressions) {
        type.getClass();
        function.getClass();
        expressions.getClass();
        return new Condition(type, function, expressions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Condition)) {
            return false;
        }
        Condition condition = (Condition) other;
        return this.type == condition.type && this.function == condition.function && Intrinsics.areEqual(this.expressions, condition.expressions);
    }

    @NotNull
    public final List<Expression> getExpressions() {
        return this.expressions;
    }

    @NotNull
    public final ConditionFunction getFunction() {
        return this.function;
    }

    @NotNull
    public final ConditionType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.expressions.hashCode() + ((this.function.hashCode() + (this.type.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        ConditionType conditionType = this.type;
        ConditionFunction conditionFunction = this.function;
        List<Expression> list = this.expressions;
        StringBuilder sb2 = new StringBuilder("Condition(type=");
        sb2.append(conditionType);
        sb2.append(", function=");
        sb2.append(conditionFunction);
        sb2.append(", expressions=");
        return f.p(sb2, list, ")");
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lzendesk/android/internal/proactivemessaging/model/Condition$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lzendesk/android/internal/proactivemessaging/model/Condition;", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return Condition$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @g(StepData.ARGS)
    public static /* synthetic */ void getExpressions$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Condition(@NotNull ConditionType conditionType, @NotNull ConditionFunction conditionFunction, @NotNull List<? extends Expression> list) {
        conditionType.getClass();
        conditionFunction.getClass();
        list.getClass();
        this.type = conditionType;
        this.function = conditionFunction;
        this.expressions = list;
    }
}
