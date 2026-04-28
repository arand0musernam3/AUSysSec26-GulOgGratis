package com.google.i18n.phonenumbers;

import h50.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class NumberParseException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f12897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12898b;

    public NumberParseException(a aVar, String str) {
        super(str);
        this.f12898b = str;
        this.f12897a = aVar;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "Error type: " + this.f12897a + ". " + this.f12898b;
    }
}
