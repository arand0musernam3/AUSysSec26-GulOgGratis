package com.fingerprintjs.android.fingerprint.tools.threading.safe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import py.a;
import w2.l1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/fingerprintjs/android/fingerprint/tools/threading/safe/ExecutionTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "fingerprint_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ExecutionTimeoutException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11004a;

    public ExecutionTimeoutException(TimeoutException timeoutException, ArrayList arrayList) {
        super(timeoutException);
        this.f11004a = arrayList;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb2 = new StringBuilder("The execution took too long to complete. Original exception: ");
        sb2.append(getCause());
        sb2.append(", execution thread stacktrace: ");
        List list = this.f11004a;
        return l1.f(sb2, list != null ? CollectionsKt.U(list, null, null, null, a.f35638a, 31) : null, '.');
    }
}
