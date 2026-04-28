package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.annotation.NonNull;
import androidx.core.app.SharedElementCallback;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class o0 extends ComponentActivity implements androidx.core.app.a {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    boolean mResumed;
    final s0 mFragments = new s0(new n0(this));
    final androidx.lifecycle.f0 mFragmentLifecycleRegistry = new androidx.lifecycle.f0(this, true);
    boolean mStopped = true;

    public o0() {
        getSavedStateRegistry().c("android:support:lifecycle", new k0(this, 0));
        final int i11 = 0;
        addOnConfigurationChangedListener(new Consumer(this) { // from class: androidx.fragment.app.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f3256b;

            {
                this.f3256b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f3256b.mFragments.a();
                        break;
                    default:
                        this.f3256b.mFragments.a();
                        break;
                }
            }
        });
        final int i12 = 1;
        addOnNewIntentListener(new Consumer(this) { // from class: androidx.fragment.app.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f3256b;

            {
                this.f3256b = this;
            }

            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.f3256b.mFragments.a();
                        break;
                    default:
                        this.f3256b.mFragments.a();
                        break;
                }
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.fragment.app.m0
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                n0 n0Var = this.f3263a.mFragments.f3330a;
                n0Var.f3359d.b(n0Var, n0Var, null);
            }
        });
    }

    public static boolean y(FragmentManager fragmentManager, Lifecycle.State state) {
        boolean zY = false;
        for (Fragment fragment : fragmentManager.f3109c.f()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zY |= y(fragment.getChildFragmentManager(), state);
                }
                i2 i2Var = fragment.mViewLifecycleOwner;
                if (i2Var != null) {
                    i2Var.b();
                    if (i2Var.f3239e.f3435d.a(Lifecycle.State.STARTED)) {
                        fragment.mViewLifecycleOwner.f3239e.i(state);
                        zY = true;
                    }
                }
                if (fragment.mLifecycleRegistry.f3435d.a(Lifecycle.State.STARTED)) {
                    fragment.mLifecycleRegistry.i(state);
                    zY = true;
                }
            }
        }
        return zY;
    }

    public final View dispatchFragmentsOnCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return this.mFragments.f3330a.f3359d.f3112f.onCreateView(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@NonNull String str, FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (shouldDumpInternalState(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.mCreated);
            printWriter.print(" mResumed=");
            printWriter.print(this.mResumed);
            printWriter.print(" mStopped=");
            printWriter.print(this.mStopped);
            if (getApplication() != null) {
                LoaderManager.b(this).d(str2, fileDescriptor, printWriter, strArr);
            }
            this.mFragments.f3330a.f3359d.w(str, fileDescriptor, printWriter, strArr);
        }
    }

    @NonNull
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.f3330a.f3359d;
    }

    @NonNull
    @Deprecated
    public LoaderManager getSupportLoaderManager() {
        return LoaderManager.b(this);
    }

    public void markFragmentsCreated() {
        while (y(getSupportFragmentManager(), Lifecycle.State.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.mFragments.a();
        super.onActivityResult(i11, i12, intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.w.ON_CREATE);
        n1 n1Var = this.mFragments.f3330a.f3359d;
        n1Var.I = false;
        n1Var.J = false;
        n1Var.P.f3327f = false;
        n1Var.v(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.f3330a.f3359d.m();
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.w.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 6) {
            return this.mFragments.f3330a.f3359d.k(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.f3330a.f3359d.v(5);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.w.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, @NonNull String[] strArr, @NonNull int[] iArr) {
        this.mFragments.a();
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.a();
        super.onResume();
        this.mResumed = true;
        this.mFragments.f3330a.f3359d.A(true);
    }

    public void onResumeFragments() {
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.w.ON_RESUME);
        n1 n1Var = this.mFragments.f3330a.f3359d;
        n1Var.I = false;
        n1Var.J = false;
        n1Var.P.f3327f = false;
        n1Var.v(7);
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.a();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            n1 n1Var = this.mFragments.f3330a.f3359d;
            n1Var.I = false;
            n1Var.J = false;
            n1Var.P.f3327f = false;
            n1Var.v(4);
        }
        this.mFragments.f3330a.f3359d.A(true);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.w.ON_START);
        n1 n1Var2 = this.mFragments.f3330a.f3359d;
        n1Var2.I = false;
        n1Var2.J = false;
        n1Var2.P.f3327f = false;
        n1Var2.v(5);
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        n1 n1Var = this.mFragments.f3330a.f3359d;
        n1Var.J = true;
        n1Var.P.f3327f = true;
        n1Var.v(4);
        this.mFragmentLifecycleRegistry.g(androidx.lifecycle.w.ON_STOP);
    }

    public void setEnterSharedElementCallback(SharedElementCallback sharedElementCallback) {
        setEnterSharedElementCallback(sharedElementCallback != null ? new androidx.core.app.b(sharedElementCallback) : null);
    }

    public void setExitSharedElementCallback(SharedElementCallback sharedElementCallback) {
        setExitSharedElementCallback(sharedElementCallback != null ? new androidx.core.app.b(sharedElementCallback) : null);
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i11, Bundle bundle) {
        if (i11 == -1) {
            startActivityForResult(intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i11, bundle);
        }
    }

    @Deprecated
    public void startIntentSenderFromFragment(@NonNull Fragment fragment, @NonNull IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) throws IntentSender.SendIntentException {
        if (i11 == -1) {
            startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        finishAfterTransition();
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateMenu();
    }

    public void supportPostponeEnterTransition() {
        postponeEnterTransition();
    }

    public void supportStartPostponedEnterTransition() {
        startPostponedEnterTransition();
    }

    public void startActivityFromFragment(@NonNull Fragment fragment, @NonNull Intent intent, int i11) {
        startActivityFromFragment(fragment, intent, i11, (Bundle) null);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Deprecated
    public void onAttachFragment(@NonNull Fragment fragment) {
    }

    @Override // androidx.core.app.a
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i11) {
    }
}
