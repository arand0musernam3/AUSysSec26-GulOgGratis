package androidx.fragment.app;

import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3401g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f3403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f3405k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CharSequence f3406m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f3407n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f3408o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f3410q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3395a = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f3402h = true;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f3409p = false;

    @Deprecated
    public z1() {
    }

    public final void b(y1 y1Var) {
        this.f3395a.add(y1Var);
        y1Var.f3385d = this.f3396b;
        y1Var.f3386e = this.f3397c;
        y1Var.f3387f = this.f3398d;
        y1Var.f3388g = this.f3399e;
    }

    public final void c(String str) {
        if (!this.f3402h) {
            com.braze.h2.b("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.f3401g = true;
            this.f3403i = str;
        }
    }

    public abstract int d();

    public void e(int i11, Fragment fragment, String str, int i12) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            q8.c.d(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 != null && !str.equals(str3)) {
                StringBuilder sb2 = new StringBuilder("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(": was ");
                com.braze.h2.b(e0.f.n(sb2, fragment.mTag, " now ", str));
                return;
            }
            fragment.mTag = str;
        }
        if (i11 != 0) {
            if (i11 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i13 = fragment.mFragmentId;
            if (i13 != 0 && i13 != i11) {
                StringBuilder sb3 = new StringBuilder("Can't change container ID of fragment ");
                sb3.append(fragment);
                int i14 = fragment.mFragmentId;
                sb3.append(": was ");
                sb3.append(i14);
                sb3.append(" now ");
                sb3.append(i11);
                throw new IllegalStateException(sb3.toString());
            }
            fragment.mFragmentId = i11;
            fragment.mContainerId = i11;
        }
        b(new y1(fragment, i12));
    }

    public final void f(int i11, Fragment fragment, String str) {
        if (i11 != 0) {
            e(i11, fragment, str, 2);
        } else {
            i4.a.f("Must use non-zero containerViewId");
        }
    }

    public z1(int i11) {
    }
}
