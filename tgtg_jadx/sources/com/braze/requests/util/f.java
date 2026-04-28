package com.braze.requests.util;

import android.content.Context;
import com.braze.dispatch.h;
import com.braze.managers.j1;
import com.braze.support.StringUtils;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static e a(h hVar, String str, String str2) {
        hVar.getClass();
        str.getClass();
        str2.getClass();
        j1 j1Var = (j1) hVar.f();
        Context contextB = j1Var.b();
        return new e(contextB, org.bouncycastle.jcajce.provider.asymmetric.a.d("com.braze.tokenbucket.", str, ".", str2, StringUtils.getCacheFileSuffix(contextB, j1Var.c(), j1Var.a())));
    }
}
