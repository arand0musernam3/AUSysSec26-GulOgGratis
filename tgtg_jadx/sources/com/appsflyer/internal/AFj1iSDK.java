package com.appsflyer.internal;

import com.android.billingclient.BuildConfig;
import java.lang.reflect.Field;
import org.jetbrains.annotations.NotNull;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AFj1iSDK implements AFj1gSDK {
    @Override // com.appsflyer.internal.AFj1gSDK
    @NotNull
    public final String getRevenue() {
        Object pVar;
        try {
            o oVar = q.f40850b;
            Field declaredField = BuildConfig.class.getDeclaredField("VERSION_NAME");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            obj.getClass();
            pVar = (String) obj;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        if (pVar instanceof p) {
            pVar = "";
        }
        return (String) pVar;
    }
}
