package com.braze.images;

import android.content.Context;
import com.braze.support.BrazeLogger;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f9865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultBrazeImageLoader f9866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, DefaultBrazeImageLoader defaultBrazeImageLoader, x70.c cVar) {
        super(2, cVar);
        this.f9865a = context;
        this.f9866b = defaultBrazeImageLoader;
    }

    public static final String a() {
        return "Initializing disk cache";
    }

    public static final String b() {
        return "Disk cache initialized";
    }

    public static final String c() {
        return "Image loader was replaced. Disk cache shut down";
    }

    public static final String d() {
        return "Caught exception creating new disk cache. Unable to create new disk cache";
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new d(this.f9865a, this.f9866b, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f9865a, this.f9866b, (x70.c) obj2).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        ba0.g.M(obj);
        c cVar = DefaultBrazeImageLoader.Companion;
        Context context = this.f9865a;
        cVar.getClass();
        File fileA = c.a(context, DefaultBrazeImageLoader.BRAZE_LRU_CACHE_FOLDER);
        ReentrantLock reentrantLock = this.f9866b.diskCacheLock;
        DefaultBrazeImageLoader defaultBrazeImageLoader = this.f9866b;
        reentrantLock.lock();
        try {
            try {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xh.d(26), 14, (Object) null);
                defaultBrazeImageLoader.diskLruCache = new a(fileA);
                if (defaultBrazeImageLoader.isOffline.get()) {
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xh.d(28), 14, (Object) null);
                    a aVar2 = defaultBrazeImageLoader.diskLruCache;
                    if (aVar2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                        aVar2 = null;
                    }
                    aVar2.a();
                } else {
                    BrazeLogger.brazelog$default(brazeLogger, DefaultBrazeImageLoader.TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xh.d(27), 14, (Object) null);
                    defaultBrazeImageLoader.isDiskCacheStarting = false;
                }
            } catch (Exception e5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, DefaultBrazeImageLoader.TAG, BrazeLogger.Priority.E, (Throwable) e5, false, (Function0) new xh.d(29), 8, (Object) null);
            }
            Unit unit = Unit.f26487a;
            reentrantLock.unlock();
            return unit;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
