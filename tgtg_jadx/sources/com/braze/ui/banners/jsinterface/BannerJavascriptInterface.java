package com.braze.ui.banners.jsinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;
import ba0.g;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.h2;
import com.braze.models.inappmessage.m;
import com.braze.support.BrazeLogger;
import com.braze.support.PermissionUtils;
import com.braze.ui.JavascriptInterfaceBase;
import com.braze.ui.inappmessage.BrazeInAppMessageManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import x70.c;
import z70.e;
import z70.i;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u0017J\b\u0010\u0016\u001a\u00020\tH\u0017J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\bH\u0007J\b\u0010\u0019\u001a\u00020\tH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u00020\u00118G¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, d2 = {"Lcom/braze/ui/banners/jsinterface/BannerJavascriptInterface;", "Lcom/braze/ui/JavascriptInterfaceBase;", "context", "Landroid/content/Context;", "placementId", "", "setHeightCallback", "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getPlacementId", "()Ljava/lang/String;", "getSetHeightCallback", "()Lkotlin/jvm/functions/Function1;", "user", "Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "getUser", "()Lcom/braze/ui/banners/jsinterface/BannerUserJavascriptInterface;", "logButtonClick", "buttonId", "logClick", "setBannerHeight", "height", "requestPushPermission", "android-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BannerJavascriptInterface extends JavascriptInterfaceBase {

    @NotNull
    private final String placementId;

    @NotNull
    private final Function1<Double, Unit> setHeightCallback;

    @NotNull
    private final BannerUserJavascriptInterface user;

    /* JADX INFO: renamed from: com.braze.ui.banners.jsinterface.BannerJavascriptInterface$requestPushPermission$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "com.braze.ui.banners.jsinterface.BannerJavascriptInterface$requestPushPermission$2", f = "BannerJavascriptInterface.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv80/b0;", "", "<anonymous>", "(Lv80/b0;)V"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends i implements Function2<b0, c<? super Unit>, Object> {
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // z70.a
        public final c<Unit> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b0 b0Var, c<? super Unit> cVar) {
            return ((AnonymousClass2) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
        }

        @Override // z70.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g.M(obj);
            PermissionUtils.requestPushPermissionPrompt(BrazeInAppMessageManager.INSTANCE.getInstance().getActivity());
            return Unit.f26487a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BannerJavascriptInterface(@NotNull Context context, @NotNull String str, @NotNull Function1<? super Double, Unit> function1) {
        super(context);
        context.getClass();
        str.getClass();
        function1.getClass();
        this.placementId = str;
        this.setHeightCallback = function1;
        this.user = new BannerUserJavascriptInterface(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(double d3) {
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Banner logButtonClick() called. Logging banner click with button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logClick$lambda$2() {
        return "Banner logClick() called. Logging banner click without button ID.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String requestPushPermission$lambda$5() {
        return "Banner requestPushPermission() called. Requesting push permission now.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$3(double d3) {
        return "Banner setBannerHeight(" + d3 + ") called with invalid height. Height must be a finite number, not NaN, and greater or equal to 0.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setBannerHeight$lambda$4(double d3) {
        return "Banner setBannerHeight(" + d3 + ") called.";
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @NotNull
    public final Function1<Double, Unit> getSetHeightCallback() {
        return this.setHeightCallback;
    }

    @JavascriptInterface
    @NotNull
    public final BannerUserJavascriptInterface getUser() {
        return this.user;
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logButtonClick(@Nullable String buttonId) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m(21), 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, buttonId);
    }

    @Override // com.braze.ui.JavascriptInterfaceBase
    @JavascriptInterface
    public void logClick() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new m(22), 6, (Object) null);
        Braze.INSTANCE.getInstance(getContext()).logBannerClick(this.placementId, null);
    }

    @JavascriptInterface
    public final void requestPushPermission() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new m(23), 6, (Object) null);
        f0.B(BrazeCoroutineScope.INSTANCE, null, null, new AnonymousClass2(null), 3);
    }

    @JavascriptInterface
    public final void setBannerHeight(final double height) {
        if (Double.isInfinite(height) || Double.isNaN(height) || height < 0.0d) {
            final int i11 = 0;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.ui.banners.jsinterface.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i11) {
                        case 0:
                            return BannerJavascriptInterface.setBannerHeight$lambda$3(height);
                        default:
                            return BannerJavascriptInterface.setBannerHeight$lambda$4(height);
                    }
                }
            }, 7, (Object) null);
        } else {
            final int i12 = 1;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.ui.banners.jsinterface.a
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i12) {
                        case 0:
                            return BannerJavascriptInterface.setBannerHeight$lambda$3(height);
                        default:
                            return BannerJavascriptInterface.setBannerHeight$lambda$4(height);
                    }
                }
            }, 6, (Object) null);
            this.setHeightCallback.invoke(Double.valueOf(height));
        }
    }

    public /* synthetic */ BannerJavascriptInterface(Context context, String str, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i11 & 4) != 0 ? new defpackage.g(22) : function1);
    }
}
