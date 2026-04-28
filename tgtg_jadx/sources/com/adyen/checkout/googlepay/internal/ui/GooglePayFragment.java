package com.adyen.checkout.googlepay.internal.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import ba0.g;
import com.adyen.checkout.googlepay.databinding.FragmentGooglePayBinding;
import com.braze.h2;
import com.google.android.gms.tasks.Task;
import e10.l;
import g10.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.z;
import x70.c;
import y70.a;
import y80.r;
import y80.w;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R>\u0010\u001b\u001a,\u0012(\u0012&\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u0019 \u001a*\u0012\u0012\f\u0012\n \u001a*\u0004\u0018\u00010\u00190\u0019\u0018\u00010\u00180\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/adyen/checkout/googlepay/internal/ui/GooglePayFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "delegate", "", "initialize", "(Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;)V", "onDestroyView", "Lcom/adyen/checkout/googlepay/databinding/FragmentGooglePayBinding;", "_binding", "Lcom/adyen/checkout/googlepay/databinding/FragmentGooglePayBinding;", "Lcom/adyen/checkout/googlepay/internal/ui/GooglePayDelegate;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/google/android/gms/tasks/Task;", "Le10/l;", "kotlin.jvm.PlatformType", "googlePayLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "getBinding", "()Lcom/adyen/checkout/googlepay/databinding/FragmentGooglePayBinding;", "binding", "googlepay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GooglePayFragment extends Fragment {

    @Nullable
    private FragmentGooglePayBinding _binding;

    @Nullable
    private GooglePayDelegate delegate;

    @NotNull
    private final ActivityResultLauncher<Task<l>> googlePayLauncher;

    /* JADX INFO: renamed from: com.adyen.checkout.googlepay.internal.ui.GooglePayFragment$initialize$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.googlepay.internal.ui.GooglePayFragment$initialize$1", f = "GooglePayFragment.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/google/android/gms/tasks/Task;", "Le10/l;", "it", "", "<anonymous>", "(Lcom/google/android/gms/tasks/Task;)V"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends i implements Function2<Task<l>, c<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        @NotNull
        public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
            AnonymousClass1 anonymousClass1 = GooglePayFragment.this.new AnonymousClass1(cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull Task<l> task, @Nullable c<? super Unit> cVar) {
            return ((AnonymousClass1) create(task, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            GooglePayFragment.this.googlePayLauncher.a((Task) this.L$0, null);
            return Unit.f26487a;
        }
    }

    public GooglePayFragment() {
        ActivityResultLauncher<Task<l>> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new b(), new z(this, 18));
        activityResultLauncherRegisterForActivityResult.getClass();
        this.googlePayLauncher = activityResultLauncherRegisterForActivityResult;
    }

    private final FragmentGooglePayBinding getBinding() {
        FragmentGooglePayBinding fragmentGooglePayBinding = this._binding;
        if (fragmentGooglePayBinding != null) {
            return fragmentGooglePayBinding;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void googlePayLauncher$lambda$0(GooglePayFragment googlePayFragment, g10.a aVar) {
        googlePayFragment.getClass();
        GooglePayDelegate googlePayDelegate = googlePayFragment.delegate;
        if (googlePayDelegate != null) {
            aVar.getClass();
            googlePayDelegate.handlePaymentResult(aVar);
        }
    }

    public final void initialize(@NotNull GooglePayDelegate delegate) {
        delegate.getClass();
        this.delegate = delegate;
        w wVar = new w(delegate.getPayEventFlow(), new AnonymousClass1(null), 5);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        r.u(m1.c(viewLifecycleOwner), wVar);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        this._binding = FragmentGooglePayBinding.inflate(inflater, container, false);
        FrameLayout root = getBinding().getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.delegate = null;
        this._binding = null;
        super.onDestroyView();
    }
}
