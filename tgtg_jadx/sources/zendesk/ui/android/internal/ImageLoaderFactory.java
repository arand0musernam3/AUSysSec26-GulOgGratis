package zendesk.ui.android.internal;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import androidx.lifecycle.n1;
import c90.e;
import c90.f;
import ed.n;
import ed.o;
import f0.f2;
import ia0.a0;
import ia0.m;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import n80.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pc.d;
import q90.c0;
import q90.d0;
import q90.g0;
import q90.p0;
import q90.w;
import q90.x;
import qc.f0;
import qc.s;
import qc.u;
import rc.h;
import u70.l;
import v90.g;
import zendesk.logger.Logger;
import zendesk.ui.android.conversation.composer.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0010¨\u0006\u0018"}, d2 = {"Lzendesk/ui/android/internal/ImageLoaderFactory;", "", "<init>", "()V", "Lpc/d;", "imageLoader", "", "setImageLoader", "(Lpc/d;)V", "Landroid/content/Context;", "context", "getImageLoader", "(Landroid/content/Context;)Lpc/d;", "Lpc/d;", "", "CACHE_MAX_SIZE_20MB", "J", "", "CACHE_NAME", "Ljava/lang/String;", "HEADER_ACCEPT", "HEADER_ACCEPT_VALUES", "TIMEOUT_SECONDS", "CustomImagesHeaderInterceptor", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nImageLoaderFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoaderFactory.kt\nzendesk/ui/android/internal/ImageLoaderFactory\n+ 2 ImageLoader.kt\ncoil/ImageLoader$Builder\n*L\n1#1,111:1\n192#2:112\n*S KotlinDebug\n*F\n+ 1 ImageLoaderFactory.kt\nzendesk/ui/android/internal/ImageLoaderFactory\n*L\n69#1:112\n*E\n"})
public final class ImageLoaderFactory {
    private static final long CACHE_MAX_SIZE_20MB = 20000000;

    @NotNull
    private static final String CACHE_NAME = "zendesk_conversationkit_image_cache";

    @NotNull
    private static final String HEADER_ACCEPT = "Accept";

    @NotNull
    private static final String HEADER_ACCEPT_VALUES = "*/*";
    private static final long TIMEOUT_SECONDS = 60;

    @Nullable
    private static d imageLoader;

    @NotNull
    public static final ImageLoaderFactory INSTANCE = new ImageLoaderFactory();
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzendesk/ui/android/internal/ImageLoaderFactory$CustomImagesHeaderInterceptor;", "Lq90/x;", "<init>", "()V", "Lq90/w;", "chain", "Lq90/p0;", "intercept", "(Lq90/w;)Lq90/p0;", "zendesk.ui_ui-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CustomImagesHeaderInterceptor implements x {
        @Override // q90.x
        @NotNull
        public p0 intercept(@NotNull w chain) {
            chain.getClass();
            g gVar = (g) chain;
            n1 n1VarB = gVar.f42190e.b();
            n1VarB.e(ImageLoaderFactory.HEADER_ACCEPT, ImageLoaderFactory.HEADER_ACCEPT_VALUES);
            return gVar.b(new g0(n1VarB));
        }
    }

    private ImageLoaderFactory() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 getImageLoader$lambda$5$lambda$0() {
        c0 c0Var = new c0();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        c0Var.f36450y = r90.g.b(60L, timeUnit);
        c0Var.f36451z = r90.g.b(60L, timeUnit);
        c0Var.A = r90.g.b(60L, timeUnit);
        c0Var.f36429c.add(new CustomImagesHeaderInterceptor());
        return new d0(c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rc.a getImageLoader$lambda$5$lambda$1(Context context) {
        long jD;
        ia0.w wVar = m.f23661a;
        f fVar = v80.p0.f42144a;
        e eVar = e.f7834b;
        File cacheDir = context.getCacheDir();
        cacheDir.getClass();
        File fileH = e80.m.h(cacheDir, CACHE_NAME);
        String str = a0.f23602b;
        a0 a0VarT = n20.f.t(fileH);
        if (0.0d > 0.0d) {
            jD = 10485760;
            try {
                File file = a0VarT.toFile();
                file.mkdir();
                StatFs statFs = new StatFs(file.getAbsolutePath());
                jD = p.d((long) (0.0d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
            } catch (Exception unused) {
            }
        } else {
            jD = CACHE_MAX_SIZE_20MB;
        }
        return new h(jD, wVar, a0VarT, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xc.d getImageLoader$lambda$5$lambda$2(Context context) {
        return new xc.a(context).a();
    }

    @NotNull
    public final d getImageLoader(@NotNull Context context) {
        d dVarB;
        context.getClass();
        d dVar = imageLoader;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            try {
                dVarB = imageLoader;
                if (dVarB == null) {
                    f2 f2Var = new f2();
                    f2Var.f16648a = context.getApplicationContext();
                    f2Var.f16649b = ed.h.f15926a;
                    f2Var.f16650c = null;
                    f2Var.f16651d = null;
                    f2Var.f16652e = null;
                    f2Var.f16653f = null;
                    f2Var.f16654g = new n();
                    f2Var.f16655h = null;
                    f2Var.f16652e = l.b(new b(9));
                    f2Var.f16651d = l.b(new bo.a(context, 19));
                    f2Var.f16650c = l.b(new bo.a(context, 20));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList5.add(new u());
                    }
                    arrayList5.add(new s());
                    arrayList5.add(new f0());
                    f2Var.f16653f = new pc.a(a.a.O(arrayList), a.a.O(arrayList2), a.a.O(arrayList3), a.a.O(arrayList4), a.a.O(arrayList5));
                    f2Var.f16655h = new o() { // from class: zendesk.ui.android.internal.ImageLoaderFactory$getImageLoader$1$5
                        private int level = 3;

                        @Override // ed.o
                        public int getLevel() {
                            return this.level;
                        }

                        @Override // ed.o
                        public void log(String tag, int priority, String message, Throwable throwable) {
                            tag.getClass();
                            Logger.i(tag, message, new Object[0]);
                        }

                        public void setLevel(int i11) {
                            this.level = i11;
                        }
                    };
                    dVarB = f2Var.b();
                    imageLoader = dVarB;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarB;
    }

    public final void setImageLoader(@NotNull d imageLoader2) {
        imageLoader2.getClass();
        imageLoader = imageLoader2;
    }
}
