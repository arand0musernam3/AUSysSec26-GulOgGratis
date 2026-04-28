package com.braze;

import com.braze.configuration.CachedConfigurationProvider;
import com.braze.models.IPropertiesObject;
import com.braze.storage.TriggerDataStoreProvider$Companion;
import com.braze.storage.r;
import com.braze.storage.u3;
import com.braze.storage.w2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10976c;

    public /* synthetic */ z1(Object obj, int i11, String str) {
        this.f10974a = i11;
        this.f10975b = str;
        this.f10976c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f10974a) {
            case 0:
                return BrazeUser.setCustomAttribute$lambda$73$lambda$71(this.f10975b, this.f10976c);
            case 1:
                return BrazeUser.setCustomAttribute$lambda$73$lambda$72(this.f10975b, this.f10976c);
            case 2:
                return IPropertiesObject.getValue$lambda$0(this.f10975b, this.f10976c);
            case 3:
                return TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$4$lambda$3(this.f10975b, this.f10976c);
            case 4:
                return com.braze.storage.h2.a(this.f10975b, this.f10976c);
            case 5:
                return r.a(this.f10975b, this.f10976c);
            case 6:
                return r.b(this.f10975b, this.f10976c);
            case 7:
                return u3.b(this.f10975b, this.f10976c);
            case 8:
                return u3.d(this.f10975b, this.f10976c);
            case 9:
                return w2.a(this.f10975b, this.f10976c);
            case 10:
                return CachedConfigurationProvider.getResourceConfigurationValue$lambda$1(this.f10975b, this.f10976c);
            case 11:
                return CachedConfigurationProvider.getRuntimeConfigurationValue$lambda$0(this.f10975b, this.f10976c);
            default:
                return CachedConfigurationProvider.readResourceValue$lambda$2(this.f10975b, this.f10976c);
        }
    }
}
