package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.adyen.checkout.components.core.internal.analytics.AnalyticsPlatformParams;
import com.adyen.checkout.ui.core.internal.ui.view.ExpiryDateInput;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class yd implements ke {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12063a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12066d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f12065c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be f12064b = new be();

    public yd(pa paVar) {
        this.f12063a = paVar.f11752b;
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final de a(Uri uri) throws zzsg, zzsi {
        if (i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        File fileB = fa.b(h(uri));
        return new de(new FileInputStream(fileB), fileB);
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final boolean b(Uri uri) throws zzsg {
        if (i(uri)) {
            throw new zzsg("Android backend cannot perform remote operations without a remote backend");
        }
        return fa.b(h(uri)).exists();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    @Override // com.google.android.gms.internal.measurement.ke
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.File c(android.net.Uri r10) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.yd.c(android.net.Uri):java.io.File");
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final OutputStream d(Uri uri) {
        return this.f12064b.d(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final String e() {
        return AnalyticsPlatformParams.channel;
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final void f(Uri uri) throws IOException {
        this.f12064b.f(h(uri));
    }

    @Override // com.google.android.gms.internal.measurement.ke
    public final void g(Uri uri, Uri uri2) throws IOException {
        this.f12064b.g(h(uri), h(uri2));
    }

    public final Uri h(Uri uri) throws IOException {
        if (i(uri)) {
            throw new zzsi("Operation across authorities is not allowed.");
        }
        File fileC = c(uri);
        Uri.Builder builderPath = new Uri.Builder().scheme("file").authority("").path(ExpiryDateInput.SEPARATOR);
        k30.d dVar = k30.h.f25901b;
        ex.i.m(4, "initialCapacity");
        builderPath.path(fileC.getAbsolutePath());
        return builderPath.encodedFragment(he.a(k30.h.j(0, new Object[4]))).build();
    }

    public final boolean i(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.f12063a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }
}
