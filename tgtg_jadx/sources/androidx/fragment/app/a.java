package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.Lifecycle;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends z1 implements j1 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FragmentManager f3132r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f3133s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f3134t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3135u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(a aVar) {
        super(0);
        aVar.f3132r.I();
        u0 u0Var = aVar.f3132r.f3129x;
        if (u0Var != null) {
            u0Var.f3357b.getClassLoader();
        }
        for (y1 y1Var : aVar.f3395a) {
            ArrayList arrayList = this.f3395a;
            y1 y1Var2 = new y1();
            y1Var2.f3382a = y1Var.f3382a;
            y1Var2.f3383b = y1Var.f3383b;
            y1Var2.f3384c = y1Var.f3384c;
            y1Var2.f3385d = y1Var.f3385d;
            y1Var2.f3386e = y1Var.f3386e;
            y1Var2.f3387f = y1Var.f3387f;
            y1Var2.f3388g = y1Var.f3388g;
            y1Var2.f3389h = y1Var.f3389h;
            y1Var2.f3390i = y1Var.f3390i;
            arrayList.add(y1Var2);
        }
        this.f3396b = aVar.f3396b;
        this.f3397c = aVar.f3397c;
        this.f3398d = aVar.f3398d;
        this.f3399e = aVar.f3399e;
        this.f3400f = aVar.f3400f;
        this.f3401g = aVar.f3401g;
        this.f3402h = aVar.f3402h;
        this.f3403i = aVar.f3403i;
        this.l = aVar.l;
        this.f3406m = aVar.f3406m;
        this.f3404j = aVar.f3404j;
        this.f3405k = aVar.f3405k;
        if (aVar.f3407n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3407n = arrayList2;
            arrayList2.addAll(aVar.f3407n);
        }
        if (aVar.f3408o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f3408o = arrayList3;
            arrayList3.addAll(aVar.f3408o);
        }
        this.f3409p = aVar.f3409p;
        this.f3134t = -1;
        this.f3135u = false;
        this.f3132r = aVar.f3132r;
        this.f3133s = aVar.f3133s;
        this.f3134t = aVar.f3134t;
        this.f3135u = aVar.f3135u;
    }

    @Override // androidx.fragment.app.j1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f3401g) {
            return true;
        }
        this.f3132r.f3110d.add(this);
        return true;
    }

    @Override // androidx.fragment.app.z1
    public final int d() {
        return i(false, true);
    }

    @Override // androidx.fragment.app.z1
    public final void e(int i11, Fragment fragment, String str, int i12) {
        super.e(i11, fragment, str, i12);
        fragment.mFragmentManager = this.f3132r;
    }

    public final void g(int i11) {
        if (this.f3401g) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i11);
            }
            ArrayList arrayList = this.f3395a;
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                y1 y1Var = (y1) arrayList.get(i12);
                Fragment fragment = y1Var.f3383b;
                if (fragment != null) {
                    fragment.mBackStackNesting += i11;
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + y1Var.f3383b + " to " + y1Var.f3383b.mBackStackNesting);
                    }
                }
            }
        }
    }

    public final void h() {
        ArrayList arrayList = this.f3395a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            y1 y1Var = (y1) arrayList.get(size);
            if (y1Var.f3384c) {
                if (y1Var.f3382a == 8) {
                    y1Var.f3384c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i11 = y1Var.f3383b.mContainerId;
                    y1Var.f3382a = 2;
                    y1Var.f3384c = false;
                    for (int i12 = size - 1; i12 >= 0; i12--) {
                        y1 y1Var2 = (y1) arrayList.get(i12);
                        if (y1Var2.f3384c && y1Var2.f3383b.mContainerId == i11) {
                            arrayList.remove(i12);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int i(boolean z11, boolean z12) {
        if (this.f3133s) {
            com.braze.h2.b("commit already called");
            return 0;
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new j2());
            k("  ", printWriter, true);
            printWriter.close();
        }
        this.f3133s = true;
        boolean z13 = this.f3401g;
        FragmentManager fragmentManager = this.f3132r;
        if (z13) {
            this.f3134t = fragmentManager.f3117k.getAndIncrement();
        } else {
            this.f3134t = -1;
        }
        if (z12) {
            fragmentManager.y(this, z11);
        }
        return this.f3134t;
    }

    public final void j() {
        if (this.f3401g) {
            com.braze.h2.b("This transaction is already being added to the back stack");
        } else {
            this.f3402h = false;
            this.f3132r.B(this, false);
        }
    }

    public final void k(String str, PrintWriter printWriter, boolean z11) {
        String str2;
        if (z11) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f3403i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f3134t);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f3133s);
            if (this.f3400f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f3400f));
            }
            if (this.f3396b != 0 || this.f3397c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3396b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3397c));
            }
            if (this.f3398d != 0 || this.f3399e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f3398d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f3399e));
            }
            if (this.f3404j != 0 || this.f3405k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f3404j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f3405k);
            }
            if (this.l != 0 || this.f3406m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f3406m);
            }
        }
        ArrayList arrayList = this.f3395a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            y1 y1Var = (y1) arrayList.get(i11);
            switch (y1Var.f3382a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + y1Var.f3382a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i11);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(y1Var.f3383b);
            if (z11) {
                if (y1Var.f3385d != 0 || y1Var.f3386e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(y1Var.f3385d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(y1Var.f3386e));
                }
                if (y1Var.f3387f != 0 || y1Var.f3388g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(y1Var.f3387f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(y1Var.f3388g));
                }
            }
        }
    }

    public final void l(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3132r) {
            b(new y1(fragment, 3));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final void m(Fragment fragment, Lifecycle.State state) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        FragmentManager fragmentManager2 = this.f3132r;
        if (fragmentManager != fragmentManager2) {
            j4.d.o(fragmentManager2, "Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            return;
        }
        if (state == Lifecycle.State.INITIALIZED && fragment.mState > -1) {
            j4.d.m("Cannot set maximum Lifecycle to ", state, " after the Fragment has been created");
            return;
        }
        if (state == Lifecycle.State.DESTROYED) {
            j4.d.m("Cannot set maximum Lifecycle to ", state, ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
            return;
        }
        y1 y1Var = new y1();
        y1Var.f3382a = 10;
        y1Var.f3383b = fragment;
        y1Var.f3384c = false;
        y1Var.f3389h = fragment.mMaxState;
        y1Var.f3390i = state;
        b(y1Var);
    }

    public final void n(Fragment fragment) {
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (fragmentManager == null || fragmentManager == this.f3132r) {
            b(new y1(fragment, 8));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f3134t >= 0) {
            sb2.append(" #");
            sb2.append(this.f3134t);
        }
        if (this.f3403i != null) {
            sb2.append(" ");
            sb2.append(this.f3403i);
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(FragmentManager fragmentManager) {
        super(0);
        fragmentManager.I();
        u0 u0Var = fragmentManager.f3129x;
        if (u0Var != null) {
            u0Var.f3357b.getClassLoader();
        }
        this.f3134t = -1;
        this.f3135u = false;
        this.f3132r = fragmentManager;
    }
}
