package com.google.firebase;

import a40.d0;
import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.messaging.p;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import o00.h0;
import r40.c;
import r40.d;
import r40.e;
import r40.g;
import u30.a;
import u30.b;
import u30.i;
import u30.o;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        a aVarA = b.a(a50.b.class);
        aVarA.a(new i(2, 0, a50.a.class));
        aVarA.f40668f = new d0();
        arrayList.add(aVarA.b());
        o oVar = new o(t30.a.class, Executor.class);
        a aVar = new a(c.class, new Class[]{e.class, g.class});
        aVar.a(i.a(Context.class));
        aVar.a(i.a(p30.g.class));
        aVar.a(new i(2, 0, d.class));
        aVar.a(new i(1, 1, a50.b.class));
        aVar.a(new i(oVar, 1, 0));
        aVar.f40668f = new p(oVar, 1);
        arrayList.add(aVar.b());
        arrayList.add(h0.r("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h0.r("fire-core", "22.0.1"));
        arrayList.add(h0.r("device-name", a(Build.PRODUCT)));
        arrayList.add(h0.r("device-model", a(Build.DEVICE)));
        arrayList.add(h0.r("device-brand", a(Build.BRAND)));
        arrayList.add(h0.t("android-target-sdk", new org.bouncycastle.jce.provider.a(12)));
        arrayList.add(h0.t("android-min-sdk", new org.bouncycastle.jce.provider.a(13)));
        arrayList.add(h0.t("android-platform", new org.bouncycastle.jce.provider.a(14)));
        arrayList.add(h0.t("android-installer", new org.bouncycastle.jce.provider.a(15)));
        try {
            string = u70.i.f40842f.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(h0.r("kotlin", string));
        }
        return arrayList;
    }
}
