package zendesk.guidekit.android.internal.di.module;

import kotlin.Metadata;
import oa0.o0;
import org.jetbrains.annotations.NotNull;
import zendesk.guidekit.android.internal.di.GuideKitScope;
import zendesk.guidekit.android.internal.rest.HelpCenterApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/guidekit/android/internal/di/module/HelpCenterModule;", "", "<init>", "()V", "Loa0/o0;", "retrofit", "Lzendesk/guidekit/android/internal/rest/HelpCenterApi;", "providesFrontendEventsApi", "(Loa0/o0;)Lzendesk/guidekit/android/internal/rest/HelpCenterApi;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HelpCenterModule {
    @GuideKitScope
    @NotNull
    public final HelpCenterApi providesFrontendEventsApi(@NotNull o0 retrofit) {
        retrofit.getClass();
        Object objB = retrofit.b(HelpCenterApi.class);
        objB.getClass();
        return (HelpCenterApi) objB;
    }
}
