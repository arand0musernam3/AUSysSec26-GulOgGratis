package com.adyen.checkout.ui.core.internal.ui.view;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressFormInput f8839b;

    public /* synthetic */ a(AddressFormInput addressFormInput, int i11) {
        this.f8838a = i11;
        this.f8839b = addressFormInput;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i11, long j9) {
        switch (this.f8838a) {
            case 0:
                AddressFormInput.lambda$1$lambda$0(this.f8839b, adapterView, view, i11, j9);
                break;
            default:
                AddressFormInput.initStatesInput$lambda$32$lambda$31(this.f8839b, adapterView, view, i11, j9);
                break;
        }
    }
}
