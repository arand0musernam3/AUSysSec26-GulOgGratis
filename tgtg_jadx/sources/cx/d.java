package cx;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.firebase.messaging.r;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f13465e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WeakReference f13468c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f13466a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f13467b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f13469d = new AtomicBoolean(false);

    public d(Activity activity) {
        this.f13468c = new WeakReference(activity);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0030 -> B:20:0x0033). Please report as a decompilation issue!!! */
    public final void a(View view) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            r rVar = new r(1, view, this);
            if (!set.contains(this)) {
                try {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        rVar.run();
                    } else {
                        this.f13467b.post(rVar);
                    }
                } catch (Throwable th2) {
                    yx.a.a(this, th2);
                }
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x005b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.View r13) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cx.d.b(android.view.View):void");
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        if (view != null) {
            try {
                a(view);
            } catch (Throwable th2) {
                yx.a.a(this, th2);
                return;
            }
        }
        if (view2 != null) {
            a(view2);
        }
    }
}
