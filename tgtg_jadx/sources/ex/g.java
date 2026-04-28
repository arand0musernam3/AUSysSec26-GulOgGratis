package ex;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.facebook.FacebookException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f16525f = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static g f16526g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f16527a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f16528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f16529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f16530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f16531e;

    public g() {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        this.f16528b = setNewSetFromMap;
        this.f16529c = new LinkedHashSet();
        this.f16530d = new HashSet();
        this.f16531e = new HashMap();
    }

    public final void a(Activity activity) {
        Set set = yx.a.f46339a;
        if (set.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.f16528b.add(activity);
            this.f16530d.clear();
            HashSet hashSet = (HashSet) this.f16531e.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.f16530d = hashSet;
            }
            if (set.contains(this)) {
                return;
            }
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    b();
                } else {
                    this.f16527a.post(new d1.e(this, 9));
                }
            } catch (Throwable th2) {
                yx.a.a(this, th2);
            }
        } catch (Throwable th3) {
            yx.a.a(this, th3);
        }
    }

    public final void b() {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            for (Activity activity : this.f16528b) {
                if (activity != null) {
                    this.f16529c.add(new f(nx.d.u(activity), this.f16527a, this.f16530d, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }

    public final void c(Activity activity) {
        if (yx.a.f46339a.contains(this)) {
            return;
        }
        try {
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.f16528b.remove(activity);
            this.f16529c.clear();
            HashMap map = this.f16531e;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = this.f16530d.clone();
            objClone.getClass();
            map.put(numValueOf, (HashSet) objClone);
            this.f16530d.clear();
        } catch (Throwable th2) {
            yx.a.a(this, th2);
        }
    }
}
