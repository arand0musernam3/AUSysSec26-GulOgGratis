package com.braze.managers;

import android.content.Context;
import com.amazon.device.messaging.development.ADMManifest;
import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static final String b() {
        return "com.amazon.device.messaging.ADM not found";
    }

    public final boolean a() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Exception unused) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new zv.b(20), 6, (Object) null);
            return false;
        }
    }

    public final boolean a(Context context) {
        try {
            ADMManifest.checkManifestAuthoredProperly(context);
            return true;
        } catch (Exception e5) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new mw.c(2, e5), 6, (Object) null);
            return false;
        }
    }

    public static final String a(Exception exc) {
        return b3.i.l("Manifest not authored properly to support ADM. ADM manifest exception: ", exc);
    }
}
