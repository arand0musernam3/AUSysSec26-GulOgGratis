package com.app.tgtg.feature.tabprofile.manageaccount.accountdetails;

import ah.n;
import android.os.Bundle;
import e.f;
import e70.c;
import ir.i;
import kotlin.jvm.internal.Intrinsics;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class AccountDetailsActivity extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9358f;

    public AccountDetailsActivity() {
        super(21);
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        c cVar = this.f9358f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        f.a(this, i.f24147a);
    }
}
