package zendesk.analyticskit.android.internal.di;

import android.content.Context;
import o00.x0;
import s70.c;
import zendesk.analyticskit.android.model.AnalyticsSettings;
import zendesk.storage.android.Storage;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitModule_ProvidesAnalyticsKitStorageFactory implements c {
    private final c contextProvider;
    private final AnalyticsKitModule module;
    private final c settingsProvider;
    private final c storageTypeProvider;

    private AnalyticsKitModule_ProvidesAnalyticsKitStorageFactory(AnalyticsKitModule analyticsKitModule, c cVar, c cVar2, c cVar3) {
        this.module = analyticsKitModule;
        this.settingsProvider = cVar;
        this.storageTypeProvider = cVar2;
        this.contextProvider = cVar3;
    }

    public static AnalyticsKitModule_ProvidesAnalyticsKitStorageFactory create(AnalyticsKitModule analyticsKitModule, c cVar, c cVar2, c cVar3) {
        return new AnalyticsKitModule_ProvidesAnalyticsKitStorageFactory(analyticsKitModule, cVar, cVar2, cVar3);
    }

    public static Storage providesAnalyticsKitStorage(AnalyticsKitModule analyticsKitModule, AnalyticsSettings analyticsSettings, StorageType storageType, Context context) {
        Storage storageProvidesAnalyticsKitStorage = analyticsKitModule.providesAnalyticsKitStorage(analyticsSettings, storageType, context);
        x0.o(storageProvidesAnalyticsKitStorage);
        return storageProvidesAnalyticsKitStorage;
    }

    @Override // t70.a
    public Storage get() {
        return providesAnalyticsKitStorage(this.module, (AnalyticsSettings) this.settingsProvider.get(), (StorageType) this.storageTypeProvider.get(), (Context) this.contextProvider.get());
    }
}
