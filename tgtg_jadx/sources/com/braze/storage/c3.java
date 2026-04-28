package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b3 f10543a;

    public c3(Context context) {
        context.getClass();
        this.f10543a = new b3(context);
    }

    public final boolean a() {
        return Intrinsics.areEqual(this.f10543a.readBoolean(DataStoreKey.SDK_ENABLEMENT, Boolean.FALSE), Boolean.TRUE);
    }

    public final void b(boolean z11) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new com.braze.o0(z11, 7), 6, (Object) null);
        this.f10543a.writeData(DataStoreKey.SDK_ENABLEMENT, Boolean.valueOf(z11));
    }

    public static final String a(boolean z11) {
        return "Setting Braze SDK disabled to: " + z11;
    }
}
