package com.google.android.gms.internal.measurement;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class he {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f11473a = Pattern.compile("(\\w+).*");

    public static String a(k30.x xVar) {
        if (xVar.isEmpty()) {
            return null;
        }
        a90.v vVar = new a90.v("+", 3);
        k30.d dVarListIterator = xVar.listIterator(0);
        StringBuilder sb2 = new StringBuilder();
        vVar.a(sb2, dVarListIterator);
        return "transform=".concat(sb2.toString());
    }
}
