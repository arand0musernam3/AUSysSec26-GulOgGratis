package com.facebook;

import ax.w;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookServiceException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FacebookServiceException extends FacebookException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f10987b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FacebookServiceException(w wVar, String str) {
        super(str);
        wVar.getClass();
        this.f10987b = wVar;
    }

    @Override // com.facebook.FacebookException, java.lang.Throwable
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{FacebookServiceException: httpResponseCode: ");
        w wVar = this.f10987b;
        sb2.append(wVar.f5018a);
        sb2.append(", facebookErrorCode: ");
        sb2.append(wVar.f5019b);
        sb2.append(", facebookErrorType: ");
        sb2.append(wVar.f5021d);
        sb2.append(", message: ");
        sb2.append(wVar.a());
        sb2.append("}");
        return sb2.toString();
    }
}
