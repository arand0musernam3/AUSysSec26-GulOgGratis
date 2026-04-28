package com.tgtg.componentlibrary.component.p000switch;

import b4.t;
import com.tgtg.componentlibrary.component.checkbox.PantryCheckboxKt;
import com.tgtg.componentlibrary.component.radiobutton.PantryRadioButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import u70.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f13304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f13305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f13306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f13307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f13309g;

    public /* synthetic */ d(boolean z11, t tVar, Function1 function1, boolean z12, int i11, int i12, int i13) {
        this.f13303a = i13;
        this.f13304b = z11;
        this.f13305c = tVar;
        this.f13306d = function1;
        this.f13307e = z12;
        this.f13308f = i11;
        this.f13309g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13303a) {
            case 0:
                ((Integer) obj2).intValue();
                PantrySwitchKt.SmallPantrySwitch(this.f13304b, this.f13305c, (Function1) this.f13306d, this.f13307e, (n) obj, i.F(this.f13308f | 1), this.f13309g);
                break;
            case 1:
                ((Integer) obj2).intValue();
                PantrySwitchKt.LargePantrySwitch(this.f13304b, this.f13305c, (Function1) this.f13306d, this.f13307e, (n) obj, i.F(this.f13308f | 1), this.f13309g);
                break;
            case 2:
                ((Integer) obj2).intValue();
                PantryCheckboxKt.PantryCheckbox(this.f13304b, (Function1) this.f13306d, this.f13305c, this.f13307e, (n) obj, i.F(this.f13308f | 1), this.f13309g);
                break;
            default:
                ((Integer) obj2).intValue();
                PantryRadioButtonKt.PantryRadioButton(this.f13304b, (Function0) this.f13306d, this.f13305c, this.f13307e, (n) obj, i.F(this.f13308f | 1), this.f13309g);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ d(boolean z11, f fVar, t tVar, boolean z12, int i11, int i12, int i13) {
        this.f13303a = i13;
        this.f13304b = z11;
        this.f13306d = fVar;
        this.f13305c = tVar;
        this.f13307e = z12;
        this.f13308f = i11;
        this.f13309g = i12;
    }
}
