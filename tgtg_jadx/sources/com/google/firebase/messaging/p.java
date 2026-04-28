package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Executor;
import zw.q2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements u30.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u30.o f12866b;

    public /* synthetic */ p(u30.o oVar, int i11) {
        this.f12865a = i11;
        this.f12866b = oVar;
    }

    @Override // u30.e
    public final Object i(q2 q2Var) {
        switch (this.f12865a) {
            case 0:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(this.f12866b, q2Var);
            default:
                return new r40.c((Context) q2Var.b(Context.class), ((p30.g) q2Var.b(p30.g.class)).d(), q2Var.f(u30.o.a(r40.d.class)), q2Var.c(a50.b.class), (Executor) q2Var.e(this.f12866b));
        }
    }
}
