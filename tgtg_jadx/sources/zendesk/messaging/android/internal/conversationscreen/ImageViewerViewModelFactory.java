package zendesk.messaging.android.internal.conversationscreen;

import android.os.Bundle;
import androidx.lifecycle.c1;
import androidx.lifecycle.l1;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\t*\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModelFactory;", "Landroidx/lifecycle/a;", "Lea/f;", "owner", "Landroid/os/Bundle;", "defaultArgs", "<init>", "(Lea/f;Landroid/os/Bundle;)V", "Landroidx/lifecycle/l1;", "T", "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/c1;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/c1;)Landroidx/lifecycle/l1;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImageViewerViewModelFactory extends androidx.lifecycle.a {
    public /* synthetic */ ImageViewerViewModelFactory(ea.f fVar, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (i11 & 2) != 0 ? null : bundle);
    }

    @Override // androidx.lifecycle.a
    @NotNull
    public <T extends l1> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull c1 handle) {
        key.getClass();
        modelClass.getClass();
        handle.getClass();
        return new ImageViewerViewModel();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageViewerViewModelFactory(@NotNull ea.f fVar, @Nullable Bundle bundle) {
        super(fVar, bundle);
        fVar.getClass();
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    @NotNull
    public /* bridge */ /* synthetic */ l1 create(@NotNull KClass kClass, @NotNull CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }
}
