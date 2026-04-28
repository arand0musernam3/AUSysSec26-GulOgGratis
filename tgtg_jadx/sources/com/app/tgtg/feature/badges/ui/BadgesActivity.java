package com.app.tgtg.feature.badges.ui;

import a70.a;
import ah.n;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.e0;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.app.tgtg.R;
import e.f;
import e70.c;
import g3.y0;
import h2.b1;
import ih.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import lv.s;
import mv.r0;
import o30.f0;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class BadgesActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f8964i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f8965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n1 f8966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e0 f8967h;

    public BadgesActivity() {
        super(20);
        this.f8966g = new n1(Reflection.getOrCreateKotlinClass(i.class), new ih.c(this, 1), new ih.c(this, 0), new ih.c(this, 2));
        this.f8967h = new e0(this, 25);
    }

    public final i a0() {
        return (i) this.f8966g.getValue();
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        super.onCreate(bundle);
        a.t(this, s.f28240u);
        getOnBackPressedDispatcher().a(this.f8967h);
        c cVar = this.f8965f;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        f.a(this, new d(new y0(this, 18), true, 423280694));
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        if (!r0.u(applicationContext)) {
            Toast.makeText(getApplicationContext(), getApplicationContext().getString(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later), 0).show();
            return;
        }
        i iVarA0 = a0();
        v80.f0.B(m1.d(iVarA0), null, null, new b1(iVarA0, null, 5), 3);
    }
}
