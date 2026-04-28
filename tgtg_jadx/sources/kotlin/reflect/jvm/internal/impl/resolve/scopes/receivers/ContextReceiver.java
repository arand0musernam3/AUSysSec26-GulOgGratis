package kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ContextReceiver extends AbstractReceiverValue implements ImplicitContextReceiver {

    @Nullable
    private final Name customLabelName;

    @NotNull
    private final CallableDescriptor declarationDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextReceiver(@NotNull CallableDescriptor callableDescriptor, @NotNull KotlinType kotlinType, @Nullable Name name, @Nullable ReceiverValue receiverValue) {
        super(kotlinType, receiverValue);
        callableDescriptor.getClass();
        kotlinType.getClass();
        this.declarationDescriptor = callableDescriptor;
        this.customLabelName = name;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitContextReceiver
    @Nullable
    public Name getCustomLabelName() {
        return this.customLabelName;
    }

    @NotNull
    public CallableDescriptor getDeclarationDescriptor() {
        return this.declarationDescriptor;
    }

    @NotNull
    public String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
