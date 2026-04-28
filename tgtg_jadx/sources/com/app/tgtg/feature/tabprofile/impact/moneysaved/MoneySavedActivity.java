package com.app.tgtg.feature.tabprofile.impact.moneysaved;

import a70.a;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.m1;
import androidx.lifecycle.n1;
import com.app.tgtg.model.local.GenericErrors;
import com.app.tgtg.model.remote.user.response.MoneySavedResponse;
import cv.i;
import d2.m2;
import f2.c0;
import f2.e0;
import g3.d5;
import g3.ga;
import g3.x5;
import k.g;
import k.h;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Reflection;
import lv.s;
import m3.b1;
import m3.m;
import m3.n;
import m3.w1;
import mr.e;
import o30.f0;
import p70.b;
import r70.c;
import v80.b0;
import z1.d3;
import zq.d;
import zz.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class MoneySavedActivity extends h implements c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f9312g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile b f9313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9314c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9315d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n1 f9316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f9317f;

    public MoneySavedActivity() {
        addOnContextAvailableListener(new g(this, 25));
        this.f9316e = new n1(Reflection.getOrCreateKotlinClass(zq.g.class), new d(this, 1), new d(this, 0), new d(this, 2));
        this.f9317f = new e(this, 16);
    }

    public final b A() {
        if (this.f9313b == null) {
            synchronized (this.f9314c) {
                try {
                    if (this.f9313b == null) {
                        this.f9313b = new b(this);
                    }
                } finally {
                }
            }
        }
        return this.f9313b;
    }

    public final void B(Bundle bundle) {
        super.onCreate(bundle);
        A().d();
    }

    @Override // r70.b
    public final Object a() {
        return A().a();
    }

    @Override // androidx.activity.ComponentActivity, androidx.lifecycle.p
    public final ViewModelProvider$Factory getDefaultViewModelProviderFactory() {
        return f.q(this, super.getDefaultViewModelProviderFactory());
    }

    @Override // androidx.fragment.app.o0, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f0.S(this, false);
        B(bundle);
        a.t(this, s.B);
        getOnBackPressedDispatcher().a(this.f9317f);
        n1 n1Var = this.f9316e;
        ((zq.g) n1Var.getValue()).f48049b.b(i.SCREEN_MONEY_SAVED);
        e.f.a(this, new u3.d(new zq.a(this, 0, (byte) 0), true, -2082263071));
        zq.g gVar = (zq.g) n1Var.getValue();
        v80.f0.B(m1.d(gVar), null, null, new zq.f(gVar, null), 3);
    }

    @Override // k.h, androidx.fragment.app.o0, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        A().b();
    }

    public final void z(n nVar, int i11) {
        m3.s sVar;
        c0 c0Var;
        MoneySavedResponse moneySavedResponse;
        m3.s sVar2 = (m3.s) nVar;
        sVar2.c0(1915133483);
        int i12 = (sVar2.h(this) ? 4 : 2) | i11;
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            d5 d5VarC = ga.c(sVar2);
            n1 n1Var = this.f9316e;
            b1 b1VarN = m3.i.n(((zq.g) n1Var.getValue()).f48051d, sVar2, 0);
            MoneySavedResponse moneySavedResponse2 = (MoneySavedResponse) m3.i.n(((zq.g) n1Var.getValue()).f48055h, sVar2, 0).getValue();
            GenericErrors genericErrors = (GenericErrors) m3.i.n(((zq.g) n1Var.getValue()).f48053f, sVar2, 0).getValue();
            Object objM = sVar2.M();
            m3.f fVar = m.f29332a;
            if (objM == fVar) {
                objM = m3.i.w(Boolean.FALSE);
                sVar2.k0(objM);
            }
            b1 b1Var = (b1) objM;
            c0 c0VarA = e0.a(0, 0, 0, 3, sVar2);
            Object objM2 = sVar2.M();
            if (objM2 == fVar) {
                objM2 = m3.i.o(kotlin.coroutines.g.f26549a, sVar2);
                sVar2.k0(objM2);
            }
            b0 b0Var = (b0) objM2;
            boolean zF = sVar2.f(c0VarA) | sVar2.h(moneySavedResponse2);
            Object objM3 = sVar2.M();
            x70.c cVar = null;
            if (zF || objM3 == fVar) {
                d3 d3Var = new d3(c0VarA, moneySavedResponse2, b1Var, cVar, 8);
                c0Var = c0VarA;
                moneySavedResponse = moneySavedResponse2;
                sVar2.k0(d3Var);
                objM3 = d3Var;
            } else {
                c0Var = c0VarA;
                moneySavedResponse = moneySavedResponse2;
            }
            m3.i.h(c0Var, (Function2) objM3, sVar2);
            sVar = sVar2;
            x5.a(v4.f.a(m2.f13850c, d5VarC.f18456c, null), u3.e.e(2009292519, sVar2, new zq.a(this, 1, (byte) 0)), null, null, null, 0, 0L, 0L, null, u3.e.e(-919261892, sVar2, new kh.a(moneySavedResponse, c0Var, b0Var, this, genericErrors, b1Var, b1VarN)), sVar, 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new zq.a(this, i11);
        }
    }
}
