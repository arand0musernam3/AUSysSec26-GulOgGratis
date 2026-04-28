package f0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.StatFs;
import com.app.tgtg.model.remote.item.response.BasicItem;
import ed.k;
import ed.p;
import f0.f2;
import ia0.a0;
import ia0.m;
import ia0.w;
import java.io.File;
import kotlin.jvm.functions.Function0;
import v80.p0;
import zendesk.ui.android.internal.ImageLoaderFactory$getImageLoader$1$5;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f16648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f16649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f16650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f16651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f16652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f16653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f16654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f16655h;

    public static final nk.q0 a(f2 f2Var, boolean z11) {
        nk.s0 s0Var = (nk.s0) ((y80.a2) f2Var.f16654g).getValue();
        if (!(s0Var instanceof nk.q0)) {
            return null;
        }
        nk.q0 q0Var = (nk.q0) s0Var;
        BasicItem basicItem = q0Var.f31035a;
        basicItem.setSubscribedForNotification(z11);
        return nk.q0.a(q0Var, basicItem, null, null, null, false, System.currentTimeMillis(), 8190);
    }

    public pc.h b() {
        Context context = (Context) this.f16648a;
        zc.c cVar = (zc.c) this.f16649b;
        u70.t tVarB = (u70.t) this.f16650c;
        if (tVarB == null) {
            final int i11 = 0;
            tVarB = u70.l.b(new Function0(this) { // from class: pc.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f2 f34643b;

                {
                    this.f34643b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    rc.h hVar;
                    long jD;
                    switch (i11) {
                        case 0:
                            return new xc.a((Context) this.f34643b.f16648a).a();
                        default:
                            f2 f2Var = this.f34643b;
                            p pVar = p.f15940a;
                            Context context2 = (Context) f2Var.f16648a;
                            synchronized (pVar) {
                                try {
                                    hVar = p.f15941b;
                                    if (hVar == null) {
                                        w wVar = m.f23661a;
                                        c90.f fVar = p0.f42144a;
                                        c90.e eVar = c90.e.f7834b;
                                        Bitmap.Config[] configArr = k.f15927a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir == null) {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                        cacheDir.mkdirs();
                                        File fileH = e80.m.h(cacheDir, "image_cache");
                                        String str = a0.f23602b;
                                        a0 a0VarT = n20.f.t(fileH);
                                        if (0.02d > 0.0d) {
                                            jD = 10485760;
                                            try {
                                                File file = a0VarT.toFile();
                                                file.mkdir();
                                                StatFs statFs = new StatFs(file.getAbsolutePath());
                                                jD = n80.p.d((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            jD = 0;
                                        }
                                        rc.h hVar2 = new rc.h(jD, wVar, a0VarT, eVar);
                                        p.f15941b = hVar2;
                                        hVar = hVar2;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return hVar;
                    }
                }
            });
        }
        u70.t tVarB2 = (u70.t) this.f16651d;
        if (tVarB2 == null) {
            final int i12 = 1;
            tVarB2 = u70.l.b(new Function0(this) { // from class: pc.c

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f2 f34643b;

                {
                    this.f34643b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    rc.h hVar;
                    long jD;
                    switch (i12) {
                        case 0:
                            return new xc.a((Context) this.f34643b.f16648a).a();
                        default:
                            f2 f2Var = this.f34643b;
                            p pVar = p.f15940a;
                            Context context2 = (Context) f2Var.f16648a;
                            synchronized (pVar) {
                                try {
                                    hVar = p.f15941b;
                                    if (hVar == null) {
                                        w wVar = m.f23661a;
                                        c90.f fVar = p0.f42144a;
                                        c90.e eVar = c90.e.f7834b;
                                        Bitmap.Config[] configArr = k.f15927a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir == null) {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                        cacheDir.mkdirs();
                                        File fileH = e80.m.h(cacheDir, "image_cache");
                                        String str = a0.f23602b;
                                        a0 a0VarT = n20.f.t(fileH);
                                        if (0.02d > 0.0d) {
                                            jD = 10485760;
                                            try {
                                                File file = a0VarT.toFile();
                                                file.mkdir();
                                                StatFs statFs = new StatFs(file.getAbsolutePath());
                                                jD = n80.p.d((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            jD = 0;
                                        }
                                        rc.h hVar2 = new rc.h(jD, wVar, a0VarT, eVar);
                                        p.f15941b = hVar2;
                                        hVar = hVar2;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return hVar;
                    }
                }
            });
        }
        u70.t tVarB3 = (u70.t) this.f16652e;
        if (tVarB3 == null) {
            tVarB3 = u70.l.b(new p9.a(2));
        }
        pc.a aVar = (pc.a) this.f16653f;
        if (aVar == null) {
            kotlin.collections.n0 n0Var = kotlin.collections.n0.f26529a;
            aVar = new pc.a(n0Var, n0Var, n0Var, n0Var, n0Var);
        }
        return new pc.h(context, cVar, tVarB, tVarB2, tVarB3, aVar, (ed.n) this.f16654g, (ImageLoaderFactory$getImageLoader$1$5) this.f16655h);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r24, int r25, long r26, f0.d1 r28, f0.d0 r29, z70.c r30) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.f2.c(java.lang.String, int, long, f0.d1, f0.d0, z70.c):java.lang.Object");
    }
}
