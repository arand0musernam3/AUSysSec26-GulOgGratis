package com.app.tgtg.feature.survey.rewards;

import ah.n;
import an.b;
import android.os.Bundle;
import androidx.lifecycle.n1;
import e.f;
import e70.c;
import ft.o;
import gq.d;
import gq.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class RewardsSurveyActivity extends n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f9261i = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n1 f9262f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f9263g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public c f9264h;

    public RewardsSurveyActivity() {
        super(14);
        this.f9262f = new n1(Reflection.getOrCreateKotlinClass(d.class), new e(this, 1), new e(this, 0), new e(this, 2));
    }

    @Override // ah.n, androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f0.S(this, false);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_REDEEMED", false);
        c cVar = this.f9264h;
        if (cVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navigationHandler");
            cVar = null;
        }
        c.b(cVar, this, null, 6);
        f.a(this, new u3.d(new b(booleanExtra, this, 3), true, 79854658));
    }

    @Override // androidx.fragment.app.o0, android.app.Activity
    public final void onResume() {
        super.onResume();
        o oVar = this.f9263g;
        if (oVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tokenManager");
            oVar = null;
        }
        oVar.f17954d = new cw.b(this, 24);
    }
}
