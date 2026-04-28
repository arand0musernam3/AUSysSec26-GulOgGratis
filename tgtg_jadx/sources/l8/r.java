package l8;

import a40.d0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f27475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e7.d f27476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ky.p f27477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f27478d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Handler f27479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ThreadPoolExecutor f27480f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ThreadPoolExecutor f27481g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0.g f27482h;

    public r(Context context, e7.d dVar) {
        pd.g.m(context, "Context cannot be null");
        this.f27475a = context.getApplicationContext();
        this.f27476b = dVar;
        this.f27477c = s.f27483d;
    }

    @Override // l8.i
    public final void a(h0.g gVar) {
        synchronized (this.f27478d) {
            this.f27482h = gVar;
        }
        synchronized (this.f27478d) {
            try {
                if (this.f27482h == null) {
                    return;
                }
                if (this.f27480f == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.f27481g = threadPoolExecutor;
                    this.f27480f = threadPoolExecutor;
                }
                this.f27480f.execute(new d1.e(this, 29));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        synchronized (this.f27478d) {
            try {
                this.f27482h = null;
                Handler handler = this.f27479e;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.f27479e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f27481g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f27480f = null;
                this.f27481g = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final e7.i c() {
        try {
            ky.p pVar = this.f27477c;
            Context context = this.f27475a;
            e7.d dVar = this.f27476b;
            pVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            e7.h hVarA = e7.c.a(context, Collections.unmodifiableList(arrayList));
            int i11 = hVarA.f15830a;
            if (i11 != 0) {
                d0.k(r8.k.h(i11, "fetchFonts failed (", ")"));
                return null;
            }
            e7.i[] iVarArr = (e7.i[]) hVarA.f15831b.get(0);
            if (iVarArr != null && iVarArr.length != 0) {
                return iVarArr[0];
            }
            d0.k("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e5) {
            d0.o("provider not found", e5);
            return null;
        }
    }
}
