package com.airbnb.android.showkase.ui;

import android.os.Bundle;
import com.airbnb.android.showkase.exceptions.ShowkaseException;
import e.f;
import k.h;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class ShowkaseBrowserActivity extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8849b = 0;

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws ShowkaseException {
        String string;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (string = extras.getString("SHOWKASE_ROOT_MODULE")) == null) {
            throw new ShowkaseException("Missing key in bundle. Please start this activity by using the intent returned by the ShowkaseBrowserActivity.getIntent() method.");
        }
        f.a(this, new d(new br.h(this, string), true, -695351285));
    }
}
