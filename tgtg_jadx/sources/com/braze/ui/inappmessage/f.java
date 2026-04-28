package com.braze.ui.inappmessage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10933a;

    public /* synthetic */ f(int i11) {
        this.f10933a = i11;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f10933a) {
            case 0:
                DefaultInAppMessageViewWrapper.createCloseInAppMessageClickListener$lambda$22(view);
                break;
        }
    }

    private final void a(View view) {
    }
}
