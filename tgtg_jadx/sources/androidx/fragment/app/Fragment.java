package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.annotation.NonNull;
import androidx.core.app.SharedElementCallback;
import androidx.fragment.app.strictmode.GetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import com.app.tgtg.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, androidx.lifecycle.s1, androidx.lifecycle.p, ea.f {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    h0 mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;

    @NonNull
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    ViewModelProvider$Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    u0 mHost;
    boolean mInDynamicContainer;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.f0 mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<i0> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final i0 mSavedStateAttachListener;
    ea.e mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mTransitioning;
    boolean mUserVisibleHint;
    View mView;
    i2 mViewLifecycleOwner;
    androidx.lifecycle.o0 mViewLifecycleOwnerLiveData;

    @NonNull
    String mWho;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static class InstantiationException extends RuntimeException {
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new n1();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new b0(this, 0);
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.o0();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new c0(this);
        m();
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) t0.c(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.setArguments(bundle);
            return fragment;
        } catch (IllegalAccessException e5) {
            throw new InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e5);
        } catch (java.lang.InstantiationException e11) {
            throw new InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e11);
        } catch (NoSuchMethodException e12) {
            throw new InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e12);
        } catch (InvocationTargetException e13) {
            throw new InstantiationException(w.a0.p("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e13);
        }
    }

    public void callStartTransitionListener(boolean z11) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var != null) {
            h0Var.f3227u = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        t2 t2VarI = t2.i(viewGroup, fragmentManager);
        t2VarI.k();
        if (z11) {
            this.mHost.f3358c.post(new t(t2VarI, 1));
        } else {
            t2VarI.e();
        }
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
            this.mPostponedHandler = null;
        }
    }

    @NonNull
    public r0 createFragmentContainer() {
        return new d0(this);
    }

    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment fragmentL = l(false);
        if (fragmentL != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentL);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            LoaderManager.b(this).d(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.w(r8.k.l(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public Activity e() {
        return getActivity();
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(@NonNull String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.f3109c.c(str);
    }

    @NonNull
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final o0 getActivity() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return u0Var.f3356a;
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f3222p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null || (bool = h0Var.f3221o) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public View getAnimatingAway() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        h0Var.getClass();
        return null;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        com.braze.h2.b(w.a0.m("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public Context getContext() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return u0Var.f3357b;
    }

    @Override // androidx.lifecycle.p
    @NonNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && FragmentManager.L(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        y8.d dVar = new y8.d(0);
        LinkedHashMap linkedHashMap = dVar.f3543a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.o1.f3505d, application);
        }
        linkedHashMap.put(androidx.lifecycle.f1.f3442a, this);
        linkedHashMap.put(androidx.lifecycle.f1.f3443b, this);
        if (getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.f1.f3444c, getArguments());
        }
        return dVar;
    }

    @Override // androidx.lifecycle.p
    @NonNull
    public ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        Application application;
        if (this.mFragmentManager == null) {
            com.braze.h2.b("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.mDefaultFactory == null) {
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.L(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new androidx.lifecycle.i1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    public int getEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f3209b;
    }

    public Object getEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f3216i;
    }

    public SharedElementCallback getEnterTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f3223q;
    }

    public int getExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f3210c;
    }

    public Object getExitTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f3218k;
    }

    public SharedElementCallback getExitTransitionCallback() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f3224r;
    }

    public View getFocusedView() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f3226t;
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            return null;
        }
        return ((n0) u0Var).f3282e;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @NonNull
    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            com.braze.h2.b("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        o0 o0Var = ((n0) u0Var).f3282e;
        LayoutInflater layoutInflaterCloneInContext = o0Var.getLayoutInflater().cloneInContext(o0Var);
        h7.o.a(layoutInflaterCloneInContext, this.mChildFragmentManager.f3112f);
        return layoutInflaterCloneInContext;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @NonNull
    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.b(this);
    }

    public int getNextTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f3213f;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @NonNull
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        com.braze.h2.b(w.a0.m("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public boolean getPopDirection() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f3208a;
    }

    public int getPopEnterAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f3211d;
    }

    public int getPopExitAnim() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 0;
        }
        return h0Var.f3212e;
    }

    public float getPostOnViewCreatedAlpha() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return 1.0f;
        }
        return h0Var.f3225s;
    }

    public Object getReenterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.l;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @NonNull
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        q8.b bVar = q8.c.f36354a;
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(this, "Attempting to get retain instance for fragment " + this);
        q8.c.c(getRetainInstanceUsageViolation);
        q8.b bVarA = q8.c.a(this);
        if (bVarA.f36352a.contains(q8.a.DETECT_RETAIN_INSTANCE_USAGE) && q8.c.e(bVarA, getClass(), GetRetainInstanceUsageViolation.class)) {
            q8.c.b(bVarA, getRetainInstanceUsageViolation);
        }
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f3217j;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // ea.f
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.f15899b;
    }

    public Object getSharedElementEnterTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        return h0Var.f3219m;
    }

    public Object getSharedElementReturnTransition() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return null;
        }
        Object obj = h0Var.f3220n;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @NonNull
    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f3214g) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        h0 h0Var = this.mAnimationInfo;
        return (h0Var == null || (arrayList = h0Var.f3215h) == null) ? new ArrayList<>() : arrayList;
    }

    @NonNull
    public final String getString(int i11) {
        return getResources().getString(i11);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return l(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        q8.b bVar = q8.c.f36354a;
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(this, "Attempting to get target request code from fragment " + this);
        q8.c.c(getTargetFragmentRequestCodeUsageViolation);
        q8.b bVarA = q8.c.a(this);
        if (bVarA.f36352a.contains(q8.a.DETECT_TARGET_FRAGMENT_USAGE) && q8.c.e(bVarA, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            q8.c.b(bVarA, getTargetFragmentRequestCodeUsageViolation);
        }
        return this.mTargetRequestCode;
    }

    @NonNull
    public final CharSequence getText(int i11) {
        return getResources().getText(i11);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    @NonNull
    public LifecycleOwner getViewLifecycleOwner() {
        i2 i2Var = this.mViewLifecycleOwner;
        if (i2Var != null) {
            return i2Var;
        }
        com.braze.h2.b(w.a0.m("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
        return null;
    }

    @NonNull
    public androidx.lifecycle.k0 getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.s1
    @NonNull
    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            com.braze.h2.b("Can't access ViewModels from detached fragment");
            return null;
        }
        if (k() == Lifecycle.State.INITIALIZED.ordinal()) {
            com.braze.h2.b("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap map = this.mFragmentManager.P.f3324c;
        ViewModelStore viewModelStore = (ViewModelStore) map.get(this.mWho);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        map.put(this.mWho, viewModelStore2);
        return viewModelStore2;
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        m();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new n1();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        if (this.mHidden) {
            return true;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            fragmentManager.getClass();
            if (fragment == null ? false : fragment.isHidden()) {
                return true;
            }
        }
        return false;
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        if (!this.mMenuVisible) {
            return false;
        }
        if (this.mFragmentManager != null) {
            Fragment fragment = this.mParentFragment;
            if (!(fragment == null ? true : fragment.isMenuVisible())) {
                return false;
            }
        }
        return true;
    }

    public boolean isPostponed() {
        h0 h0Var = this.mAnimationInfo;
        if (h0Var == null) {
            return false;
        }
        return h0Var.f3227u;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.P();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public final h0 j() {
        if (this.mAnimationInfo == null) {
            h0 h0Var = new h0();
            h0Var.f3216i = null;
            Object obj = USE_DEFAULT_TRANSITION;
            h0Var.f3217j = obj;
            h0Var.f3218k = null;
            h0Var.l = obj;
            h0Var.f3219m = null;
            h0Var.f3220n = obj;
            h0Var.f3223q = null;
            h0Var.f3224r = null;
            h0Var.f3225s = 1.0f;
            h0Var.f3226t = null;
            this.mAnimationInfo = h0Var;
        }
        return this.mAnimationInfo;
    }

    public final int k() {
        Lifecycle.State state = this.mMaxState;
        return (state == Lifecycle.State.INITIALIZED || this.mParentFragment == null) ? state.ordinal() : Math.min(state.ordinal(), this.mParentFragment.k());
    }

    public final Fragment l(boolean z11) {
        String str;
        if (z11) {
            q8.b bVar = q8.c.f36354a;
            GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(this, "Attempting to get target fragment from fragment " + this);
            q8.c.c(getTargetFragmentUsageViolation);
            q8.b bVarA = q8.c.a(this);
            if (bVarA.f36352a.contains(q8.a.DETECT_TARGET_FRAGMENT_USAGE) && q8.c.e(bVarA, getClass(), GetTargetFragmentUsageViolation.class)) {
                q8.c.b(bVarA, getTargetFragmentUsageViolation);
            }
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.f3109c.b(str);
    }

    public final void m() {
        this.mLifecycleRegistry = new androidx.lifecycle.f0(this, true);
        this.mSavedStateRegistryController = new ea.e(new ga.a(this, new cw.b(this, 6)));
        this.mDefaultFactory = null;
        if (this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            return;
        }
        i0 i0Var = this.mSavedStateAttachListener;
        if (this.mState >= 0) {
            i0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(i0Var);
        }
    }

    public final a0 n(ActivityResultContract activityResultContract, s.a aVar, ActivityResultCallback activityResultCallback) {
        if (this.mState > 1) {
            com.braze.h2.b(w.a0.m("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
            return null;
        }
        AtomicReference atomicReference = new AtomicReference();
        g0 g0Var = new g0(this, aVar, atomicReference, activityResultContract, activityResultCallback);
        if (this.mState >= 0) {
            g0Var.a();
        } else {
            this.mOnPreAttachedListeners.add(g0Var);
        }
        return new a0(atomicReference, activityResultContract);
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.R();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i11 + " resultCode: " + i12 + " data: " + intent);
        }
    }

    public void onAttach(@NonNull Context context) {
        this.mCalled = true;
        u0 u0Var = this.mHost;
        o0 o0Var = u0Var == null ? null : u0Var.f3356a;
        if (o0Var != null) {
            this.mCalled = false;
            onAttach((Activity) o0Var);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState();
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.f3128w >= 1) {
            return;
        }
        fragmentManager.I = false;
        fragmentManager.J = false;
        fragmentManager.P.f3327f = false;
        fragmentManager.v(1);
    }

    public Animation onCreateAnimation(int i11, boolean z11, int i12) {
        return null;
    }

    public Animator onCreateAnimator(int i11, boolean z11, int i12) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(@NonNull ContextMenu contextMenu, @NonNull View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            return layoutInflater.inflate(i11, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @NonNull
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onInflate(@NonNull Context context, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        u0 u0Var = this.mHost;
        o0 o0Var = u0Var == null ? null : u0Var.f3356a;
        if (o0Var != null) {
            this.mCalled = false;
            onInflate((Activity) o0Var, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    @Deprecated
    public boolean onOptionsItemSelected(@NonNull MenuItem menuItem) {
        return false;
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onActivityCreated()"));
        }
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle bundle2 = this.mSavedFragmentState;
            restoreViewState(bundle2 != null ? bundle2.getBundle("savedInstanceState") : null);
        }
        this.mSavedFragmentState = null;
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.I = false;
        fragmentManager.J = false;
        fragmentManager.P.f3327f = false;
        fragmentManager.v(4);
    }

    public void performAttach() {
        Iterator<i0> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.b(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach((Context) this.mHost.f3357b);
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onAttach()"));
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        Iterator it2 = fragmentManager.f3122q.iterator();
        while (it2.hasNext()) {
            ((r1) it2.next()).a(fragmentManager, this);
        }
        FragmentManager fragmentManager2 = this.mChildFragmentManager;
        fragmentManager2.I = false;
        fragmentManager2.J = false;
        fragmentManager2.P.f3327f = false;
        fragmentManager2.v(0);
    }

    public void performConfigurationChanged(@NonNull Configuration configuration) {
        onConfigurationChanged(configuration);
    }

    public boolean performContextItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.k(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.a(new e0(this));
        onCreate(bundle);
        this.mIsCreated = true;
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onCreate()"));
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.w.ON_CREATE);
    }

    public boolean performCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onCreateOptionsMenu(menu, menuInflater);
            z11 = true;
        }
        return this.mChildFragmentManager.l(menu, menuInflater) | z11;
    }

    public void performCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.R();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new i2(this, getViewModelStore(), new z(this, 0));
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        i2 i2Var = this.mViewLifecycleOwner;
        if (viewOnCreateView == null) {
            if (i2Var.f3239e == null) {
                this.mViewLifecycleOwner = null;
                return;
            } else {
                com.braze.h2.b("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        i2Var.b();
        if (FragmentManager.L(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
        }
        androidx.lifecycle.m1.e(this.mView, this.mViewLifecycleOwner);
        View view = this.mView;
        i2 i2Var2 = this.mViewLifecycleOwner;
        view.getClass();
        view.setTag(R.id.view_tree_view_model_store_owner, i2Var2);
        View view2 = this.mView;
        i2 i2Var3 = this.mViewLifecycleOwner;
        view2.getClass();
        view2.setTag(R.id.view_tree_saved_state_registry_owner, i2Var3);
        this.mViewLifecycleOwnerLiveData.k(this.mViewLifecycleOwner);
    }

    public void performDestroy() {
        this.mChildFragmentManager.m();
        this.mLifecycleRegistry.g(androidx.lifecycle.w.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onDestroy()"));
        }
    }

    public void performDestroyView() {
        this.mChildFragmentManager.v(1);
        if (this.mView != null) {
            i2 i2Var = this.mViewLifecycleOwner;
            i2Var.b();
            if (i2Var.f3239e.f3435d.a(Lifecycle.State.CREATED)) {
                this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_DESTROY);
            }
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onDestroyView()"));
        }
        q1.l1 l1Var = LoaderManager.b(this).f6073b.f6070a;
        int iF = l1Var.f();
        for (int i11 = 0; i11 < iF; i11++) {
            ((b9.b) l1Var.h(i11)).m();
        }
        this.mPerformedCreateView = false;
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onDetach()"));
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        if (fragmentManager.K) {
            return;
        }
        fragmentManager.m();
        this.mChildFragmentManager = new n1();
    }

    @NonNull
    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
    }

    public void performMultiWindowModeChanged(boolean z11) {
        onMultiWindowModeChanged(z11);
    }

    public boolean performOptionsItemSelected(@NonNull MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.q(menuItem);
    }

    public void performOptionsMenuClosed(@NonNull Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.r(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.v(5);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_PAUSE);
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.w.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onPause()"));
        }
    }

    public void performPictureInPictureModeChanged(boolean z11) {
        onPictureInPictureModeChanged(z11);
    }

    public boolean performPrepareOptionsMenu(@NonNull Menu menu) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onPrepareOptionsMenu(menu);
            z11 = true;
        }
        return this.mChildFragmentManager.u(menu) | z11;
    }

    public void performPrimaryNavigationFragmentChanged() {
        this.mFragmentManager.getClass();
        boolean zO = FragmentManager.O(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zO) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zO);
            onPrimaryNavigationFragmentChanged(zO);
            FragmentManager fragmentManager = this.mChildFragmentManager;
            fragmentManager.l0();
            fragmentManager.s(fragmentManager.A);
        }
    }

    public void performResume() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.A(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onResume()"));
        }
        androidx.lifecycle.f0 f0Var = this.mLifecycleRegistry;
        androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_RESUME;
        f0Var.g(wVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f3239e.g(wVar);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.I = false;
        fragmentManager.J = false;
        fragmentManager.P.f3327f = false;
        fragmentManager.v(7);
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
    }

    public void performStart() {
        this.mChildFragmentManager.R();
        this.mChildFragmentManager.A(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onStart()"));
        }
        androidx.lifecycle.f0 f0Var = this.mLifecycleRegistry;
        androidx.lifecycle.w wVar = androidx.lifecycle.w.ON_START;
        f0Var.g(wVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.f3239e.g(wVar);
        }
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.I = false;
        fragmentManager.J = false;
        fragmentManager.P.f3327f = false;
        fragmentManager.v(5);
    }

    public void performStop() {
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.J = true;
        fragmentManager.P.f3327f = true;
        fragmentManager.v(4);
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_STOP);
        }
        this.mLifecycleRegistry.g(androidx.lifecycle.w.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onStop()"));
        }
    }

    public void performViewCreated() {
        Bundle bundle = this.mSavedFragmentState;
        onViewCreated(this.mView, bundle != null ? bundle.getBundle("savedInstanceState") : null);
        this.mChildFragmentManager.v(2);
    }

    public final void postponeEnterTransition(long j9, @NonNull TimeUnit timeUnit) {
        j().f3227u = true;
        Handler handler = this.mPostponedHandler;
        if (handler != null) {
            handler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            this.mPostponedHandler = fragmentManager.f3129x.f3358c;
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j9));
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return n(activityResultContract, new f0(this, 0), activityResultCallback);
    }

    public void registerForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@NonNull String[] strArr, int i11) {
        if (this.mHost == null) {
            com.braze.h2.b(w.a0.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.F == null) {
            parentFragmentManager.f3129x.getClass();
            strArr.getClass();
        } else {
            parentFragmentManager.G.addLast(new h1(this.mWho, i11));
            parentFragmentManager.F.a(strArr, null);
        }
    }

    @NonNull
    public final o0 requireActivity() {
        o0 activity = getActivity();
        if (activity != null) {
            return activity;
        }
        com.braze.h2.b(w.a0.m("Fragment ", this, " not attached to an activity."));
        return null;
    }

    @NonNull
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        com.braze.h2.b(w.a0.m("Fragment ", this, " does not have any arguments."));
        return null;
    }

    @NonNull
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        com.braze.h2.b(w.a0.m("Fragment ", this, " not attached to a context."));
        return null;
    }

    @NonNull
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @NonNull
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        com.braze.h2.b(w.a0.m("Fragment ", this, " not attached to a host."));
        return null;
    }

    @NonNull
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            com.braze.h2.b(w.a0.m("Fragment ", this, " is not attached to any Fragment or host"));
            return null;
        }
        StringBuilder sb2 = new StringBuilder("Fragment ");
        sb2.append(this);
        Context context = getContext();
        sb2.append(" is not a child Fragment, it is directly attached to ");
        sb2.append(context);
        throw new IllegalStateException(sb2.toString());
    }

    @NonNull
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        com.braze.h2.b(w.a0.m("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public void restoreChildFragmentState() {
        Bundle bundle;
        Bundle bundle2 = this.mSavedFragmentState;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.mChildFragmentManager.Z(bundle);
        FragmentManager fragmentManager = this.mChildFragmentManager;
        fragmentManager.I = false;
        fragmentManager.J = false;
        fragmentManager.P.f3327f = false;
        fragmentManager.v(1);
    }

    public final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (!this.mCalled) {
            throw new u2(w.a0.m("Fragment ", this, " did not call through to super.onViewStateRestored()"));
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(androidx.lifecycle.w.ON_CREATE);
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z11) {
        j().f3222p = Boolean.valueOf(z11);
    }

    public void setAllowReturnTransitionOverlap(boolean z11) {
        j().f3221o = Boolean.valueOf(z11);
    }

    public void setAnimations(int i11, int i12, int i13, int i14) {
        if (this.mAnimationInfo == null && i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return;
        }
        j().f3209b = i11;
        j().f3210c = i12;
        j().f3211d = i13;
        j().f3212e = i14;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = bundle;
        } else {
            com.braze.h2.b("Fragment already added and state has been saved");
        }
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        j().f3223q = sharedElementCallback;
    }

    public void setEnterTransition(Object obj) {
        j().f3216i = obj;
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        j().f3224r = sharedElementCallback;
    }

    public void setExitTransition(Object obj) {
        j().f3218k = obj;
    }

    public void setFocusedView(View view) {
        j().f3226t = view;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean z11) {
        if (this.mHasMenu != z11) {
            this.mHasMenu = z11;
            if (!isAdded() || isHidden()) {
                return;
            }
            ((n0) this.mHost).f3282e.invalidateMenu();
        }
    }

    public void setInitialSavedState(j0 j0Var) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            com.braze.h2.b("Fragment already added");
            return;
        }
        if (j0Var == null || (bundle = j0Var.f3242a) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z11) {
        if (this.mMenuVisible != z11) {
            this.mMenuVisible = z11;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                ((n0) this.mHost).f3282e.invalidateMenu();
            }
        }
    }

    public void setNextTransition(int i11) {
        if (this.mAnimationInfo == null && i11 == 0) {
            return;
        }
        j();
        this.mAnimationInfo.f3213f = i11;
    }

    public void setPopDirection(boolean z11) {
        if (this.mAnimationInfo == null) {
            return;
        }
        j().f3208a = z11;
    }

    public void setPostOnViewCreatedAlpha(float f11) {
        j().f3225s = f11;
    }

    public void setReenterTransition(Object obj) {
        j().l = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z11) {
        q8.b bVar = q8.c.f36354a;
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(this, "Attempting to set retain instance for fragment " + this);
        q8.c.c(setRetainInstanceUsageViolation);
        q8.b bVarA = q8.c.a(this);
        if (bVarA.f36352a.contains(q8.a.DETECT_RETAIN_INSTANCE_USAGE) && q8.c.e(bVarA, getClass(), SetRetainInstanceUsageViolation.class)) {
            q8.c.b(bVarA, setRetainInstanceUsageViolation);
        }
        this.mRetainInstance = z11;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
            return;
        }
        q1 q1Var = fragmentManager.P;
        if (z11) {
            q1Var.a(this);
        } else {
            q1Var.e(this);
        }
    }

    public void setReturnTransition(Object obj) {
        j().f3217j = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        j().f3219m = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        j();
        h0 h0Var = this.mAnimationInfo;
        h0Var.f3214g = arrayList;
        h0Var.f3215h = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        j().f3220n = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i11) {
        if (fragment != null) {
            q8.b bVar = q8.c.f36354a;
            SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(this, "Attempting to set target fragment " + fragment + " with request code " + i11 + " for fragment " + this);
            q8.c.c(setTargetFragmentUsageViolation);
            q8.b bVarA = q8.c.a(this);
            if (bVarA.f36352a.contains(q8.a.DETECT_TARGET_FRAGMENT_USAGE) && q8.c.e(bVarA, getClass(), SetTargetFragmentUsageViolation.class)) {
                q8.c.b(bVarA, setTargetFragmentUsageViolation);
            }
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            i4.a.f(w.a0.m("Fragment ", fragment, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (Fragment fragmentL = fragment; fragmentL != null; fragmentL = fragmentL.l(false)) {
            if (fragmentL.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i11;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z11) {
        q8.b bVar = q8.c.f36354a;
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(this, "Attempting to set user visible hint to " + z11 + " for fragment " + this);
        q8.c.c(setUserVisibleHintViolation);
        q8.b bVarA = q8.c.a(this);
        if (bVarA.f36352a.contains(q8.a.DETECT_SET_USER_VISIBLE_HINT) && q8.c.e(bVarA, getClass(), SetUserVisibleHintViolation.class)) {
            q8.c.b(bVarA, setUserVisibleHintViolation);
        }
        boolean z12 = false;
        if (!this.mUserVisibleHint && z11 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            w1 w1VarH = fragmentManager.h(this);
            Fragment fragment = w1VarH.f3369c;
            if (fragment.mDeferStart) {
                if (fragmentManager.f3108b) {
                    fragmentManager.L = true;
                } else {
                    fragment.mDeferStart = false;
                    w1VarH.k();
                }
            }
        }
        this.mUserVisibleHint = z11;
        if (this.mState < 5 && !z11) {
            z12 = true;
        }
        this.mDeferStart = z12;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z11);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String str) {
        u0 u0Var = this.mHost;
        if (u0Var != null) {
            return androidx.core.app.e.l(((n0) u0Var).f3282e, str);
        }
        return false;
    }

    public void startActivity(@NonNull Intent intent, Bundle bundle) {
        u0 u0Var = this.mHost;
        if (u0Var == null) {
            com.braze.h2.b(w.a0.m("Fragment ", this, " not attached to Activity"));
        } else {
            intent.getClass();
            u0Var.f3357b.startActivity(intent, bundle);
        }
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i11, Bundle bundle) {
        if (this.mHost == null) {
            com.braze.h2.b(w.a0.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.D != null) {
            parentFragmentManager.G.addLast(new h1(this.mWho, i11));
            if (bundle != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            parentFragmentManager.D.a(intent, null);
            return;
        }
        u0 u0Var = parentFragmentManager.f3129x;
        u0Var.getClass();
        intent.getClass();
        if (i11 == -1) {
            u0Var.f3357b.startActivity(intent, bundle);
        } else {
            com.braze.h2.b("Starting activity with a requestCode requires a FragmentActivity host");
        }
    }

    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            com.braze.h2.b(w.a0.m("Fragment ", this, " not attached to Activity"));
            return;
        }
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i11 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        FragmentManager parentFragmentManager = getParentFragmentManager();
        if (parentFragmentManager.E == null) {
            u0 u0Var = parentFragmentManager.f3129x;
            u0Var.getClass();
            intentSender.getClass();
            if (i11 != -1) {
                com.braze.h2.b("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
            o0 o0Var = u0Var.f3356a;
            if (o0Var != null) {
                o0Var.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
                return;
            } else {
                com.braze.h2.b("Starting intent sender with a requestCode requires a FragmentActivity host");
                return;
            }
        }
        if (bundle != null) {
            if (intent == null) {
                intent = new Intent();
                intent.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
            }
            if (FragmentManager.L(2)) {
                Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + this);
            }
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        intentSender.getClass();
        h.g gVar = new h.g(intentSender, intent, i12, i13);
        parentFragmentManager.G.addLast(new h1(this.mWho, i11));
        if (FragmentManager.L(2)) {
            Log.v("FragmentManager", "Fragment " + this + "is launching an IntentSender for result ");
        }
        parentFragmentManager.E.a(gVar, null);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !j().f3227u) {
            return;
        }
        if (this.mHost == null) {
            j().f3227u = false;
        } else if (Looper.myLooper() != this.mHost.f3358c.getLooper()) {
            this.mHost.f3358c.postAtFrontOfQueue(new b0(this, 1));
        } else {
            callStartTransitionListener(true);
        }
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(@NonNull View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @NonNull
    public final String getString(int i11, Object... objArr) {
        return getResources().getString(i11, objArr);
    }

    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return n(activityResultContract, new f0(activityResultRegistry, 1), activityResultCallback);
    }

    @Deprecated
    public void onAttach(@NonNull Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(@NonNull Activity activity, @NonNull AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    public void startActivity(@NonNull Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    public void onHiddenChanged(boolean z11) {
    }

    public void onMultiWindowModeChanged(boolean z11) {
    }

    @Deprecated
    public void onOptionsMenuClosed(@NonNull Menu menu) {
    }

    public void onPictureInPictureModeChanged(boolean z11) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(@NonNull Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z11) {
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @NonNull
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Deprecated
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
    }

    public void postponeEnterTransition() {
        j().f3227u = true;
    }

    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i11) {
        startActivityForResult(intent, i11, null);
    }

    public Fragment(int i11) {
        this();
        this.mContentLayoutId = i11;
    }

    @Deprecated
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
    }

    @NonNull
    @Deprecated
    public static Fragment instantiate(@NonNull Context context, @NonNull String str) {
        return instantiate(context, str, null);
    }
}
