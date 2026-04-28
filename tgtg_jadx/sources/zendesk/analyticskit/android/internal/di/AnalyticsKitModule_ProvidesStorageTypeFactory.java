package zendesk.analyticskit.android.internal.di;

import o00.x0;
import s70.c;
import zendesk.analyticskit.android.internal.storage.AnalyticsStorageSerializer;
import zendesk.storage.android.StorageType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class AnalyticsKitModule_ProvidesStorageTypeFactory implements c {
    private final c analyticsStorageSerializerProvider;
    private final AnalyticsKitModule module;

    private AnalyticsKitModule_ProvidesStorageTypeFactory(AnalyticsKitModule analyticsKitModule, c cVar) {
        this.module = analyticsKitModule;
        this.analyticsStorageSerializerProvider = cVar;
    }

    public static AnalyticsKitModule_ProvidesStorageTypeFactory create(AnalyticsKitModule analyticsKitModule, c cVar) {
        return new AnalyticsKitModule_ProvidesStorageTypeFactory(analyticsKitModule, cVar);
    }

    public static StorageType providesStorageType(AnalyticsKitModule analyticsKitModule, AnalyticsStorageSerializer analyticsStorageSerializer) {
        StorageType storageTypeProvidesStorageType = analyticsKitModule.providesStorageType(analyticsStorageSerializer);
        x0.o(storageTypeProvidesStorageType);
        return storageTypeProvidesStorageType;
    }

    @Override // t70.a
    public StorageType get() {
        return providesStorageType(this.module, (AnalyticsStorageSerializer) this.analyticsStorageSerializerProvider.get());
    }
}
