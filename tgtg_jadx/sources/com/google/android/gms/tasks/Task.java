package com.google.android.gms.tasks;

import android.app.Activity;
import androidx.annotation.NonNull;
import d10.b;
import d10.c;
import d10.d;
import d10.e;
import d10.f;
import d10.o;
import java.util.concurrent.Executor;
import mp.a;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Task<TResult> {
    public void a(c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @NonNull
    public Task<TResult> addOnCompleteListener(@NonNull OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public void b(Executor executor, c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public void c(Executor executor, OnCompleteListener onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract o d(Activity activity, a aVar);

    public abstract o e(d dVar);

    public abstract o f(Executor executor, d dVar);

    public abstract o g(e eVar);

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract o h(Executor executor, e eVar);

    public Task i(Executor executor, b bVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public abstract boolean isSuccessful();

    public Task j(Executor executor, b bVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Object k();

    public abstract boolean l();

    public abstract boolean m();

    public Task n(f fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public Task o(Executor executor, f fVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
