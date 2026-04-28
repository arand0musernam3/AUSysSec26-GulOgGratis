package zendesk.messaging.android.internal.conversationscreen;

import androidx.lifecycle.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import y80.a2;
import y80.f1;
import y80.h1;
import y80.y1;
import zendesk.messaging.android.internal.model.MessagingTheme;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModel;", "Landroidx/lifecycle/l1;", "<init>", "()V", "Lzendesk/messaging/android/internal/model/MessagingTheme;", "newTheme", "", "refreshTheme$zendesk_messaging_messaging_android", "(Lzendesk/messaging/android/internal/model/MessagingTheme;)V", "refreshTheme", "Ly80/f1;", "Lzendesk/messaging/android/internal/conversationscreen/ImageViewerState;", "_imageViewerState", "Ly80/f1;", "Ly80/y1;", "imageViewerState", "Ly80/y1;", "getImageViewerState", "()Ly80/y1;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageViewerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModel\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,43:1\n230#2,5:44\n*S KotlinDebug\n*F\n+ 1 ImageViewerViewModel.kt\nzendesk/messaging/android/internal/conversationscreen/ImageViewerViewModel\n*L\n35#1:44,5\n*E\n"})
public final class ImageViewerViewModel extends l1 {

    @NotNull
    private final f1 _imageViewerState;

    @NotNull
    private final y1 imageViewerState;

    public ImageViewerViewModel() {
        a2 a2VarC = y80.r.c(new ImageViewerState(null, null, 3, null));
        this._imageViewerState = a2VarC;
        this.imageViewerState = new h1(a2VarC);
    }

    @NotNull
    public final y1 getImageViewerState() {
        return this.imageViewerState;
    }

    public final void refreshTheme$zendesk_messaging_messaging_android(@NotNull MessagingTheme newTheme) {
        a2 a2Var;
        Object value;
        newTheme.getClass();
        if (Intrinsics.areEqual(((ImageViewerState) this.imageViewerState.getValue()).getMessagingTheme(), newTheme)) {
            return;
        }
        f1 f1Var = this._imageViewerState;
        do {
            a2Var = (a2) f1Var;
            value = a2Var.getValue();
        } while (!a2Var.g(value, ImageViewerState.copy$default((ImageViewerState) value, newTheme, null, 2, null)));
    }
}
