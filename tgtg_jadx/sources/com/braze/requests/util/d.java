package com.braze.requests.util;

import android.net.Uri;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f10480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f10481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10482d;

    public d(Uri uri) {
        uri.getClass();
        this.f10480b = uri;
        String string = uri.toString();
        this.f10479a = string;
        this.f10481c = new URL(string);
        this.f10482d = false;
    }

    public final String toString() {
        return this.f10479a;
    }

    public /* synthetic */ d(String str) {
        this(str, false);
    }

    public d(String str, boolean z11) {
        str.getClass();
        this.f10480b = Uri.parse(str);
        this.f10479a = str;
        this.f10481c = new URL(str);
        this.f10482d = z11;
    }
}
