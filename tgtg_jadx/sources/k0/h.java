package k0;

import android.content.res.TypedArray;
import android.media.Image;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import com.braze.h2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f25615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j30.g f25616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r80.a f25617c = w.b.p(false);

    public h(g gVar, j30.g gVar2) {
        this.f25615a = gVar;
        this.f25616b = gVar2;
    }

    public final h a() {
        int i11;
        int i12;
        h hVar = null;
        if (!this.f25617c.b()) {
            j30.g gVar = this.f25616b;
            r80.b bVar = (r80.b) gVar.f24503c;
            do {
                i11 = bVar.f37781a;
                i12 = i11 == 0 ? 0 : i11 + 1;
            } while (!r80.b.f37780b.compareAndSet(bVar, i11, i12));
            if ((i12 != 0 ? (g) gVar.f24502b : null) != null) {
                hVar = new h(this.f25615a, this.f25616b);
            }
        }
        if (hVar != null) {
            return hVar;
        }
        h2.b("Required value was null.");
        return null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        if (this.f25617c.a()) {
            j30.g gVar = this.f25616b;
            r80.b bVar = (r80.b) gVar.f24503c;
            bVar.getClass();
            if (r80.b.f37780b.decrementAndGet(bVar) == 0) {
                r80.d dVar = (r80.d) gVar.f24504d;
                dVar.getClass();
                d dVar2 = (d) r80.d.f37784b.getAndSet(dVar, null);
                dVar2.getClass();
                AutoCloseable autoCloseable = (g) gVar.f24502b;
                dVar2.getClass();
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                    return;
                }
                if (!(autoCloseable instanceof ExecutorService)) {
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    }
                    if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                        return;
                    } else if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                        return;
                    } else {
                        i4.a.h();
                        return;
                    }
                }
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
                    return;
                }
                executorService.shutdown();
                boolean z11 = false;
                while (!zIsTerminated) {
                    try {
                        zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z11) {
                            executorService.shutdownNow();
                            z11 = true;
                        }
                    }
                }
                if (z11) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        kClass.getClass();
        if (this.f25617c.b()) {
            return null;
        }
        if (Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(h.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(g.class)) || Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(f.class))) {
            return this;
        }
        if (!Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Image.class))) {
            return this.f25615a.t(kClass);
        }
        throw new UnsupportedOperationException("Cannot unwrap " + this + " as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
    }

    public final String toString() {
        return this.f25615a.toString();
    }
}
