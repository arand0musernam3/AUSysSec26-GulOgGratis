package androidx.fragment.app;

import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import com.adyen.checkout.components.core.PaymentMethodTypes;
import com.app.tgtg.R;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f3367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1 f3368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Fragment f3369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3370d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3371e = -1;

    public w1(y0 y0Var, x1 x1Var, ClassLoader classLoader, t0 t0Var, Bundle bundle) {
        this.f3367a = y0Var;
        this.f3368b = x1Var;
        Fragment fragmentA = ((t1) bundle.getParcelable("state")).a(t0Var, classLoader);
        this.f3369c = fragmentA;
        fragmentA.mSavedFragmentState = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        fragmentA.setArguments(bundle2);
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    public final void a() {
        boolean zL = FragmentManager.L(3);
        Fragment fragment = this.f3369c;
        if (zL) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.performActivityCreated(bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.f3367a.a(fragment, false);
    }

    public final void b() {
        View view;
        View view2;
        Fragment fragment = this.f3369c;
        Fragment fragmentE = FragmentManager.E(fragment.mContainer);
        Fragment parentFragment = fragment.getParentFragment();
        if (fragmentE != null && !fragmentE.equals(parentFragment)) {
            int i11 = fragment.mContainerId;
            q8.b bVar = q8.c.f36354a;
            StringBuilder sb2 = new StringBuilder("Attempting to nest fragment ");
            sb2.append(fragment);
            sb2.append(" within the view of parent fragment ");
            sb2.append(fragmentE);
            sb2.append(" via container with ID ");
            WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, r8.k.i(i11, " without using parent's childFragmentManager", sb2));
            q8.c.c(wrongNestedHierarchyViolation);
            q8.b bVarA = q8.c.a(fragment);
            if (bVarA.f36352a.contains(q8.a.DETECT_WRONG_NESTED_HIERARCHY) && q8.c.e(bVarA, fragment.getClass(), WrongNestedHierarchyViolation.class)) {
                q8.c.b(bVarA, wrongNestedHierarchyViolation);
            }
        }
        ArrayList arrayList = this.f3368b.f3376a;
        ViewGroup viewGroup = fragment.mContainer;
        int iIndexOfChild = -1;
        if (viewGroup != null) {
            int iIndexOf = arrayList.indexOf(fragment);
            int i12 = iIndexOf - 1;
            while (true) {
                if (i12 < 0) {
                    while (true) {
                        iIndexOf++;
                        if (iIndexOf >= arrayList.size()) {
                            break;
                        }
                        Fragment fragment2 = (Fragment) arrayList.get(iIndexOf);
                        if (fragment2.mContainer == viewGroup && (view = fragment2.mView) != null) {
                            iIndexOfChild = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    Fragment fragment3 = (Fragment) arrayList.get(i12);
                    if (fragment3.mContainer == viewGroup && (view2 = fragment3.mView) != null) {
                        iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i12--;
                }
            }
        }
        fragment.mContainer.addView(fragment.mView, iIndexOfChild);
    }

    public final void c() {
        boolean zL = FragmentManager.L(3);
        Fragment fragment = this.f3369c;
        if (zL) {
            Log.d("FragmentManager", "moveto ATTACHED: " + fragment);
        }
        Fragment fragment2 = fragment.mTarget;
        w1 w1Var = null;
        x1 x1Var = this.f3368b;
        if (fragment2 != null) {
            w1 w1Var2 = (w1) x1Var.f3377b.get(fragment2.mWho);
            if (w1Var2 == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(fragment);
                Fragment fragment3 = fragment.mTarget;
                sb2.append(" declared target fragment ");
                sb2.append(fragment3);
                sb2.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb2.toString());
            }
            fragment.mTargetWho = fragment.mTarget.mWho;
            fragment.mTarget = null;
            w1Var = w1Var2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (w1Var = (w1) x1Var.f3377b.get(str)) == null) {
                StringBuilder sb3 = new StringBuilder("Fragment ");
                sb3.append(fragment);
                sb3.append(" declared target fragment ");
                com.braze.h2.b(r8.k.p(sb3, fragment.mTargetWho, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (w1Var != null) {
            w1Var.k();
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        fragment.mHost = fragmentManager.f3129x;
        fragment.mParentFragment = fragmentManager.f3131z;
        y0 y0Var = this.f3367a;
        y0Var.g(fragment, false);
        fragment.performAttach();
        y0Var.b(fragment, false);
    }

    public final int d() {
        Fragment fragment = this.f3369c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int iMin = this.f3371e;
        int i11 = v1.f3364a[fragment.mMaxState.ordinal()];
        if (i11 != 1) {
            iMin = i11 != 2 ? i11 != 3 ? i11 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        if (fragment.mFromLayout) {
            boolean z11 = fragment.mInLayout;
            int i12 = this.f3371e;
            if (z11) {
                iMin = Math.max(i12, 2);
                View view = fragment.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = i12 < 4 ? Math.min(iMin, fragment.mState) : Math.min(iMin, 1);
            }
        }
        if (fragment.mInDynamicContainer && fragment.mContainer == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!fragment.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            t2 t2VarI = t2.i(viewGroup, fragment.getParentFragmentManager());
            m2 m2VarF = t2VarI.f(fragment);
            n2 n2Var = m2VarF != null ? m2VarF.f3268b : null;
            m2 m2VarG = t2VarI.g(fragment);
            n2Var = m2VarG != null ? m2VarG.f3268b : null;
            int i13 = n2Var == null ? -1 : s2.$EnumSwitchMapping$0[n2Var.ordinal()];
            if (i13 != -1 && i13 != 1) {
                n2Var = n2Var;
            }
        }
        if (n2Var == n2.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (n2Var == n2.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else if (fragment.mRemoving) {
            iMin = fragment.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (fragment.mDeferStart && fragment.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (fragment.mTransitioning) {
            iMin = Math.max(iMin, 3);
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + fragment);
        }
        return iMin;
    }

    public final void e() {
        boolean zL = FragmentManager.L(3);
        Fragment fragment = this.f3369c;
        if (zL) {
            Log.d("FragmentManager", "moveto CREATED: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (fragment.mIsCreated) {
            fragment.mState = 1;
            fragment.restoreChildFragmentState();
        } else {
            y0 y0Var = this.f3367a;
            y0Var.h(fragment, false);
            fragment.performCreate(bundle2);
            y0Var.c(fragment, false);
        }
    }

    public final void f() {
        String resourceName;
        Fragment fragment = this.f3369c;
        if (fragment.mFromLayout) {
            return;
        }
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
        }
        Bundle bundle = fragment.mSavedFragmentState;
        ViewGroup viewGroup = null;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(bundle2);
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i11 = fragment.mContainerId;
            if (i11 != 0) {
                if (i11 == -1) {
                    i4.a.f(w.a0.m("Cannot create fragment ", fragment, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) fragment.mFragmentManager.f3130y.b(i11);
                if (viewGroup == null) {
                    if (!fragment.mRestored && !fragment.mInDynamicContainer) {
                        try {
                            resourceName = fragment.getResources().getResourceName(fragment.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = PaymentMethodTypes.UNKNOWN;
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(fragment.mContainerId) + " (" + resourceName + ") for fragment " + fragment);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    q8.b bVar = q8.c.f36354a;
                    WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, "Attempting to add fragment " + fragment + " to container " + viewGroup + " which is not a FragmentContainerView");
                    q8.c.c(wrongFragmentContainerViolation);
                    q8.b bVarA = q8.c.a(fragment);
                    if (bVarA.f36352a.contains(q8.a.DETECT_WRONG_FRAGMENT_CONTAINER) && q8.c.e(bVarA, fragment.getClass(), WrongFragmentContainerViolation.class)) {
                        q8.c.b(bVarA, wrongFragmentContainerViolation);
                    }
                }
            }
        }
        fragment.mContainer = viewGroup;
        fragment.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, bundle2);
        if (fragment.mView != null) {
            if (FragmentManager.L(3)) {
                Log.d("FragmentManager", "moveto VIEW_CREATED: " + fragment);
            }
            fragment.mView.setSaveFromParentEnabled(false);
            fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
            if (viewGroup != null) {
                b();
            }
            if (fragment.mHidden) {
                fragment.mView.setVisibility(8);
            }
            boolean zIsAttachedToWindow = fragment.mView.isAttachedToWindow();
            View view = fragment.mView;
            if (zIsAttachedToWindow) {
                ViewCompat.Z(view);
            } else {
                view.addOnAttachStateChangeListener(new u1(view));
            }
            fragment.performViewCreated();
            this.f3367a.m(fragment, fragment.mView, bundle2, false);
            int visibility = fragment.mView.getVisibility();
            fragment.setPostOnViewCreatedAlpha(fragment.mView.getAlpha());
            if (fragment.mContainer != null && visibility == 0) {
                View viewFindFocus = fragment.mView.findFocus();
                if (viewFindFocus != null) {
                    fragment.setFocusedView(viewFindFocus);
                    if (FragmentManager.L(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragment);
                    }
                }
                fragment.mView.setAlpha(0.0f);
            }
        }
        fragment.mState = 2;
    }

    public final void g() {
        Fragment fragmentB;
        boolean zL = FragmentManager.L(3);
        Fragment fragment = this.f3369c;
        if (zL) {
            Log.d("FragmentManager", "movefrom CREATED: " + fragment);
        }
        boolean zIsChangingConfigurations = true;
        boolean z11 = fragment.mRemoving && !fragment.isInBackStack();
        x1 x1Var = this.f3368b;
        if (z11 && !fragment.mBeingSaved) {
            x1Var.i(null, fragment.mWho);
        }
        if (!z11) {
            q1 q1Var = x1Var.f3379d;
            if (!((q1Var.f3322a.containsKey(fragment.mWho) && q1Var.f3325d) ? q1Var.f3326e : true)) {
                String str = fragment.mTargetWho;
                if (str != null && (fragmentB = x1Var.b(str)) != null && fragmentB.mRetainInstance) {
                    fragment.mTarget = fragmentB;
                }
                fragment.mState = 0;
                return;
            }
        }
        u0 u0Var = fragment.mHost;
        if (u0Var instanceof androidx.lifecycle.s1) {
            zIsChangingConfigurations = x1Var.f3379d.f3326e;
        } else {
            o0 o0Var = u0Var.f3357b;
            if (o0Var != null) {
                zIsChangingConfigurations = true ^ o0Var.isChangingConfigurations();
            }
        }
        if ((z11 && !fragment.mBeingSaved) || zIsChangingConfigurations) {
            x1Var.f3379d.b(fragment, false);
        }
        fragment.performDestroy();
        this.f3367a.d(fragment, false);
        for (w1 w1Var : x1Var.d()) {
            if (w1Var != null) {
                Fragment fragment2 = w1Var.f3369c;
                if (fragment.mWho.equals(fragment2.mTargetWho)) {
                    fragment2.mTarget = fragment;
                    fragment2.mTargetWho = null;
                }
            }
        }
        String str2 = fragment.mTargetWho;
        if (str2 != null) {
            fragment.mTarget = x1Var.b(str2);
        }
        x1Var.h(this);
    }

    public final void h() {
        View view;
        boolean zL = FragmentManager.L(3);
        Fragment fragment = this.f3369c;
        if (zL) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + fragment);
        }
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        fragment.performDestroyView();
        this.f3367a.n(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.k(null);
        fragment.mInLayout = false;
    }

    public final void i() {
        boolean zL = FragmentManager.L(3);
        Fragment fragment = this.f3369c;
        if (zL) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + fragment);
        }
        fragment.performDetach();
        this.f3367a.e(fragment, false);
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (!fragment.mRemoving || fragment.isInBackStack()) {
            q1 q1Var = this.f3368b.f3379d;
            if (!((q1Var.f3322a.containsKey(fragment.mWho) && q1Var.f3325d) ? q1Var.f3326e : true)) {
                return;
            }
        }
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + fragment);
        }
        fragment.initState();
    }

    public final void j() {
        Fragment fragment = this.f3369c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.L(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + fragment);
            }
            Bundle bundle = fragment.mSavedFragmentState;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            fragment.performCreateView(fragment.performGetLayoutInflater(bundle2), null, bundle2);
            View view = fragment.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                fragment.mView.setTag(R.id.fragment_container_view_tag, fragment);
                if (fragment.mHidden) {
                    fragment.mView.setVisibility(8);
                }
                fragment.performViewCreated();
                this.f3367a.m(fragment, fragment.mView, bundle2, false);
                fragment.mState = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z11 = this.f3370d;
        Fragment fragment = this.f3369c;
        if (z11) {
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + fragment);
                return;
            }
            return;
        }
        try {
            this.f3370d = true;
            boolean z12 = false;
            while (true) {
                int iD = d();
                int i11 = fragment.mState;
                x1 x1Var = this.f3368b;
                if (iD == i11) {
                    if (!z12 && i11 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !fragment.mBeingSaved) {
                        if (FragmentManager.L(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + fragment);
                        }
                        x1Var.f3379d.b(fragment, true);
                        x1Var.h(this);
                        if (FragmentManager.L(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + fragment);
                        }
                        fragment.initState();
                    }
                    if (fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            t2 t2VarI = t2.i(viewGroup, fragment.getParentFragmentManager());
                            if (fragment.mHidden) {
                                if (FragmentManager.L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + fragment);
                                }
                                t2VarI.d(q2.GONE, n2.NONE, this);
                            } else {
                                if (FragmentManager.L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + fragment);
                                }
                                t2VarI.d(q2.VISIBLE, n2.NONE, this);
                            }
                        }
                        FragmentManager fragmentManager = fragment.mFragmentManager;
                        if (fragmentManager != null && fragment.mAdded && FragmentManager.M(fragment)) {
                            fragmentManager.H = true;
                        }
                        fragment.mHiddenChanged = false;
                        fragment.onHiddenChanged(fragment.mHidden);
                        fragment.mChildFragmentManager.p();
                    }
                    this.f3370d = false;
                    return;
                }
                y0 y0Var = this.f3367a;
                if (iD <= i11) {
                    switch (i11 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (fragment.mBeingSaved) {
                                if (((Bundle) x1Var.f3378c.get(fragment.mWho)) == null) {
                                    x1Var.i(n(), fragment.mWho);
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            fragment.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.L(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.mBeingSaved) {
                                x1Var.i(n(), fragment.mWho);
                            } else if (fragment.mView != null && fragment.mSavedViewState == null) {
                                o();
                            }
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                t2 t2VarI2 = t2.i(viewGroup2, fragment.getParentFragmentManager());
                                if (FragmentManager.L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + fragment);
                                }
                                t2VarI2.d(q2.REMOVED, n2.REMOVING, this);
                            }
                            fragment.mState = 3;
                            break;
                        case 4:
                            if (FragmentManager.L(3)) {
                                Log.d("FragmentManager", "movefrom STARTED: " + fragment);
                            }
                            fragment.performStop();
                            y0Var.l(fragment, false);
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            if (FragmentManager.L(3)) {
                                Log.d("FragmentManager", "movefrom RESUMED: " + fragment);
                            }
                            fragment.performPause();
                            y0Var.f(fragment, false);
                            break;
                    }
                } else {
                    switch (i11 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                t2 t2VarI3 = t2.i(viewGroup3, fragment.getParentFragmentManager());
                                int visibility = fragment.mView.getVisibility();
                                q2.Companion.getClass();
                                q2 q2VarB = o2.b(visibility);
                                q2VarB.getClass();
                                if (FragmentManager.L(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + fragment);
                                }
                                t2VarI3.d(q2VarB, n2.ADDING, this);
                            }
                            fragment.mState = 4;
                            break;
                        case 5:
                            if (FragmentManager.L(3)) {
                                Log.d("FragmentManager", "moveto STARTED: " + fragment);
                            }
                            fragment.performStart();
                            y0Var.k(fragment, false);
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m();
                            break;
                    }
                }
                z12 = true;
            }
        } catch (Throwable th2) {
            this.f3370d = false;
            throw th2;
        }
    }

    public final void l(ClassLoader classLoader) {
        Fragment fragment = this.f3369c;
        Bundle bundle = fragment.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (fragment.mSavedFragmentState.getBundle("savedInstanceState") == null) {
            fragment.mSavedFragmentState.putBundle("savedInstanceState", new Bundle());
        }
        try {
            fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("viewState");
            fragment.mSavedViewRegistryState = fragment.mSavedFragmentState.getBundle("viewRegistryState");
            t1 t1Var = (t1) fragment.mSavedFragmentState.getParcelable("state");
            if (t1Var != null) {
                fragment.mTargetWho = t1Var.f3346m;
                fragment.mTargetRequestCode = t1Var.f3347n;
                Boolean bool = fragment.mSavedUserVisibleHint;
                if (bool != null) {
                    fragment.mUserVisibleHint = bool.booleanValue();
                    fragment.mSavedUserVisibleHint = null;
                } else {
                    fragment.mUserVisibleHint = t1Var.f3348o;
                }
            }
            if (fragment.mUserVisibleHint) {
                return;
            }
            fragment.mDeferStart = true;
        } catch (BadParcelableException e5) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + fragment, e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r6 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.FragmentManager.L(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.Fragment r2 = r6.f3369c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            android.view.View r0 = r2.getFocusedView()
            if (r0 == 0) goto L78
            android.view.View r3 = r2.mView
            if (r0 != r3) goto L27
            goto L31
        L27:
            android.view.ViewParent r3 = r0.getParent()
        L2b:
            if (r3 == 0) goto L78
            android.view.View r4 = r2.mView
            if (r3 != r4) goto L73
        L31:
            boolean r3 = r0.requestFocus()
            r4 = 2
            boolean r4 = androidx.fragment.app.FragmentManager.L(r4)
            if (r4 == 0) goto L78
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Restoring focused view "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " "
            r4.append(r0)
            if (r3 == 0) goto L50
            java.lang.String r0 = "succeeded"
            goto L52
        L50:
            java.lang.String r0 = "failed"
        L52:
            r4.append(r0)
            java.lang.String r0 = " on Fragment "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r4.append(r0)
            android.view.View r0 = r2.mView
            android.view.View r0 = r0.findFocus()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.v(r1, r0)
            goto L78
        L73:
            android.view.ViewParent r3 = r3.getParent()
            goto L2b
        L78:
            r0 = 0
            r2.setFocusedView(r0)
            r2.performResume()
            androidx.fragment.app.y0 r1 = r6.f3367a
            r3 = 0
            r1.i(r2, r3)
            androidx.fragment.app.x1 r1 = r6.f3368b
            java.lang.String r3 = r2.mWho
            r1.i(r0, r3)
            r2.mSavedFragmentState = r0
            r2.mSavedViewState = r0
            r2.mSavedViewRegistryState = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w1.m():void");
    }

    public final Bundle n() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        Fragment fragment = this.f3369c;
        if (fragment.mState == -1 && (bundle = fragment.mSavedFragmentState) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new t1(fragment));
        if (fragment.mState > 0) {
            Bundle bundle3 = new Bundle();
            fragment.performSaveInstanceState(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.f3367a.j(fragment, bundle3, false);
            Bundle bundle4 = new Bundle();
            fragment.mSavedStateRegistryController.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleA0 = fragment.mChildFragmentManager.a0();
            if (!bundleA0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleA0);
            }
            if (fragment.mView != null) {
                o();
            }
            SparseArray<Parcelable> sparseArray = fragment.mSavedViewState;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = fragment.mSavedViewRegistryState;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = fragment.mArguments;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void o() {
        Fragment fragment = this.f3369c;
        if (fragment.mView == null) {
            return;
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + fragment + " with view " + fragment.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        fragment.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            fragment.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        fragment.mViewLifecycleOwner.f3240f.c(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        fragment.mSavedViewRegistryState = bundle;
    }

    public w1(y0 y0Var, x1 x1Var, Fragment fragment) {
        this.f3367a = y0Var;
        this.f3368b = x1Var;
        this.f3369c = fragment;
    }

    public w1(y0 y0Var, x1 x1Var, Fragment fragment, Bundle bundle) {
        this.f3367a = y0Var;
        this.f3368b = x1Var;
        this.f3369c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        fragment.mSavedFragmentState = bundle;
        fragment.mArguments = bundle.getBundle("arguments");
    }
}
