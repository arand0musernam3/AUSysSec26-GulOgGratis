package com.braze.requests.util;

import android.content.Context;
import com.braze.storage.k1;
import j4.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f10471a;

    public a(Context context) {
        context.getClass();
        this.f10471a = new k1(context);
    }

    public static String a(String str) {
        return s.f(str.hashCode(), "uri-at-");
    }

    public static String b(String str) {
        return s.f(str.hashCode(), "uri-");
    }
}
