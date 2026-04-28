package p70;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import c50.w;
import o00.x0;
import qc.y;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements r70.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34546a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f34547b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile r70.a f34548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f34549d;

    public g(lz.i iVar) {
        this.f34549d = iVar;
    }

    public static final Context d(Context context) {
        while ((context instanceof ContextWrapper) && !(context instanceof Activity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // r70.b
    public final Object a() {
        switch (this.f34546a) {
            case 0:
                if (((ag.i) this.f34548c) == null) {
                    synchronized (this.f34547b) {
                        try {
                            if (((ag.i) this.f34548c) == null) {
                                this.f34548c = ((lz.i) this.f34549d).C();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return (ag.i) this.f34548c;
            case 1:
                if (((ag.e) this.f34548c) == null) {
                    synchronized (this.f34547b) {
                        try {
                            if (((ag.e) this.f34548c) == null) {
                                this.f34548c = b();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return (ag.e) this.f34548c;
            default:
                if (((ag.j) this.f34548c) == null) {
                    synchronized (this.f34547b) {
                        try {
                            if (((ag.j) this.f34548c) == null) {
                                this.f34548c = c();
                            }
                        } finally {
                        }
                        break;
                    }
                }
                return (ag.j) this.f34548c;
        }
    }

    public ag.e b() {
        Fragment fragment = (Fragment) this.f34549d;
        if (fragment.getHost() == null) {
            w.l("Hilt Fragments must be attached before creating the component.");
            return null;
        }
        ox.h.q(fragment.getHost() instanceof r70.c, "Hilt Fragments must be attached to an @AndroidEntryPoint Activity. Found: %s", fragment.getHost().getClass());
        ag.b bVar = (ag.b) ((h) x0.q(h.class, fragment.getHost()));
        return new ag.e(bVar.f1288a, bVar.f1289b, bVar.f1290c);
    }

    public ag.j c() {
        ViewGroup viewGroup = (ViewGroup) this.f34549d;
        Context context = viewGroup.getContext();
        while ((context instanceof ContextWrapper) && !r70.b.class.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        Application applicationT = u00.d.t(context.getApplicationContext());
        Object obj = context;
        if (context == applicationT) {
            ox.h.q(false, "%s, Hilt view cannot be created using the application context. Use a Hilt Fragment or Activity context.", viewGroup.getClass());
            obj = null;
        }
        if (obj instanceof r70.b) {
            return new ag.j(((ag.b) ((l) x0.q(l.class, (r70.b) obj))).f1288a);
        }
        y.g(viewGroup.getClass(), ", Hilt view must be attached to an @AndroidEntryPoint Fragment or Activity.");
        return null;
    }

    public g(Fragment fragment) {
        this.f34549d = fragment;
    }

    public g(ViewGroup viewGroup) {
        this.f34549d = viewGroup;
    }
}
