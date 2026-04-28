package com.adyen.checkout.ui.core.internal.ui.view;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressLookupView f8845b;

    public /* synthetic */ d(AddressLookupView addressLookupView, int i11) {
        this.f8844a = i11;
        this.f8845b = addressLookupView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f8844a) {
            case 0:
                AddressLookupView.initSubmitAddressButton$lambda$5(this.f8845b, view);
                break;
            default:
                AddressLookupView.initManualEntryFields$lambda$4(this.f8845b, view);
                break;
        }
    }
}
