package com.tgtg.componentlibrary.component.p000switch;

import com.tgtg.componentlibrary.component.p000switch.model.ThumbGeometry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThumbGeometry f13301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13302c;

    public /* synthetic */ c(ThumbGeometry thumbGeometry, boolean z11, int i11) {
        this.f13300a = i11;
        this.f13301b = thumbGeometry;
        this.f13302c = z11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f13300a;
        n nVar = (n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantrySwitchKt.a(this.f13301b, this.f13302c, null, sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            default:
                s sVar2 = (s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    PantrySwitchKt.a(this.f13301b, this.f13302c, null, sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
