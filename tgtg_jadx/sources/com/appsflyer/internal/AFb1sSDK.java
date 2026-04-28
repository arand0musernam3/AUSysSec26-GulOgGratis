package com.appsflyer.internal;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/appsflyer/internal/AFb1sSDK;", "", "Lcom/appsflyer/internal/AFh1sSDK;", "event", "", "rawData", "<init>", "(Lcom/appsflyer/internal/AFh1sSDK;[B)V", "", "afInfoLog", "()V", "getMonetizationNetwork", "Lcom/appsflyer/internal/AFh1sSDK;", "getCurrencyIso4217Code", "getRevenue", "[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFb1sSDK {

    /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    @NotNull
    private final AFh1sSDK getCurrencyIso4217Code;

    @Nullable
    private final byte[] getRevenue;

    public AFb1sSDK(@NotNull AFh1sSDK aFh1sSDK, @Nullable byte[] bArr) {
        aFh1sSDK.getClass();
        this.getCurrencyIso4217Code = aFh1sSDK;
        this.getRevenue = bArr;
    }

    public final void afInfoLog() {
        try {
            Map map = AFa1kSDK.f9510i;
            Object declaredConstructor = map.get(-496653013);
            if (declaredConstructor == null) {
                declaredConstructor = ((Class) AFa1kSDK.getMediationNetwork((char) (28155 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 87 - Color.argb(0, 0, 0, 0))).getDeclaredConstructor(null);
                map.put(-496653013, declaredConstructor);
            }
            Object objNewInstance = ((Constructor) declaredConstructor).newInstance(null);
            Object[] objArr = {this.getCurrencyIso4217Code, this.getRevenue};
            Object method = map.get(-40095608);
            if (method == null) {
                method = ((Class) AFa1kSDK.getMediationNetwork((char) (28155 - TextUtils.indexOf("", "", 0, 0)), 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 87 - (ViewConfiguration.getScrollBarSize() >> 8))).getMethod("getMonetizationNetwork", AFh1sSDK.class, byte[].class);
                map.put(-40095608, method);
            }
            ((Method) method).invoke(objNewInstance, objArr);
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }
}
