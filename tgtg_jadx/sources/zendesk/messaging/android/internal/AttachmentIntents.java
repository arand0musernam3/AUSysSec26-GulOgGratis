package zendesk.messaging.android.internal;

import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/AttachmentIntents;", "", "getCameraIntent", "Landroid/content/Intent;", "getAttachmentIntent", "canOpenCameraIntent", "", "canOpenAttachmentIntent", "shouldAskForCameraPermission", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AttachmentIntents {
    boolean canOpenAttachmentIntent();

    boolean canOpenCameraIntent();

    @NotNull
    Intent getAttachmentIntent();

    @NotNull
    Intent getCameraIntent();

    boolean shouldAskForCameraPermission();
}
