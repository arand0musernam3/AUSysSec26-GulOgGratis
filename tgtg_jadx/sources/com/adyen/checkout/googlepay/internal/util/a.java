package com.adyen.checkout.googlepay.internal.util;

import com.braze.BrazeUser;
import com.braze.events.IValueCallback;
import com.braze.ui.UserJavascriptInterfaceBase;
import d10.e;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements e, IValueCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f8827b;

    public /* synthetic */ a(Function1 function1, int i11) {
        this.f8826a = i11;
        this.f8827b = function1;
    }

    @Override // d10.e
    public final void onSuccess(Object obj) {
        switch (this.f8826a) {
            case 0:
                GooglePayAvailabilityCheck.isAvailable$lambda$0(this.f8827b, obj);
                break;
            default:
                UserJavascriptInterfaceBase.Companion.runOnUser$lambda$0(this.f8827b, (BrazeUser) obj);
                break;
        }
    }
}
