package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;
import i30.e;
import lz.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static IntegrityManager create(Context context) {
        i iVar;
        synchronized (d30.i.class) {
            try {
                if (d30.i.f14026a == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    d30.i.f14026a = new i(context, 9);
                }
                iVar = d30.i.f14026a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (IntegrityManager) ((e) iVar.f28446b).a();
    }
}
