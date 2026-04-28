package zendesk.messaging.android.internal;

import androidx.activity.result.ActivityResultCallback;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements ActivityResultCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttachmentIntentsLauncher f47648b;

    public /* synthetic */ a(AttachmentIntentsLauncher attachmentIntentsLauncher, int i11) {
        this.f47647a = i11;
        this.f47648b = attachmentIntentsLauncher;
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        switch (this.f47647a) {
            case 0:
                AttachmentIntentsLauncher.setupGalleryLauncher$lambda$5(this.f47648b, (h.a) obj);
                break;
            default:
                AttachmentIntentsLauncher.setupCameraLauncher$lambda$1(this.f47648b, ((Boolean) obj).booleanValue());
                break;
        }
    }
}
