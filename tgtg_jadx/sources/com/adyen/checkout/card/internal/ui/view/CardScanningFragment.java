package com.adyen.checkout.card.internal.ui.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m1;
import ax.s;
import ba0.g;
import com.adyen.checkout.card.databinding.FragmentCardScanningBinding;
import com.adyen.checkout.card.internal.ui.CardDelegate;
import com.adyen.checkout.card.internal.util.CardScannerWrapper;
import com.adyen.checkout.card.scanning.AdyenCardScannerResult;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.checkout.core.Environment;
import com.braze.h2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import z70.e;
import z70.i;
import zendesk.faye.internal.Bayeux;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bJ\"\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\rH\u0016J\u001a\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001f\u001a\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/adyen/checkout/card/internal/ui/view/CardScanningFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/adyen/checkout/card/databinding/FragmentCardScanningBinding;", "binding", "getBinding", "()Lcom/adyen/checkout/card/databinding/FragmentCardScanningBinding;", "cardScanner", "Lcom/adyen/checkout/card/internal/util/CardScannerWrapper;", "delegate", "Lcom/adyen/checkout/card/internal/ui/CardDelegate;", "initialize", "", "onActivityResult", "requestCode", "", StatusResponse.RESULT_CODE, Bayeux.KEY_DATA, "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "resetScanner", "Companion", "card_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CardScanningFragment extends Fragment {
    private static final int REQUEST_CODE = 101;

    @Nullable
    private FragmentCardScanningBinding _binding;

    @Nullable
    private CardScannerWrapper cardScanner;

    @Nullable
    private CardDelegate delegate;

    /* JADX INFO: renamed from: com.adyen.checkout.card.internal.ui.view.CardScanningFragment$resetScanner$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.adyen.checkout.card.internal.ui.view.CardScanningFragment$resetScanner$1", f = "CardScanningFragment.kt", l = {60}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nCardScanningFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardScanningFragment.kt\ncom/adyen/checkout/card/internal/ui/view/CardScanningFragment$resetScanner$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,93:1\n256#2,2:94\n*S KotlinDebug\n*F\n+ 1 CardScanningFragment.kt\ncom/adyen/checkout/card/internal/ui/view/CardScanningFragment$resetScanner$1\n*L\n61#1:94,2\n*E\n"})
    public static final class AnonymousClass1 extends i implements Function2<b0, x70.c<? super Unit>, Object> {
        final /* synthetic */ CardScannerWrapper $cardScanner;
        final /* synthetic */ CardDelegate $delegate;
        int label;
        final /* synthetic */ CardScanningFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CardScannerWrapper cardScannerWrapper, CardScanningFragment cardScanningFragment, CardDelegate cardDelegate, x70.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$cardScanner = cardScannerWrapper;
            this.this$0 = cardScanningFragment;
            this.$delegate = cardDelegate;
        }

        @Override // z70.a
        @NotNull
        public final x70.c<Unit> create(@Nullable Object obj, @NotNull x70.c<?> cVar) {
            return new AnonymousClass1(this.$cardScanner, this.this$0, this.$delegate, cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull b0 b0Var, @Nullable x70.c<? super Unit> cVar) {
            return ((AnonymousClass1) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                g.M(obj);
                CardScannerWrapper cardScannerWrapper = this.$cardScanner;
                Context contextRequireContext = this.this$0.requireContext();
                contextRequireContext.getClass();
                Environment environment = this.$delegate.getComponentParams().getEnvironment();
                this.label = 1;
                obj = cardScannerWrapper.initialize(contextRequireContext, environment, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    h2.b("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g.M(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            ImageView imageView = this.this$0.getBinding().scanButton;
            imageView.getClass();
            imageView.setVisibility(zBooleanValue ? 0 : 8);
            this.$delegate.onCardScanningAvailability(zBooleanValue);
            return Unit.f26487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentCardScanningBinding getBinding() {
        FragmentCardScanningBinding fragmentCardScanningBinding = this._binding;
        if (fragmentCardScanningBinding != null) {
            return fragmentCardScanningBinding;
        }
        i4.a.f("Required value was null.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewCreated$lambda$1(CardScanningFragment cardScanningFragment, View view) {
        cardScanningFragment.getClass();
        CardScannerWrapper cardScannerWrapper = cardScanningFragment.cardScanner;
        Boolean boolValueOf = cardScannerWrapper != null ? Boolean.valueOf(cardScannerWrapper.startScanner(cardScanningFragment, REQUEST_CODE)) : null;
        CardDelegate cardDelegate = cardScanningFragment.delegate;
        if (cardDelegate != null) {
            cardDelegate.onCardScanningDisplayed(boolValueOf != null ? boolValueOf.booleanValue() : false);
        }
    }

    private final void resetScanner() {
        CardDelegate cardDelegate;
        CardScannerWrapper cardScannerWrapper = this.cardScanner;
        if (cardScannerWrapper == null || (cardDelegate = this.delegate) == null) {
            return;
        }
        cardScannerWrapper.terminate();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        f0.B(m1.c(viewLifecycleOwner), null, null, new AnonymousClass1(cardScannerWrapper, this, cardDelegate, null), 3);
    }

    public final void initialize(@NotNull CardDelegate delegate) {
        delegate.getClass();
        this.delegate = delegate;
        this.cardScanner = new CardScannerWrapper();
        resetScanner();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQUEST_CODE) {
            return;
        }
        CardScannerWrapper cardScannerWrapper = this.cardScanner;
        AdyenCardScannerResult result = cardScannerWrapper != null ? cardScannerWrapper.getResult(data) : null;
        CardDelegate cardDelegate = this.delegate;
        if (cardDelegate != null) {
            cardDelegate.onCardScanningResult(resultCode, result != null ? result.getPan() : null, result != null ? result.getExpiryMonth() : null, result != null ? result.getExpiryYear() : null);
        }
        resetScanner();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        inflater.getClass();
        this._binding = FragmentCardScanningBinding.inflate(inflater, container, false);
        LinearLayout root = getBinding().getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this._binding = null;
        this.delegate = null;
        CardScannerWrapper cardScannerWrapper = this.cardScanner;
        if (cardScannerWrapper != null) {
            cardScannerWrapper.terminate();
        }
        this.cardScanner = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        view.getClass();
        super.onViewCreated(view, savedInstanceState);
        getBinding().scanButton.setOnClickListener(new s(this, 8));
    }
}
