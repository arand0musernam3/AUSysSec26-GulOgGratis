package com.braze.support;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/braze/support/HandlerUtils;", "", "<init>", "()V", "createHandler", "Landroid/os/Handler;", "android-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HandlerUtils {
    public static final HandlerUtils INSTANCE = new HandlerUtils();

    private HandlerUtils() {
    }

    public static final Handler createHandler() {
        return new Handler(Looper.getMainLooper());
    }
}
