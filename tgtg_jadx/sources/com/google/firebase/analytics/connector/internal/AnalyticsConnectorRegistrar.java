package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.i0;
import com.google.android.gms.internal.measurement.a7;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import o00.h0;
import p30.g;
import r30.a;
import r30.b;
import u30.c;
import u30.i;
import u30.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(c cVar) {
        g gVar = (g) cVar.b(g.class);
        Context context = (Context) cVar.b(Context.class);
        q40.c cVar2 = (q40.c) cVar.b(q40.c.class);
        i0.h(gVar);
        i0.h(context);
        i0.h(cVar2);
        i0.h(context.getApplicationContext());
        if (b.f37610c == null) {
            synchronized (b.class) {
                try {
                    if (b.f37610c == null) {
                        Bundle bundle = new Bundle(1);
                        gVar.a();
                        if ("[DEFAULT]".equals(gVar.f34223b)) {
                            ((j) cVar2).a(w0.a.f42802d, l50.a.f27382c);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.h());
                        }
                        b.f37610c = new b(a7.c(context, bundle).f11246b);
                    }
                } finally {
                }
            }
        }
        return b.f37610c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<u30.b> getComponents() {
        u30.a aVarA = u30.b.a(a.class);
        aVarA.a(i.a(g.class));
        aVarA.a(i.a(Context.class));
        aVarA.a(i.a(q40.c.class));
        aVarA.f40668f = l50.a.f27383d;
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), h0.r("fire-analytics", "23.2.0"));
    }
}
