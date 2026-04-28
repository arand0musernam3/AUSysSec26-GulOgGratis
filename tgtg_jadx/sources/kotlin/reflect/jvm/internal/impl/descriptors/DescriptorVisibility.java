package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class DescriptorVisibility {
    @Nullable
    public final Integer compareTo(@NotNull DescriptorVisibility descriptorVisibility) {
        descriptorVisibility.getClass();
        return getDelegate().compareTo(descriptorVisibility.getDelegate());
    }

    @NotNull
    public abstract Visibility getDelegate();

    @NotNull
    public abstract String getInternalDisplayName();

    public final boolean isPublicAPI() {
        return getDelegate().isPublicAPI();
    }

    public abstract boolean isVisible(@Nullable ReceiverValue receiverValue, @NotNull DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, @NotNull DeclarationDescriptor declarationDescriptor, boolean z11);

    @NotNull
    public abstract DescriptorVisibility normalize();

    @NotNull
    public final String toString() {
        return getDelegate().toString();
    }
}
