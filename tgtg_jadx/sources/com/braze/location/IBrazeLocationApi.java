package com.braze.location;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.models.IBrazeLocation;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\t0\fH&¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lcom/braze/location/IBrazeLocationApi;", "", "Landroid/content/Context;", "context", "Ljava/util/EnumSet;", "Lcom/braze/enums/LocationProviderName;", "allowedProviders", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "", "initWithContext", "(Landroid/content/Context;Ljava/util/EnumSet;Lcom/braze/configuration/BrazeConfigurationProvider;)V", "Lkotlin/Function1;", "Lcom/braze/models/IBrazeLocation;", "locationUpdateCallback", "", "requestSingleLocationUpdate", "(Lkotlin/jvm/functions/Function1;)Z", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface IBrazeLocationApi {
    void initWithContext(Context context, EnumSet<LocationProviderName> allowedProviders, BrazeConfigurationProvider appConfigurationProvider);

    boolean requestSingleLocationUpdate(Function1<? super IBrazeLocation, Unit> locationUpdateCallback);
}
