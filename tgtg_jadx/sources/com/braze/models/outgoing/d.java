package com.braze.models.outgoing;

import com.braze.support.BrazeLogger;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static final String b() {
        return "The leading character in the key string may not be '$'. Not adding property.";
    }

    public final boolean a(String str) {
        str.getClass();
        if (StringsKt.H(str)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new cu.a(14), 6, (Object) null);
            return false;
        }
        if (!y.p(str, "$", false)) {
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new cu.a(15), 6, (Object) null);
        return false;
    }

    public static final String a() {
        return "The BrazeProperties key cannot be null or contain only whitespaces. Not adding property.";
    }
}
