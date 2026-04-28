package zendesk.guidekit.android.internal.di;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import v80.x;
import zendesk.guidekit.android.GuideKit;
import zendesk.guidekit.android.model.GuideKitSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@GuideKitScope
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\ba\u0018\u00002\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lzendesk/guidekit/android/internal/di/GuideKitComponent;", "", "Lzendesk/guidekit/android/GuideKit;", "guideKit", "()Lzendesk/guidekit/android/GuideKit;", "Lv80/x;", "ioDispatcher", "()Lv80/x;", "Factory", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface GuideKitComponent {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lzendesk/guidekit/android/internal/di/GuideKitComponent$Factory;", "", "Lzendesk/guidekit/android/model/GuideKitSettings;", "settings", "Landroid/content/Context;", "context", "Lv80/b0;", "coroutineScope", "Lzendesk/guidekit/android/internal/di/GuideKitComponent;", "create", "(Lzendesk/guidekit/android/model/GuideKitSettings;Landroid/content/Context;Lv80/b0;)Lzendesk/guidekit/android/internal/di/GuideKitComponent;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        @NotNull
        GuideKitComponent create(@NotNull GuideKitSettings settings, @NotNull Context context, @NotNull b0 coroutineScope);
    }

    @NotNull
    GuideKit guideKit();

    @NotNull
    x ioDispatcher();
}
