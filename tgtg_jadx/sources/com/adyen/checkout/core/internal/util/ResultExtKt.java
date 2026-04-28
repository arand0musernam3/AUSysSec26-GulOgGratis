package com.adyen.checkout.core.internal.util;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import u70.o;
import u70.p;
import u70.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"T", "R", "Lkotlin/Function1;", "block", "Lu70/q;", "runSuspendCatching", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "checkout-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ResultExtKt {
    @NotNull
    public static final <T, R> Object runSuspendCatching(T t9, @NotNull Function1<? super T, ? extends R> function1) {
        function1.getClass();
        try {
            o oVar = q.f40850b;
            return function1.invoke(t9);
        } catch (CancellationException e5) {
            throw e5;
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            return new p(th2);
        }
    }
}
