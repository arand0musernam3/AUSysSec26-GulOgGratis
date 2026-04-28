package com.google.firebase.messaging;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f12800d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12803c;

    public f0(String str, String str2) {
        String strSubstring;
        if (str2 == null || !str2.startsWith("/topics/")) {
            strSubstring = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            strSubstring = str2.substring(8);
        }
        if (strSubstring == null || !f12800d.matcher(strSubstring).matches()) {
            i4.a.f(w.a0.p("Invalid topic name: ", strSubstring, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.f12801a = strSubstring;
        this.f12802b = str;
        this.f12803c = r8.k.m(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return this.f12801a.equals(f0Var.f12801a) && this.f12802b.equals(f0Var.f12802b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f12802b, this.f12801a});
    }
}
