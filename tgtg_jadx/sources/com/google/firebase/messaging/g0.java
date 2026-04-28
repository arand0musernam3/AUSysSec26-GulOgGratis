package com.google.firebase.messaging;

import android.text.TextUtils;
import androidx.lifecycle.n1;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static WeakReference f12807b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n1 f12808a;

    public final synchronized f0 a() {
        String str;
        f0 f0Var;
        n1 n1Var = this.f12808a;
        synchronized (((ArrayDeque) n1Var.f3502d)) {
            str = (String) ((ArrayDeque) n1Var.f3502d).peek();
        }
        Pattern pattern = f0.f12800d;
        f0Var = null;
        if (!TextUtils.isEmpty(str)) {
            String[] strArrSplit = str.split("!", -1);
            if (strArrSplit.length == 2) {
                f0Var = new f0(strArrSplit[0], strArrSplit[1]);
            }
        }
        return f0Var;
    }
}
