package com.tgtg.componentlibrary.component.p000switch;

import b4.t;
import com.tgtg.componentlibrary.component.p000switch.model.SwitchGeometry;
import g3.w7;
import g3.z7;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13312a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f13314c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f13315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function2 f13316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f13319h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f13320i;

    public /* synthetic */ f(boolean z11, Function1 function1, t tVar, Function2 function2, boolean z12, w7 w7Var, int i11, int i12) {
        this.f13313b = z11;
        this.f13314c = function1;
        this.f13315d = tVar;
        this.f13316e = function2;
        this.f13317f = z12;
        this.f13320i = w7Var;
        this.f13318g = i11;
        this.f13319h = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13312a) {
            case 0:
                ((Integer) obj2).intValue();
                PantrySwitchKt.PantrySwitch(this.f13313b, this.f13314c, (SwitchGeometry) this.f13320i, this.f13315d, this.f13317f, this.f13316e, (n) obj, i.F(this.f13318g | 1), this.f13319h);
                break;
            default:
                ((Integer) obj2).getClass();
                z7.a(this.f13313b, this.f13314c, this.f13315d, this.f13316e, this.f13317f, (w7) this.f13320i, (n) obj, i.F(this.f13318g | 1), this.f13319h);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ f(boolean z11, Function1 function1, SwitchGeometry switchGeometry, t tVar, boolean z12, Function2 function2, int i11, int i12) {
        this.f13313b = z11;
        this.f13314c = function1;
        this.f13320i = switchGeometry;
        this.f13315d = tVar;
        this.f13317f = z12;
        this.f13316e = function2;
        this.f13318g = i11;
        this.f13319h = i12;
    }
}
