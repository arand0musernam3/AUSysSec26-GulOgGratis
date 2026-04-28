package zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.di;

import android.os.Bundle;
import com.braze.h2;
import ea.f;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.messaging.android.internal.conversationscreen.guidearticleviewer.GuideArticleViewerBottomSheetFragment;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@GuideArticleFragmentScope
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideArticleFragmentComponent;", "", "inject", "", "guideArticleViewerBottomSheetFragment", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/GuideArticleViewerBottomSheetFragment;", "Factory", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GuideArticleFragmentComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideArticleFragmentComponent$Factory;", "", "Lea/f;", "savedStateRegistryOwner", "Landroid/os/Bundle;", "defaultArgs", "Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideArticleFragmentComponent;", "create", "(Lea/f;Landroid/os/Bundle;)Lzendesk/messaging/android/internal/conversationscreen/guidearticleviewer/di/GuideArticleFragmentComponent;", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {

        /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ GuideArticleFragmentComponent create$default(Factory factory, f fVar, Bundle bundle, int i11, Object obj) {
                if (obj != null) {
                    h2.a("Super calls with default arguments not supported in this target, function: create");
                    return null;
                }
                if ((i11 & 2) != 0) {
                    bundle = null;
                }
                return factory.create(fVar, bundle);
            }
        }

        @NotNull
        GuideArticleFragmentComponent create(@NotNull f savedStateRegistryOwner, @Nullable Bundle defaultArgs);
    }

    void inject(@NotNull GuideArticleViewerBottomSheetFragment guideArticleViewerBottomSheetFragment);
}
