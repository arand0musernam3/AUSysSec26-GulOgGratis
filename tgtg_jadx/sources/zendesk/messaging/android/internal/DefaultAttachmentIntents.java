package zendesk.messaging.android.internal;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.y;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0016J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u0005H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lzendesk/messaging/android/internal/DefaultAttachmentIntents;", "Lzendesk/messaging/android/internal/AttachmentIntents;", "activity", "Landroid/app/Activity;", "isMultiAttachmentsEnabled", "", "<init>", "(Landroid/app/Activity;Z)V", "getCameraIntent", "Landroid/content/Intent;", "getAttachmentIntent", "canOpenCameraIntent", "canOpenAttachmentIntent", "shouldAskForCameraPermission", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAttachmentIntents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachmentIntents.kt\nzendesk/messaging/android/internal/DefaultAttachmentIntents\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n1#2:83\n*E\n"})
public final class DefaultAttachmentIntents implements AttachmentIntents {

    @NotNull
    private static final String LOG_TAG = "DefaultAttachmentIntents";

    @NotNull
    private final Activity activity;
    private final boolean isMultiAttachmentsEnabled;

    public DefaultAttachmentIntents(@NotNull Activity activity, boolean z11) {
        activity.getClass();
        this.activity = activity;
        this.isMultiAttachmentsEnabled = z11;
    }

    @Override // zendesk.messaging.android.internal.AttachmentIntents
    public boolean canOpenAttachmentIntent() {
        boolean zIsEmpty;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags resolveInfoFlagsOf = PackageManager.ResolveInfoFlags.of(131072L);
            resolveInfoFlagsOf.getClass();
            List<ResolveInfo> listQueryIntentActivities = this.activity.getPackageManager().queryIntentActivities(getAttachmentIntent(), resolveInfoFlagsOf);
            listQueryIntentActivities.getClass();
            zIsEmpty = listQueryIntentActivities.isEmpty();
        } else {
            List<ResolveInfo> listQueryIntentActivities2 = this.activity.getPackageManager().queryIntentActivities(getAttachmentIntent(), 0);
            listQueryIntentActivities2.getClass();
            zIsEmpty = listQueryIntentActivities2.isEmpty();
        }
        return !zIsEmpty;
    }

    @Override // zendesk.messaging.android.internal.AttachmentIntents
    public boolean canOpenCameraIntent() {
        return this.activity.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    @Override // zendesk.messaging.android.internal.AttachmentIntents
    @NotNull
    public Intent getAttachmentIntent() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setFlags(65);
        intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.isMultiAttachmentsEnabled);
        return intent;
    }

    @Override // zendesk.messaging.android.internal.AttachmentIntents
    @NotNull
    public Intent getCameraIntent() {
        return new Intent("android.media.action.IMAGE_CAPTURE");
    }

    @Override // zendesk.messaging.android.internal.AttachmentIntents
    public boolean shouldAskForCameraPermission() {
        int i11 = Build.VERSION.SDK_INT;
        Activity activity = this.activity;
        String[] strArr = (i11 >= 33 ? activity.getPackageManager().getPackageInfo(this.activity.getPackageName(), PackageManager.PackageInfoFlags.of(4096L)) : activity.getPackageManager().getPackageInfo(this.activity.getPackageName(), 4096)).requestedPermissions;
        if (strArr != null) {
            return y.v(strArr, "android.permission.CAMERA");
        }
        Logger.e(LOG_TAG, "RequestedPermissions is " + strArr, new Object[0]);
        return false;
    }
}
