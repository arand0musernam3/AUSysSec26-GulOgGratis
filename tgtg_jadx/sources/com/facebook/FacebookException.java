package com.facebook;

import ax.a0;
import ax.u;
import java.security.SecureRandom;
import kotlin.Metadata;
import tx.t;
import tx.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/FacebookException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FacebookException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SecureRandom f10985a = new SecureRandom();

    public FacebookException(String str) {
        super(str);
        if (str == null || !a0.f4864q.get() || f10985a.nextInt(100) <= 50) {
            return;
        }
        w.a(new u(str, 0), t.ErrorReport);
    }

    @Override // java.lang.Throwable
    public String toString() {
        String message = getMessage();
        return message == null ? "" : message;
    }
}
