package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.a1;
import androidx.core.app.b1;
import androidx.core.app.v0;
import androidx.core.app.w0;
import androidx.core.app.z0;
import androidx.core.util.Consumer;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.f1;
import androidx.lifecycle.o1;
import androidx.lifecycle.s1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y0;
import androidx.savedstate.SavedStateRegistry;
import com.app.tgtg.R;
import com.braze.h2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import o00.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements LifecycleOwner, s1, androidx.lifecycle.p, ea.f, f0, q9.d, h.f, v6.c, v6.d, v0, w0, h7.p {

    @NotNull
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1695a = 0;

    @Nullable
    private ViewModelStore _viewModelStore;

    @NotNull
    private final ActivityResultRegistry activityResultRegistry;
    private int contentLayoutId;

    @NotNull
    private final u70.j defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    @NotNull
    private final u70.j fullyDrawnReporter$delegate;
    private boolean hasPictureInPictureSystemFeature;

    @NotNull
    private final AtomicInteger nextLocalRequestCode;

    @NotNull
    private final u70.j onBackPressedDispatcher$delegate;

    @NotNull
    private final u70.j onBackPressedInput$delegate;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Configuration>> onConfigurationChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<androidx.core.app.h>> onMultiWindowModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Intent>> onNewIntentListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<z0>> onPictureInPictureModeChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<r40.d>> onPictureInPictureUiStateChangedListeners;

    @NotNull
    private final CopyOnWriteArrayList<Consumer<Integer>> onTrimMemoryListeners;

    @NotNull
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    @NotNull
    private final ReportFullyDrawnExecutor reportFullyDrawnExecutor;

    @NotNull
    private final ea.e savedStateRegistryController;

    @NotNull
    private final g.a contextAwareHelper = new g.a();

    @NotNull
    private final h7.r menuHostHelper = new h7.r(new c(this, 0));

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$ReportFullyDrawnExecutor;", "Ljava/util/concurrent/Executor;", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ReportFullyDrawnExecutor extends Executor {
        void O(View view);

        void e();
    }

    public ComponentActivity() {
        ea.e eVar = new ea.e(new ga.a(this, new cw.b(this, 6)));
        this.savedStateRegistryController = eVar;
        this.reportFullyDrawnExecutor = new k(this);
        this.fullyDrawnReporter$delegate = u70.l.b(new d(this, 1));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new m(this);
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = u70.l.b(new d(this, 2));
        if (getLifecycle() == null) {
            h2.b("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i11 = 0;
        getLifecycle().a(new androidx.lifecycle.c0(this) { // from class: androidx.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f1724b;

            {
                this.f1724b = this;
            }

            @Override // androidx.lifecycle.c0
            public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
                Window window;
                View viewPeekDecorView;
                int i12 = i11;
                ComponentActivity componentActivity = this.f1724b;
                switch (i12) {
                    case 0:
                        int i13 = ComponentActivity.f1695a;
                        if (wVar == androidx.lifecycle.w.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.v(componentActivity, lifecycleOwner, wVar);
                        break;
                }
            }
        });
        final int i12 = 1;
        getLifecycle().a(new androidx.lifecycle.c0(this) { // from class: androidx.activity.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f1724b;

            {
                this.f1724b = this;
            }

            @Override // androidx.lifecycle.c0
            public final void onStateChanged(LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
                Window window;
                View viewPeekDecorView;
                int i122 = i12;
                ComponentActivity componentActivity = this.f1724b;
                switch (i122) {
                    case 0:
                        int i13 = ComponentActivity.f1695a;
                        if (wVar == androidx.lifecycle.w.ON_STOP && (window = componentActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        ComponentActivity.v(componentActivity, lifecycleOwner, wVar);
                        break;
                }
            }
        });
        getLifecycle().a(new ea.b(this, i12));
        eVar.a();
        f1.b(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new g(this, 0));
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.h
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void a(ComponentActivity componentActivity) {
                ComponentActivity.x(this.f1730a, componentActivity);
            }
        });
        this.defaultViewModelProviderFactory$delegate = u70.l.b(new d(this, 3));
        this.onBackPressedDispatcher$delegate = u70.l.b(new d(this, 4));
    }

    public static final void access$ensureViewModelStore(ComponentActivity componentActivity) {
        if (componentActivity._viewModelStore == null) {
            j jVar = (j) componentActivity.getLastNonConfigurationInstance();
            if (jVar != null) {
                componentActivity._viewModelStore = jVar.f1732b;
            }
            if (componentActivity._viewModelStore == null) {
                componentActivity._viewModelStore = new ViewModelStore();
            }
        }
    }

    public static Bundle q(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
        activityResultRegistry.getClass();
        LinkedHashMap linkedHashMap = activityResultRegistry.f1755b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(activityResultRegistry.f1757d));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(activityResultRegistry.f1760g));
        return bundle;
    }

    public static void t(OnBackPressedDispatcher onBackPressedDispatcher, ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        if (wVar == androidx.lifecycle.w.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.e(onBackInvokedDispatcher);
        }
    }

    public static FullyDrawnReporter u(ComponentActivity componentActivity) {
        return new FullyDrawnReporter(componentActivity.reportFullyDrawnExecutor, new d(componentActivity, 0));
    }

    public static void v(ComponentActivity componentActivity, LifecycleOwner lifecycleOwner, androidx.lifecycle.w wVar) {
        if (wVar == androidx.lifecycle.w.ON_DESTROY) {
            componentActivity.contextAwareHelper.f17996b = null;
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.e();
        }
    }

    public static void w(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e5) {
            if (!Intrinsics.areEqual(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e5;
            }
        } catch (NullPointerException e11) {
            if (!Intrinsics.areEqual(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e11;
            }
        }
    }

    public static void x(ComponentActivity componentActivity, Context context) {
        context.getClass();
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            ActivityResultRegistry activityResultRegistry = componentActivity.activityResultRegistry;
            LinkedHashMap linkedHashMap = activityResultRegistry.f1755b;
            LinkedHashMap linkedHashMap2 = activityResultRegistry.f1754a;
            Bundle bundle = activityResultRegistry.f1760g;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                activityResultRegistry.f1757d.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                String str = stringArrayList.get(i11);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i11);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i11);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                activityResultRegistry.f1755b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.O(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(@NotNull MenuProvider menuProvider, @NotNull LifecycleOwner lifecycleOwner) {
        menuProvider.getClass();
        lifecycleOwner.getClass();
        h7.r rVar = this.menuHostHelper;
        rVar.f21615b.add(menuProvider);
        rVar.f21614a.run();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = rVar.f21616c;
        h7.q qVar = (h7.q) map.remove(menuProvider);
        if (qVar != null) {
            qVar.f21609a.d(qVar.f21610b);
            qVar.f21610b = null;
        }
        map.put(menuProvider, new h7.q(lifecycle, new e(1, rVar, menuProvider)));
    }

    @Override // v6.c
    public final void addOnConfigurationChangedListener(@NotNull Consumer<Configuration> consumer) {
        consumer.getClass();
        this.onConfigurationChangedListeners.add(consumer);
    }

    public final void addOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener) {
        onContextAvailableListener.getClass();
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        ComponentActivity componentActivity = aVar.f17996b;
        if (componentActivity != null) {
            onContextAvailableListener.a(componentActivity);
        }
        aVar.f17995a.add(onContextAvailableListener);
    }

    @Override // androidx.core.app.v0
    public final void addOnMultiWindowModeChangedListener(@NotNull Consumer<androidx.core.app.h> consumer) {
        consumer.getClass();
        this.onMultiWindowModeChangedListeners.add(consumer);
    }

    public final void addOnNewIntentListener(@NotNull Consumer<Intent> consumer) {
        consumer.getClass();
        this.onNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.w0
    public final void addOnPictureInPictureModeChangedListener(@NotNull Consumer<z0> consumer) {
        consumer.getClass();
        this.onPictureInPictureModeChangedListeners.add(consumer);
    }

    public final void addOnPictureInPictureUiStateChangedListener(@NotNull Consumer<r40.d> consumer) {
        consumer.getClass();
        this.onPictureInPictureUiStateChangedListeners.add(consumer);
    }

    @Override // v6.d
    public final void addOnTrimMemoryListener(@NotNull Consumer<Integer> consumer) {
        consumer.getClass();
        this.onTrimMemoryListeners.add(consumer);
    }

    public final void addOnUserLeaveHintListener(@NotNull Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final void enterPictureInPictureMode(@NotNull a1 a1Var) {
        throw null;
    }

    @Override // h.f
    @NotNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.p
    @NotNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        y8.d dVar = new y8.d(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = dVar.f3543a;
        if (application != null) {
            linkedHashMap.put(o1.f3505d, getApplication());
        }
        linkedHashMap.put(f1.f3442a, this);
        linkedHashMap.put(f1.f3443b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap.put(f1.f3444c, extras);
        }
        return dVar;
    }

    @NotNull
    public ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return (ViewModelProvider$Factory) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    @NotNull
    public FullyDrawnReporter getFullyDrawnReporter() {
        return (FullyDrawnReporter) this.fullyDrawnReporter$delegate.getValue();
    }

    @u70.d
    @Nullable
    public Object getLastCustomNonConfigurationInstance() {
        j jVar = (j) getLastNonConfigurationInstance();
        if (jVar != null) {
            return jVar.f1731a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    @Override // q9.d
    @NotNull
    public q9.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().f1710c;
    }

    @Override // androidx.activity.f0
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return (OnBackPressedDispatcher) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // ea.f
    @NotNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.f15899b;
    }

    @Override // androidx.lifecycle.s1
    @NotNull
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            h2.b("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            j jVar = (j) getLastNonConfigurationInstance();
            if (jVar != null) {
                this._viewModelStore = jVar.f1732b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new ViewModelStore();
            }
        }
        ViewModelStore viewModelStore = this._viewModelStore;
        viewModelStore.getClass();
        return viewModelStore;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @u70.d
    public void onActivityResult(int i11, int i12, @Nullable Intent intent) {
        if (this.activityResultRegistry.a(i11, i12, intent)) {
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.app.Activity
    @u70.d
    public void onBackPressed() {
        ((q9.a) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.savedStateRegistryController.b(bundle);
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f17996b = this;
        Iterator it = aVar.f17995a.iterator();
        while (it.hasNext()) {
            ((OnContextAvailableListener) it.next()).a(this);
        }
        super.onCreate(bundle);
        int i11 = androidx.lifecycle.a1.f3413b;
        y0.b(this);
        int i12 = this.contentLayoutId;
        if (i12 != 0) {
            setContentView(i12);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, @NotNull Menu menu) {
        menu.getClass();
        if (i11 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i11, menu);
        h7.r rVar = this.menuHostHelper;
        MenuInflater menuInflater = getMenuInflater();
        Iterator it = rVar.f21615b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).c(menu, menuInflater);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, @NotNull MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 == 0) {
            Iterator it = this.menuHostHelper.f21615b.iterator();
            while (it.hasNext()) {
                if (((MenuProvider) it.next()).a(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z11, @NotNull Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z11, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<androidx.core.app.h>> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                Consumer<androidx.core.app.h> next = it.next();
                configuration.getClass();
                next.accept(new androidx.core.app.h(z11));
            }
        } catch (Throwable th2) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, @NotNull Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.f21615b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).b(menu);
        }
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11, @NotNull Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z11, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<z0>> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                Consumer<z0> next = it.next();
                configuration.getClass();
                next.accept(new z0(z11));
            }
        } catch (Throwable th2) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(@NotNull PictureInPictureUiState pictureInPictureUiState) {
        pictureInPictureUiState.getClass();
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        r40.d dVarA = b1.a(pictureInPictureUiState);
        Iterator<Consumer<r40.d>> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(dVarA);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i11, @Nullable View view, @NotNull Menu menu) {
        menu.getClass();
        if (i11 != 0) {
            return true;
        }
        super.onPreparePanel(i11, view, menu);
        Iterator it = this.menuHostHelper.f21615b.iterator();
        while (it.hasNext()) {
            ((MenuProvider) it.next()).d(menu);
        }
        return true;
    }

    @Override // android.app.Activity
    @u70.d
    public void onRequestPermissionsResult(int i11, @NotNull String[] strArr, @NotNull int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i11, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @u70.d
    @Nullable
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        j jVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (jVar = (j) getLastNonConfigurationInstance()) != null) {
            viewModelStore = jVar.f1732b;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        j jVar2 = new j();
        jVar2.f1731a = objOnRetainCustomNonConfigurationInstance;
        jVar2.f1732b = viewModelStore;
        return jVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof androidx.lifecycle.f0) {
            Lifecycle lifecycle = getLifecycle();
            lifecycle.getClass();
            ((androidx.lifecycle.f0) lifecycle).i(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.savedStateRegistryController.c(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        super.onTrimMemory(i11);
        Iterator<Consumer<Integer>> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i11));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    @Nullable
    public Context peekAvailableContext() {
        return this.contextAwareHelper.f17996b;
    }

    @NotNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> activityResultContract, @NotNull ActivityResultRegistry activityResultRegistry, @NotNull ActivityResultCallback<O> activityResultCallback) {
        activityResultContract.getClass();
        activityResultRegistry.getClass();
        activityResultCallback.getClass();
        return activityResultRegistry.d("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    @Override // h7.p
    public void removeMenuProvider(@NotNull MenuProvider menuProvider) {
        menuProvider.getClass();
        this.menuHostHelper.a(menuProvider);
    }

    @Override // v6.c
    public final void removeOnConfigurationChangedListener(@NotNull Consumer<Configuration> consumer) {
        consumer.getClass();
        this.onConfigurationChangedListeners.remove(consumer);
    }

    public final void removeOnContextAvailableListener(@NotNull OnContextAvailableListener onContextAvailableListener) {
        onContextAvailableListener.getClass();
        g.a aVar = this.contextAwareHelper;
        aVar.getClass();
        aVar.f17995a.remove(onContextAvailableListener);
    }

    @Override // androidx.core.app.v0
    public final void removeOnMultiWindowModeChangedListener(@NotNull Consumer<androidx.core.app.h> consumer) {
        consumer.getClass();
        this.onMultiWindowModeChangedListeners.remove(consumer);
    }

    public final void removeOnNewIntentListener(@NotNull Consumer<Intent> consumer) {
        consumer.getClass();
        this.onNewIntentListeners.remove(consumer);
    }

    @Override // androidx.core.app.w0
    public final void removeOnPictureInPictureModeChangedListener(@NotNull Consumer<z0> consumer) {
        consumer.getClass();
        this.onPictureInPictureModeChangedListeners.remove(consumer);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(@NotNull Consumer<r40.d> consumer) {
        consumer.getClass();
        this.onPictureInPictureUiStateChangedListeners.remove(consumer);
    }

    @Override // v6.d
    public final void removeOnTrimMemoryListener(@NotNull Consumer<Integer> consumer) {
        consumer.getClass();
        this.onTrimMemoryListeners.remove(consumer);
    }

    public final void removeOnUserLeaveHintListener(@NotNull Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (x0.y()) {
                Trace.beginSection(x0.G("reportFullyDrawn() for ComponentActivity"));
            }
            super.reportFullyDrawn();
            FullyDrawnReporter fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f1697b) {
                try {
                    fullyDrawnReporter.f1698c = true;
                    Iterator it = fullyDrawnReporter.f1699d.iterator();
                    while (it.hasNext()) {
                        ((Function0) it.next()).invoke();
                    }
                    fullyDrawnReporter.f1699d.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i11) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.O(decorView);
        super.setContentView(i11);
    }

    public final void setPictureInPictureParams(@NotNull a1 a1Var) {
        throw null;
    }

    @Override // android.app.Activity
    @u70.d
    public void startActivityForResult(@NotNull Intent intent, int i11) {
        intent.getClass();
        super.startActivityForResult(intent, i11);
    }

    @Override // android.app.Activity
    @u70.d
    public void startIntentSenderForResult(@NotNull IntentSender intentSender, int i11, @Nullable Intent intent, int i12, int i13, int i14) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
    }

    @Override // android.app.Activity
    @u70.d
    public void startActivityForResult(@NotNull Intent intent, int i11, @Nullable Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // android.app.Activity
    @u70.d
    public void startIntentSenderForResult(@NotNull IntentSender intentSender, int i11, @Nullable Intent intent, int i12, int i13, int i14, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.O(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ReportFullyDrawnExecutor reportFullyDrawnExecutor = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        reportFullyDrawnExecutor.O(decorView);
        super.setContentView(view, layoutParams);
    }

    @NotNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NotNull ActivityResultContract<I, O> activityResultContract, @NotNull ActivityResultCallback<O> activityResultCallback) {
        activityResultContract.getClass();
        activityResultCallback.getClass();
        return registerForActivityResult(activityResultContract, this.activityResultRegistry, activityResultCallback);
    }

    @Override // android.app.Activity
    @u70.d
    public void onMultiWindowModeChanged(boolean z11) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<androidx.core.app.h>> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new androidx.core.app.h(z11));
        }
    }

    @Override // android.app.Activity
    @u70.d
    public void onPictureInPictureModeChanged(boolean z11) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<z0>> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new z0(z11));
        }
    }

    @Override // h7.p
    public void addMenuProvider(@NotNull MenuProvider menuProvider) {
        menuProvider.getClass();
        h7.r rVar = this.menuHostHelper;
        rVar.f21615b.add(menuProvider);
        rVar.f21614a.run();
    }

    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NotNull MenuProvider menuProvider, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.State state) {
        menuProvider.getClass();
        lifecycleOwner.getClass();
        state.getClass();
        h7.r rVar = this.menuHostHelper;
        rVar.getClass();
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        HashMap map = rVar.f21616c;
        h7.q qVar = (h7.q) map.remove(menuProvider);
        if (qVar != null) {
            qVar.f21609a.d(qVar.f21610b);
            qVar.f21610b = null;
        }
        map.put(menuProvider, new h7.q(lifecycle, new gn.s(rVar, state, menuProvider, 1)));
    }
}
