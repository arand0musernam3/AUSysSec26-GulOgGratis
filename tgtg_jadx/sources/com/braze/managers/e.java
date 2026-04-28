package com.braze.managers;

import android.content.Context;
import android.view.View;
import com.braze.Braze;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends z70.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f9965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f9967c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, String str, d dVar, x70.c cVar) {
        super(2, cVar);
        this.f9965a = view;
        this.f9966b = str;
        this.f9967c = dVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new e(this.f9965a, this.f9966b, this.f9967c, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((v80.b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        Braze.Companion companion = Braze.INSTANCE;
        Context context = this.f9965a.getContext();
        context.getClass();
        companion.getInstance(context).logBannerImpression(this.f9966b);
        ReentrantLock reentrantLock = j.f10002k;
        d dVar = this.f9967c;
        reentrantLock.lock();
        try {
            dVar.f9958c = true;
            return Unit.f26487a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
