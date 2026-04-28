package com.braze.location;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import java.util.EnumSet;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IBrazeLocationApi f9903a;

    public b(Context context, EnumSet enumSet, BrazeConfigurationProvider brazeConfigurationProvider) {
        context.getClass();
        enumSet.getClass();
        brazeConfigurationProvider.getClass();
        IBrazeLocationApi iBrazeLocationApi = null;
        try {
            Object objNewInstance = Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(null).newInstance(null);
            objNewInstance.getClass();
            iBrazeLocationApi = (IBrazeLocationApi) objNewInstance;
        } catch (Exception unused) {
        }
        this.f9903a = iBrazeLocationApi;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.initWithContext(context, enumSet, brazeConfigurationProvider);
        }
    }
}
