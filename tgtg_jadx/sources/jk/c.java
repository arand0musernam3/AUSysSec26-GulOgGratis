package jk;

import ek.q;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import ox.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f25294b;

    public /* synthetic */ c(q qVar, int i11, int i12) {
        this.f25293a = i12;
        this.f25294b = qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f25293a;
        n nVar = (n) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                d.a(this.f25294b, nVar, i.F(1));
                break;
            case 1:
                w0.e.i(this.f25294b, nVar, i.F(1));
                break;
            default:
                h.j(this.f25294b, nVar, i.F(1));
                break;
        }
        return Unit.f26487a;
    }
}
