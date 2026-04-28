package q8;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.Violation;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import mr.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f36354a = b.f36351c;

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                fragment.getParentFragmentManager().getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f36354a;
    }

    public static void b(b bVar, Violation violation) {
        Fragment fragment = violation.f3331a;
        String name = fragment.getClass().getName();
        Set set = bVar.f36352a;
        if (set.contains(a.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(a.PENALTY_DEATH)) {
            h hVar = new h(7, name, violation);
            if (!fragment.isAdded()) {
                hVar.run();
                throw null;
            }
            Handler handler = fragment.getParentFragmentManager().f3129x.f3358c;
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                hVar.run();
                throw null;
            }
            handler.post(hVar);
        }
    }

    public static void c(Violation violation) {
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f3331a.getClass().getName()), violation);
        }
    }

    public static final void d(Fragment fragment, String str) {
        fragment.getClass();
        str.getClass();
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + str);
        c(fragmentReuseViolation);
        b bVarA = a(fragment);
        if (bVarA.f36352a.contains(a.DETECT_FRAGMENT_REUSE) && e(bVarA, fragment.getClass(), FragmentReuseViolation.class)) {
            b(bVarA, fragmentReuseViolation);
        }
    }

    public static boolean e(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f36353b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), Violation.class) || !CollectionsKt.I(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
