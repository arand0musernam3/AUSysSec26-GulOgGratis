package com.facebook;

import kotlin.Metadata;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookDialogException;", "Lcom/facebook/FacebookException;", "facebook-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookDialogException extends FacebookException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10984c;

    public FacebookDialogException(String str, int i11, String str2) {
        super(str);
        this.f10983b = i11;
        this.f10984c = str2;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookDialogException: errorCode: ");
        sb2.append(this.f10983b);
        sb2.append(", message: ");
        sb2.append(getMessage());
        sb2.append(", url: ");
        return k.p(sb2, this.f10984c, "}");
    }
}
