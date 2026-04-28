package zendesk.messaging.android.internal.conversationscreen;

import kotlin.jvm.functions.Function1;
import zendesk.messaging.android.internal.conversationscreen.ImageViewerActivity;
import zendesk.ui.android.conversation.imagerviewer.ImageViewerRendering;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ImageViewerActivity f47710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ImageViewerState f47711c;

    public /* synthetic */ u(ImageViewerActivity imageViewerActivity, ImageViewerState imageViewerState, int i11) {
        this.f47709a = i11;
        this.f47710b = imageViewerActivity;
        this.f47711c = imageViewerState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f47709a) {
            case 0:
                return ImageViewerActivity.AnonymousClass1.C00471.C00481.C00491.emit$lambda$2$lambda$0(this.f47710b, this.f47711c, (zendesk.ui.android.conversation.imagerviewer.ImageViewerState) obj);
            default:
                return ImageViewerActivity.AnonymousClass1.C00471.C00481.C00491.emit$lambda$2(this.f47710b, this.f47711c, (ImageViewerRendering) obj);
        }
    }
}
