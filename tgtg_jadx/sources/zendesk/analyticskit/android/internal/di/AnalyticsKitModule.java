package zendesk.analyticskit.android.internal.di;

import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import zendesk.analyticskit.android.AnalyticsKit;
import zendesk.analyticskit.android.internal.DefaultAnalyticsKit;
import zendesk.analyticskit.android.internal.storage.AnalyticsStorageSerializer;
import zendesk.analyticskit.android.model.AnalyticsSettings;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageFactory;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007¨\u0006\u0013"}, d2 = {"Lzendesk/analyticskit/android/internal/di/AnalyticsKitModule;", "", "<init>", "()V", "providesBaseUrl", "", "settings", "Lzendesk/analyticskit/android/model/AnalyticsSettings;", "providesStorageType", "Lzendesk/storage/android/StorageType;", "analyticsStorageSerializer", "Lzendesk/analyticskit/android/internal/storage/AnalyticsStorageSerializer;", "providesAnalyticsKitStorage", "Lzendesk/storage/android/Storage;", "storageType", "context", "Landroid/content/Context;", "AnalyticsBindModule", "Companion", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AnalyticsKitModule {

    @NotNull
    public static final String ANALYTICS_KIT_STORAGE = "ANALYTICS_KIT_STORAGE";

    @NotNull
    private static final String ANALYTICS_KIT_STORAGE_NAMESPACE = "zendesk.analyticskit";

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, d2 = {"Lzendesk/analyticskit/android/internal/di/AnalyticsKitModule$AnalyticsBindModule;", "", "providesAnalyticsManager", "Lzendesk/analyticskit/android/AnalyticsKit;", "defaultAnalyticsKit", "Lzendesk/analyticskit/android/internal/DefaultAnalyticsKit;", "zendesk.analyticskit_analyticskit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface AnalyticsBindModule {
        @AnalyticsKitScope
        @NotNull
        AnalyticsKit providesAnalyticsManager(@NotNull DefaultAnalyticsKit defaultAnalyticsKit);
    }

    @AnalyticsKitScope
    @NotNull
    public final Storage providesAnalyticsKitStorage(@NotNull AnalyticsSettings settings, @NotNull StorageType storageType, @NotNull Context context) {
        settings.getClass();
        storageType.getClass();
        context.getClass();
        return StorageFactory.INSTANCE.create(ANALYTICS_KIT_STORAGE_NAMESPACE, context, storageType, settings.getIntegrationId());
    }

    @AnalyticsKitScope
    @NotNull
    public final String providesBaseUrl(@NotNull AnalyticsSettings settings) {
        settings.getClass();
        return settings.getBaseUrl();
    }

    @AnalyticsKitScope
    @NotNull
    public final StorageType providesStorageType(@NotNull AnalyticsStorageSerializer analyticsStorageSerializer) {
        analyticsStorageSerializer.getClass();
        return new StorageType.Complex(analyticsStorageSerializer);
    }
}
