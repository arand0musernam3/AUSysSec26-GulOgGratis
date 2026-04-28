package ma;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import com.app.tgtg.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o00.x0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f29898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f29899e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f29902c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f29901b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f29900a = new HashMap();

    public a(Context context) {
        this.f29902c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f29898d == null) {
            synchronized (f29899e) {
                try {
                    if (f29898d == null) {
                        f29898d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f29898d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f29902c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f29901b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e5) {
                throw new StartupException(e5);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f29900a;
        if (x0.y()) {
            try {
                Trace.beginSection(x0.G(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f29902c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new StartupException(th3);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
