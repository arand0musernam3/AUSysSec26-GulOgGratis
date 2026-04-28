package androidx.activity;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistry;
import com.app.tgtg.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class o extends Dialog implements LifecycleOwner, f0, q9.d, ea.f {

    @Nullable
    private androidx.lifecycle.f0 _lifecycleRegistry;

    @NotNull
    private final u70.j onBackPressedDispatcher$delegate;

    @NotNull
    private final u70.j onBackPressedInput$delegate;

    @NotNull
    private final ea.e savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(@NotNull Context context, int i11) {
        super(context, i11);
        context.getClass();
        this.savedStateRegistryController = new ea.e(new ga.a(this, new cw.b(this, 6)));
        final int i12 = 0;
        this.onBackPressedInput$delegate = u70.l.b(new Function0(this) { // from class: androidx.activity.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f1743b;

            {
                this.f1743b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i12) {
                    case 0:
                        q9.a aVar = new q9.a();
                        this.f1743b.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new OnBackPressedDispatcher(new al.u(this.f1743b, 2));
                }
            }
        });
        final int i13 = 1;
        this.onBackPressedDispatcher$delegate = u70.l.b(new Function0(this) { // from class: androidx.activity.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f1743b;

            {
                this.f1743b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        q9.a aVar = new q9.a();
                        this.f1743b.getNavigationEventDispatcher().b(aVar);
                        return aVar;
                    default:
                        return new OnBackPressedDispatcher(new al.u(this.f1743b, 2));
                }
            }
        });
    }

    public static void a(o oVar) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public final androidx.lifecycle.f0 b() {
        androidx.lifecycle.f0 f0Var = this._lifecycleRegistry;
        if (f0Var != null) {
            return f0Var;
        }
        androidx.lifecycle.f0 f0Var2 = new androidx.lifecycle.f0(this, true);
        this._lifecycleRegistry = f0Var2;
        return f0Var2;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NotNull
    public Lifecycle getLifecycle() {
        return b();
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
    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.f15899b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    @u70.d
    public void onBackPressed() {
        ((q9.a) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.e(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.b(bundle);
        b().g(androidx.lifecycle.w.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.savedStateRegistryController.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        b().g(androidx.lifecycle.w.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        b().g(androidx.lifecycle.w.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(int i11) {
        initializeViewTreeOwners();
        super.setContentView(i11);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public /* synthetic */ o(Context context, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? 0 : i11);
    }
}
